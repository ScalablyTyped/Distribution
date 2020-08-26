package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeListFilterableMessages extends js.Object {
  var and: js.UndefOr[String] = js.native
  var clear: js.UndefOr[String] = js.native
  var filter: js.UndefOr[String] = js.native
  var info: js.UndefOr[String] = js.native
  var isFalse: js.UndefOr[String] = js.native
  var isTrue: js.UndefOr[String] = js.native
  var or: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object TreeListFilterableMessages {
  @scala.inline
  def apply(): TreeListFilterableMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListFilterableMessages]
  }
  @scala.inline
  implicit class TreeListFilterableMessagesOps[Self <: TreeListFilterableMessages] (val x: Self) extends AnyVal {
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
    def setAnd(value: String): Self = this.set("and", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnd: Self = this.set("and", js.undefined)
    @scala.inline
    def setClear(value: String): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setIsFalse(value: String): Self = this.set("isFalse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFalse: Self = this.set("isFalse", js.undefined)
    @scala.inline
    def setIsTrue(value: String): Self = this.set("isTrue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTrue: Self = this.set("isTrue", js.undefined)
    @scala.inline
    def setOr(value: String): Self = this.set("or", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOr: Self = this.set("or", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

