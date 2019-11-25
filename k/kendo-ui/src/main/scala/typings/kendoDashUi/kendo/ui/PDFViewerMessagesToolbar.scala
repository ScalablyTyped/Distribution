package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerMessagesToolbar extends js.Object {
  var download: js.UndefOr[String] = js.undefined
  var exportAs: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[String] = js.undefined
  var pager: js.UndefOr[PDFViewerMessagesToolbarPager] = js.undefined
}

object PDFViewerMessagesToolbar {
  @scala.inline
  def apply(
    download: String = null,
    exportAs: String = null,
    open: String = null,
    pager: PDFViewerMessagesToolbarPager = null
  ): PDFViewerMessagesToolbar = {
    val __obj = js.Dynamic.literal()
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (pager != null) __obj.updateDynamic("pager")(pager.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerMessagesToolbar]
  }
}

