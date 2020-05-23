package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadProgressEvent extends UploadEvent {
  var files: js.UndefOr[js.Array[_]] = js.undefined
  var percentComplete: js.UndefOr[Double] = js.undefined
}

object UploadProgressEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Upload,
    files: js.Array[_] = null,
    percentComplete: js.UndefOr[Double] = js.undefined
  ): UploadProgressEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(percentComplete)) __obj.updateDynamic("percentComplete")(percentComplete.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProgressEvent]
  }
}

