package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFViewerMessagesToolbarPager extends js.Object {
  var first: js.UndefOr[String] = js.native
  var last: js.UndefOr[String] = js.native
  var next: js.UndefOr[String] = js.native
  var of: js.UndefOr[String] = js.native
  var page: js.UndefOr[String] = js.native
  var pages: js.UndefOr[String] = js.native
  var previous: js.UndefOr[String] = js.native
}

object PDFViewerMessagesToolbarPager {
  @scala.inline
  def apply(): PDFViewerMessagesToolbarPager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerMessagesToolbarPager]
  }
  @scala.inline
  implicit class PDFViewerMessagesToolbarPagerOps[Self <: PDFViewerMessagesToolbarPager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFirst(value: String): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    @scala.inline
    def setLast(value: String): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setOf(value: String): Self = this.set("of", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOf: Self = this.set("of", js.undefined)
    @scala.inline
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPages(value: String): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    @scala.inline
    def setPrevious(value: String): Self = this.set("previous", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
  }
  
}

