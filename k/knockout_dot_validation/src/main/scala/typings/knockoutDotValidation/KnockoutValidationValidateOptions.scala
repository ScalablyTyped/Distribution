package typings.knockoutDotValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationValidateOptions extends js.Object {
  var throttle: js.UndefOr[Double] = js.undefined
}

object KnockoutValidationValidateOptions {
  @scala.inline
  def apply(throttle: Int | Double = null): KnockoutValidationValidateOptions = {
    val __obj = js.Dynamic.literal()
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationValidateOptions]
  }
}

