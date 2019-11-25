package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerMessagesToolbarPager extends js.Object {
  var first: js.UndefOr[String] = js.undefined
  var last: js.UndefOr[String] = js.undefined
  var next: js.UndefOr[String] = js.undefined
  var of: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[String] = js.undefined
  var pages: js.UndefOr[String] = js.undefined
  var previous: js.UndefOr[String] = js.undefined
}

object PDFViewerMessagesToolbarPager {
  @scala.inline
  def apply(
    first: String = null,
    last: String = null,
    next: String = null,
    of: String = null,
    page: String = null,
    pages: String = null,
    previous: String = null
  ): PDFViewerMessagesToolbarPager = {
    val __obj = js.Dynamic.literal()
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (of != null) __obj.updateDynamic("of")(of.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerMessagesToolbarPager]
  }
}

