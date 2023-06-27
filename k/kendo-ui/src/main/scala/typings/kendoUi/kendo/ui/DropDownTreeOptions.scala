package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.HierarchicalDataSource
import typings.kendoUi.kendoUiStrings.auto
import typings.kendoUi.kendoUiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownTreeOptions
  extends StObject
     with AllEditorOptions {
  
  var adaptiveMode: js.UndefOr[none | auto] = js.undefined
  
  var animation: js.UndefOr[Boolean | DropDownTreeAnimation] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ DropDownTreeChangeEvent, Unit]] = js.undefined
  
  var checkAll: js.UndefOr[Boolean] = js.undefined
  
  var checkAllTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var checkboxes: js.UndefOr[Boolean | DropDownTreeCheckboxes] = js.undefined
  
  var clearButton: js.UndefOr[Boolean] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ DropDownTreeCloseEvent, Unit]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ DropDownTreeDataBoundEvent, Unit]] = js.undefined
  
  var dataImageUrlField: js.UndefOr[String] = js.undefined
  
  var dataSource: js.UndefOr[Any | HierarchicalDataSource] = js.undefined
  
  var dataSpriteCssClassField: js.UndefOr[String] = js.undefined
  
  var dataTextField: js.UndefOr[String | Any] = js.undefined
  
  var dataUrlField: js.UndefOr[String] = js.undefined
  
  var dataValueField: js.UndefOr[String | Any] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  var enforceMinLength: js.UndefOr[Boolean] = js.undefined
  
  var fillMode: js.UndefOr[String] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var filterLabel: js.UndefOr[String] = js.undefined
  
  var filtering: js.UndefOr[js.Function1[/* e */ DropDownTreeFilteringEvent, Unit]] = js.undefined
  
  var footerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var headerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String | js.Function | BaseLabel] = js.undefined
  
  var loadOnDemand: js.UndefOr[Boolean] = js.undefined
  
  var messages: js.UndefOr[DropDownTreeMessages] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var noDataTemplate: js.UndefOr[String | js.Function | Boolean] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ DropDownTreeOpenEvent, Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var popup: js.UndefOr[DropDownTreePopup] = js.undefined
  
  var rounded: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ DropDownTreeSelectEvent, Unit]] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var tagMode: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String | Any] = js.undefined
  
  var valuePrimitive: js.UndefOr[Boolean] = js.undefined
  
  var valueTemplate: js.UndefOr[String | js.Function] = js.undefined
}
object DropDownTreeOptions {
  
  inline def apply(): DropDownTreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownTreeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropDownTreeOptions] (val x: Self) extends AnyVal {
    
    inline def setAdaptiveMode(value: none | auto): Self = StObject.set(x, "adaptiveMode", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveModeUndefined: Self = StObject.set(x, "adaptiveMode", js.undefined)
    
    inline def setAnimation(value: Boolean | DropDownTreeAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    inline def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
    
    inline def setChange(value: /* e */ DropDownTreeChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setCheckAll(value: Boolean): Self = StObject.set(x, "checkAll", value.asInstanceOf[js.Any])
    
    inline def setCheckAllTemplate(value: String | js.Function): Self = StObject.set(x, "checkAllTemplate", value.asInstanceOf[js.Any])
    
    inline def setCheckAllTemplateUndefined: Self = StObject.set(x, "checkAllTemplate", js.undefined)
    
    inline def setCheckAllUndefined: Self = StObject.set(x, "checkAll", js.undefined)
    
    inline def setCheckboxes(value: Boolean | DropDownTreeCheckboxes): Self = StObject.set(x, "checkboxes", value.asInstanceOf[js.Any])
    
    inline def setCheckboxesUndefined: Self = StObject.set(x, "checkboxes", js.undefined)
    
    inline def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
    
    inline def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
    
    inline def setClose(value: /* e */ DropDownTreeCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setDataBound(value: /* e */ DropDownTreeDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataImageUrlField(value: String): Self = StObject.set(x, "dataImageUrlField", value.asInstanceOf[js.Any])
    
    inline def setDataImageUrlFieldUndefined: Self = StObject.set(x, "dataImageUrlField", js.undefined)
    
    inline def setDataSource(value: Any | HierarchicalDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSpriteCssClassField(value: String): Self = StObject.set(x, "dataSpriteCssClassField", value.asInstanceOf[js.Any])
    
    inline def setDataSpriteCssClassFieldUndefined: Self = StObject.set(x, "dataSpriteCssClassField", js.undefined)
    
    inline def setDataTextField(value: String | Any): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    inline def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    inline def setDataUrlField(value: String): Self = StObject.set(x, "dataUrlField", value.asInstanceOf[js.Any])
    
    inline def setDataUrlFieldUndefined: Self = StObject.set(x, "dataUrlField", js.undefined)
    
    inline def setDataValueField(value: String | Any): Self = StObject.set(x, "dataValueField", value.asInstanceOf[js.Any])
    
    inline def setDataValueFieldUndefined: Self = StObject.set(x, "dataValueField", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setEnforceMinLength(value: Boolean): Self = StObject.set(x, "enforceMinLength", value.asInstanceOf[js.Any])
    
    inline def setEnforceMinLengthUndefined: Self = StObject.set(x, "enforceMinLength", js.undefined)
    
    inline def setFillMode(value: String): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
    
    inline def setFillModeUndefined: Self = StObject.set(x, "fillMode", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterLabel(value: String): Self = StObject.set(x, "filterLabel", value.asInstanceOf[js.Any])
    
    inline def setFilterLabelUndefined: Self = StObject.set(x, "filterLabel", js.undefined)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFiltering(value: /* e */ DropDownTreeFilteringEvent => Unit): Self = StObject.set(x, "filtering", js.Any.fromFunction1(value))
    
    inline def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
    
    inline def setFooterTemplate(value: String | js.Function): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    inline def setHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setLabel(value: String | js.Function | BaseLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLoadOnDemand(value: Boolean): Self = StObject.set(x, "loadOnDemand", value.asInstanceOf[js.Any])
    
    inline def setLoadOnDemandUndefined: Self = StObject.set(x, "loadOnDemand", js.undefined)
    
    inline def setMessages(value: DropDownTreeMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoDataTemplate(value: String | js.Function | Boolean): Self = StObject.set(x, "noDataTemplate", value.asInstanceOf[js.Any])
    
    inline def setNoDataTemplateUndefined: Self = StObject.set(x, "noDataTemplate", js.undefined)
    
    inline def setOpen(value: /* e */ DropDownTreeOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPopup(value: DropDownTreePopup): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setSelect(value: /* e */ DropDownTreeSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTagMode(value: String): Self = StObject.set(x, "tagMode", value.asInstanceOf[js.Any])
    
    inline def setTagModeUndefined: Self = StObject.set(x, "tagMode", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: String | Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValuePrimitive(value: Boolean): Self = StObject.set(x, "valuePrimitive", value.asInstanceOf[js.Any])
    
    inline def setValuePrimitiveUndefined: Self = StObject.set(x, "valuePrimitive", js.undefined)
    
    inline def setValueTemplate(value: String | js.Function): Self = StObject.set(x, "valueTemplate", value.asInstanceOf[js.Any])
    
    inline def setValueTemplateUndefined: Self = StObject.set(x, "valueTemplate", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
