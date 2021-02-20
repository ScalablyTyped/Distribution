package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.data.DataSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridColumn extends StObject {
  
  var aggregates: js.UndefOr[js.Any] = js.native
  
  var attributes: js.UndefOr[js.Any] = js.native
  
  var columns: js.UndefOr[js.Any] = js.native
  
  var command: js.UndefOr[String | (js.Array[GridColumnCommandItem | String]) | GridColumnCommandItem] = js.native
  
  var dataSource: js.UndefOr[DataSource | DataSourceOptions] = js.native
  
  var dataTextField: js.UndefOr[String] = js.native
  
  var dataValueField: js.UndefOr[String] = js.native
  
  var editable: js.UndefOr[js.Function] = js.native
  
  var editor: js.UndefOr[
    js.Function2[/* container */ JQuery, /* options */ GridColumnEditorOptions, Unit]
  ] = js.native
  
  var encoded: js.UndefOr[Boolean] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var filterable: js.UndefOr[Boolean | GridColumnFilterable] = js.native
  
  var footerAttributes: js.UndefOr[js.Any] = js.native
  
  var footerTemplate: js.UndefOr[String | js.Function] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var groupFooterTemplate: js.UndefOr[String | js.Function] = js.native
  
  var groupHeaderColumnTemplate: js.UndefOr[String | js.Function] = js.native
  
  var groupHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  
  var groupable: js.UndefOr[Boolean | GridColumnGroupable] = js.native
  
  var headerAttributes: js.UndefOr[js.Any] = js.native
  
  var headerTemplate: js.UndefOr[String | js.Function] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var lockable: js.UndefOr[Boolean] = js.native
  
  var locked: js.UndefOr[Boolean] = js.native
  
  var media: js.UndefOr[String] = js.native
  
  var menu: js.UndefOr[Boolean] = js.native
  
  var minResizableWidth: js.UndefOr[Double] = js.native
  
  var minScreenWidth: js.UndefOr[Double] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var sortable: js.UndefOr[Boolean | GridColumnSortable] = js.native
  
  var stickable: js.UndefOr[Boolean] = js.native
  
  var sticky: js.UndefOr[Boolean] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var values: js.UndefOr[js.Any] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
}
object GridColumn {
  
  @scala.inline
  def apply(): GridColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumn]
  }
  
  @scala.inline
  implicit class GridColumnMutableBuilder[Self <: GridColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregates(value: js.Any): Self = StObject.set(x, "aggregates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatesUndefined: Self = StObject.set(x, "aggregates", js.undefined)
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setCommand(value: String | (js.Array[GridColumnCommandItem | String]) | GridColumnCommandItem): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: (GridColumnCommandItem | String)*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: DataSource | DataSourceOptions): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
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
    def setEditable(value: js.Function): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEditor(value: (/* container */ JQuery, /* options */ GridColumnEditorOptions) => Unit): Self = StObject.set(x, "editor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    @scala.inline
    def setEncoded(value: Boolean): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedUndefined: Self = StObject.set(x, "encoded", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean | GridColumnFilterable): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    @scala.inline
    def setFooterAttributes(value: js.Any): Self = StObject.set(x, "footerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterAttributesUndefined: Self = StObject.set(x, "footerAttributes", js.undefined)
    
    @scala.inline
    def setFooterTemplate(value: String | js.Function): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGroupFooterTemplate(value: String | js.Function): Self = StObject.set(x, "groupFooterTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupFooterTemplateUndefined: Self = StObject.set(x, "groupFooterTemplate", js.undefined)
    
    @scala.inline
    def setGroupHeaderColumnTemplate(value: String | js.Function): Self = StObject.set(x, "groupHeaderColumnTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupHeaderColumnTemplateUndefined: Self = StObject.set(x, "groupHeaderColumnTemplate", js.undefined)
    
    @scala.inline
    def setGroupHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "groupHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupHeaderTemplateUndefined: Self = StObject.set(x, "groupHeaderTemplate", js.undefined)
    
    @scala.inline
    def setGroupable(value: Boolean | GridColumnGroupable): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupableUndefined: Self = StObject.set(x, "groupable", js.undefined)
    
    @scala.inline
    def setHeaderAttributes(value: js.Any): Self = StObject.set(x, "headerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderAttributesUndefined: Self = StObject.set(x, "headerAttributes", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setLockable(value: Boolean): Self = StObject.set(x, "lockable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockableUndefined: Self = StObject.set(x, "lockable", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setMenu(value: Boolean): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setMinResizableWidth(value: Double): Self = StObject.set(x, "minResizableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinResizableWidthUndefined: Self = StObject.set(x, "minResizableWidth", js.undefined)
    
    @scala.inline
    def setMinScreenWidth(value: Double): Self = StObject.set(x, "minScreenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScreenWidthUndefined: Self = StObject.set(x, "minScreenWidth", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean | GridColumnSortable): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    @scala.inline
    def setStickable(value: Boolean): Self = StObject.set(x, "stickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickableUndefined: Self = StObject.set(x, "stickable", js.undefined)
    
    @scala.inline
    def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
