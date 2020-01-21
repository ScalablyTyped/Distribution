package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadValidation extends js.Object {
  var allowedExtensions: js.UndefOr[js.Any] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var minFileSize: js.UndefOr[Double] = js.undefined
}

object UploadValidation {
  @scala.inline
  def apply(
    allowedExtensions: js.Any = null,
    maxFileSize: Int | Double = null,
    minFileSize: Int | Double = null
  ): UploadValidation = {
    val __obj = js.Dynamic.literal()
    if (allowedExtensions != null) __obj.updateDynamic("allowedExtensions")(allowedExtensions.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (minFileSize != null) __obj.updateDynamic("minFileSize")(minFileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadValidation]
  }
}

