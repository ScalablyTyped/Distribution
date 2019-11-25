package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerToolbar extends js.Object {
  var items: js.UndefOr[js.Array[PDFViewerToolbarItem]] = js.undefined
}

object PDFViewerToolbar {
  @scala.inline
  def apply(items: js.Array[PDFViewerToolbarItem] = null): PDFViewerToolbar = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerToolbar]
  }
}

