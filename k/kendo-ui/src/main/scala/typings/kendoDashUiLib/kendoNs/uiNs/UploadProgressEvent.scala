package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadProgressEvent extends UploadEvent {
  var files: js.UndefOr[js.Array[_]] = js.undefined
  var percentComplete: js.UndefOr[scala.Double] = js.undefined
}

object UploadProgressEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Upload,
    files: js.Array[_] = null,
    percentComplete: scala.Int | scala.Double = null
  ): UploadProgressEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (files != null) __obj.updateDynamic("files")(files)
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProgressEvent]
  }
}

