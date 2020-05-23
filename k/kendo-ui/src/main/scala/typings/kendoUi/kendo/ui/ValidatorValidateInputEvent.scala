package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorValidateInputEvent extends ValidatorEvent {
  var error: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[JQuery] = js.undefined
  var valid: js.UndefOr[Boolean] = js.undefined
}

object ValidatorValidateInputEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Validator,
    error: String = null,
    field: String = null,
    input: JQuery = null,
    valid: js.UndefOr[Boolean] = js.undefined
  ): ValidatorValidateInputEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorValidateInputEvent]
  }
}

