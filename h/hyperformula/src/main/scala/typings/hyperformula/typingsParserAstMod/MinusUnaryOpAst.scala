package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.MINUS_UNARY_OP
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinusUnaryOpAst] (val x: Self) extends AnyVal {
    
    inline def setType(value: MINUS_UNARY_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Ast): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
