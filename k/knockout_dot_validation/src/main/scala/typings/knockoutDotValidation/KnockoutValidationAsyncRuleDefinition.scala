package typings.knockoutDotValidation

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
    message: String,
    validator: (js.Any, js.Any, KnockoutValidationAsyncCallback) => Unit
  ): KnockoutValidationAsyncRuleDefinition = {
    val __obj = js.Dynamic.literal(async = async, message = message, validator = js.Any.fromFunction3(validator))
  
    __obj.asInstanceOf[KnockoutValidationAsyncRuleDefinition]
  }
}

