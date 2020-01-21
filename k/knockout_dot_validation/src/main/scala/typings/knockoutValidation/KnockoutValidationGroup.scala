package typings.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationGroup extends js.Object {
  var errors: js.UndefOr[KnockoutValidationErrors] = js.undefined
  var isAnyMessageShown: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object KnockoutValidationGroup {
  @scala.inline
  def apply(
    errors: KnockoutValidationErrors = null,
    isAnyMessageShown: () => Boolean = null,
    isValid: () => Boolean = null
  ): KnockoutValidationGroup = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (isAnyMessageShown != null) __obj.updateDynamic("isAnyMessageShown")(js.Any.fromFunction0(isAnyMessageShown))
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction0(isValid))
    __obj.asInstanceOf[KnockoutValidationGroup]
  }
}

