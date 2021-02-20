package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComboBoxOptions extends StObject {
  
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
  implicit class ComboBoxOptionsMutableBuilder[Self <: ComboBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: ComboBoxAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
    
    @scala.inline
    def setCascade(value: /* e */ ComboBoxCascadeEvent => Unit): Self = StObject.set(x, "cascade", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCascadeFrom(value: String): Self = StObject.set(x, "cascadeFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadeFromField(value: String): Self = StObject.set(x, "cascadeFromField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadeFromFieldUndefined: Self = StObject.set(x, "cascadeFromField", js.undefined)
    
    @scala.inline
    def setCascadeFromUndefined: Self = StObject.set(x, "cascadeFrom", js.undefined)
    
    @scala.inline
    def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ComboBoxChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ ComboBoxCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ ComboBoxDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataTextField(value: String): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    @scala.inline
    def setDataValueField(value: String): Self = StObject.set(x, "dataValueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataValueFieldUndefined: Self = StObject.set(x, "dataValueField", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setEnforceMinLength(value: Boolean): Self = StObject.set(x, "enforceMinLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceMinLengthUndefined: Self = StObject.set(x, "enforceMinLength", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFiltering(value: /* e */ ComboBoxFilteringEvent => Unit): Self = StObject.set(x, "filtering", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
    
    @scala.inline
    def setFixedGroupTemplate(value: String | js.Function): Self = StObject.set(x, "fixedGroupTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedGroupTemplateUndefined: Self = StObject.set(x, "fixedGroupTemplate", js.undefined)
    
    @scala.inline
    def setFooterTemplate(value: String | js.Function): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    @scala.inline
    def setGroupTemplate(value: String | js.Function): Self = StObject.set(x, "groupTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupTemplateUndefined: Self = StObject.set(x, "groupTemplate", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHighlightFirst(value: Boolean): Self = StObject.set(x, "highlightFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightFirstUndefined: Self = StObject.set(x, "highlightFirst", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNoDataTemplate(value: String | js.Function | Boolean): Self = StObject.set(x, "noDataTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataTemplateUndefined: Self = StObject.set(x, "noDataTemplate", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ ComboBoxOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPopup(value: ComboBoxPopup): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ ComboBoxSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSuggest(value: Boolean): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
    
    @scala.inline
    def setSyncValueAndText(value: Boolean): Self = StObject.set(x, "syncValueAndText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncValueAndTextUndefined: Self = StObject.set(x, "syncValueAndText", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuePrimitive(value: Boolean): Self = StObject.set(x, "valuePrimitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuePrimitiveUndefined: Self = StObject.set(x, "valuePrimitive", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVirtual(value: Boolean | ComboBoxVirtual): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
