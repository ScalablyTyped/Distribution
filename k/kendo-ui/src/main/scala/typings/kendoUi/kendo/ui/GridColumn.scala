package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.data.DataSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridColumn extends StObject {
  
  var aggregates: js.UndefOr[Any] = js.undefined
  
  var attributes: js.UndefOr[Any] = js.undefined
  
  var columnMenu: js.UndefOr[Boolean] = js.undefined
  
  var columns: js.UndefOr[Any] = js.undefined
  
  var command: js.UndefOr[String | (js.Array[GridColumnCommandItem | String]) | GridColumnCommandItem] = js.undefined
  
  var dataSource: js.UndefOr[DataSource | DataSourceOptions] = js.undefined
  
  var dataTextField: js.UndefOr[String] = js.undefined
  
  var dataValueField: js.UndefOr[String] = js.undefined
  
  var editable: js.UndefOr[js.Function] = js.undefined
  
  var editor: js.UndefOr[
    js.Function2[/* container */ JQuery, /* options */ GridColumnEditorOptions, Unit]
  ] = js.undefined
  
  var encoded: js.UndefOr[Boolean] = js.undefined
  
  var exportable: js.UndefOr[Boolean | GridColumnExportable] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var filterable: js.UndefOr[Boolean | GridColumnFilterable] = js.undefined
  
  var footerAttributes: js.UndefOr[Any] = js.undefined
  
  var footerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var groupFooterTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var groupHeaderColumnTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var groupHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var groupable: js.UndefOr[Boolean | GridColumnGroupable] = js.undefined
  
  var headerAttributes: js.UndefOr[Any] = js.undefined
  
  var headerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var hideOnGroup: js.UndefOr[Boolean] = js.undefined
  
  var lockable: js.UndefOr[Boolean] = js.undefined
  
  var locked: js.UndefOr[Boolean] = js.undefined
  
  var media: js.UndefOr[String] = js.undefined
  
  var menu: js.UndefOr[Boolean] = js.undefined
  
  var minResizableWidth: js.UndefOr[Double] = js.undefined
  
  var minScreenWidth: js.UndefOr[Double] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var sortable: js.UndefOr[Boolean | GridColumnSortable] = js.undefined
  
  var stickable: js.UndefOr[Boolean] = js.undefined
  
  var sticky: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[Any] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object GridColumn {
  
  inline def apply(): GridColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridColumn] (val x: Self) extends AnyVal {
    
    inline def setAggregates(value: Any): Self = StObject.set(x, "aggregates", value.asInstanceOf[js.Any])
    
    inline def setAggregatesUndefined: Self = StObject.set(x, "aggregates", js.undefined)
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setColumnMenu(value: Boolean): Self = StObject.set(x, "columnMenu", value.asInstanceOf[js.Any])
    
    inline def setColumnMenuUndefined: Self = StObject.set(x, "columnMenu", js.undefined)
    
    inline def setColumns(value: Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setCommand(value: String | (js.Array[GridColumnCommandItem | String]) | GridColumnCommandItem): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCommandVarargs(value: (GridColumnCommandItem | String)*): Self = StObject.set(x, "command", js.Array(value*))
    
    inline def setDataSource(value: DataSource | DataSourceOptions): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataTextField(value: String): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    inline def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    inline def setDataValueField(value: String): Self = StObject.set(x, "dataValueField", value.asInstanceOf[js.Any])
    
    inline def setDataValueFieldUndefined: Self = StObject.set(x, "dataValueField", js.undefined)
    
    inline def setEditable(value: js.Function): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEditor(value: (/* container */ JQuery, /* options */ GridColumnEditorOptions) => Unit): Self = StObject.set(x, "editor", js.Any.fromFunction2(value))
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setEncoded(value: Boolean): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
    
    inline def setEncodedUndefined: Self = StObject.set(x, "encoded", js.undefined)
    
    inline def setExportable(value: Boolean | GridColumnExportable): Self = StObject.set(x, "exportable", value.asInstanceOf[js.Any])
    
    inline def setExportableUndefined: Self = StObject.set(x, "exportable", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFilterable(value: Boolean | GridColumnFilterable): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    inline def setFooterAttributes(value: Any): Self = StObject.set(x, "footerAttributes", value.asInstanceOf[js.Any])
    
    inline def setFooterAttributesUndefined: Self = StObject.set(x, "footerAttributes", js.undefined)
    
    inline def setFooterTemplate(value: String | js.Function): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGroupFooterTemplate(value: String | js.Function): Self = StObject.set(x, "groupFooterTemplate", value.asInstanceOf[js.Any])
    
    inline def setGroupFooterTemplateUndefined: Self = StObject.set(x, "groupFooterTemplate", js.undefined)
    
    inline def setGroupHeaderColumnTemplate(value: String | js.Function): Self = StObject.set(x, "groupHeaderColumnTemplate", value.asInstanceOf[js.Any])
    
    inline def setGroupHeaderColumnTemplateUndefined: Self = StObject.set(x, "groupHeaderColumnTemplate", js.undefined)
    
    inline def setGroupHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "groupHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setGroupHeaderTemplateUndefined: Self = StObject.set(x, "groupHeaderTemplate", js.undefined)
    
    inline def setGroupable(value: Boolean | GridColumnGroupable): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
    
    inline def setGroupableUndefined: Self = StObject.set(x, "groupable", js.undefined)
    
    inline def setHeaderAttributes(value: Any): Self = StObject.set(x, "headerAttributes", value.asInstanceOf[js.Any])
    
    inline def setHeaderAttributesUndefined: Self = StObject.set(x, "headerAttributes", js.undefined)
    
    inline def setHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHideOnGroup(value: Boolean): Self = StObject.set(x, "hideOnGroup", value.asInstanceOf[js.Any])
    
    inline def setHideOnGroupUndefined: Self = StObject.set(x, "hideOnGroup", js.undefined)
    
    inline def setLockable(value: Boolean): Self = StObject.set(x, "lockable", value.asInstanceOf[js.Any])
    
    inline def setLockableUndefined: Self = StObject.set(x, "lockable", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setMenu(value: Boolean): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setMinResizableWidth(value: Double): Self = StObject.set(x, "minResizableWidth", value.asInstanceOf[js.Any])
    
    inline def setMinResizableWidthUndefined: Self = StObject.set(x, "minResizableWidth", js.undefined)
    
    inline def setMinScreenWidth(value: Double): Self = StObject.set(x, "minScreenWidth", value.asInstanceOf[js.Any])
    
    inline def setMinScreenWidthUndefined: Self = StObject.set(x, "minScreenWidth", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSortable(value: Boolean | GridColumnSortable): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setStickable(value: Boolean): Self = StObject.set(x, "stickable", value.asInstanceOf[js.Any])
    
    inline def setStickableUndefined: Self = StObject.set(x, "stickable", js.undefined)
    
    inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
