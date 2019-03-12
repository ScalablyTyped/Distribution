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
  def apply(message: java.lang.String, validator: (js.Any, js.Any) => scala.Boolean): KnockoutValidationRuleDefinition = {
    val __obj = js.Dynamic.literal(message = message, validator = js.Any.fromFunction2(validator))
  
    __obj.asInstanceOf[KnockoutValidationRuleDefinition]
  }
}

