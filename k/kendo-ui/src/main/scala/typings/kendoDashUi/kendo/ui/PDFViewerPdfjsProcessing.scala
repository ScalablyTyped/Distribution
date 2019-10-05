package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerPdfjsProcessing extends js.Object {
  var file: js.UndefOr[js.Any | String] = js.undefined
}

object PDFViewerPdfjsProcessing {
  @scala.inline
  def apply(file: js.Any | String = null): PDFViewerPdfjsProcessing = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerPdfjsProcessing]
  }
}

