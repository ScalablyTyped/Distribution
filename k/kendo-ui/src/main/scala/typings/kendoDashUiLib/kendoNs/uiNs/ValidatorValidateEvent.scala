package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorValidateEvent extends ValidatorEvent {
  var valid: js.UndefOr[scala.Boolean] = js.undefined
}

object ValidatorValidateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Validator,
    valid: js.UndefOr[scala.Boolean] = js.undefined
  ): ValidatorValidateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[ValidatorValidateEvent]
  }
}

