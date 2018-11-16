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

