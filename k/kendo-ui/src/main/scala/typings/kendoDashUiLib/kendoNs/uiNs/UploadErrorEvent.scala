package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadErrorEvent extends UploadEvent {
  var XMLHttpRequest: js.UndefOr[js.Any] = js.undefined
  var files: js.UndefOr[js.Array[_]] = js.undefined
  var operation: js.UndefOr[java.lang.String] = js.undefined
}

object UploadErrorEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Upload,
    XMLHttpRequest: js.Any = null,
    files: js.Array[_] = null,
    operation: java.lang.String = null
  ): UploadErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (XMLHttpRequest != null) __obj.updateDynamic("XMLHttpRequest")(XMLHttpRequest)
    if (files != null) __obj.updateDynamic("files")(files)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    __obj.asInstanceOf[UploadErrorEvent]
  }
}

