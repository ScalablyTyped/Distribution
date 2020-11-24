package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComboBoxOptions extends js.Object {
  
  var animation: js.UndefOr[ComboBoxAnimation] = js.native
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var autoWidth: js.UndefOr[Boolean] = js.native
  
  var cascade: js.UndefOr[js.Function1[/* e */ ComboBoxCascadeEvent, Unit]] = js.native
  
  var cascadeFrom: js.UndefOr[String] = js.native
  
  var cascadeFromField: js.UndefOr[String] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ ComboBoxChangeEvent, Unit]] = js.native
  
  var clearButton: js.UndefOr[Boolean] = js.native
  
  var close: js.UndefOr[js.Function1[/* e */ ComboBoxCloseEvent, Unit]] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ ComboBoxDataBoundEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.native
  
  var dataTextField: js.UndefOr[String] = js.native
  
  var dataValueField: js.UndefOr[String] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var enable: js.UndefOr[Boolean] = js.native
  
  var enforceMinLength: js.UndefOr[Boolean] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var filtering: js.UndefOr[js.Function1[/* e */ ComboBoxFilteringEvent, Unit]] = js.native
  
  var fixedGroupTemplate: js.UndefOr[String | js.Function] = js.native
  
  var footerTemplate: js.UndefOr[String | js.Function] = js.native
  
  var groupTemplate: js.UndefOr[String | js.Function] = js.native
  
  var headerTemplate: js.UndefOr[String | js.Function] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var highlightFirst: js.UndefOr[Boolean] = js.native
  
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var noDataTemplate: js.UndefOr[String | js.Function | Boolean] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ ComboBoxOpenEvent, Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var popup: js.UndefOr[ComboBoxPopup] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ ComboBoxSelectEvent, Unit]] = js.native
  
  var suggest: js.UndefOr[Boolean] = js.native
  
  var syncValueAndText: js.UndefOr[Boolean] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var valuePrimitive: js.UndefOr[Boolean] = js.native
  
  var virtual: js.UndefOr[Boolean | ComboBoxVirtual] = js.native
}
object ComboBoxOptions {
  
  @scala.inline
  def apply(): ComboBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboBoxOptions]
  }
  
  @scala.inline
  implicit class ComboBoxOptionsOps[Self <: ComboBoxOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: ComboBoxAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
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
    def setCascade(value: /* e */ ComboBoxCascadeEvent => Unit): Self = this.set("cascade", js.Any.fromFunction1(value))
    
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
    def setChange(value: /* e */ ComboBoxChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClearButton(value: Boolean): Self = this.set("clearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearButton: Self = this.set("clearButton", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ ComboBoxCloseEvent => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ ComboBoxDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
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
    def setFiltering(value: /* e */ ComboBoxFilteringEvent => Unit): Self = this.set("filtering", js.Any.fromFunction1(value))
    
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
    def setOpen(value: /* e */ ComboBoxOpenEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPopup(value: ComboBoxPopup): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ ComboBoxSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSuggest(value: Boolean): Self = this.set("suggest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggest: Self = this.set("suggest", js.undefined)
    
    @scala.inline
    def setSyncValueAndText(value: Boolean): Self = this.set("syncValueAndText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncValueAndText: Self = this.set("syncValueAndText", js.undefined)
    
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
    def setVirtual(value: Boolean | ComboBoxVirtual): Self = this.set("virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtual: Self = this.set("virtual", js.undefined)
  }
}
