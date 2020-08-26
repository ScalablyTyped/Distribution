package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.GanttDataSource
import typings.kendoUi.kendo.data.GanttDependencyDataSource
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttOptions extends js.Object {
  var add: js.UndefOr[js.Function1[/* e */ GanttAddEvent, Unit]] = js.native
  var assignments: js.UndefOr[GanttAssignments] = js.native
  var autoBind: js.UndefOr[Boolean] = js.native
  var cancel: js.UndefOr[js.Function1[/* e */ GanttCancelEvent, Unit]] = js.native
  var change: js.UndefOr[js.Function1[/* e */ GanttChangeEvent, Unit]] = js.native
  var columnResize: js.UndefOr[js.Function1[/* e */ GanttColumnResizeEvent, Unit]] = js.native
  var columnResizeHandleWidth: js.UndefOr[Double] = js.native
  var columns: js.UndefOr[js.Array[GanttColumn]] = js.native
  var currentTimeMarker: js.UndefOr[Boolean | GanttCurrentTimeMarker] = js.native
  var dataBinding: js.UndefOr[js.Function1[/* e */ GanttDataBindingEvent, Unit]] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ GanttDataBoundEvent, Unit]] = js.native
  var dataSource: js.UndefOr[js.Any | GanttDataSource] = js.native
  var date: js.UndefOr[Date] = js.native
  var dependencies: js.UndefOr[js.Any | GanttDependencyDataSource] = js.native
  var edit: js.UndefOr[js.Function1[/* e */ GanttEditEvent, Unit]] = js.native
  var editable: js.UndefOr[Boolean | GanttEditable] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var hourSpan: js.UndefOr[Double] = js.native
  var listWidth: js.UndefOr[String | Double] = js.native
  var messages: js.UndefOr[GanttMessages] = js.native
  var move: js.UndefOr[js.Function1[/* e */ GanttMoveEvent, Unit]] = js.native
  var moveEnd: js.UndefOr[js.Function1[/* e */ GanttMoveEndEvent, Unit]] = js.native
  var moveStart: js.UndefOr[js.Function1[/* e */ GanttMoveStartEvent, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var navigatable: js.UndefOr[Boolean] = js.native
  var navigate: js.UndefOr[js.Function1[/* e */ GanttNavigateEvent, Unit]] = js.native
  var pdf: js.UndefOr[GanttPdf] = js.native
  var pdfExport: js.UndefOr[js.Function1[/* e */ GanttPdfExportEvent, Unit]] = js.native
  var range: js.UndefOr[GanttRange] = js.native
  var remove: js.UndefOr[js.Function1[/* e */ GanttRemoveEvent, Unit]] = js.native
  var resizable: js.UndefOr[Boolean] = js.native
  var resize: js.UndefOr[js.Function1[/* e */ GanttResizeEvent, Unit]] = js.native
  var resizeEnd: js.UndefOr[js.Function1[/* e */ GanttResizeEndEvent, Unit]] = js.native
  var resizeStart: js.UndefOr[js.Function1[/* e */ GanttResizeStartEvent, Unit]] = js.native
  var resources: js.UndefOr[GanttResources] = js.native
  var rowHeight: js.UndefOr[Double | String] = js.native
  var save: js.UndefOr[js.Function1[/* e */ GanttSaveEvent, Unit]] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var showWorkDays: js.UndefOr[Boolean] = js.native
  var showWorkHours: js.UndefOr[Boolean] = js.native
  var snap: js.UndefOr[Boolean] = js.native
  var taskTemplate: js.UndefOr[String | js.Function] = js.native
  var toolbar: js.UndefOr[js.Array[GanttToolbarItem]] = js.native
  var tooltip: js.UndefOr[GanttTooltip] = js.native
  var views: js.UndefOr[js.Array[GanttView]] = js.native
  var workDayEnd: js.UndefOr[Date] = js.native
  var workDayStart: js.UndefOr[Date] = js.native
  var workWeekEnd: js.UndefOr[Double] = js.native
  var workWeekStart: js.UndefOr[Double] = js.native
}

object GanttOptions {
  @scala.inline
  def apply(): GanttOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttOptions]
  }
  @scala.inline
  implicit class GanttOptionsOps[Self <: GanttOptions] (val x: Self) extends AnyVal {
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
    def setAdd(value: /* e */ GanttAddEvent => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAssignments(value: GanttAssignments): Self = this.set("assignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    @scala.inline
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    @scala.inline
    def setCancel(value: /* e */ GanttCancelEvent => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setChange(value: /* e */ GanttChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setColumnResize(value: /* e */ GanttColumnResizeEvent => Unit): Self = this.set("columnResize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteColumnResize: Self = this.set("columnResize", js.undefined)
    @scala.inline
    def setColumnResizeHandleWidth(value: Double): Self = this.set("columnResizeHandleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnResizeHandleWidth: Self = this.set("columnResizeHandleWidth", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: GanttColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[GanttColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setCurrentTimeMarker(value: Boolean | GanttCurrentTimeMarker): Self = this.set("currentTimeMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentTimeMarker: Self = this.set("currentTimeMarker", js.undefined)
    @scala.inline
    def setDataBinding(value: /* e */ GanttDataBindingEvent => Unit): Self = this.set("dataBinding", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    @scala.inline
    def setDataBound(value: /* e */ GanttDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any | GanttDataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDependencies(value: js.Any | GanttDependencyDataSource): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setEdit(value: /* e */ GanttEditEvent => Unit): Self = this.set("edit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    @scala.inline
    def setEditable(value: Boolean | GanttEditable): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHourSpan(value: Double): Self = this.set("hourSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourSpan: Self = this.set("hourSpan", js.undefined)
    @scala.inline
    def setListWidth(value: String | Double): Self = this.set("listWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListWidth: Self = this.set("listWidth", js.undefined)
    @scala.inline
    def setMessages(value: GanttMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMove(value: /* e */ GanttMoveEvent => Unit): Self = this.set("move", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    @scala.inline
    def setMoveEnd(value: /* e */ GanttMoveEndEvent => Unit): Self = this.set("moveEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMoveEnd: Self = this.set("moveEnd", js.undefined)
    @scala.inline
    def setMoveStart(value: /* e */ GanttMoveStartEvent => Unit): Self = this.set("moveStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMoveStart: Self = this.set("moveStart", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNavigatable(value: Boolean): Self = this.set("navigatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigatable: Self = this.set("navigatable", js.undefined)
    @scala.inline
    def setNavigate(value: /* e */ GanttNavigateEvent => Unit): Self = this.set("navigate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNavigate: Self = this.set("navigate", js.undefined)
    @scala.inline
    def setPdf(value: GanttPdf): Self = this.set("pdf", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    @scala.inline
    def setPdfExport(value: /* e */ GanttPdfExportEvent => Unit): Self = this.set("pdfExport", js.Any.fromFunction1(value))
    @scala.inline
    def deletePdfExport: Self = this.set("pdfExport", js.undefined)
    @scala.inline
    def setRange(value: GanttRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRemove(value: /* e */ GanttRemoveEvent => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    @scala.inline
    def setResize(value: /* e */ GanttResizeEvent => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setResizeEnd(value: /* e */ GanttResizeEndEvent => Unit): Self = this.set("resizeEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResizeEnd: Self = this.set("resizeEnd", js.undefined)
    @scala.inline
    def setResizeStart(value: /* e */ GanttResizeStartEvent => Unit): Self = this.set("resizeStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResizeStart: Self = this.set("resizeStart", js.undefined)
    @scala.inline
    def setResources(value: GanttResources): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setRowHeight(value: Double | String): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    @scala.inline
    def setSave(value: /* e */ GanttSaveEvent => Unit): Self = this.set("save", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setShowWorkDays(value: Boolean): Self = this.set("showWorkDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWorkDays: Self = this.set("showWorkDays", js.undefined)
    @scala.inline
    def setShowWorkHours(value: Boolean): Self = this.set("showWorkHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWorkHours: Self = this.set("showWorkHours", js.undefined)
    @scala.inline
    def setSnap(value: Boolean): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setTaskTemplate(value: String | js.Function): Self = this.set("taskTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskTemplate: Self = this.set("taskTemplate", js.undefined)
    @scala.inline
    def setToolbarVarargs(value: GanttToolbarItem*): Self = this.set("toolbar", js.Array(value :_*))
    @scala.inline
    def setToolbar(value: js.Array[GanttToolbarItem]): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    @scala.inline
    def setTooltip(value: GanttTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setViewsVarargs(value: GanttView*): Self = this.set("views", js.Array(value :_*))
    @scala.inline
    def setViews(value: js.Array[GanttView]): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
    @scala.inline
    def setWorkDayEnd(value: Date): Self = this.set("workDayEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkDayEnd: Self = this.set("workDayEnd", js.undefined)
    @scala.inline
    def setWorkDayStart(value: Date): Self = this.set("workDayStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkDayStart: Self = this.set("workDayStart", js.undefined)
    @scala.inline
    def setWorkWeekEnd(value: Double): Self = this.set("workWeekEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkWeekEnd: Self = this.set("workWeekEnd", js.undefined)
    @scala.inline
    def setWorkWeekStart(value: Double): Self = this.set("workWeekStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkWeekStart: Self = this.set("workWeekStart", js.undefined)
  }
  
}

