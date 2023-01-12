package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.GanttDataSource
import typings.kendoUi.kendo.data.GanttDependencyDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttOptions extends StObject {
  
  var add: js.UndefOr[js.Function1[/* e */ GanttAddEvent, Unit]] = js.undefined
  
  var assignments: js.UndefOr[GanttAssignments] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var cancel: js.UndefOr[js.Function1[/* e */ GanttCancelEvent, Unit]] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ GanttChangeEvent, Unit]] = js.undefined
  
  var columnMenu: js.UndefOr[Boolean | Any] = js.undefined
  
  var columnResize: js.UndefOr[js.Function1[/* e */ GanttColumnResizeEvent, Unit]] = js.undefined
  
  var columnResizeHandleWidth: js.UndefOr[Double] = js.undefined
  
  var columns: js.UndefOr[js.Array[GanttColumn]] = js.undefined
  
  var currentTimeMarker: js.UndefOr[Boolean | GanttCurrentTimeMarker] = js.undefined
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ GanttDataBindingEvent, Unit]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ GanttDataBoundEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[Any | GanttDataSource] = js.undefined
  
  var date: js.UndefOr[js.Date] = js.undefined
  
  var dependencies: js.UndefOr[Any | GanttDependencyDataSource] = js.undefined
  
  var edit: js.UndefOr[js.Function1[/* e */ GanttEditEvent, Unit]] = js.undefined
  
  var editable: js.UndefOr[Boolean | GanttEditable] = js.undefined
  
  var filterable: js.UndefOr[Boolean | Any] = js.undefined
  
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
  
  var workDayEnd: js.UndefOr[js.Date] = js.undefined
  
  var workDayStart: js.UndefOr[js.Date] = js.undefined
  
  var workWeekEnd: js.UndefOr[Double] = js.undefined
  
  var workWeekStart: js.UndefOr[Double] = js.undefined
}
object GanttOptions {
  
  inline def apply(): GanttOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GanttOptions] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: /* e */ GanttAddEvent => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAssignments(value: GanttAssignments): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setCancel(value: /* e */ GanttCancelEvent => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setChange(value: /* e */ GanttChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setColumnMenu(value: Boolean | Any): Self = StObject.set(x, "columnMenu", value.asInstanceOf[js.Any])
    
    inline def setColumnMenuUndefined: Self = StObject.set(x, "columnMenu", js.undefined)
    
    inline def setColumnResize(value: /* e */ GanttColumnResizeEvent => Unit): Self = StObject.set(x, "columnResize", js.Any.fromFunction1(value))
    
    inline def setColumnResizeHandleWidth(value: Double): Self = StObject.set(x, "columnResizeHandleWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnResizeHandleWidthUndefined: Self = StObject.set(x, "columnResizeHandleWidth", js.undefined)
    
    inline def setColumnResizeUndefined: Self = StObject.set(x, "columnResize", js.undefined)
    
    inline def setColumns(value: js.Array[GanttColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: GanttColumn*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCurrentTimeMarker(value: Boolean | GanttCurrentTimeMarker): Self = StObject.set(x, "currentTimeMarker", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeMarkerUndefined: Self = StObject.set(x, "currentTimeMarker", js.undefined)
    
    inline def setDataBinding(value: /* e */ GanttDataBindingEvent => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1(value))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: /* e */ GanttDataBoundEvent => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: Any | GanttDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDependencies(value: Any | GanttDependencyDataSource): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setEdit(value: /* e */ GanttEditEvent => Unit): Self = StObject.set(x, "edit", js.Any.fromFunction1(value))
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setEditable(value: Boolean | GanttEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFilterable(value: Boolean | Any): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHourSpan(value: Double): Self = StObject.set(x, "hourSpan", value.asInstanceOf[js.Any])
    
    inline def setHourSpanUndefined: Self = StObject.set(x, "hourSpan", js.undefined)
    
    inline def setListWidth(value: String | Double): Self = StObject.set(x, "listWidth", value.asInstanceOf[js.Any])
    
    inline def setListWidthUndefined: Self = StObject.set(x, "listWidth", js.undefined)
    
    inline def setMessages(value: GanttMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMove(value: /* e */ GanttMoveEvent => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
    
    inline def setMoveEnd(value: /* e */ GanttMoveEndEvent => Unit): Self = StObject.set(x, "moveEnd", js.Any.fromFunction1(value))
    
    inline def setMoveEndUndefined: Self = StObject.set(x, "moveEnd", js.undefined)
    
    inline def setMoveStart(value: /* e */ GanttMoveStartEvent => Unit): Self = StObject.set(x, "moveStart", js.Any.fromFunction1(value))
    
    inline def setMoveStartUndefined: Self = StObject.set(x, "moveStart", js.undefined)
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNavigatable(value: Boolean): Self = StObject.set(x, "navigatable", value.asInstanceOf[js.Any])
    
    inline def setNavigatableUndefined: Self = StObject.set(x, "navigatable", js.undefined)
    
    inline def setNavigate(value: /* e */ GanttNavigateEvent => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
    
    inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    inline def setPdf(value: GanttPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfExport(value: /* e */ GanttPdfExportEvent => Unit): Self = StObject.set(x, "pdfExport", js.Any.fromFunction1(value))
    
    inline def setPdfExportUndefined: Self = StObject.set(x, "pdfExport", js.undefined)
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    inline def setRange(value: GanttRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRemove(value: /* e */ GanttRemoveEvent => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setReorderable(value: Boolean): Self = StObject.set(x, "reorderable", value.asInstanceOf[js.Any])
    
    inline def setReorderableUndefined: Self = StObject.set(x, "reorderable", js.undefined)
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setResize(value: /* e */ GanttResizeEvent => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
    
    inline def setResizeEnd(value: /* e */ GanttResizeEndEvent => Unit): Self = StObject.set(x, "resizeEnd", js.Any.fromFunction1(value))
    
    inline def setResizeEndUndefined: Self = StObject.set(x, "resizeEnd", js.undefined)
    
    inline def setResizeStart(value: /* e */ GanttResizeStartEvent => Unit): Self = StObject.set(x, "resizeStart", js.Any.fromFunction1(value))
    
    inline def setResizeStartUndefined: Self = StObject.set(x, "resizeStart", js.undefined)
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setResources(value: GanttResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setRowHeight(value: Double | String): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    inline def setSave(value: /* e */ GanttSaveEvent => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setShowWorkDays(value: Boolean): Self = StObject.set(x, "showWorkDays", value.asInstanceOf[js.Any])
    
    inline def setShowWorkDaysUndefined: Self = StObject.set(x, "showWorkDays", js.undefined)
    
    inline def setShowWorkHours(value: Boolean): Self = StObject.set(x, "showWorkHours", value.asInstanceOf[js.Any])
    
    inline def setShowWorkHoursUndefined: Self = StObject.set(x, "showWorkHours", js.undefined)
    
    inline def setSnap(value: Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    inline def setTaskTemplate(value: String | js.Function): Self = StObject.set(x, "taskTemplate", value.asInstanceOf[js.Any])
    
    inline def setTaskTemplateUndefined: Self = StObject.set(x, "taskTemplate", js.undefined)
    
    inline def setTogglePlannedTasks(value: /* e */ GanttTogglePlannedTasks => Unit): Self = StObject.set(x, "togglePlannedTasks", js.Any.fromFunction1(value))
    
    inline def setTogglePlannedTasksUndefined: Self = StObject.set(x, "togglePlannedTasks", js.undefined)
    
    inline def setToolbar(value: js.Array[GanttToolbarItem]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setToolbarVarargs(value: GanttToolbarItem*): Self = StObject.set(x, "toolbar", js.Array(value*))
    
    inline def setTooltip(value: GanttTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setViews(value: js.Array[GanttView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setViewsVarargs(value: GanttView*): Self = StObject.set(x, "views", js.Array(value*))
    
    inline def setWorkDayEnd(value: js.Date): Self = StObject.set(x, "workDayEnd", value.asInstanceOf[js.Any])
    
    inline def setWorkDayEndUndefined: Self = StObject.set(x, "workDayEnd", js.undefined)
    
    inline def setWorkDayStart(value: js.Date): Self = StObject.set(x, "workDayStart", value.asInstanceOf[js.Any])
    
    inline def setWorkDayStartUndefined: Self = StObject.set(x, "workDayStart", js.undefined)
    
    inline def setWorkWeekEnd(value: Double): Self = StObject.set(x, "workWeekEnd", value.asInstanceOf[js.Any])
    
    inline def setWorkWeekEndUndefined: Self = StObject.set(x, "workWeekEnd", js.undefined)
    
    inline def setWorkWeekStart(value: Double): Self = StObject.set(x, "workWeekStart", value.asInstanceOf[js.Any])
    
    inline def setWorkWeekStartUndefined: Self = StObject.set(x, "workWeekStart", js.undefined)
  }
}
