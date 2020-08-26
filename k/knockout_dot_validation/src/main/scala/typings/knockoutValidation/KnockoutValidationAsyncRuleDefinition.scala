package typings.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutValidationAsyncRuleDefinition extends KnockoutValidationRuleBase {
  var async: Boolean = js.native
  def validator(value: js.Any, params: js.Any, callback: KnockoutValidationAsyncCallback): Unit = js.native
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
  @scala.inline
  implicit class KnockoutValidationAsyncRuleDefinitionOps[Self <: KnockoutValidationAsyncRuleDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidator(value: (js.Any, js.Any, KnockoutValidationAsyncCallback) => Unit): Self = this.set("validator", js.Any.fromFunction3(value))
  }
  
}

