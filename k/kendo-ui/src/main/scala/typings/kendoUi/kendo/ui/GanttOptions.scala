package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.GanttDataSource
import typings.kendoUi.kendo.data.GanttDependencyDataSource
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttOptions extends StObject {
  
  var add: js.UndefOr[js.Function1[/* e */ GanttAddEvent, Unit]] = js.undefined
  
  var assignments: js.UndefOr[GanttAssignments] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var cancel: js.UndefOr[js.Function1[/* e */ GanttCancelEvent, Unit]] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ GanttChangeEvent, Unit]] = js.undefined
  
  var columnMenu: js.UndefOr[Boolean | js.Any] = js.undefined
  
  var columnResize: js.UndefOr[js.Function1[/* e */ GanttColumnResizeEvent, Unit]] = js.undefined
  
  var columnResizeHandleWidth: js.UndefOr[Double] = js.undefined
  
  var columns: js.UndefOr[js.Array[GanttColumn]] = js.undefined
  
  var currentTimeMarker: js.UndefOr[Boolean | GanttCurrentTimeMarker] = js.undefined
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ GanttDataBindingEvent, Unit]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ GanttDataBoundEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[js.Any | GanttDataSource] = js.undefined
  
  var date: js.UndefOr[Date] = js.undefined
  
  var dependencies: js.UndefOr[js.Any | GanttDependencyDataSource] = js.undefined
  
  var edit: js.UndefOr[js.Function1[/* e */ GanttEditEvent, Unit]] = js.undefined
  
  var editable: js.UndefOr[Boolean | GanttEditable] = js.undefined
  
  var filterable: js.UndefOr[Boolean | js.Any] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var hourSpan: js.UndefOr[Double] = js.undefined
  
  var listWidth: js.UndefOr[String | Double] = js.undefined
  
  var messages: js.UndefOr[GanttMessages] = js.undefined
  
  var move: js.UndefOr[js.Function1[/* e */ GanttMoveEvent, Unit]] = js.undefined
  
  var moveEnd: js.UndefOr[js.Function1[/* e */ GanttMoveEndEvent, Unit]] = js.undefined
  
  var moveStart: js.UndefOr[js.Function1[/* e */ GanttMoveStartEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var navigatable: js.UndefOr[Boolean] = js.undefined
  
  var navigate: js.UndefOr[js.Function1[/* e */ GanttNavigateEvent, Unit]] = js.undefined
  
  var pdf: js.UndefOr[GanttPdf] = js.undefined
  
  var pdfExport: js.UndefOr[js.Function1[/* e */ GanttPdfExportEvent, Unit]] = js.undefined
  
  var range: js.UndefOr[GanttRange] = js.undefined
  
  var remove: js.UndefOr[js.Function1[/* e */ GanttRemoveEvent, Unit]] = js.undefined
  
  var reorderable: js.UndefOr[Boolean] = js.undefined
  
  var resizable: js.UndefOr[Boolean] = js.undefined
  
  var resize: js.UndefOr[js.Function1[/* e */ GanttResizeEvent, Unit]] = js.undefined
  
  var resizeEnd: js.UndefOr[js.Function1[/* e */ GanttResizeEndEvent, Unit]] = js.undefined
  
  var resizeStart: js.UndefOr[js.Function1[/* e */ GanttResizeStartEvent, Unit]] = js.undefined
  
  var resources: js.UndefOr[GanttResources] = js.undefined
  
  var rowHeight: js.UndefOr[Double | String] = js.undefined
  
  var save: js.UndefOr[js.Function1[/* e */ GanttSaveEvent, Unit]] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var showWorkDays: js.UndefOr[Boolean] = js.undefined
  
  var showWorkHours: js.UndefOr[Boolean] = js.undefined
  
  var snap: js.UndefOr[Boolean] = js.undefined
  
  var taskTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var togglePlannedTasks: js.UndefOr[js.Function1[/* e */ GanttTogglePlannedTasks, Unit]] = js.undefined
  
  var toolbar: js.UndefOr[js.Array[GanttToolbarItem]] = js.undefined
  
  var tooltip: js.UndefOr[GanttTooltip] = js.undefined
  
  var views: js.UndefOr[js.Array[GanttView]] = js.undefined
  
  var workDayEnd: js.UndefOr[Date] = js.undefined
  
  var workDayStart: js.UndefOr[Date] = js.undefined
  
  var workWeekEnd: js.UndefOr[Double] = js.undefined
  
  var workWeekStart: js.UndefOr[Double] = js.undefined
}
object GanttOptions {
  
  @scala.inline
  def apply(): GanttOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttOptions]
  }
  
  @scala.inline
  implicit class GanttOptionsMutableBuilder[Self <: GanttOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: /* e */ GanttAddEvent => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAssignments(value: GanttAssignments): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setCancel(value: /* e */ GanttCancelEvent => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ GanttChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setColumnMenu(value: Boolean | js.Any): Self = StObject.set(x, "columnMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMenuUndefined: Self = StObject.set(x, "columnMenu", js.undefined)
    
    @scala.inline
    def setColumnResize(value: /* e */ GanttColumnResizeEvent => Unit): Self = StObject.set(x, "columnResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnResizeHandleWidth(value: Double): Self = StObject.set(x, "columnResizeHandleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnResizeHandleWidthUndefined: Self = StObject.set(x, "columnResizeHandleWidth", js.undefined)
    
    @scala.inline
    def setColumnResizeUndefined: Self = StObject.set(x, "columnResize", js.undefined)
    
    @scala.inline
    def setColumns(value: js.Array[GanttColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: GanttColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setCurrentTimeMarker(value: Boolean | GanttCurrentTimeMarker): Self = StObject.set(x, "currentTimeMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeMarkerUndefined: Self = StObject.set(x, "currentTimeMarker", js.undefined)
    
    @scala.inline
    def setDataBinding(value: /* e */ GanttDataBindingEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ GanttDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | GanttDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDependencies(value: js.Any | GanttDependencyDataSource): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setEdit(value: /* e */ GanttEditEvent => Unit): Self = StObject.set(x, "edit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean | GanttEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean | js.Any): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHourSpan(value: Double): Self = StObject.set(x, "hourSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourSpanUndefined: Self = StObject.set(x, "hourSpan", js.undefined)
    
    @scala.inline
    def setListWidth(value: String | Double): Self = StObject.set(x, "listWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListWidthUndefined: Self = StObject.set(x, "listWidth", js.undefined)
    
    @scala.inline
    def setMessages(value: GanttMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMove(value: /* e */ GanttMoveEvent => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveEnd(value: /* e */ GanttMoveEndEvent => Unit): Self = StObject.set(x, "moveEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveEndUndefined: Self = StObject.set(x, "moveEnd", js.undefined)
    
    @scala.inline
    def setMoveStart(value: /* e */ GanttMoveStartEvent => Unit): Self = StObject.set(x, "moveStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveStartUndefined: Self = StObject.set(x, "moveStart", js.undefined)
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNavigatable(value: Boolean): Self = StObject.set(x, "navigatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatableUndefined: Self = StObject.set(x, "navigatable", js.undefined)
    
    @scala.inline
    def setNavigate(value: /* e */ GanttNavigateEvent => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    @scala.inline
    def setPdf(value: GanttPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfExport(value: /* e */ GanttPdfExportEvent => Unit): Self = StObject.set(x, "pdfExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPdfExportUndefined: Self = StObject.set(x, "pdfExport", js.undefined)
    
    @scala.inline
    def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    @scala.inline
    def setRange(value: GanttRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRemove(value: /* e */ GanttRemoveEvent => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setReorderable(value: Boolean): Self = StObject.set(x, "reorderable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReorderableUndefined: Self = StObject.set(x, "reorderable", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setResize(value: /* e */ GanttResizeEvent => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeEnd(value: /* e */ GanttResizeEndEvent => Unit): Self = StObject.set(x, "resizeEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeEndUndefined: Self = StObject.set(x, "resizeEnd", js.undefined)
    
    @scala.inline
    def setResizeStart(value: /* e */ GanttResizeStartEvent => Unit): Self = StObject.set(x, "resizeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResizeStartUndefined: Self = StObject.set(x, "resizeStart", js.undefined)
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    @scala.inline
    def setResources(value: GanttResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double | String): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    @scala.inline
    def setSave(value: /* e */ GanttSaveEvent => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setShowWorkDays(value: Boolean): Self = StObject.set(x, "showWorkDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWorkDaysUndefined: Self = StObject.set(x, "showWorkDays", js.undefined)
    
    @scala.inline
    def setShowWorkHours(value: Boolean): Self = StObject.set(x, "showWorkHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWorkHoursUndefined: Self = StObject.set(x, "showWorkHours", js.undefined)
    
    @scala.inline
    def setSnap(value: Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    @scala.inline
    def setTaskTemplate(value: String | js.Function): Self = StObject.set(x, "taskTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskTemplateUndefined: Self = StObject.set(x, "taskTemplate", js.undefined)
    
    @scala.inline
    def setTogglePlannedTasks(value: /* e */ GanttTogglePlannedTasks => Unit): Self = StObject.set(x, "togglePlannedTasks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTogglePlannedTasksUndefined: Self = StObject.set(x, "togglePlannedTasks", js.undefined)
    
    @scala.inline
    def setToolbar(value: js.Array[GanttToolbarItem]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setToolbarVarargs(value: GanttToolbarItem*): Self = StObject.set(x, "toolbar", js.Array(value :_*))
    
    @scala.inline
    def setTooltip(value: GanttTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setViews(value: js.Array[GanttView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    @scala.inline
    def setViewsVarargs(value: GanttView*): Self = StObject.set(x, "views", js.Array(value :_*))
    
    @scala.inline
    def setWorkDayEnd(value: Date): Self = StObject.set(x, "workDayEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkDayEndUndefined: Self = StObject.set(x, "workDayEnd", js.undefined)
    
    @scala.inline
    def setWorkDayStart(value: Date): Self = StObject.set(x, "workDayStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkDayStartUndefined: Self = StObject.set(x, "workDayStart", js.undefined)
    
    @scala.inline
    def setWorkWeekEnd(value: Double): Self = StObject.set(x, "workWeekEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkWeekEndUndefined: Self = StObject.set(x, "workWeekEnd", js.undefined)
    
    @scala.inline
    def setWorkWeekStart(value: Double): Self = StObject.set(x, "workWeekStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkWeekStartUndefined: Self = StObject.set(x, "workWeekStart", js.undefined)
  }
}
