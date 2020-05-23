package typings.kendoUi.kendo.ui

import typings.kendoUi.kendoUiStrings.horizontal
import typings.kendoUi.kendoUiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormOptions extends js.Object {
  var buttonsTemplate: js.UndefOr[String | js.Function] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ FormChangeEvent, Unit]] = js.undefined
  var formData: js.UndefOr[FormData] = js.undefined
  var items: js.UndefOr[js.Array[FormItem]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[String | horizontal | vertical] = js.undefined
  var submit: js.UndefOr[js.Function1[/* e */ FormSubmitEvent, Unit]] = js.undefined
  var validatable: js.UndefOr[FormValidatable] = js.undefined
  var validate: js.UndefOr[js.Function1[/* e */ FormValidateEvent, Unit]] = js.undefined
  var validateField: js.UndefOr[js.Function1[/* e */ FormValidateFieldEvent, Unit]] = js.undefined
}

object FormOptions {
  @scala.inline
  def apply(
    buttonsTemplate: String | js.Function = null,
    change: /* e */ FormChangeEvent => Unit = null,
    formData: FormData = null,
    items: js.Array[FormItem] = null,
    name: String = null,
    orientation: String | horizontal | vertical = null,
    submit: /* e */ FormSubmitEvent => Unit = null,
    validatable: FormValidatable = null,
    validate: /* e */ FormValidateEvent => Unit = null,
    validateField: /* e */ FormValidateFieldEvent => Unit = null
  ): FormOptions = {
    val __obj = js.Dynamic.literal()
    if (buttonsTemplate != null) __obj.updateDynamic("buttonsTemplate")(buttonsTemplate.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(js.Any.fromFunction1(submit))
    if (validatable != null) __obj.updateDynamic("validatable")(validatable.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    if (validateField != null) __obj.updateDynamic("validateField")(js.Any.fromFunction1(validateField))
    __obj.asInstanceOf[FormOptions]
  }
}

