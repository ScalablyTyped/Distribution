package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationGroup extends js.Object {
  var errors: js.UndefOr[KnockoutValidationErrors] = js.undefined
  var isAnyMessageShown: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var isValid: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object KnockoutValidationGroup {
  @scala.inline
  def apply(
    errors: KnockoutValidationErrors = null,
    isAnyMessageShown: js.Function0[scala.Boolean] = null,
    isValid: js.Function0[scala.Boolean] = null
  ): KnockoutValidationGroup = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (isAnyMessageShown != null) __obj.updateDynamic("isAnyMessageShown")(isAnyMessageShown)
    if (isValid != null) __obj.updateDynamic("isValid")(isValid)
    __obj.asInstanceOf[KnockoutValidationGroup]
  }
}

