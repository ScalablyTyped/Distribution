package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorExecParams extends js.Object {
  var value: js.UndefOr[js.Any] = js.undefined
}

object EditorExecParams {
  @scala.inline
  def apply(value: js.Any = null): EditorExecParams = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EditorExecParams]
  }
}

