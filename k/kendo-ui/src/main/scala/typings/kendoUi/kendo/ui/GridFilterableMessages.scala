package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridFilterableMessages extends js.Object {
  var and: js.UndefOr[String] = js.native
  var cancel: js.UndefOr[String] = js.native
  var checkAll: js.UndefOr[String] = js.native
  var clear: js.UndefOr[String] = js.native
  var filter: js.UndefOr[String] = js.native
  var info: js.UndefOr[String] = js.native
  var isFalse: js.UndefOr[String] = js.native
  var isTrue: js.UndefOr[String] = js.native
  var operator: js.UndefOr[String] = js.native
  var or: js.UndefOr[String] = js.native
  var search: js.UndefOr[String] = js.native
  var selectValue: js.UndefOr[String] = js.native
  var selectedItemsFormat: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object GridFilterableMessages {
  @scala.inline
  def apply(): GridFilterableMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFilterableMessages]
  }
  @scala.inline
  implicit class GridFilterableMessagesOps[Self <: GridFilterableMessages] (val x: Self) extends AnyVal {
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
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCheckAll(value: String): Self = this.set("checkAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckAll: Self = this.set("checkAll", js.undefined)
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
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setOr(value: String): Self = this.set("or", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOr: Self = this.set("or", js.undefined)
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setSelectValue(value: String): Self = this.set("selectValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectValue: Self = this.set("selectValue", js.undefined)
    @scala.inline
    def setSelectedItemsFormat(value: String): Self = this.set("selectedItemsFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItemsFormat: Self = this.set("selectedItemsFormat", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

