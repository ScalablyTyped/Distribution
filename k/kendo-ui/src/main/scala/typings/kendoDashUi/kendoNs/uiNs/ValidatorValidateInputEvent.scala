package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorValidateInputEvent extends ValidatorEvent {
  var input: js.UndefOr[JQuery] = js.undefined
  var valid: js.UndefOr[Boolean] = js.undefined
}

object ValidatorValidateInputEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Validator,
    input: JQuery = null,
    valid: js.UndefOr[Boolean] = js.undefined
  ): ValidatorValidateInputEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (input != null) __obj.updateDynamic("input")(input)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[ValidatorValidateInputEvent]
  }
}

