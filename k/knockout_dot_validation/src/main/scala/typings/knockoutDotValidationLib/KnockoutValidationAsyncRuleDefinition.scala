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
    validator: js.Function3[js.Any, js.Any, KnockoutValidationAsyncCallback, scala.Unit]
  ): KnockoutValidationAsyncRuleDefinition = {
    val __obj = js.Dynamic.literal(async = async, message = message, validator = validator)
  
    __obj.asInstanceOf[KnockoutValidationAsyncRuleDefinition]
  }
}

