package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerDplProcessingDownload extends js.Object {
  var url: js.UndefOr[String] = js.undefined
}

object PDFViewerDplProcessingDownload {
  @scala.inline
  def apply(url: String = null): PDFViewerDplProcessingDownload = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerDplProcessingDownload]
  }
}

