package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListColumn extends StObject {
  
  var attributes: js.UndefOr[Any] = js.undefined
  
  var columns: js.UndefOr[Any] = js.undefined
  
  var command: js.UndefOr[js.Array[TreeListColumnCommandItem]] = js.undefined
  
  var editable: js.UndefOr[js.Function] = js.undefined
  
  var editor: js.UndefOr[js.Function2[/* container */ JQuery, /* options */ TreeListEditorOptions, Unit]] = js.undefined
  
  var encoded: js.UndefOr[Boolean] = js.undefined
  
  var expandable: js.UndefOr[Boolean] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var filterable: js.UndefOr[Boolean | TreeListColumnFilterable] = js.undefined
  
  var footerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var headerAttributes: js.UndefOr[Any] = js.undefined
  
  var headerTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var includeChildren: js.UndefOr[Boolean] = js.undefined
  
  var lockable: js.UndefOr[Boolean] = js.undefined
  
  var locked: js.UndefOr[Boolean] = js.undefined
  
  var menu: js.UndefOr[Boolean] = js.undefined
  
  var minScreenWidth: js.UndefOr[Double] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var sortable: js.UndefOr[Boolean | TreeListColumnSortable] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
}
object TreeListColumn {
  
  inline def apply(): TreeListColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListColumn]
  }
  
  extension [Self <: TreeListColumn](x: Self) {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setColumns(value: Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setCommand(value: js.Array[TreeListColumnCommandItem]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setCommandVarargs(value: TreeListColumnCommandItem*): Self = StObject.set(x, "command", js.Array(value*))
    
    inline def setEditable(value: js.Function): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEditor(value: (/* container */ JQuery, /* options */ TreeListEditorOptions) => Unit): Self = StObject.set(x, "editor", js.Any.fromFunction2(value))
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setEncoded(value: Boolean): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
    
    inline def setEncodedUndefined: Self = StObject.set(x, "encoded", js.undefined)
    
    inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFilterable(value: Boolean | TreeListColumnFilterable): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    inline def setFooterTemplate(value: String | js.Function): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeaderAttributes(value: Any): Self = StObject.set(x, "headerAttributes", value.asInstanceOf[js.Any])
    
    inline def setHeaderAttributesUndefined: Self = StObject.set(x, "headerAttributes", js.undefined)
    
    inline def setHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIncludeChildren(value: Boolean): Self = StObject.set(x, "includeChildren", value.asInstanceOf[js.Any])
    
    inline def setIncludeChildrenUndefined: Self = StObject.set(x, "includeChildren", js.undefined)
    
    inline def setLockable(value: Boolean): Self = StObject.set(x, "lockable", value.asInstanceOf[js.Any])
    
    inline def setLockableUndefined: Self = StObject.set(x, "lockable", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setMenu(value: Boolean): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setMinScreenWidth(value: Double): Self = StObject.set(x, "minScreenWidth", value.asInstanceOf[js.Any])
    
    inline def setMinScreenWidthUndefined: Self = StObject.set(x, "minScreenWidth", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSortable(value: Boolean | TreeListColumnSortable): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
