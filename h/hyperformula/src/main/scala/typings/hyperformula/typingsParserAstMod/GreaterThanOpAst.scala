package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.GREATER_THAN_OP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GreaterThanOpAst
  extends StObject
     with BinaryOpAst
     with Ast {
  
  var `type`: GREATER_THAN_OP
}
object GreaterThanOpAst {
  
  inline def apply(left: Ast, right: Ast, `type`: GREATER_THAN_OP): GreaterThanOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GreaterThanOpAst]
  }
  
  extension [Self <: GreaterThanOpAst](x: Self) {
    
    inline def setType(value: GREATER_THAN_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
