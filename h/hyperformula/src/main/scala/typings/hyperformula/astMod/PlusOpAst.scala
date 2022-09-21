package typings.hyperformula.astMod

import typings.hyperformula.astMod.AstNodeType.PLUS_OP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlusOpAst
  extends StObject
     with BinaryOpAst
     with Ast {
  
  var `type`: PLUS_OP
}
object PlusOpAst {
  
  inline def apply(left: Ast, right: Ast, `type`: PLUS_OP): PlusOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusOpAst]
  }
  
  extension [Self <: PlusOpAst](x: Self) {
    
    inline def setType(value: PLUS_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
