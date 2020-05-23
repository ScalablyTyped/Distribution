package typings.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationValidateOptions extends js.Object {
  var throttle: js.UndefOr[Double] = js.undefined
}

object KnockoutValidationValidateOptions {
  @scala.inline
  def apply(throttle: js.UndefOr[Double] = js.undefined): KnockoutValidationValidateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(throttle)) __obj.updateDynamic("throttle")(throttle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationValidateOptions]
  }
}

