package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownListOptions extends js.Object {
  
  var animation: js.UndefOr[Boolean | DropDownListAnimation] = js.native
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var autoWidth: js.UndefOr[Boolean] = js.native
  
  var cascade: js.UndefOr[js.Function1[/* e */ DropDownListCascadeEvent, Unit]] = js.native
  
  var cascadeFrom: js.UndefOr[String] = js.native
  
  var cascadeFromField: js.UndefOr[String] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ DropDownListChangeEvent, Unit]] = js.native
  
  var close: js.UndefOr[js.Function1[/* e */ DropDownListCloseEvent, Unit]] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ DropDownListDataBoundEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var dataTextField: js.UndefOr[String] = js.native
  
  var dataValueField: js.UndefOr[String] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var enable: js.UndefOr[Boolean] = js.native
  
  var enforceMinLength: js.UndefOr[Boolean] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var filtering: js.UndefOr[js.Function1[/* e */ DropDownListFilteringEvent, Unit]] = js.native
  
  var fixedGroupTemplate: js.UndefOr[String | js.Function] = js.native
  
  var footerTemplate: js.UndefOr[String | js.Function] = js.native
  
  var groupTemplate: js.UndefOr[String | js.Function] = js.native
  
  var headerTemplate: js.UndefOr[String | js.Function] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var noDataTemplate: js.UndefOr[String | js.Function | Boolean] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ DropDownListOpenEvent, Unit]] = js.native
  
  var optionLabel: js.UndefOr[String | js.Any] = js.native
  
  var optionLabelTemplate: js.UndefOr[String | js.Function] = js.native
  
  var popup: js.UndefOr[DropDownListPopup] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ DropDownListSelectEvent, Unit]] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var valuePrimitive: js.UndefOr[Boolean] = js.native
  
  var valueTemplate: js.UndefOr[String | js.Function] = js.native
  
  var virtual: js.UndefOr[Boolean | DropDownListVirtual] = js.native
}
object DropDownListOptions {
  
  @scala.inline
  def apply(): DropDownListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownListOptions]
  }
  
  @scala.inline
  implicit class DropDownListOptionsOps[Self <: DropDownListOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: Boolean | DropDownListAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoWidth: Self = this.set("autoWidth", js.undefined)
    
    @scala.inline
    def setCascade(value: /* e */ DropDownListCascadeEvent => Unit): Self = this.set("cascade", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    
    @scala.inline
    def setCascadeFrom(value: String): Self = this.set("cascadeFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCascadeFrom: Self = this.set("cascadeFrom", js.undefined)
    
    @scala.inline
    def setCascadeFromField(value: String): Self = this.set("cascadeFromField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCascadeFromField: Self = this.set("cascadeFromField", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ DropDownListChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ DropDownListCloseEvent => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ DropDownListDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
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
    def setFiltering(value: /* e */ DropDownListFilteringEvent => Unit): Self = this.set("filtering", js.Any.fromFunction1(value))
    
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
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
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
    def setOpen(value: /* e */ DropDownListOpenEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOptionLabel(value: String | js.Any): Self = this.set("optionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionLabel: Self = this.set("optionLabel", js.undefined)
    
    @scala.inline
    def setOptionLabelTemplate(value: String | js.Function): Self = this.set("optionLabelTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionLabelTemplate: Self = this.set("optionLabelTemplate", js.undefined)
    
    @scala.inline
    def setPopup(value: DropDownListPopup): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ DropDownListSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setVirtual(value: Boolean | DropDownListVirtual): Self = this.set("virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
}
