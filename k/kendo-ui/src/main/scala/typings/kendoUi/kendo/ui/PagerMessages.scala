package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerMessages extends js.Object {
  var allPages: js.UndefOr[String] = js.native
  var display: js.UndefOr[String] = js.native
  var empty: js.UndefOr[String] = js.native
  var first: js.UndefOr[String] = js.native
  var itemsPerPage: js.UndefOr[String] = js.native
  var last: js.UndefOr[String] = js.native
  var next: js.UndefOr[String] = js.native
  var of: js.UndefOr[String] = js.native
  var page: js.UndefOr[String] = js.native
  var previous: js.UndefOr[String] = js.native
  var refresh: js.UndefOr[String] = js.native
}

object PagerMessages {
  @scala.inline
  def apply(): PagerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerMessages]
  }
  @scala.inline
  implicit class PagerMessagesOps[Self <: PagerMessages] (val x: Self) extends AnyVal {
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
    def setAllPages(value: String): Self = this.set("allPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllPages: Self = this.set("allPages", js.undefined)
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    @scala.inline
    def setFirst(value: String): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    @scala.inline
    def setItemsPerPage(value: String): Self = this.set("itemsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsPerPage: Self = this.set("itemsPerPage", js.undefined)
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
    def setPrevious(value: String): Self = this.set("previous", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    @scala.inline
    def setRefresh(value: String): Self = this.set("refresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
  }
  
}

