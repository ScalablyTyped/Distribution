package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerOptions extends js.Object {
  var add: js.UndefOr[js.Function1[/* e */ SchedulerAddEvent, scala.Unit]] = js.undefined
  var allDayEventTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var allDaySlot: js.UndefOr[scala.Boolean] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ SchedulerCancelEvent, scala.Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ SchedulerChangeEvent, scala.Unit]] = js.undefined
  var currentTimeMarker: js.UndefOr[scala.Boolean | SchedulerCurrentTimeMarker] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ SchedulerDataBindingEvent, scala.Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ SchedulerDataBoundEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.SchedulerDataSource] = js.undefined
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var dateHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var edit: js.UndefOr[js.Function1[/* e */ SchedulerEditEvent, scala.Unit]] = js.undefined
  var editable: js.UndefOr[scala.Boolean | SchedulerEditable] = js.undefined
  var endTime: js.UndefOr[stdLib.Date] = js.undefined
  var eventTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var footer: js.UndefOr[scala.Boolean | SchedulerFooter] = js.undefined
  var group: js.UndefOr[SchedulerGroup] = js.undefined
  var groupHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var majorTick: js.UndefOr[scala.Double] = js.undefined
  var majorTimeHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var max: js.UndefOr[stdLib.Date] = js.undefined
  var messages: js.UndefOr[SchedulerMessages] = js.undefined
  var min: js.UndefOr[stdLib.Date] = js.undefined
  var minorTickCount: js.UndefOr[scala.Double] = js.undefined
  var minorTimeHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var mobile: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var move: js.UndefOr[js.Function1[/* e */ SchedulerMoveEvent, scala.Unit]] = js.undefined
  var moveEnd: js.UndefOr[js.Function1[/* e */ SchedulerMoveEndEvent, scala.Unit]] = js.undefined
  var moveStart: js.UndefOr[js.Function1[/* e */ SchedulerMoveStartEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ SchedulerNavigateEvent, scala.Unit]] = js.undefined
  var pdf: js.UndefOr[SchedulerPdf] = js.undefined
  var pdfExport: js.UndefOr[js.Function1[/* e */ SchedulerPdfExportEvent, scala.Unit]] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ SchedulerRemoveEvent, scala.Unit]] = js.undefined
  var resize: js.UndefOr[js.Function1[/* e */ SchedulerResizeEvent, scala.Unit]] = js.undefined
  var resizeEnd: js.UndefOr[js.Function1[/* e */ SchedulerResizeEndEvent, scala.Unit]] = js.undefined
  var resizeStart: js.UndefOr[js.Function1[/* e */ SchedulerResizeStartEvent, scala.Unit]] = js.undefined
  var resources: js.UndefOr[js.Array[SchedulerResource]] = js.undefined
  var save: js.UndefOr[js.Function1[/* e */ SchedulerSaveEvent, scala.Unit]] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var showWorkHours: js.UndefOr[scala.Boolean] = js.undefined
  var snap: js.UndefOr[scala.Boolean] = js.undefined
  var startTime: js.UndefOr[stdLib.Date] = js.undefined
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  var toolbar: js.UndefOr[js.Array[SchedulerToolbarItem]] = js.undefined
  var views: js.UndefOr[js.Array[SchedulerView]] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var workDayEnd: js.UndefOr[stdLib.Date] = js.undefined
  var workDayStart: js.UndefOr[stdLib.Date] = js.undefined
  var workWeekEnd: js.UndefOr[scala.Double] = js.undefined
  var workWeekStart: js.UndefOr[scala.Double] = js.undefined
}

object SchedulerOptions {
  @scala.inline
  def apply(
    add: js.Function1[/* e */ SchedulerAddEvent, scala.Unit] = null,
    allDayEventTemplate: java.lang.String | js.Function = null,
    allDaySlot: js.UndefOr[scala.Boolean] = js.undefined,
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    cancel: js.Function1[/* e */ SchedulerCancelEvent, scala.Unit] = null,
    change: js.Function1[/* e */ SchedulerChangeEvent, scala.Unit] = null,
    currentTimeMarker: scala.Boolean | SchedulerCurrentTimeMarker = null,
    dataBinding: js.Function1[/* e */ SchedulerDataBindingEvent, scala.Unit] = null,
    dataBound: js.Function1[/* e */ SchedulerDataBoundEvent, scala.Unit] = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.SchedulerDataSource = null,
    date: stdLib.Date = null,
    dateHeaderTemplate: java.lang.String | js.Function = null,
    edit: js.Function1[/* e */ SchedulerEditEvent, scala.Unit] = null,
    editable: scala.Boolean | SchedulerEditable = null,
    endTime: stdLib.Date = null,
    eventTemplate: java.lang.String | js.Function = null,
    footer: scala.Boolean | SchedulerFooter = null,
    group: SchedulerGroup = null,
    groupHeaderTemplate: java.lang.String | js.Function = null,
    height: scala.Double | java.lang.String = null,
    majorTick: scala.Int | scala.Double = null,
    majorTimeHeaderTemplate: java.lang.String | js.Function = null,
    max: stdLib.Date = null,
    messages: SchedulerMessages = null,
    min: stdLib.Date = null,
    minorTickCount: scala.Int | scala.Double = null,
    minorTimeHeaderTemplate: java.lang.String | js.Function = null,
    mobile: scala.Boolean | java.lang.String = null,
    move: js.Function1[/* e */ SchedulerMoveEvent, scala.Unit] = null,
    moveEnd: js.Function1[/* e */ SchedulerMoveEndEvent, scala.Unit] = null,
    moveStart: js.Function1[/* e */ SchedulerMoveStartEvent, scala.Unit] = null,
    name: java.lang.String = null,
    navigate: js.Function1[/* e */ SchedulerNavigateEvent, scala.Unit] = null,
    pdf: SchedulerPdf = null,
    pdfExport: js.Function1[/* e */ SchedulerPdfExportEvent, scala.Unit] = null,
    remove: js.Function1[/* e */ SchedulerRemoveEvent, scala.Unit] = null,
    resize: js.Function1[/* e */ SchedulerResizeEvent, scala.Unit] = null,
    resizeEnd: js.Function1[/* e */ SchedulerResizeEndEvent, scala.Unit] = null,
    resizeStart: js.Function1[/* e */ SchedulerResizeStartEvent, scala.Unit] = null,
    resources: js.Array[SchedulerResource] = null,
    save: js.Function1[/* e */ SchedulerSaveEvent, scala.Unit] = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    showWorkHours: js.UndefOr[scala.Boolean] = js.undefined,
    snap: js.UndefOr[scala.Boolean] = js.undefined,
    startTime: stdLib.Date = null,
    timezone: java.lang.String = null,
    toolbar: js.Array[SchedulerToolbarItem] = null,
    views: js.Array[SchedulerView] = null,
    width: scala.Double | java.lang.String = null,
    workDayEnd: stdLib.Date = null,
    workDayStart: stdLib.Date = null,
    workWeekEnd: scala.Int | scala.Double = null,
    workWeekStart: scala.Int | scala.Double = null
  ): SchedulerOptions = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (allDayEventTemplate != null) __obj.updateDynamic("allDayEventTemplate")(allDayEventTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(allDaySlot)) __obj.updateDynamic("allDaySlot")(allDaySlot)
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (change != null) __obj.updateDynamic("change")(change)
    if (currentTimeMarker != null) __obj.updateDynamic("currentTimeMarker")(currentTimeMarker.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(dataBinding)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date)
    if (dateHeaderTemplate != null) __obj.updateDynamic("dateHeaderTemplate")(dateHeaderTemplate.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(edit)
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (eventTemplate != null) __obj.updateDynamic("eventTemplate")(eventTemplate.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group)
    if (groupHeaderTemplate != null) __obj.updateDynamic("groupHeaderTemplate")(groupHeaderTemplate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (majorTick != null) __obj.updateDynamic("majorTick")(majorTick.asInstanceOf[js.Any])
    if (majorTimeHeaderTemplate != null) __obj.updateDynamic("majorTimeHeaderTemplate")(majorTimeHeaderTemplate.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (min != null) __obj.updateDynamic("min")(min)
    if (minorTickCount != null) __obj.updateDynamic("minorTickCount")(minorTickCount.asInstanceOf[js.Any])
    if (minorTimeHeaderTemplate != null) __obj.updateDynamic("minorTimeHeaderTemplate")(minorTimeHeaderTemplate.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(move)
    if (moveEnd != null) __obj.updateDynamic("moveEnd")(moveEnd)
    if (moveStart != null) __obj.updateDynamic("moveStart")(moveStart)
    if (name != null) __obj.updateDynamic("name")(name)
    if (navigate != null) __obj.updateDynamic("navigate")(navigate)
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(pdfExport)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (resizeEnd != null) __obj.updateDynamic("resizeEnd")(resizeEnd)
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(resizeStart)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (save != null) __obj.updateDynamic("save")(save)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(showWorkHours)) __obj.updateDynamic("showWorkHours")(showWorkHours)
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    if (views != null) __obj.updateDynamic("views")(views)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (workDayEnd != null) __obj.updateDynamic("workDayEnd")(workDayEnd)
    if (workDayStart != null) __obj.updateDynamic("workDayStart")(workDayStart)
    if (workWeekEnd != null) __obj.updateDynamic("workWeekEnd")(workWeekEnd.asInstanceOf[js.Any])
    if (workWeekStart != null) __obj.updateDynamic("workWeekStart")(workWeekStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerOptions]
  }
}

