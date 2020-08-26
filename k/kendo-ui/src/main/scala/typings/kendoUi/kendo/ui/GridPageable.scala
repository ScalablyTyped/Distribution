package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridPageable extends js.Object {
  var alwaysVisible: js.UndefOr[Boolean] = js.native
  var buttonCount: js.UndefOr[Double] = js.native
  var info: js.UndefOr[Boolean] = js.native
  var input: js.UndefOr[Boolean] = js.native
  var messages: js.UndefOr[GridPageableMessages] = js.native
  var numeric: js.UndefOr[Boolean] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var pageSizes: js.UndefOr[Boolean | js.Any] = js.native
  var position: js.UndefOr[String] = js.native
  var previousNext: js.UndefOr[Boolean] = js.native
  var refresh: js.UndefOr[Boolean] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
}

object GridPageable {
  @scala.inline
  def apply(): GridPageable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridPageable]
  }
  @scala.inline
  implicit class GridPageableOps[Self <: GridPageable] (val x: Self) extends AnyVal {
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
    def setAlwaysVisible(value: Boolean): Self = this.set("alwaysVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysVisible: Self = this.set("alwaysVisible", js.undefined)
    @scala.inline
    def setButtonCount(value: Double): Self = this.set("buttonCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonCount: Self = this.set("buttonCount", js.undefined)
    @scala.inline
    def setInfo(value: Boolean): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setInput(value: Boolean): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setMessages(value: GridPageableMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setNumeric(value: Boolean): Self = this.set("numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageSizes(value: Boolean | js.Any): Self = this.set("pageSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizes: Self = this.set("pageSizes", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPreviousNext(value: Boolean): Self = this.set("previousNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousNext: Self = this.set("previousNext", js.undefined)
    @scala.inline
    def setRefresh(value: Boolean): Self = this.set("refresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    @scala.inline
    def setResponsive(value: Boolean): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
  }
  
}

