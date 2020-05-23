package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormValidateEvent extends FormEvent {
  var errors: js.UndefOr[js.Array[_]] = js.undefined
  var model: js.UndefOr[Model] = js.undefined
  var valid: js.UndefOr[Boolean] = js.undefined
}

object FormValidateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Form,
    errors: js.Array[_] = null,
    model: Model = null,
    valid: js.UndefOr[Boolean] = js.undefined
  ): FormValidateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormValidateEvent]
  }
}

