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

