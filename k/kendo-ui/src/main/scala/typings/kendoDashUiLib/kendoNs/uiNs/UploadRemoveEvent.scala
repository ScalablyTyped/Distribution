package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadRemoveEvent extends UploadEvent {
  var data: js.UndefOr[js.Any] = js.undefined
  var files: js.UndefOr[js.Array[_]] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
}

object UploadRemoveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Upload,
    data: js.Any = null,
    files: js.Array[_] = null,
    headers: js.Any = null
  ): UploadRemoveEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (data != null) __obj.updateDynamic("data")(data)
    if (files != null) __obj.updateDynamic("files")(files)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[UploadRemoveEvent]
  }
}

