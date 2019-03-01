package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttOptions extends js.Object {
  var add: js.UndefOr[js.Function1[/* e */ GanttAddEvent, scala.Unit]] = js.undefined
  var assignments: js.UndefOr[GanttAssignments] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ GanttCancelEvent, scala.Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ GanttChangeEvent, scala.Unit]] = js.undefined
  var columnResize: js.UndefOr[js.Function1[/* e */ GanttColumnResizeEvent, scala.Unit]] = js.undefined
  var columnResizeHandleWidth: js.UndefOr[scala.Double] = js.undefined
  var columns: js.UndefOr[js.Array[GanttColumn]] = js.undefined
  var currentTimeMarker: js.UndefOr[scala.Boolean | GanttCurrentTimeMarker] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ GanttDataBindingEvent, scala.Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ GanttDataBoundEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.GanttDataSource] = js.undefined
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var dependencies: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.GanttDependencyDataSource] = js.undefined
  var edit: js.UndefOr[js.Function1[/* e */ GanttEditEvent, scala.Unit]] = js.undefined
  var editable: js.UndefOr[scala.Boolean | GanttEditable] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var hourSpan: js.UndefOr[scala.Double] = js.undefined
  var listWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var messages: js.UndefOr[GanttMessages] = js.undefined
  var move: js.UndefOr[js.Function1[/* e */ GanttMoveEvent, scala.Unit]] = js.undefined
  var moveEnd: js.UndefOr[js.Function1[/* e */ GanttMoveEndEvent, scala.Unit]] = js.undefined
  var moveStart: js.UndefOr[js.Function1[/* e */ GanttMoveStartEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigatable: js.UndefOr[scala.Boolean] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ GanttNavigateEvent, scala.Unit]] = js.undefined
  var pdf: js.UndefOr[GanttPdf] = js.undefined
  var pdfExport: js.UndefOr[js.Function1[/* e */ GanttPdfExportEvent, scala.Unit]] = js.undefined
  var range: js.UndefOr[GanttRange] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ GanttRemoveEvent, scala.Unit]] = js.undefined
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[js.Function1[/* e */ GanttResizeEvent, scala.Unit]] = js.undefined
  var resizeEnd: js.UndefOr[js.Function1[/* e */ GanttResizeEndEvent, scala.Unit]] = js.undefined
  var resizeStart: js.UndefOr[js.Function1[/* e */ GanttResizeStartEvent, scala.Unit]] = js.undefined
  var resources: js.UndefOr[GanttResources] = js.undefined
  var rowHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var save: js.UndefOr[js.Function1[/* e */ GanttSaveEvent, scala.Unit]] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var showWorkDays: js.UndefOr[scala.Boolean] = js.undefined
  var showWorkHours: js.UndefOr[scala.Boolean] = js.undefined
  var snap: js.UndefOr[scala.Boolean] = js.undefined
  var taskTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var toolbar: js.UndefOr[js.Array[GanttToolbarItem]] = js.undefined
  var tooltip: js.UndefOr[GanttTooltip] = js.undefined
  var views: js.UndefOr[js.Array[GanttView]] = js.undefined
  var workDayEnd: js.UndefOr[stdLib.Date] = js.undefined
  var workDayStart: js.UndefOr[stdLib.Date] = js.undefined
  var workWeekEnd: js.UndefOr[scala.Double] = js.undefined
  var workWeekStart: js.UndefOr[scala.Double] = js.undefined
}

object GanttOptions {
  @scala.inline
  def apply(
    add: js.Function1[/* e */ GanttAddEvent, scala.Unit] = null,
    assignments: GanttAssignments = null,
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    cancel: js.Function1[/* e */ GanttCancelEvent, scala.Unit] = null,
    change: js.Function1[/* e */ GanttChangeEvent, scala.Unit] = null,
    columnResize: js.Function1[/* e */ GanttColumnResizeEvent, scala.Unit] = null,
    columnResizeHandleWidth: scala.Int | scala.Double = null,
    columns: js.Array[GanttColumn] = null,
    currentTimeMarker: scala.Boolean | GanttCurrentTimeMarker = null,
    dataBinding: js.Function1[/* e */ GanttDataBindingEvent, scala.Unit] = null,
    dataBound: js.Function1[/* e */ GanttDataBoundEvent, scala.Unit] = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.GanttDataSource = null,
    date: stdLib.Date = null,
    dependencies: js.Any | kendoDashUiLib.kendoNs.dataNs.GanttDependencyDataSource = null,
    edit: js.Function1[/* e */ GanttEditEvent, scala.Unit] = null,
    editable: scala.Boolean | GanttEditable = null,
    height: scala.Double | java.lang.String = null,
    hourSpan: scala.Int | scala.Double = null,
    listWidth: java.lang.String | scala.Double = null,
    messages: GanttMessages = null,
    move: js.Function1[/* e */ GanttMoveEvent, scala.Unit] = null,
    moveEnd: js.Function1[/* e */ GanttMoveEndEvent, scala.Unit] = null,
    moveStart: js.Function1[/* e */ GanttMoveStartEvent, scala.Unit] = null,
    name: java.lang.String = null,
    navigatable: js.UndefOr[scala.Boolean] = js.undefined,
    navigate: js.Function1[/* e */ GanttNavigateEvent, scala.Unit] = null,
    pdf: GanttPdf = null,
    pdfExport: js.Function1[/* e */ GanttPdfExportEvent, scala.Unit] = null,
    range: GanttRange = null,
    remove: js.Function1[/* e */ GanttRemoveEvent, scala.Unit] = null,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    resize: js.Function1[/* e */ GanttResizeEvent, scala.Unit] = null,
    resizeEnd: js.Function1[/* e */ GanttResizeEndEvent, scala.Unit] = null,
    resizeStart: js.Function1[/* e */ GanttResizeStartEvent, scala.Unit] = null,
    resources: GanttResources = null,
    rowHeight: scala.Double | java.lang.String = null,
    save: js.Function1[/* e */ GanttSaveEvent, scala.Unit] = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    showWorkDays: js.UndefOr[scala.Boolean] = js.undefined,
    showWorkHours: js.UndefOr[scala.Boolean] = js.undefined,
    snap: js.UndefOr[scala.Boolean] = js.undefined,
    taskTemplate: java.lang.String | js.Function = null,
    toolbar: js.Array[GanttToolbarItem] = null,
    tooltip: GanttTooltip = null,
    views: js.Array[GanttView] = null,
    workDayEnd: stdLib.Date = null,
    workDayStart: stdLib.Date = null,
    workWeekEnd: scala.Int | scala.Double = null,
    workWeekStart: scala.Int | scala.Double = null
  ): GanttOptions = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (change != null) __obj.updateDynamic("change")(change)
    if (columnResize != null) __obj.updateDynamic("columnResize")(columnResize)
    if (columnResizeHandleWidth != null) __obj.updateDynamic("columnResizeHandleWidth")(columnResizeHandleWidth.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (currentTimeMarker != null) __obj.updateDynamic("currentTimeMarker")(currentTimeMarker.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(dataBinding)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(edit)
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hourSpan != null) __obj.updateDynamic("hourSpan")(hourSpan.asInstanceOf[js.Any])
    if (listWidth != null) __obj.updateDynamic("listWidth")(listWidth.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (move != null) __obj.updateDynamic("move")(move)
    if (moveEnd != null) __obj.updateDynamic("moveEnd")(moveEnd)
    if (moveStart != null) __obj.updateDynamic("moveStart")(moveStart)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable)
    if (navigate != null) __obj.updateDynamic("navigate")(navigate)
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(pdfExport)
    if (range != null) __obj.updateDynamic("range")(range)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (resizeEnd != null) __obj.updateDynamic("resizeEnd")(resizeEnd)
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(resizeStart)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(save)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(showWorkDays)) __obj.updateDynamic("showWorkDays")(showWorkDays)
    if (!js.isUndefined(showWorkHours)) __obj.updateDynamic("showWorkHours")(showWorkHours)
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap)
    if (taskTemplate != null) __obj.updateDynamic("taskTemplate")(taskTemplate.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (views != null) __obj.updateDynamic("views")(views)
    if (workDayEnd != null) __obj.updateDynamic("workDayEnd")(workDayEnd)
    if (workDayStart != null) __obj.updateDynamic("workDayStart")(workDayStart)
    if (workWeekEnd != null) __obj.updateDynamic("workWeekEnd")(workWeekEnd.asInstanceOf[js.Any])
    if (workWeekStart != null) __obj.updateDynamic("workWeekStart")(workWeekStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttOptions]
  }
}

