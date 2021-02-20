package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutValidationRuleDefinition extends KnockoutValidationRuleBase {
  
  def validator(value: js.Any, params: js.Any): Boolean = js.native
}
object KnockoutValidationRuleDefinition {
  
  @scala.inline
  def apply(message: String | KnockoutValidationMessageFunction, validator: (js.Any, js.Any) => Boolean): KnockoutValidationRuleDefinition = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], validator = js.Any.fromFunction2(validator))
    __obj.asInstanceOf[KnockoutValidationRuleDefinition]
  }
  
  @scala.inline
  implicit class KnockoutValidationRuleDefinitionMutableBuilder[Self <: KnockoutValidationRuleDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidator(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "validator", js.Any.fromFunction2(value))
  }
}
