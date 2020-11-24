package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgScheduler
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Fired after agenda view range is changed when using previous and next buttons (fired only in Agenda View)
    */
  var agendaRangeChanged: js.UndefOr[AgendaRangeChangedEvent] = js.native
  
  /**
    * Fired before agenda view range is changed when using previous and next buttons (fired only in Agenda View)
    */
  var agendaRangeChanging: js.UndefOr[AgendaRangeChangingEvent] = js.native
  
  /**
    * Gets/Sets AgendaView settings.
    *
    */
  var agendaViewSettings: js.UndefOr[IgSchedulerAgendaViewSettings] = js.native
  
  /**
    * Fired after an appointment is created.
    */
  var appointmentCreated: js.UndefOr[AppointmentCreatedEvent] = js.native
  
  /**
    * Fired before an appointment is created.
    */
  var appointmentCreating: js.UndefOr[AppointmentCreatingEvent] = js.native
  
  /**
    * Fired after an appointment is deleted.
    */
  var appointmentDeleted: js.UndefOr[AppointmentDeletedEvent] = js.native
  
  /**
    * Fired before an appointment is deleted.
    */
  var appointmentDeleting: js.UndefOr[AppointmentDeletingEvent] = js.native
  
  /**
    * Fired after closing the dialog window for adding/editing appointment.
    */
  var appointmentDialogClosed: js.UndefOr[AppointmentDialogClosedEvent] = js.native
  
  /**
    * Fired before closing the dialog for adding/editing appointment.
    */
  var appointmentDialogClosing: js.UndefOr[AppointmentDialogClosingEvent] = js.native
  
  /**
    * Fired after opening the dialog for creating/editing appointment.
    */
  var appointmentDialogOpened: js.UndefOr[AppointmentDialogOpenedEvent] = js.native
  
  /**
    * Fired before opening the dialog for creating/editing appointment.
    */
  var appointmentDialogOpening: js.UndefOr[AppointmentDialogOpeningEvent] = js.native
  
  /**
    * Gets/Sets whether the appointment dialog and the related day and appointment popups should be shown.
    *
    */
  var appointmentDialogSuppress: js.UndefOr[Boolean] = js.native
  
  /**
    * Fired after an appointment is edited.
    */
  var appointmentEdited: js.UndefOr[AppointmentEditedEvent] = js.native
  
  /**
    * Fired before an appointment is edited.
    */
  var appointmentEditing: js.UndefOr[AppointmentEditingEvent] = js.native
  
  /**
    * Gets/Sets dataSource of type $.ig.scheduler.ScheduleListDataSource.
    *
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  
  /**
    * Fired after day is changed when using previous and next buttons (fired only in Day View)
    */
  var dayChanged: js.UndefOr[DayChangedEvent] = js.native
  
  /**
    * Fired before changing the day begins, when using previous and next buttons (fired only in Day View)
    */
  var dayChanging: js.UndefOr[DayChangingEvent] = js.native
  
  /**
    * Fired when a day is selected from the datepicker calendar.
    */
  var daySelected: js.UndefOr[DaySelectedEvent] = js.native
  
  /**
    * Gets/Sets DayView settings.
    *
    */
  var dayViewSettings: js.UndefOr[IgSchedulerDayViewSettings] = js.native
  
  /**
    * Enables/Disables today button.
    *
    */
  var enableTodayButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets the height of the control.
    *
    *
    * Valid values:
    * "null" will fit the editor inside its parent container, if no other heights are defined.
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Fired after month is changed when using previous and next buttons (fired only in Month View)
    */
  var monthChanged: js.UndefOr[MonthChangedEvent] = js.native
  
  /**
    * Fired before changing the month begins, when using previous and next buttons (fired only in Month View)
    */
  var monthChanging: js.UndefOr[MonthChangingEvent] = js.native
  
  /**
    * Gets/Sets MonthView settings.
    *
    */
  var monthViewSettings: js.UndefOr[IgSchedulerMonthViewSettings] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Fired after rendering of the scheduler has finished.
    */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  
  /**
    * Fired before rendering of the scheduler begins.
    */
  var rendering: js.UndefOr[RenderingEvent] = js.native
  
  /**
    * Gets the resources collection that holds the activities` owners
    *
    * //Initialize
    * var resources = [
    * { id: 1, displayName: "Trina Friesen" },
    * { id: 2, displayName: "Mack Koch" }];
    * $(".selector").%%WidgetName%%({
    * resources: resources
    * });
    *
    * // Get
    * var resources = $(".selector").%%WidgetName%%("option", "resources");
    */
  var resources: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets/Sets selected date in the Scheduler.
    *
    */
  var selectedDate: js.UndefOr[Date] = js.native
  
  /**
    * Fired after the view is changed, when using the menu buttons.
    */
  var viewChanged: js.UndefOr[ViewChangedEvent] = js.native
  
  /**
    * Fired before the view is changed, when using the menu buttons.
    */
  var viewChanging: js.UndefOr[ViewChangingEvent] = js.native
  
  /**
    * Gets/Sets current view mode in the Scheduler. If this options is not defined, then the first defined view in the views property is taken.
    *
    *
    * Valid values:
    * "monthView" Enables MonthView in the Scheduler.
    * "agendaView" Enables AgendaView in the Scheduler.
    */
  var viewMode: js.UndefOr[String] = js.native
  
  /**
    * Lists of all the views, rendered in the Scheduler.
    *
    */
  var views: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Fired after week is changed when using previous and next buttons (fired only in Week View)
    */
  var weekChanged: js.UndefOr[WeekChangedEvent] = js.native
  
  /**
    * Fired before changing the week begins, when using previous and next buttons (fired only in Week View)
    */
  var weekChanging: js.UndefOr[WeekChangingEvent] = js.native
  
  /**
    * Gets/Sets WeekView settings.
    *
    */
  var weekViewSettings: js.UndefOr[IgSchedulerWeekViewSettings] = js.native
  
  /**
    * Gets/Sets the width of the control.
    *
    *
    * Valid values:
    * "null" will stretch to fit data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.native
}
object IgScheduler {
  
  @scala.inline
  def apply(): IgScheduler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgScheduler]
  }
  
  @scala.inline
  implicit class IgSchedulerOps[Self <: IgScheduler] (val x: Self) extends AnyVal {
    
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
    def setAgendaRangeChanged(value: (/* event */ Event, /* ui */ AgendaRangeChangedEventUIParam) => Unit): Self = this.set("agendaRangeChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAgendaRangeChanged: Self = this.set("agendaRangeChanged", js.undefined)
    
    @scala.inline
    def setAgendaRangeChanging(value: (/* event */ Event, /* ui */ AgendaRangeChangingEventUIParam) => Unit): Self = this.set("agendaRangeChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAgendaRangeChanging: Self = this.set("agendaRangeChanging", js.undefined)
    
    @scala.inline
    def setAgendaViewSettings(value: IgSchedulerAgendaViewSettings): Self = this.set("agendaViewSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgendaViewSettings: Self = this.set("agendaViewSettings", js.undefined)
    
    @scala.inline
    def setAppointmentCreated(value: (/* event */ Event, /* ui */ AppointmentCreatedEventUIParam) => Unit): Self = this.set("appointmentCreated", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAppointmentCreated: Self = this.set("appointmentCreated", js.undefined)
    
    @scala.inline
    def setAppointmentCreating(value: (/* event */ Event, /* ui */ AppointmentCreatingEventUIParam) => Unit): Self = this.set("appointmentCreating", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAppointmentCreating: Self = this.set("appointmentCreating", js.undefined)
    
    @scala.inline
    def setAppointmentDeleted(value: (/* event */ Event, /* ui */ AppointmentDeletedEventUIParam) => Unit): Self = this.set("appointmentDeleted", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAppointmentDeleted: Self = this.set("appointmentDeleted", js.undefined)
    
    @scala.inline
    def setAppointmentDeleting(value: (/* event */ Event, /* ui */ AppointmentDeletingEventUIParam) => Unit): Self = this.set("appointmentDeleting", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAppointmentDeleting: Self = this.set("appointmentDeleting", js.undefined)
    
    @scala.inline
    def setAppointmentDialogClosed(value: (/* event */ Event, /* ui */ AppointmentDialogClosedEventUIParam) => Unit): Self = this.set("appointmentDialogClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAppointmentDialogClosed: Self = this.set("appointmentDialogClosed", js.undefined)
    
    @scala.inline
    def setAppointmentDialogClosing(value: (/* event */ Event, /* ui */ AppointmentDialogClosingEventUIParam) => Unit): Self = this.set("appointmentDialogClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAppointmentDialogClosing: Self = this.set("appointmentDialogClosing", js.undefined)
    
    @scala.inline
    def setAppointmentDialogOpened(value: (/* event */ Event, /* ui */ AppointmentDialogOpenedEventUIParam) => Unit): Self = this.set("appointmentDialogOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAppointmentDialogOpened: Self = this.set("appointmentDialogOpened", js.undefined)
    
    @scala.inline
    def setAppointmentDialogOpening(value: (/* event */ Event, /* ui */ AppointmentDialogOpeningEventUIParam) => Unit): Self = this.set("appointmentDialogOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAppointmentDialogOpening: Self = this.set("appointmentDialogOpening", js.undefined)
    
    @scala.inline
    def setAppointmentDialogSuppress(value: Boolean): Self = this.set("appointmentDialogSuppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppointmentDialogSuppress: Self = this.set("appointmentDialogSuppress", js.undefined)
    
    @scala.inline
    def setAppointmentEdited(value: (/* event */ Event, /* ui */ AppointmentEditedEventUIParam) => Unit): Self = this.set("appointmentEdited", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAppointmentEdited: Self = this.set("appointmentEdited", js.undefined)
    
    @scala.inline
    def setAppointmentEditing(value: (/* event */ Event, /* ui */ AppointmentEditingEventUIParam) => Unit): Self = this.set("appointmentEditing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAppointmentEditing: Self = this.set("appointmentEditing", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDayChanged(value: (/* event */ Event, /* ui */ DayChangedEventUIParam) => Unit): Self = this.set("dayChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDayChanged: Self = this.set("dayChanged", js.undefined)
    
    @scala.inline
    def setDayChanging(value: (/* event */ Event, /* ui */ DayChangingEventUIParam) => Unit): Self = this.set("dayChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDayChanging: Self = this.set("dayChanging", js.undefined)
    
    @scala.inline
    def setDaySelected(value: (/* event */ Event, /* ui */ DaySelectedEventUIParam) => Unit): Self = this.set("daySelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDaySelected: Self = this.set("daySelected", js.undefined)
    
    @scala.inline
    def setDayViewSettings(value: IgSchedulerDayViewSettings): Self = this.set("dayViewSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayViewSettings: Self = this.set("dayViewSettings", js.undefined)
    
    @scala.inline
    def setEnableTodayButton(value: Boolean): Self = this.set("enableTodayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTodayButton: Self = this.set("enableTodayButton", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMonthChanged(value: (/* event */ Event, /* ui */ MonthChangedEventUIParam) => Unit): Self = this.set("monthChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMonthChanged: Self = this.set("monthChanged", js.undefined)
    
    @scala.inline
    def setMonthChanging(value: (/* event */ Event, /* ui */ MonthChangingEventUIParam) => Unit): Self = this.set("monthChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMonthChanging: Self = this.set("monthChanging", js.undefined)
    
    @scala.inline
    def setMonthViewSettings(value: IgSchedulerMonthViewSettings): Self = this.set("monthViewSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthViewSettings: Self = this.set("monthViewSettings", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = this.set("rendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRendered: Self = this.set("rendered", js.undefined)
    
    @scala.inline
    def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = this.set("rendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRendering: Self = this.set("rendering", js.undefined)
    
    @scala.inline
    def setResources(value: js.Any): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setSelectedDate(value: Date): Self = this.set("selectedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDate: Self = this.set("selectedDate", js.undefined)
    
    @scala.inline
    def setViewChanged(value: (/* event */ Event, /* ui */ ViewChangedEventUIParam) => Unit): Self = this.set("viewChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteViewChanged: Self = this.set("viewChanged", js.undefined)
    
    @scala.inline
    def setViewChanging(value: (/* event */ Event, /* ui */ ViewChangingEventUIParam) => Unit): Self = this.set("viewChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteViewChanging: Self = this.set("viewChanging", js.undefined)
    
    @scala.inline
    def setViewMode(value: String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
    
    @scala.inline
    def setViewsVarargs(value: js.Any*): Self = this.set("views", js.Array(value :_*))
    
    @scala.inline
    def setViews(value: js.Array[_]): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
    
    @scala.inline
    def setWeekChanged(value: (/* event */ Event, /* ui */ WeekChangedEventUIParam) => Unit): Self = this.set("weekChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteWeekChanged: Self = this.set("weekChanged", js.undefined)
    
    @scala.inline
    def setWeekChanging(value: (/* event */ Event, /* ui */ WeekChangingEventUIParam) => Unit): Self = this.set("weekChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteWeekChanging: Self = this.set("weekChanging", js.undefined)
    
    @scala.inline
    def setWeekViewSettings(value: IgSchedulerWeekViewSettings): Self = this.set("weekViewSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekViewSettings: Self = this.set("weekViewSettings", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
