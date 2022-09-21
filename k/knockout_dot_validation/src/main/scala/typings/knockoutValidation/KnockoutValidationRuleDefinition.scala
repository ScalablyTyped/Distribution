package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutValidationRuleDefinition
  extends StObject
     with KnockoutValidationRuleBase {
  
  def validator(value: Any, params: Any): Boolean
}
object KnockoutValidationRuleDefinition {
  
  inline def apply(message: String | KnockoutValidationMessageFunction, validator: (Any, Any) => Boolean): KnockoutValidationRuleDefinition = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], validator = js.Any.fromFunction2(validator))
    __obj.asInstanceOf[KnockoutValidationRuleDefinition]
  }
  
  extension [Self <: KnockoutValidationRuleDefinition](x: Self) {
    
    inline def setValidator(value: (Any, Any) => Boolean): Self = StObject.set(x, "validator", js.Any.fromFunction2(value))
  }
}
