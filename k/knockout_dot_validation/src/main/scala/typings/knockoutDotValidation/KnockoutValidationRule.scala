package typings.knockoutDotValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationRule extends js.Object {
  var condition: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var params: js.Any
  var rule: String
}

object KnockoutValidationRule {
  @scala.inline
  def apply(params: js.Any, rule: String, condition: () => Boolean = null, message: String = null): KnockoutValidationRule = {
    val __obj = js.Dynamic.literal(params = params, rule = rule)
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction0(condition))
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[KnockoutValidationRule]
  }
}

