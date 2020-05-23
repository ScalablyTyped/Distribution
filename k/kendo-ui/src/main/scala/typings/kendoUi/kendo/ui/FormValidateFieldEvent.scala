package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.Model
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormValidateFieldEvent extends FormEvent {
  var error: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[Element] = js.undefined
  var model: js.UndefOr[Model] = js.undefined
  var valid: js.UndefOr[Boolean] = js.undefined
}

object FormValidateFieldEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Form,
    error: String = null,
    field: String = null,
    input: Element = null,
    model: Model = null,
    valid: js.UndefOr[Boolean] = js.undefined
  ): FormValidateFieldEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormValidateFieldEvent]
  }
}

