package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutValidationRuleDefinition
  extends StObject
     with KnockoutValidationRuleBase {
  
  def validator(value: js.Any, params: js.Any): Boolean
}
object KnockoutValidationRuleDefinition {
  
  inline def apply(message: String | KnockoutValidationMessageFunction, validator: (js.Any, js.Any) => Boolean): KnockoutValidationRuleDefinition = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], validator = js.Any.fromFunction2(validator))
    __obj.asInstanceOf[KnockoutValidationRuleDefinition]
  }
  
  extension [Self <: KnockoutValidationRuleDefinition](x: Self) {
    
    inline def setValidator(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "validator", js.Any.fromFunction2(value))
  }
}
