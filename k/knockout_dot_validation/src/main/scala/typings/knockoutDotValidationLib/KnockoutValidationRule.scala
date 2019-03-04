package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationRule extends js.Object {
  var condition: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var params: js.Any
  var rule: java.lang.String
}

object KnockoutValidationRule {
  @scala.inline
  def apply(
    params: js.Any,
    rule: java.lang.String,
    condition: js.Function0[scala.Boolean] = null,
    message: java.lang.String = null
  ): KnockoutValidationRule = {
    val __obj = js.Dynamic.literal(params = params, rule = rule)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[KnockoutValidationRule]
  }
}

