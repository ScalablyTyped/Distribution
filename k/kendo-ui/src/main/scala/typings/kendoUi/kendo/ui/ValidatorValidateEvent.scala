package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorValidateEvent extends ValidatorEvent {
  var errors: js.UndefOr[js.Array[_]] = js.undefined
  var valid: js.UndefOr[Boolean] = js.undefined
}

object ValidatorValidateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Validator,
    errors: js.Array[_] = null,
    valid: js.UndefOr[Boolean] = js.undefined
  ): ValidatorValidateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorValidateEvent]
  }
}

