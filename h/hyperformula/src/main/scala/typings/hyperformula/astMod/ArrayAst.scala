package typings.hyperformula.astMod

import typings.hyperformula.astMod.AstNodeType.ARRAY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayAst
  extends StObject
     with AstWithInternalWhitespace
     with Ast {
  
  var args: js.Array[js.Array[Ast]]
  
  var `type`: ARRAY
}
object ArrayAst {
  
  inline def apply(args: js.Array[js.Array[Ast]], `type`: ARRAY): ArrayAst = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayAst]
  }
  
  extension [Self <: ArrayAst](x: Self) {
    
    inline def setArgs(value: js.Array[js.Array[Ast]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: js.Array[Ast]*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setType(value: ARRAY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
