package typings.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationRuleDefinition extends KnockoutValidationRuleBase {
  def validator(value: js.Any, params: js.Any): Boolean
}

object KnockoutValidationRuleDefinition {
  @scala.inline
  def apply(message: String | KnockoutValidationMessageFunction, validator: (js.Any, js.Any) => Boolean): KnockoutValidationRuleDefinition = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], validator = js.Any.fromFunction2(validator))
    __obj.asInstanceOf[KnockoutValidationRuleDefinition]
  }
}

