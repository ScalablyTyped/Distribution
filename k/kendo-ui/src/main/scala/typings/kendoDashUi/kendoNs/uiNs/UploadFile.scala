package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFile extends js.Object {
  var extension: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object UploadFile {
  @scala.inline
  def apply(extension: String = null, name: String = null, size: Int | Double = null): UploadFile = {
    val __obj = js.Dynamic.literal()
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFile]
  }
}

