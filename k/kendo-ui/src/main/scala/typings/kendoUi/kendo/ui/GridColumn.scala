package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.DataSource
import typings.kendoUi.kendo.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridColumn extends js.Object {
  
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
  implicit class GridColumnOps[Self <: GridColumn] (val x: Self) extends AnyVal {
    
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
    def setAggregates(value: js.Any): Self = this.set("aggregates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregates: Self = this.set("aggregates", js.undefined)
    
    @scala.inline
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Any): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setCommandVarargs(value: (GridColumnCommandItem | String)*): Self = this.set("command", js.Array(value :_*))
    
    @scala.inline
    def setCommand(value: String | (js.Array[GridColumnCommandItem | String]) | GridColumnCommandItem): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDataTextField(value: String): Self = this.set("dataTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTextField: Self = this.set("dataTextField", js.undefined)
    
    @scala.inline
    def setDataValueField(value: String): Self = this.set("dataValueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataValueField: Self = this.set("dataValueField", js.undefined)
    
    @scala.inline
    def setEditable(value: js.Function): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setEditor(value: (/* container */ JQuery, /* options */ GridColumnEditorOptions) => Unit): Self = this.set("editor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    
    @scala.inline
    def setEncoded(value: Boolean): Self = this.set("encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoded: Self = this.set("encoded", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean | GridColumnFilterable): Self = this.set("filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterable: Self = this.set("filterable", js.undefined)
    
    @scala.inline
    def setFooterAttributes(value: js.Any): Self = this.set("footerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterAttributes: Self = this.set("footerAttributes", js.undefined)
    
    @scala.inline
    def setFooterTemplate(value: String | js.Function): Self = this.set("footerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterTemplate: Self = this.set("footerTemplate", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGroupFooterTemplate(value: String | js.Function): Self = this.set("groupFooterTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupFooterTemplate: Self = this.set("groupFooterTemplate", js.undefined)
    
    @scala.inline
    def setGroupHeaderColumnTemplate(value: String | js.Function): Self = this.set("groupHeaderColumnTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupHeaderColumnTemplate: Self = this.set("groupHeaderColumnTemplate", js.undefined)
    
    @scala.inline
    def setGroupHeaderTemplate(value: String | js.Function): Self = this.set("groupHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupHeaderTemplate: Self = this.set("groupHeaderTemplate", js.undefined)
    
    @scala.inline
    def setGroupable(value: Boolean | GridColumnGroupable): Self = this.set("groupable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupable: Self = this.set("groupable", js.undefined)
    
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
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setMenu(value: Boolean): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu: Self = this.set("menu", js.undefined)
    
    @scala.inline
    def setMinResizableWidth(value: Double): Self = this.set("minResizableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinResizableWidth: Self = this.set("minResizableWidth", js.undefined)
    
    @scala.inline
    def setMinScreenWidth(value: Double): Self = this.set("minScreenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinScreenWidth: Self = this.set("minScreenWidth", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean | GridColumnSortable): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    
    @scala.inline
    def setStickable(value: Boolean): Self = this.set("stickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickable: Self = this.set("stickable", js.undefined)
    
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
