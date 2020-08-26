package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiSelectOptions extends js.Object {
  var animation: js.UndefOr[Boolean | MultiSelectAnimation] = js.native
  var autoBind: js.UndefOr[Boolean] = js.native
  var autoClose: js.UndefOr[Boolean] = js.native
  var autoWidth: js.UndefOr[Boolean] = js.native
  var change: js.UndefOr[js.Function1[/* e */ MultiSelectChangeEvent, Unit]] = js.native
  var clearButton: js.UndefOr[Boolean] = js.native
  var close: js.UndefOr[js.Function1[/* e */ MultiSelectCloseEvent, Unit]] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ MultiSelectDataBoundEvent, Unit]] = js.native
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  var dataTextField: js.UndefOr[String] = js.native
  var dataValueField: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Double] = js.native
  var deselect: js.UndefOr[js.Function1[/* e */ MultiSelectDeselectEvent, Unit]] = js.native
  var enable: js.UndefOr[Boolean] = js.native
  var enforceMinLength: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[String] = js.native
  var filtering: js.UndefOr[js.Function1[/* e */ MultiSelectFilteringEvent, Unit]] = js.native
  var fixedGroupTemplate: js.UndefOr[String | js.Function] = js.native
  var footerTemplate: js.UndefOr[String | js.Function] = js.native
  var groupTemplate: js.UndefOr[String | js.Function] = js.native
  var headerTemplate: js.UndefOr[String | js.Function] = js.native
  var height: js.UndefOr[Double] = js.native
  var highlightFirst: js.UndefOr[Boolean] = js.native
  var ignoreCase: js.UndefOr[Boolean] = js.native
  var itemTemplate: js.UndefOr[String | js.Function] = js.native
  var maxSelectedItems: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var noDataTemplate: js.UndefOr[String | js.Function | Boolean] = js.native
  var open: js.UndefOr[js.Function1[/* e */ MultiSelectOpenEvent, Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var popup: js.UndefOr[MultiSelectPopup] = js.native
  var select: js.UndefOr[js.Function1[/* e */ MultiSelectSelectEvent, Unit]] = js.native
  var tagMode: js.UndefOr[String] = js.native
  var tagTemplate: js.UndefOr[String | js.Function] = js.native
  var value: js.UndefOr[js.Any] = js.native
  var valuePrimitive: js.UndefOr[Boolean] = js.native
  var virtual: js.UndefOr[Boolean | MultiSelectVirtual] = js.native
}

object MultiSelectOptions {
  @scala.inline
  def apply(): MultiSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectOptions]
  }
  @scala.inline
  implicit class MultiSelectOptionsOps[Self <: MultiSelectOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean | MultiSelectAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
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
    def setChange(value: /* e */ MultiSelectChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setClearButton(value: Boolean): Self = this.set("clearButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearButton: Self = this.set("clearButton", js.undefined)
    @scala.inline
    def setClose(value: /* e */ MultiSelectCloseEvent => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setDataBound(value: /* e */ MultiSelectDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDataTextField(value: String): Self = this.set("dataTextField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTextField: Self = this.set("dataTextField", js.undefined)
    @scala.inline
    def setDataValueField(value: String): Self = this.set("dataValueField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataValueField: Self = this.set("dataValueField", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDeselect(value: /* e */ MultiSelectDeselectEvent => Unit): Self = this.set("deselect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDeselect: Self = this.set("deselect", js.undefined)
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
    def setFiltering(value: /* e */ MultiSelectFilteringEvent => Unit): Self = this.set("filtering", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFiltering: Self = this.set("filtering", js.undefined)
    @scala.inline
    def setFixedGroupTemplate(value: String | js.Function): Self = this.set("fixedGroupTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedGroupTemplate: Self = this.set("fixedGroupTemplate", js.undefined)
    @scala.inline
    def setFooterTemplate(value: String | js.Function): Self = this.set("footerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterTemplate: Self = this.set("footerTemplate", js.undefined)
    @scala.inline
    def setGroupTemplate(value: String | js.Function): Self = this.set("groupTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupTemplate: Self = this.set("groupTemplate", js.undefined)
    @scala.inline
    def setHeaderTemplate(value: String | js.Function): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHighlightFirst(value: Boolean): Self = this.set("highlightFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightFirst: Self = this.set("highlightFirst", js.undefined)
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    @scala.inline
    def setItemTemplate(value: String | js.Function): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    @scala.inline
    def setMaxSelectedItems(value: Double): Self = this.set("maxSelectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSelectedItems: Self = this.set("maxSelectedItems", js.undefined)
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
    def setOpen(value: /* e */ MultiSelectOpenEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPopup(value: MultiSelectPopup): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    @scala.inline
    def setSelect(value: /* e */ MultiSelectSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setTagMode(value: String): Self = this.set("tagMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagMode: Self = this.set("tagMode", js.undefined)
    @scala.inline
    def setTagTemplate(value: String | js.Function): Self = this.set("tagTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagTemplate: Self = this.set("tagTemplate", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValuePrimitive(value: Boolean): Self = this.set("valuePrimitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValuePrimitive: Self = this.set("valuePrimitive", js.undefined)
    @scala.inline
    def setVirtual(value: Boolean | MultiSelectVirtual): Self = this.set("virtual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
  
}

