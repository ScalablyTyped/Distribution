package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.HierarchicalDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownTreeOptions extends js.Object {
  var animation: js.UndefOr[Boolean | DropDownTreeAnimation] = js.native
  var autoBind: js.UndefOr[Boolean] = js.native
  var autoClose: js.UndefOr[Boolean] = js.native
  var autoWidth: js.UndefOr[Boolean] = js.native
  var change: js.UndefOr[js.Function1[/* e */ DropDownTreeChangeEvent, Unit]] = js.native
  var checkAll: js.UndefOr[Boolean] = js.native
  var checkAllTemplate: js.UndefOr[String | js.Function] = js.native
  var checkboxes: js.UndefOr[Boolean | DropDownTreeCheckboxes] = js.native
  var clearButton: js.UndefOr[Boolean] = js.native
  var close: js.UndefOr[js.Function1[/* e */ DropDownTreeCloseEvent, Unit]] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ DropDownTreeDataBoundEvent, Unit]] = js.native
  var dataImageUrlField: js.UndefOr[String] = js.native
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.native
  var dataSpriteCssClassField: js.UndefOr[String] = js.native
  var dataTextField: js.UndefOr[String | js.Any] = js.native
  var dataUrlField: js.UndefOr[String] = js.native
  var dataValueField: js.UndefOr[String | js.Any] = js.native
  var delay: js.UndefOr[Double] = js.native
  var enable: js.UndefOr[Boolean] = js.native
  var enforceMinLength: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[String] = js.native
  var filtering: js.UndefOr[js.Function1[/* e */ DropDownTreeFilteringEvent, Unit]] = js.native
  var footerTemplate: js.UndefOr[String | js.Function] = js.native
  var headerTemplate: js.UndefOr[String | js.Function] = js.native
  var height: js.UndefOr[String | Double] = js.native
  var ignoreCase: js.UndefOr[Boolean] = js.native
  var loadOnDemand: js.UndefOr[Boolean] = js.native
  var messages: js.UndefOr[DropDownTreeMessages] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var noDataTemplate: js.UndefOr[String | js.Function | Boolean] = js.native
  var open: js.UndefOr[js.Function1[/* e */ DropDownTreeOpenEvent, Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var popup: js.UndefOr[DropDownTreePopup] = js.native
  var select: js.UndefOr[js.Function1[/* e */ DropDownTreeSelectEvent, Unit]] = js.native
  var tagMode: js.UndefOr[String] = js.native
  var template: js.UndefOr[String | js.Function] = js.native
  var text: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | js.Any] = js.native
  var valuePrimitive: js.UndefOr[Boolean] = js.native
  var valueTemplate: js.UndefOr[String | js.Function] = js.native
}

object DropDownTreeOptions {
  @scala.inline
  def apply(): DropDownTreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownTreeOptions]
  }
  @scala.inline
  implicit class DropDownTreeOptionsOps[Self <: DropDownTreeOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean | DropDownTreeAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    @scala.inline
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    @scala.inline
    def setAutoWidth(value: Boolean): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoWidth: Self = this.set("autoWidth", js.undefined)
    @scala.inline
    def setChange(value: /* e */ DropDownTreeChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setCheckAll(value: Boolean): Self = this.set("checkAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckAll: Self = this.set("checkAll", js.undefined)
    @scala.inline
    def setCheckAllTemplate(value: String | js.Function): Self = this.set("checkAllTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckAllTemplate: Self = this.set("checkAllTemplate", js.undefined)
    @scala.inline
    def setCheckboxes(value: Boolean | DropDownTreeCheckboxes): Self = this.set("checkboxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckboxes: Self = this.set("checkboxes", js.undefined)
    @scala.inline
    def setClearButton(value: Boolean): Self = this.set("clearButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearButton: Self = this.set("clearButton", js.undefined)
    @scala.inline
    def setClose(value: /* e */ DropDownTreeCloseEvent => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setDataBound(value: /* e */ DropDownTreeDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataImageUrlField(value: String): Self = this.set("dataImageUrlField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataImageUrlField: Self = this.set("dataImageUrlField", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any | HierarchicalDataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDataSpriteCssClassField(value: String): Self = this.set("dataSpriteCssClassField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSpriteCssClassField: Self = this.set("dataSpriteCssClassField", js.undefined)
    @scala.inline
    def setDataTextField(value: String | js.Any): Self = this.set("dataTextField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTextField: Self = this.set("dataTextField", js.undefined)
    @scala.inline
    def setDataUrlField(value: String): Self = this.set("dataUrlField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataUrlField: Self = this.set("dataUrlField", js.undefined)
    @scala.inline
    def setDataValueField(value: String | js.Any): Self = this.set("dataValueField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataValueField: Self = this.set("dataValueField", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setEnforceMinLength(value: Boolean): Self = this.set("enforceMinLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceMinLength: Self = this.set("enforceMinLength", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFiltering(value: /* e */ DropDownTreeFilteringEvent => Unit): Self = this.set("filtering", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFiltering: Self = this.set("filtering", js.undefined)
    @scala.inline
    def setFooterTemplate(value: String | js.Function): Self = this.set("footerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterTemplate: Self = this.set("footerTemplate", js.undefined)
    @scala.inline
    def setHeaderTemplate(value: String | js.Function): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    @scala.inline
    def setLoadOnDemand(value: Boolean): Self = this.set("loadOnDemand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadOnDemand: Self = this.set("loadOnDemand", js.undefined)
    @scala.inline
    def setMessages(value: DropDownTreeMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNoDataTemplate(value: String | js.Function | Boolean): Self = this.set("noDataTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDataTemplate: Self = this.set("noDataTemplate", js.undefined)
    @scala.inline
    def setOpen(value: /* e */ DropDownTreeOpenEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPopup(value: DropDownTreePopup): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    @scala.inline
    def setSelect(value: /* e */ DropDownTreeSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setTagMode(value: String): Self = this.set("tagMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagMode: Self = this.set("tagMode", js.undefined)
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setValue(value: String | js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValuePrimitive(value: Boolean): Self = this.set("valuePrimitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValuePrimitive: Self = this.set("valuePrimitive", js.undefined)
    @scala.inline
    def setValueTemplate(value: String | js.Function): Self = this.set("valueTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueTemplate: Self = this.set("valueTemplate", js.undefined)
  }
  
}

