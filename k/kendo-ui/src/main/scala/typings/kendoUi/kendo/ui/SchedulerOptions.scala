package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.SchedulerDataSource
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerOptions extends js.Object {
  
  var add: js.UndefOr[js.Function1[/* e */ SchedulerAddEvent, Unit]] = js.native
  
  var allDayEventTemplate: js.UndefOr[String | js.Function] = js.native
  
  var allDaySlot: js.UndefOr[Boolean] = js.native
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var cancel: js.UndefOr[js.Function1[/* e */ SchedulerCancelEvent, Unit]] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ SchedulerChangeEvent, Unit]] = js.native
  
  var currentTimeMarker: js.UndefOr[Boolean | SchedulerCurrentTimeMarker] = js.native
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ SchedulerDataBindingEvent, Unit]] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ SchedulerDataBoundEvent, Unit]] = js.native
  
  var dataSource: js.UndefOr[js.Any | SchedulerDataSource] = js.native
  
  var date: js.UndefOr[Date] = js.native
  
  var dateHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  
  var edit: js.UndefOr[js.Function1[/* e */ SchedulerEditEvent, Unit]] = js.native
  
  var editable: js.UndefOr[Boolean | SchedulerEditable] = js.native
  
  var endTime: js.UndefOr[Date] = js.native
  
  var eventTemplate: js.UndefOr[String | js.Function] = js.native
  
  var footer: js.UndefOr[Boolean | SchedulerFooter] = js.native
  
  var group: js.UndefOr[SchedulerGroup] = js.native
  
  var groupHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var majorTick: js.UndefOr[Double] = js.native
  
  var majorTimeHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  
  var max: js.UndefOr[Date] = js.native
  
  var messages: js.UndefOr[SchedulerMessages] = js.native
  
  var min: js.UndefOr[Date] = js.native
  
  var minorTickCount: js.UndefOr[Double] = js.native
  
  var minorTimeHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  
  var mobile: js.UndefOr[Boolean | String] = js.native
  
  var move: js.UndefOr[js.Function1[/* e */ SchedulerMoveEvent, Unit]] = js.native
  
  var moveEnd: js.UndefOr[js.Function1[/* e */ SchedulerMoveEndEvent, Unit]] = js.native
  
  var moveStart: js.UndefOr[js.Function1[/* e */ SchedulerMoveStartEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var navigate: js.UndefOr[js.Function1[/* e */ SchedulerNavigateEvent, Unit]] = js.native
  
  var pdf: js.UndefOr[SchedulerPdf] = js.native
  
  var pdfExport: js.UndefOr[js.Function1[/* e */ SchedulerPdfExportEvent, Unit]] = js.native
  
  var remove: js.UndefOr[js.Function1[/* e */ SchedulerRemoveEvent, Unit]] = js.native
  
  var resize: js.UndefOr[js.Function1[/* e */ SchedulerResizeEvent, Unit]] = js.native
  
  var resizeEnd: js.UndefOr[js.Function1[/* e */ SchedulerResizeEndEvent, Unit]] = js.native
  
  var resizeStart: js.UndefOr[js.Function1[/* e */ SchedulerResizeStartEvent, Unit]] = js.native
  
  var resources: js.UndefOr[js.Array[SchedulerResource]] = js.native
  
  var save: js.UndefOr[js.Function1[/* e */ SchedulerSaveEvent, Unit]] = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var showWorkHours: js.UndefOr[Boolean] = js.native
  
  var snap: js.UndefOr[Boolean] = js.native
  
  var startTime: js.UndefOr[Date] = js.native
  
  var timezone: js.UndefOr[String] = js.native
  
  var toolbar: js.UndefOr[js.Array[SchedulerToolbarItem]] = js.native
  
  var views: js.UndefOr[js.Array[SchedulerView]] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
  
  var workDayEnd: js.UndefOr[Date] = js.native
  
  var workDayStart: js.UndefOr[Date] = js.native
  
  var workWeekEnd: js.UndefOr[Double] = js.native
  
  var workWeekStart: js.UndefOr[Double] = js.native
}
object SchedulerOptions {
  
  @scala.inline
  def apply(): SchedulerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerOptions]
  }
  
  @scala.inline
  implicit class SchedulerOptionsOps[Self <: SchedulerOptions] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: /* e */ SchedulerAddEvent => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setAllDayEventTemplate(value: String | js.Function): Self = this.set("allDayEventTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDayEventTemplate: Self = this.set("allDayEventTemplate", js.undefined)
    
    @scala.inline
    def setAllDaySlot(value: Boolean): Self = this.set("allDaySlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDaySlot: Self = this.set("allDaySlot", js.undefined)
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    
    @scala.inline
    def setCancel(value: /* e */ SchedulerCancelEvent => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ SchedulerChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setCurrentTimeMarker(value: Boolean | SchedulerCurrentTimeMarker): Self = this.set("currentTimeMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTimeMarker: Self = this.set("currentTimeMarker", js.undefined)
    
    @scala.inline
    def setDataBinding(value: /* e */ SchedulerDataBindingEvent => Unit): Self = this.set("dataBinding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ SchedulerDataBoundEvent => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | SchedulerDataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDateHeaderTemplate(value: String | js.Function): Self = this.set("dateHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateHeaderTemplate: Self = this.set("dateHeaderTemplate", js.undefined)
    
    @scala.inline
    def setEdit(value: /* e */ SchedulerEditEvent => Unit): Self = this.set("edit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean | SchedulerEditable): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setEndTime(value: Date): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setEventTemplate(value: String | js.Function): Self = this.set("eventTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTemplate: Self = this.set("eventTemplate", js.undefined)
    
    @scala.inline
    def setFooter(value: Boolean | SchedulerFooter): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setGroup(value: SchedulerGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroupHeaderTemplate(value: String | js.Function): Self = this.set("groupHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupHeaderTemplate: Self = this.set("groupHeaderTemplate", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMajorTick(value: Double): Self = this.set("majorTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorTick: Self = this.set("majorTick", js.undefined)
    
    @scala.inline
    def setMajorTimeHeaderTemplate(value: String | js.Function): Self = this.set("majorTimeHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorTimeHeaderTemplate: Self = this.set("majorTimeHeaderTemplate", js.undefined)
    
    @scala.inline
    def setMax(value: Date): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMessages(value: SchedulerMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMin(value: Date): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinorTickCount(value: Double): Self = this.set("minorTickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickCount: Self = this.set("minorTickCount", js.undefined)
    
    @scala.inline
    def setMinorTimeHeaderTemplate(value: String | js.Function): Self = this.set("minorTimeHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTimeHeaderTemplate: Self = this.set("minorTimeHeaderTemplate", js.undefined)
    
    @scala.inline
    def setMobile(value: Boolean | String): Self = this.set("mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    
    @scala.inline
    def setMove(value: /* e */ SchedulerMoveEvent => Unit): Self = this.set("move", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    
    @scala.inline
    def setMoveEnd(value: /* e */ SchedulerMoveEndEvent => Unit): Self = this.set("moveEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMoveEnd: Self = this.set("moveEnd", js.undefined)
    
    @scala.inline
    def setMoveStart(value: /* e */ SchedulerMoveStartEvent => Unit): Self = this.set("moveStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMoveStart: Self = this.set("moveStart", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNavigate(value: /* e */ SchedulerNavigateEvent => Unit): Self = this.set("navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNavigate: Self = this.set("navigate", js.undefined)
    
    @scala.inline
    def setPdf(value: SchedulerPdf): Self = this.set("pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    
    @scala.inline
    def setPdfExport(value: /* e */ SchedulerPdfExportEvent => Unit): Self = this.set("pdfExport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePdfExport: Self = this.set("pdfExport", js.undefined)
    
    @scala.inline
    def setRemove(value: /* e */ SchedulerRemoveEvent => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setResize(value: /* e */ SchedulerResizeEvent => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setResizeEnd(value: /* e */ SchedulerResizeEndEvent => Unit): Self = this.set("resizeEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResizeEnd: Self = this.set("resizeEnd", js.undefined)
    
    @scala.inline
    def setResizeStart(value: /* e */ SchedulerResizeStartEvent => Unit): Self = this.set("resizeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResizeStart: Self = this.set("resizeStart", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: SchedulerResource*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[SchedulerResource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setSave(value: /* e */ SchedulerSaveEvent => Unit): Self = this.set("save", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    
    @scala.inline
    def setShowWorkHours(value: Boolean): Self = this.set("showWorkHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWorkHours: Self = this.set("showWorkHours", js.undefined)
    
    @scala.inline
    def setSnap(value: Boolean): Self = this.set("snap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
    @scala.inline
    def setToolbarVarargs(value: SchedulerToolbarItem*): Self = this.set("toolbar", js.Array(value :_*))
    
    @scala.inline
    def setToolbar(value: js.Array[SchedulerToolbarItem]): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setViewsVarargs(value: SchedulerView*): Self = this.set("views", js.Array(value :_*))
    
    @scala.inline
    def setViews(value: js.Array[SchedulerView]): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
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
