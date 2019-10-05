package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerDplProcessingUpload extends js.Object {
  var saveField: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PDFViewerDplProcessingUpload {
  @scala.inline
  def apply(saveField: String = null, url: String = null): PDFViewerDplProcessingUpload = {
    val __obj = js.Dynamic.literal()
    if (saveField != null) __obj.updateDynamic("saveField")(saveField)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PDFViewerDplProcessingUpload]
  }
}

