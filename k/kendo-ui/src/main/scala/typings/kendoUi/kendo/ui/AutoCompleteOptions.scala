package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendoUiStrings.auto
import typings.kendoUi.kendoUiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCompleteOptions
  extends StObject
     with AllEditorOptions {
  
  var adaptiveMode: js.UndefOr[none | auto] = js.undefined
  
  var animation: js.UndefOr[Boolean | AutoCompleteAnimation] = js.undefined
  
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ AutoCompleteChangeEvent, Unit]] = js.undefined
  
  var clearButton: js.UndefOr[Boolean] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ AutoCompleteCloseEvent, Unit]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ AutoCompleteDataBoundEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[Any | DataSource] = js.undefined
  
  var dataTextField: js.UndefOr[String] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  var enforceMinLength: js.UndefOr[Boolean] = js.undefined
  
  var fillMode: js.UndefOr[String] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var filtering: js.UndefOr[js.Function1[/* e */ AutoCompleteFilteringEvent, Unit]] = js.undefined
  
  var fixedGroupTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var footerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var groupTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var headerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var highlightFirst: js.UndefOr[Boolean] = js.undefined
  
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String | js.Function | BaseLabel] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var noDataTemplate: js.UndefOr[String | js.Function | Boolean] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ AutoCompleteOpenEvent, Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var popup: js.UndefOr[Any] = js.undefined
  
  var rounded: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ AutoCompleteSelectEvent, Unit]] = js.undefined
  
  var separator: js.UndefOr[String | Any] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var suggest: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
  
  var valuePrimitive: js.UndefOr[Boolean] = js.undefined
  
  var virtual: js.UndefOr[Boolean | AutoCompleteVirtual] = js.undefined
}
object AutoCompleteOptions {
  
  inline def apply(): AutoCompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompleteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoCompleteOptions] (val x: Self) extends AnyVal {
    
    inline def setAdaptiveMode(value: none | auto): Self = StObject.set(x, "adaptiveMode", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveModeUndefined: Self = StObject.set(x, "adaptiveMode", js.undefined)
    
    inline def setAnimation(value: Boolean | AutoCompleteAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    inline def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
    
    inline def setChange(value: /* e */ AutoCompleteChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
    
    inline def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
    
    inline def setClose(value: /* e */ AutoCompleteCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDataBound(value: /* e */ AutoCompleteDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: Any | DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataTextField(value: String): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    inline def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setEnforceMinLength(value: Boolean): Self = StObject.set(x, "enforceMinLength", value.asInstanceOf[js.Any])
    
    inline def setEnforceMinLengthUndefined: Self = StObject.set(x, "enforceMinLength", js.undefined)
    
    inline def setFillMode(value: String): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
    
    inline def setFillModeUndefined: Self = StObject.set(x, "fillMode", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFiltering(value: /* e */ AutoCompleteFilteringEvent => Unit): Self = StObject.set(x, "filtering", js.Any.fromFunction1(value))
    
    inline def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
    
    inline def setFixedGroupTemplate(value: String | js.Function): Self = StObject.set(x, "fixedGroupTemplate", value.asInstanceOf[js.Any])
    
    inline def setFixedGroupTemplateUndefined: Self = StObject.set(x, "fixedGroupTemplate", js.undefined)
    
    inline def setFooterTemplate(value: String | js.Function): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    inline def setGroupTemplate(value: String | js.Function): Self = StObject.set(x, "groupTemplate", value.asInstanceOf[js.Any])
    
    inline def setGroupTemplateUndefined: Self = StObject.set(x, "groupTemplate", js.undefined)
    
    inline def setHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHighlightFirst(value: Boolean): Self = StObject.set(x, "highlightFirst", value.asInstanceOf[js.Any])
    
    inline def setHighlightFirstUndefined: Self = StObject.set(x, "highlightFirst", js.undefined)
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setLabel(value: String | js.Function | BaseLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoDataTemplate(value: String | js.Function | Boolean): Self = StObject.set(x, "noDataTemplate", value.asInstanceOf[js.Any])
    
    inline def setNoDataTemplateUndefined: Self = StObject.set(x, "noDataTemplate", js.undefined)
    
    inline def setOpen(value: /* e */ AutoCompleteOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPopup(value: Any): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setSelect(value: /* e */ AutoCompleteSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSeparator(value: String | Any): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSuggest(value: Boolean): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
    
    inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValuePrimitive(value: Boolean): Self = StObject.set(x, "valuePrimitive", value.asInstanceOf[js.Any])
    
    inline def setValuePrimitiveUndefined: Self = StObject.set(x, "valuePrimitive", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVirtual(value: Boolean | AutoCompleteVirtual): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
