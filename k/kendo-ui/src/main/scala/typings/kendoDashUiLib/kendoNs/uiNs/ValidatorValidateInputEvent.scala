package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorValidateInputEvent extends ValidatorEvent {
  var input: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var valid: js.UndefOr[scala.Boolean] = js.undefined
}

object ValidatorValidateInputEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Validator,
    input: kendoDashUiLib.JQuery = null,
    valid: js.UndefOr[scala.Boolean] = js.undefined
  ): ValidatorValidateInputEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (input != null) __obj.updateDynamic("input")(input)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[ValidatorValidateInputEvent]
  }
}

