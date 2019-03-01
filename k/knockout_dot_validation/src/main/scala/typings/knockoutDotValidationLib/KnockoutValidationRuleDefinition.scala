package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationRuleDefinition extends KnockoutValidationRuleBase {
  def validator(value: js.Any, params: js.Any): scala.Boolean
}

object KnockoutValidationRuleDefinition {
  @scala.inline
  def apply(message: java.lang.String, validator: js.Function2[js.Any, js.Any, scala.Boolean]): KnockoutValidationRuleDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("validator")(validator)
    __obj.asInstanceOf[KnockoutValidationRuleDefinition]
  }
}

