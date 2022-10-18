package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.MINUS_OP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinusOpAst
  extends StObject
     with BinaryOpAst
     with Ast {
  
  var `type`: MINUS_OP
}
object MinusOpAst {
  
  inline def apply(left: Ast, right: Ast, `type`: MINUS_OP): MinusOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinusOpAst]
  }
  
  extension [Self <: MinusOpAst](x: Self) {
    
    inline def setType(value: MINUS_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
