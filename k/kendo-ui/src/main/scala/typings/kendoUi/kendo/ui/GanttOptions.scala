package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.GanttDataSource
import typings.kendoUi.kendo.data.GanttDependencyDataSource
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttOptions extends js.Object {
  var add: js.UndefOr[js.Function1[/* e */ GanttAddEvent, Unit]] = js.undefined
  var assignments: js.UndefOr[GanttAssignments] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ GanttCancelEvent, Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ GanttChangeEvent, Unit]] = js.undefined
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
  def apply(
    add: /* e */ GanttAddEvent => Unit = null,
    assignments: GanttAssignments = null,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    cancel: /* e */ GanttCancelEvent => Unit = null,
    change: /* e */ GanttChangeEvent => Unit = null,
    columnResize: /* e */ GanttColumnResizeEvent => Unit = null,
    columnResizeHandleWidth: js.UndefOr[Double] = js.undefined,
    columns: js.Array[GanttColumn] = null,
    currentTimeMarker: Boolean | GanttCurrentTimeMarker = null,
    dataBinding: /* e */ GanttDataBindingEvent => Unit = null,
    dataBound: /* e */ GanttDataBoundEvent => Unit = null,
    dataSource: js.Any | GanttDataSource = null,
    date: Date = null,
    dependencies: js.Any | GanttDependencyDataSource = null,
    edit: /* e */ GanttEditEvent => Unit = null,
    editable: Boolean | GanttEditable = null,
    height: Double | String = null,
    hourSpan: js.UndefOr[Double] = js.undefined,
    listWidth: String | Double = null,
    messages: GanttMessages = null,
    move: /* e */ GanttMoveEvent => Unit = null,
    moveEnd: /* e */ GanttMoveEndEvent => Unit = null,
    moveStart: /* e */ GanttMoveStartEvent => Unit = null,
    name: String = null,
    navigatable: js.UndefOr[Boolean] = js.undefined,
    navigate: /* e */ GanttNavigateEvent => Unit = null,
    pdf: GanttPdf = null,
    pdfExport: /* e */ GanttPdfExportEvent => Unit = null,
    range: GanttRange = null,
    remove: /* e */ GanttRemoveEvent => Unit = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    resize: /* e */ GanttResizeEvent => Unit = null,
    resizeEnd: /* e */ GanttResizeEndEvent => Unit = null,
    resizeStart: /* e */ GanttResizeStartEvent => Unit = null,
    resources: GanttResources = null,
    rowHeight: Double | String = null,
    save: /* e */ GanttSaveEvent => Unit = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    showWorkDays: js.UndefOr[Boolean] = js.undefined,
    showWorkHours: js.UndefOr[Boolean] = js.undefined,
    snap: js.UndefOr[Boolean] = js.undefined,
    taskTemplate: String | js.Function = null,
    toolbar: js.Array[GanttToolbarItem] = null,
    tooltip: GanttTooltip = null,
    views: js.Array[GanttView] = null,
    workDayEnd: Date = null,
    workDayStart: Date = null,
    workWeekEnd: js.UndefOr[Double] = js.undefined,
    workWeekStart: js.UndefOr[Double] = js.undefined
  ): GanttOptions = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.get.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (columnResize != null) __obj.updateDynamic("columnResize")(js.Any.fromFunction1(columnResize))
    if (!js.isUndefined(columnResizeHandleWidth)) __obj.updateDynamic("columnResizeHandleWidth")(columnResizeHandleWidth.get.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (currentTimeMarker != null) __obj.updateDynamic("currentTimeMarker")(currentTimeMarker.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction1(edit))
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hourSpan)) __obj.updateDynamic("hourSpan")(hourSpan.get.asInstanceOf[js.Any])
    if (listWidth != null) __obj.updateDynamic("listWidth")(listWidth.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(js.Any.fromFunction1(move))
    if (moveEnd != null) __obj.updateDynamic("moveEnd")(js.Any.fromFunction1(moveEnd))
    if (moveStart != null) __obj.updateDynamic("moveStart")(js.Any.fromFunction1(moveStart))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable.get.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction1(navigate))
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(js.Any.fromFunction1(pdfExport))
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (resizeEnd != null) __obj.updateDynamic("resizeEnd")(js.Any.fromFunction1(resizeEnd))
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(js.Any.fromFunction1(resizeStart))
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1(save))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWorkDays)) __obj.updateDynamic("showWorkDays")(showWorkDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWorkHours)) __obj.updateDynamic("showWorkHours")(showWorkHours.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.get.asInstanceOf[js.Any])
    if (taskTemplate != null) __obj.updateDynamic("taskTemplate")(taskTemplate.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (workDayEnd != null) __obj.updateDynamic("workDayEnd")(workDayEnd.asInstanceOf[js.Any])
    if (workDayStart != null) __obj.updateDynamic("workDayStart")(workDayStart.asInstanceOf[js.Any])
    if (!js.isUndefined(workWeekEnd)) __obj.updateDynamic("workWeekEnd")(workWeekEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workWeekStart)) __obj.updateDynamic("workWeekStart")(workWeekStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttOptions]
  }
}

