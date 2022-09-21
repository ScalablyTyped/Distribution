package typings.hyperformula.astMod

import typings.hyperformula.astMod.AstNodeType.GREATER_THAN_OR_EQUAL_OP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GreaterThanOrEqualOpAst
  extends StObject
     with BinaryOpAst
     with Ast {
  
  var `type`: GREATER_THAN_OR_EQUAL_OP
}
object GreaterThanOrEqualOpAst {
  
  inline def apply(left: Ast, right: Ast, `type`: GREATER_THAN_OR_EQUAL_OP): GreaterThanOrEqualOpAst = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GreaterThanOrEqualOpAst]
  }
  
  extension [Self <: GreaterThanOrEqualOpAst](x: Self) {
    
    inline def setType(value: GREATER_THAN_OR_EQUAL_OP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
