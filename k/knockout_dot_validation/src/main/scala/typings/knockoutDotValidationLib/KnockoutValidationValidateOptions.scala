package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationValidateOptions extends js.Object {
  var throttle: js.UndefOr[scala.Double] = js.undefined
}

object KnockoutValidationValidateOptions {
  @scala.inline
  def apply(throttle: scala.Int | scala.Double = null): KnockoutValidationValidateOptions = {
    val __obj = js.Dynamic.literal()
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationValidateOptions]
  }
}

