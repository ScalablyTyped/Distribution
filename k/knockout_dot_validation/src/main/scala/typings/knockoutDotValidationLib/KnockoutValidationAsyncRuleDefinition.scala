package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationAsyncRuleDefinition extends KnockoutValidationRuleBase {
  var async: scala.Boolean
  def validator(value: js.Any, params: js.Any, callback: KnockoutValidationAsyncCallback): scala.Unit
}

object KnockoutValidationAsyncRuleDefinition {
  @scala.inline
  def apply(
    async: scala.Boolean,
    message: java.lang.String,
    validator: (js.Any, js.Any, KnockoutValidationAsyncCallback) => scala.Unit
  ): KnockoutValidationAsyncRuleDefinition = {
    val __obj = js.Dynamic.literal(async = async, message = message, validator = js.Any.fromFunction3(validator))
  
    __obj.asInstanceOf[KnockoutValidationAsyncRuleDefinition]
  }
}

