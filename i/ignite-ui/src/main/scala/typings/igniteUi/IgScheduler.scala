package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Event
import org.scalablytyped.runtime.StObject
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
  implicit class IgSchedulerMutableBuilder[Self <: IgScheduler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgendaRangeChanged(value: (/* event */ Event, /* ui */ AgendaRangeChangedEventUIParam) => Unit): Self = StObject.set(x, "agendaRangeChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAgendaRangeChangedUndefined: Self = StObject.set(x, "agendaRangeChanged", js.undefined)
    
    @scala.inline
    def setAgendaRangeChanging(value: (/* event */ Event, /* ui */ AgendaRangeChangingEventUIParam) => Unit): Self = StObject.set(x, "agendaRangeChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAgendaRangeChangingUndefined: Self = StObject.set(x, "agendaRangeChanging", js.undefined)
    
    @scala.inline
    def setAgendaViewSettings(value: IgSchedulerAgendaViewSettings): Self = StObject.set(x, "agendaViewSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgendaViewSettingsUndefined: Self = StObject.set(x, "agendaViewSettings", js.undefined)
    
    @scala.inline
    def setAppointmentCreated(value: (/* event */ Event, /* ui */ AppointmentCreatedEventUIParam) => Unit): Self = StObject.set(x, "appointmentCreated", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppointmentCreatedUndefined: Self = StObject.set(x, "appointmentCreated", js.undefined)
    
    @scala.inline
    def setAppointmentCreating(value: (/* event */ Event, /* ui */ AppointmentCreatingEventUIParam) => Unit): Self = StObject.set(x, "appointmentCreating", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppointmentCreatingUndefined: Self = StObject.set(x, "appointmentCreating", js.undefined)
    
    @scala.inline
    def setAppointmentDeleted(value: (/* event */ Event, /* ui */ AppointmentDeletedEventUIParam) => Unit): Self = StObject.set(x, "appointmentDeleted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppointmentDeletedUndefined: Self = StObject.set(x, "appointmentDeleted", js.undefined)
    
    @scala.inline
    def setAppointmentDeleting(value: (/* event */ Event, /* ui */ AppointmentDeletingEventUIParam) => Unit): Self = StObject.set(x, "appointmentDeleting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppointmentDeletingUndefined: Self = StObject.set(x, "appointmentDeleting", js.undefined)
    
    @scala.inline
    def setAppointmentDialogClosed(value: (/* event */ Event, /* ui */ AppointmentDialogClosedEventUIParam) => Unit): Self = StObject.set(x, "appointmentDialogClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppointmentDialogClosedUndefined: Self = StObject.set(x, "appointmentDialogClosed", js.undefined)
    
    @scala.inline
    def setAppointmentDialogClosing(value: (/* event */ Event, /* ui */ AppointmentDialogClosingEventUIParam) => Unit): Self = StObject.set(x, "appointmentDialogClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppointmentDialogClosingUndefined: Self = StObject.set(x, "appointmentDialogClosing", js.undefined)
    
    @scala.inline
    def setAppointmentDialogOpened(value: (/* event */ Event, /* ui */ AppointmentDialogOpenedEventUIParam) => Unit): Self = StObject.set(x, "appointmentDialogOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppointmentDialogOpenedUndefined: Self = StObject.set(x, "appointmentDialogOpened", js.undefined)
    
    @scala.inline
    def setAppointmentDialogOpening(value: (/* event */ Event, /* ui */ AppointmentDialogOpeningEventUIParam) => Unit): Self = StObject.set(x, "appointmentDialogOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppointmentDialogOpeningUndefined: Self = StObject.set(x, "appointmentDialogOpening", js.undefined)
    
    @scala.inline
    def setAppointmentDialogSuppress(value: Boolean): Self = StObject.set(x, "appointmentDialogSuppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentDialogSuppressUndefined: Self = StObject.set(x, "appointmentDialogSuppress", js.undefined)
    
    @scala.inline
    def setAppointmentEdited(value: (/* event */ Event, /* ui */ AppointmentEditedEventUIParam) => Unit): Self = StObject.set(x, "appointmentEdited", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppointmentEditedUndefined: Self = StObject.set(x, "appointmentEdited", js.undefined)
    
    @scala.inline
    def setAppointmentEditing(value: (/* event */ Event, /* ui */ AppointmentEditingEventUIParam) => Unit): Self = StObject.set(x, "appointmentEditing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAppointmentEditingUndefined: Self = StObject.set(x, "appointmentEditing", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDayChanged(value: (/* event */ Event, /* ui */ DayChangedEventUIParam) => Unit): Self = StObject.set(x, "dayChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDayChangedUndefined: Self = StObject.set(x, "dayChanged", js.undefined)
    
    @scala.inline
    def setDayChanging(value: (/* event */ Event, /* ui */ DayChangingEventUIParam) => Unit): Self = StObject.set(x, "dayChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDayChangingUndefined: Self = StObject.set(x, "dayChanging", js.undefined)
    
    @scala.inline
    def setDaySelected(value: (/* event */ Event, /* ui */ DaySelectedEventUIParam) => Unit): Self = StObject.set(x, "daySelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDaySelectedUndefined: Self = StObject.set(x, "daySelected", js.undefined)
    
    @scala.inline
    def setDayViewSettings(value: IgSchedulerDayViewSettings): Self = StObject.set(x, "dayViewSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayViewSettingsUndefined: Self = StObject.set(x, "dayViewSettings", js.undefined)
    
    @scala.inline
    def setEnableTodayButton(value: Boolean): Self = StObject.set(x, "enableTodayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTodayButtonUndefined: Self = StObject.set(x, "enableTodayButton", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMonthChanged(value: (/* event */ Event, /* ui */ MonthChangedEventUIParam) => Unit): Self = StObject.set(x, "monthChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMonthChangedUndefined: Self = StObject.set(x, "monthChanged", js.undefined)
    
    @scala.inline
    def setMonthChanging(value: (/* event */ Event, /* ui */ MonthChangingEventUIParam) => Unit): Self = StObject.set(x, "monthChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMonthChangingUndefined: Self = StObject.set(x, "monthChanging", js.undefined)
    
    @scala.inline
    def setMonthViewSettings(value: IgSchedulerMonthViewSettings): Self = StObject.set(x, "monthViewSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthViewSettingsUndefined: Self = StObject.set(x, "monthViewSettings", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = StObject.set(x, "rendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    @scala.inline
    def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = StObject.set(x, "rendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderingUndefined: Self = StObject.set(x, "rendering", js.undefined)
    
    @scala.inline
    def setResources(value: js.Any): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setSelectedDate(value: Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedDateUndefined: Self = StObject.set(x, "selectedDate", js.undefined)
    
    @scala.inline
    def setViewChanged(value: (/* event */ Event, /* ui */ ViewChangedEventUIParam) => Unit): Self = StObject.set(x, "viewChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setViewChangedUndefined: Self = StObject.set(x, "viewChanged", js.undefined)
    
    @scala.inline
    def setViewChanging(value: (/* event */ Event, /* ui */ ViewChangingEventUIParam) => Unit): Self = StObject.set(x, "viewChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setViewChangingUndefined: Self = StObject.set(x, "viewChanging", js.undefined)
    
    @scala.inline
    def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    
    @scala.inline
    def setViews(value: js.Array[_]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    @scala.inline
    def setViewsVarargs(value: js.Any*): Self = StObject.set(x, "views", js.Array(value :_*))
    
    @scala.inline
    def setWeekChanged(value: (/* event */ Event, /* ui */ WeekChangedEventUIParam) => Unit): Self = StObject.set(x, "weekChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWeekChangedUndefined: Self = StObject.set(x, "weekChanged", js.undefined)
    
    @scala.inline
    def setWeekChanging(value: (/* event */ Event, /* ui */ WeekChangingEventUIParam) => Unit): Self = StObject.set(x, "weekChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWeekChangingUndefined: Self = StObject.set(x, "weekChanging", js.undefined)
    
    @scala.inline
    def setWeekViewSettings(value: IgSchedulerWeekViewSettings): Self = StObject.set(x, "weekViewSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekViewSettingsUndefined: Self = StObject.set(x, "weekViewSettings", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
