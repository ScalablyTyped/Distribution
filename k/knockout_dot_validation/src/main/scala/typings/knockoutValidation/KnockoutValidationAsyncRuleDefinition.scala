package typings.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationAsyncRuleDefinition extends KnockoutValidationRuleBase {
  var async: Boolean
  def validator(value: js.Any, params: js.Any, callback: KnockoutValidationAsyncCallback): Unit
}

object KnockoutValidationAsyncRuleDefinition {
  @scala.inline
  def apply(
    async: Boolean,
    message: String | KnockoutValidationMessageFunction,
    validator: (js.Any, js.Any, KnockoutValidationAsyncCallback) => Unit
  ): KnockoutValidationAsyncRuleDefinition = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], validator = js.Any.fromFunction3(validator))
  
    __obj.asInstanceOf[KnockoutValidationAsyncRuleDefinition]
  }
}

