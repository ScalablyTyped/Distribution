package typings.hyperformula.astMod

import typings.hyperformula.astMod.AstNodeType.MINUS_UNARY_OP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinusUnaryOpAst
  extends StObject
     with AstWithWhitespace
     with Ast {
  
  var `type`: MINUS_UNARY_OP
  
  var value: Ast
}
object MinusUnaryOpAst {
  
  inline def apply(`type`: MINUS_UNARY_OP, value: Ast): MinusUnaryOpAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinusUnaryOpAst]
  }
  
  extension [Self <: MinusUnaryOpAst](x: Self) {
    
    inline def setType(value: MINUS_UNARY_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Ast): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
