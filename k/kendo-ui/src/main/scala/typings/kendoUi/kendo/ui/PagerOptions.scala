package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagerOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.native
  var buttonCount: js.UndefOr[Double] = js.native
  var change: js.UndefOr[js.Function1[/* e */ PagerChangeEvent, Unit]] = js.native
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  var info: js.UndefOr[Boolean] = js.native
  var input: js.UndefOr[Boolean] = js.native
  var linkTemplate: js.UndefOr[String] = js.native
  var messages: js.UndefOr[PagerMessages] = js.native
  var name: js.UndefOr[String] = js.native
  var numeric: js.UndefOr[Boolean] = js.native
  var pageSizes: js.UndefOr[Boolean | js.Any] = js.native
  var previousNext: js.UndefOr[Boolean] = js.native
  var refresh: js.UndefOr[Boolean] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var selectTemplate: js.UndefOr[String] = js.native
}

object PagerOptions {
  @scala.inline
  def apply(): PagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagerOptions]
  }
  @scala.inline
  implicit class PagerOptionsOps[Self <: PagerOptions] (val x: Self) extends AnyVal {
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
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    @scala.inline
    def setButtonCount(value: Double): Self = this.set("buttonCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonCount: Self = this.set("buttonCount", js.undefined)
    @scala.inline
    def setChange(value: /* e */ PagerChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setInfo(value: Boolean): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setInput(value: Boolean): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setLinkTemplate(value: String): Self = this.set("linkTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkTemplate: Self = this.set("linkTemplate", js.undefined)
    @scala.inline
    def setMessages(value: PagerMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNumeric(value: Boolean): Self = this.set("numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    @scala.inline
    def setPageSizes(value: Boolean | js.Any): Self = this.set("pageSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSizes: Self = this.set("pageSizes", js.undefined)
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
    @scala.inline
    def setSelectTemplate(value: String): Self = this.set("selectTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectTemplate: Self = this.set("selectTemplate", js.undefined)
  }
  
}

