package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogAction extends js.Object {
  var action: js.UndefOr[js.Function] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object DialogAction {
  @scala.inline
  def apply(
    action: js.Function = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null
  ): DialogAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DialogAction]
  }
}

