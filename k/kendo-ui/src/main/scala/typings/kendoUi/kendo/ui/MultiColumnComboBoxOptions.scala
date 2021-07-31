package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiColumnComboBoxOptions extends StObject {
  
  var animation: js.UndefOr[MultiColumnComboBoxAnimation] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  
  var cascade: js.UndefOr[js.Function1[/* e */ MultiColumnComboBoxCascadeEvent, Unit]] = js.undefined
  
  var cascadeFrom: js.UndefOr[String] = js.undefined
  
  var cascadeFromField: js.UndefOr[String] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ MultiColumnComboBoxChangeEvent, Unit]] = js.undefined
  
  var clearButton: js.UndefOr[Boolean] = js.undefined
  
  var close: js.UndefOr[js.Function1[/* e */ MultiColumnComboBoxCloseEvent, Unit]] = js.undefined
  
  var columns: js.UndefOr[js.Array[MultiColumnComboBoxColumn]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ MultiColumnComboBoxDataBoundEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  
  var dataTextField: js.UndefOr[String] = js.undefined
  
  var dataValueField: js.UndefOr[String] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var dropDownWidth: js.UndefOr[String | Double] = js.undefined
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  var enforceMinLength: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var filterFields: js.UndefOr[js.Any] = js.undefined
  
  var filtering: js.UndefOr[js.Function1[/* e */ MultiColumnComboBoxFilteringEvent, Unit]] = js.undefined
  
  var fixedGroupTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var footerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var groupTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var headerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var highlightFirst: js.UndefOr[Boolean] = js.undefined
  
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var noDataTemplate: js.UndefOr[String | js.Function | Boolean] = js.undefined
  
  var open: js.UndefOr[js.Function1[/* e */ MultiColumnComboBoxOpenEvent, Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var popup: js.UndefOr[MultiColumnComboBoxPopup] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ MultiColumnComboBoxSelectEvent, Unit]] = js.undefined
  
  var suggest: js.UndefOr[Boolean] = js.undefined
  
  var syncValueAndText: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
  
  var valuePrimitive: js.UndefOr[Boolean] = js.undefined
  
  var virtual: js.UndefOr[Boolean | MultiColumnComboBoxVirtual] = js.undefined
}
object MultiColumnComboBoxOptions {
  
  @scala.inline
  def apply(): MultiColumnComboBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiColumnComboBoxOptions]
  }
  
  @scala.inline
  implicit class MultiColumnComboBoxOptionsMutableBuilder[Self <: MultiColumnComboBoxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: MultiColumnComboBoxAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
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
    def setCascade(value: /* e */ MultiColumnComboBoxCascadeEvent => Unit): Self = StObject.set(x, "cascade", js.Any.fromFunction1(value))
    
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
    def setChange(value: /* e */ MultiColumnComboBoxChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ MultiColumnComboBoxCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[MultiColumnComboBoxColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: MultiColumnComboBoxColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDataBound(value: /* e */ MultiColumnComboBoxDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
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
    def setDropDownWidth(value: String | Double): Self = StObject.set(x, "dropDownWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownWidthUndefined: Self = StObject.set(x, "dropDownWidth", js.undefined)
    
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
    def setFilterFields(value: js.Any): Self = StObject.set(x, "filterFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFieldsUndefined: Self = StObject.set(x, "filterFields", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFiltering(value: /* e */ MultiColumnComboBoxFilteringEvent => Unit): Self = StObject.set(x, "filtering", js.Any.fromFunction1(value))
    
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
    def setOpen(value: /* e */ MultiColumnComboBoxOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setPopup(value: MultiColumnComboBoxPopup): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ MultiColumnComboBoxSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
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
    def setVirtual(value: Boolean | MultiColumnComboBoxVirtual): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
