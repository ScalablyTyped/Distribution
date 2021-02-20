package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttColumn extends StObject {
  
  var attributes: js.UndefOr[js.Any] = js.native
  
  var columns: js.UndefOr[js.Any] = js.native
  
  var editable: js.UndefOr[Boolean] = js.native
  
  var editor: js.UndefOr[js.Function] = js.native
  
  var expandable: js.UndefOr[Boolean] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var filterable: js.UndefOr[Boolean | GanttColumnFilterable] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var headerAttributes: js.UndefOr[js.Any] = js.native
  
  var headerTemplate: js.UndefOr[String | js.Function] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var menu: js.UndefOr[Boolean] = js.native
  
  var minScreenWidth: js.UndefOr[Double] = js.native
  
  var sortable: js.UndefOr[Boolean | GanttColumnSortable] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
}
object GanttColumn {
  
  @scala.inline
  def apply(): GanttColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttColumn]
  }
  
  @scala.inline
  implicit class GanttColumnMutableBuilder[Self <: GanttColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEditor(value: js.Function): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    @scala.inline
    def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean | GanttColumnFilterable): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
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
    def setMenu(value: Boolean): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setMinScreenWidth(value: Double): Self = StObject.set(x, "minScreenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScreenWidthUndefined: Self = StObject.set(x, "minScreenWidth", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean | GanttColumnSortable): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
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
