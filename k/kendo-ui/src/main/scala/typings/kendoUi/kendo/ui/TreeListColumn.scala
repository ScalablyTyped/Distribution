package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeListColumn extends js.Object {
  
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
  implicit class TreeListColumnOps[Self <: TreeListColumn] (val x: Self) extends AnyVal {
    
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
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Any): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: TreeListColumnCommandItem*): Self = this.set("command", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: js.Array[TreeListColumnCommandItem]): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setEditable(value: js.Function): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setEditor(value: (/* container */ JQuery, /* options */ TreeListEditorOptions) => Unit): Self = this.set("editor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    
    @scala.inline
    def setEncoded(value: Boolean): Self = this.set("encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoded: Self = this.set("encoded", js.undefined)
    
    @scala.inline
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean | TreeListColumnFilterable): Self = this.set("filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    
    @scala.inline
    def setFooterTemplate(value: String | js.Function): Self = this.set("footerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterTemplate: Self = this.set("footerTemplate", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHeaderAttributes(value: js.Any): Self = this.set("headerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderAttributes: Self = this.set("headerAttributes", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: String | js.Function): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setLockable(value: Boolean): Self = this.set("lockable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockable: Self = this.set("lockable", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    
    @scala.inline
    def setMenu(value: Boolean): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setMinScreenWidth(value: Double): Self = this.set("minScreenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinScreenWidth: Self = this.set("minScreenWidth", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean | TreeListColumnSortable): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
