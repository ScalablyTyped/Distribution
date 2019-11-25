package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerView extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
}

object PDFViewerView {
  @scala.inline
  def apply(`type`: String = null): PDFViewerView = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerView]
  }
}

