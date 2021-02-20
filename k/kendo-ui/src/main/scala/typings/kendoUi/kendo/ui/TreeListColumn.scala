package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListColumn extends StObject {
  
  var attributes: js.UndefOr[js.Any] = js.native
  
  var columns: js.UndefOr[js.Any] = js.native
  
  var command: js.UndefOr[js.Array[TreeListColumnCommandItem]] = js.native
  
  var editable: js.UndefOr[js.Function] = js.native
  
  var editor: js.UndefOr[js.Function2[/* container */ JQuery, /* options */ TreeListEditorOptions, Unit]] = js.native
  
  var encoded: js.UndefOr[Boolean] = js.native
  
  var expandable: js.UndefOr[Boolean] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var filterable: js.UndefOr[Boolean | TreeListColumnFilterable] = js.native
  
  var footerTemplate: js.UndefOr[String | js.Function] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var headerAttributes: js.UndefOr[js.Any] = js.native
  
  var headerTemplate: js.UndefOr[String | js.Function] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var lockable: js.UndefOr[Boolean] = js.native
  
  var locked: js.UndefOr[Boolean] = js.native
  
  var menu: js.UndefOr[Boolean] = js.native
  
  var minScreenWidth: js.UndefOr[Double] = js.native
  
  var sortable: js.UndefOr[Boolean | TreeListColumnSortable] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
}
object TreeListColumn {
  
  @scala.inline
  def apply(): TreeListColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListColumn]
  }
  
  @scala.inline
  implicit class TreeListColumnMutableBuilder[Self <: TreeListColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setCommand(value: js.Array[TreeListColumnCommandItem]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: TreeListColumnCommandItem*): Self = StObject.set(x, "command", js.Array(value :_*))
    
    @scala.inline
    def setEditable(value: js.Function): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEditor(value: (/* container */ JQuery, /* options */ TreeListEditorOptions) => Unit): Self = StObject.set(x, "editor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    @scala.inline
    def setEncoded(value: Boolean): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedUndefined: Self = StObject.set(x, "encoded", js.undefined)
    
    @scala.inline
    def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean | TreeListColumnFilterable): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    @scala.inline
    def setFooterTemplate(value: String | js.Function): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
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
    def setMenu(value: Boolean): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setMinScreenWidth(value: Double): Self = StObject.set(x, "minScreenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScreenWidthUndefined: Self = StObject.set(x, "minScreenWidth", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean | TreeListColumnSortable): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
