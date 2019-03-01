package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadSelectEvent extends UploadEvent {
  var e: js.UndefOr[js.Any] = js.undefined
  var files: js.UndefOr[js.Array[_]] = js.undefined
}

object UploadSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Upload,
    e: js.Any = null,
    files: js.Array[_] = null
  ): UploadSelectEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (e != null) __obj.updateDynamic("e")(e)
    if (files != null) __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[UploadSelectEvent]
  }
}

