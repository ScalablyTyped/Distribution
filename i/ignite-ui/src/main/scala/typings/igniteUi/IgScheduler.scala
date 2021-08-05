package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgScheduler
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Fired after agenda view range is changed when using previous and next buttons (fired only in Agenda View)
    */
  var agendaRangeChanged: js.UndefOr[AgendaRangeChangedEvent] = js.undefined
  
  /**
    * Fired before agenda view range is changed when using previous and next buttons (fired only in Agenda View)
    */
  var agendaRangeChanging: js.UndefOr[AgendaRangeChangingEvent] = js.undefined
  
  /**
    * Gets/Sets AgendaView settings.
    *
    */
  var agendaViewSettings: js.UndefOr[IgSchedulerAgendaViewSettings] = js.undefined
  
  /**
    * Fired after an appointment is created.
    */
  var appointmentCreated: js.UndefOr[AppointmentCreatedEvent] = js.undefined
  
  /**
    * Fired before an appointment is created.
    */
  var appointmentCreating: js.UndefOr[AppointmentCreatingEvent] = js.undefined
  
  /**
    * Fired after an appointment is deleted.
    */
  var appointmentDeleted: js.UndefOr[AppointmentDeletedEvent] = js.undefined
  
  /**
    * Fired before an appointment is deleted.
    */
  var appointmentDeleting: js.UndefOr[AppointmentDeletingEvent] = js.undefined
  
  /**
    * Fired after closing the dialog window for adding/editing appointment.
    */
  var appointmentDialogClosed: js.UndefOr[AppointmentDialogClosedEvent] = js.undefined
  
  /**
    * Fired before closing the dialog for adding/editing appointment.
    */
  var appointmentDialogClosing: js.UndefOr[AppointmentDialogClosingEvent] = js.undefined
  
  /**
    * Fired after opening the dialog for creating/editing appointment.
    */
  var appointmentDialogOpened: js.UndefOr[AppointmentDialogOpenedEvent] = js.undefined
  
  /**
    * Fired before opening the dialog for creating/editing appointment.
    */
  var appointmentDialogOpening: js.UndefOr[AppointmentDialogOpeningEvent] = js.undefined
  
  /**
    * Gets/Sets whether the appointment dialog and the related day and appointment popups should be shown.
    *
    */
  var appointmentDialogSuppress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Fired after an appointment is edited.
    */
  var appointmentEdited: js.UndefOr[AppointmentEditedEvent] = js.undefined
  
  /**
    * Fired before an appointment is edited.
    */
  var appointmentEditing: js.UndefOr[AppointmentEditingEvent] = js.undefined
  
  /**
    * Gets/Sets dataSource of type $.ig.scheduler.ScheduleListDataSource.
    *
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Fired after day is changed when using previous and next buttons (fired only in Day View)
    */
  var dayChanged: js.UndefOr[DayChangedEvent] = js.undefined
  
  /**
    * Fired before changing the day begins, when using previous and next buttons (fired only in Day View)
    */
  var dayChanging: js.UndefOr[DayChangingEvent] = js.undefined
  
  /**
    * Fired when a day is selected from the datepicker calendar.
    */
  var daySelected: js.UndefOr[DaySelectedEvent] = js.undefined
  
  /**
    * Gets/Sets DayView settings.
    *
    */
  var dayViewSettings: js.UndefOr[IgSchedulerDayViewSettings] = js.undefined
  
  /**
    * Enables/Disables today button.
    *
    */
  var enableTodayButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets the height of the control.
    *
    *
    * Valid values:
    * "null" will fit the editor inside its parent container, if no other heights are defined.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Fired after month is changed when using previous and next buttons (fired only in Month View)
    */
  var monthChanged: js.UndefOr[MonthChangedEvent] = js.undefined
  
  /**
    * Fired before changing the month begins, when using previous and next buttons (fired only in Month View)
    */
  var monthChanging: js.UndefOr[MonthChangingEvent] = js.undefined
  
  /**
    * Gets/Sets MonthView settings.
    *
    */
  var monthViewSettings: js.UndefOr[IgSchedulerMonthViewSettings] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * Fired after rendering of the scheduler has finished.
    */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  
  /**
    * Fired before rendering of the scheduler begins.
    */
  var rendering: js.UndefOr[RenderingEvent] = js.undefined
  
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
  var resources: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets/Sets selected date in the Scheduler.
    *
    */
  var selectedDate: js.UndefOr[Date] = js.undefined
  
  /**
    * Fired after the view is changed, when using the menu buttons.
    */
  var viewChanged: js.UndefOr[ViewChangedEvent] = js.undefined
  
  /**
    * Fired before the view is changed, when using the menu buttons.
    */
  var viewChanging: js.UndefOr[ViewChangingEvent] = js.undefined
  
  /**
    * Gets/Sets current view mode in the Scheduler. If this options is not defined, then the first defined view in the views property is taken.
    *
    *
    * Valid values:
    * "monthView" Enables MonthView in the Scheduler.
    * "agendaView" Enables AgendaView in the Scheduler.
    */
  var viewMode: js.UndefOr[String] = js.undefined
  
  /**
    * Lists of all the views, rendered in the Scheduler.
    *
    */
  var views: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Fired after week is changed when using previous and next buttons (fired only in Week View)
    */
  var weekChanged: js.UndefOr[WeekChangedEvent] = js.undefined
  
  /**
    * Fired before changing the week begins, when using previous and next buttons (fired only in Week View)
    */
  var weekChanging: js.UndefOr[WeekChangingEvent] = js.undefined
  
  /**
    * Gets/Sets WeekView settings.
    *
    */
  var weekViewSettings: js.UndefOr[IgSchedulerWeekViewSettings] = js.undefined
  
  /**
    * Gets/Sets the width of the control.
    *
    *
    * Valid values:
    * "null" will stretch to fit data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.undefined
}
object IgScheduler {
  
  inline def apply(): IgScheduler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgScheduler]
  }
  
  extension [Self <: IgScheduler](x: Self) {
    
    inline def setAgendaRangeChanged(value: (/* event */ Event, /* ui */ AgendaRangeChangedEventUIParam) => Unit): Self = StObject.set(x, "agendaRangeChanged", js.Any.fromFunction2(value))
    
    inline def setAgendaRangeChangedUndefined: Self = StObject.set(x, "agendaRangeChanged", js.undefined)
    
    inline def setAgendaRangeChanging(value: (/* event */ Event, /* ui */ AgendaRangeChangingEventUIParam) => Unit): Self = StObject.set(x, "agendaRangeChanging", js.Any.fromFunction2(value))
    
    inline def setAgendaRangeChangingUndefined: Self = StObject.set(x, "agendaRangeChanging", js.undefined)
    
    inline def setAgendaViewSettings(value: IgSchedulerAgendaViewSettings): Self = StObject.set(x, "agendaViewSettings", value.asInstanceOf[js.Any])
    
    inline def setAgendaViewSettingsUndefined: Self = StObject.set(x, "agendaViewSettings", js.undefined)
    
    inline def setAppointmentCreated(value: (/* event */ Event, /* ui */ AppointmentCreatedEventUIParam) => Unit): Self = StObject.set(x, "appointmentCreated", js.Any.fromFunction2(value))
    
    inline def setAppointmentCreatedUndefined: Self = StObject.set(x, "appointmentCreated", js.undefined)
    
    inline def setAppointmentCreating(value: (/* event */ Event, /* ui */ AppointmentCreatingEventUIParam) => Unit): Self = StObject.set(x, "appointmentCreating", js.Any.fromFunction2(value))
    
    inline def setAppointmentCreatingUndefined: Self = StObject.set(x, "appointmentCreating", js.undefined)
    
    inline def setAppointmentDeleted(value: (/* event */ Event, /* ui */ AppointmentDeletedEventUIParam) => Unit): Self = StObject.set(x, "appointmentDeleted", js.Any.fromFunction2(value))
    
    inline def setAppointmentDeletedUndefined: Self = StObject.set(x, "appointmentDeleted", js.undefined)
    
    inline def setAppointmentDeleting(value: (/* event */ Event, /* ui */ AppointmentDeletingEventUIParam) => Unit): Self = StObject.set(x, "appointmentDeleting", js.Any.fromFunction2(value))
    
    inline def setAppointmentDeletingUndefined: Self = StObject.set(x, "appointmentDeleting", js.undefined)
    
    inline def setAppointmentDialogClosed(value: (/* event */ Event, /* ui */ AppointmentDialogClosedEventUIParam) => Unit): Self = StObject.set(x, "appointmentDialogClosed", js.Any.fromFunction2(value))
    
    inline def setAppointmentDialogClosedUndefined: Self = StObject.set(x, "appointmentDialogClosed", js.undefined)
    
    inline def setAppointmentDialogClosing(value: (/* event */ Event, /* ui */ AppointmentDialogClosingEventUIParam) => Unit): Self = StObject.set(x, "appointmentDialogClosing", js.Any.fromFunction2(value))
    
    inline def setAppointmentDialogClosingUndefined: Self = StObject.set(x, "appointmentDialogClosing", js.undefined)
    
    inline def setAppointmentDialogOpened(value: (/* event */ Event, /* ui */ AppointmentDialogOpenedEventUIParam) => Unit): Self = StObject.set(x, "appointmentDialogOpened", js.Any.fromFunction2(value))
    
    inline def setAppointmentDialogOpenedUndefined: Self = StObject.set(x, "appointmentDialogOpened", js.undefined)
    
    inline def setAppointmentDialogOpening(value: (/* event */ Event, /* ui */ AppointmentDialogOpeningEventUIParam) => Unit): Self = StObject.set(x, "appointmentDialogOpening", js.Any.fromFunction2(value))
    
    inline def setAppointmentDialogOpeningUndefined: Self = StObject.set(x, "appointmentDialogOpening", js.undefined)
    
    inline def setAppointmentDialogSuppress(value: Boolean): Self = StObject.set(x, "appointmentDialogSuppress", value.asInstanceOf[js.Any])
    
    inline def setAppointmentDialogSuppressUndefined: Self = StObject.set(x, "appointmentDialogSuppress", js.undefined)
    
    inline def setAppointmentEdited(value: (/* event */ Event, /* ui */ AppointmentEditedEventUIParam) => Unit): Self = StObject.set(x, "appointmentEdited", js.Any.fromFunction2(value))
    
    inline def setAppointmentEditedUndefined: Self = StObject.set(x, "appointmentEdited", js.undefined)
    
    inline def setAppointmentEditing(value: (/* event */ Event, /* ui */ AppointmentEditingEventUIParam) => Unit): Self = StObject.set(x, "appointmentEditing", js.Any.fromFunction2(value))
    
    inline def setAppointmentEditingUndefined: Self = StObject.set(x, "appointmentEditing", js.undefined)
    
    inline def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDayChanged(value: (/* event */ Event, /* ui */ DayChangedEventUIParam) => Unit): Self = StObject.set(x, "dayChanged", js.Any.fromFunction2(value))
    
    inline def setDayChangedUndefined: Self = StObject.set(x, "dayChanged", js.undefined)
    
    inline def setDayChanging(value: (/* event */ Event, /* ui */ DayChangingEventUIParam) => Unit): Self = StObject.set(x, "dayChanging", js.Any.fromFunction2(value))
    
    inline def setDayChangingUndefined: Self = StObject.set(x, "dayChanging", js.undefined)
    
    inline def setDaySelected(value: (/* event */ Event, /* ui */ DaySelectedEventUIParam) => Unit): Self = StObject.set(x, "daySelected", js.Any.fromFunction2(value))
    
    inline def setDaySelectedUndefined: Self = StObject.set(x, "daySelected", js.undefined)
    
    inline def setDayViewSettings(value: IgSchedulerDayViewSettings): Self = StObject.set(x, "dayViewSettings", value.asInstanceOf[js.Any])
    
    inline def setDayViewSettingsUndefined: Self = StObject.set(x, "dayViewSettings", js.undefined)
    
    inline def setEnableTodayButton(value: Boolean): Self = StObject.set(x, "enableTodayButton", value.asInstanceOf[js.Any])
    
    inline def setEnableTodayButtonUndefined: Self = StObject.set(x, "enableTodayButton", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMonthChanged(value: (/* event */ Event, /* ui */ MonthChangedEventUIParam) => Unit): Self = StObject.set(x, "monthChanged", js.Any.fromFunction2(value))
    
    inline def setMonthChangedUndefined: Self = StObject.set(x, "monthChanged", js.undefined)
    
    inline def setMonthChanging(value: (/* event */ Event, /* ui */ MonthChangingEventUIParam) => Unit): Self = StObject.set(x, "monthChanging", js.Any.fromFunction2(value))
    
    inline def setMonthChangingUndefined: Self = StObject.set(x, "monthChanging", js.undefined)
    
    inline def setMonthViewSettings(value: IgSchedulerMonthViewSettings): Self = StObject.set(x, "monthViewSettings", value.asInstanceOf[js.Any])
    
    inline def setMonthViewSettingsUndefined: Self = StObject.set(x, "monthViewSettings", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = StObject.set(x, "rendered", js.Any.fromFunction2(value))
    
    inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    inline def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = StObject.set(x, "rendering", js.Any.fromFunction2(value))
    
    inline def setRenderingUndefined: Self = StObject.set(x, "rendering", js.undefined)
    
    inline def setResources(value: js.Any): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setSelectedDate(value: Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
    
    inline def setSelectedDateUndefined: Self = StObject.set(x, "selectedDate", js.undefined)
    
    inline def setViewChanged(value: (/* event */ Event, /* ui */ ViewChangedEventUIParam) => Unit): Self = StObject.set(x, "viewChanged", js.Any.fromFunction2(value))
    
    inline def setViewChangedUndefined: Self = StObject.set(x, "viewChanged", js.undefined)
    
    inline def setViewChanging(value: (/* event */ Event, /* ui */ ViewChangingEventUIParam) => Unit): Self = StObject.set(x, "viewChanging", js.Any.fromFunction2(value))
    
    inline def setViewChangingUndefined: Self = StObject.set(x, "viewChanging", js.undefined)
    
    inline def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    
    inline def setViews(value: js.Array[js.Any]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setViewsVarargs(value: js.Any*): Self = StObject.set(x, "views", js.Array(value :_*))
    
    inline def setWeekChanged(value: (/* event */ Event, /* ui */ WeekChangedEventUIParam) => Unit): Self = StObject.set(x, "weekChanged", js.Any.fromFunction2(value))
    
    inline def setWeekChangedUndefined: Self = StObject.set(x, "weekChanged", js.undefined)
    
    inline def setWeekChanging(value: (/* event */ Event, /* ui */ WeekChangingEventUIParam) => Unit): Self = StObject.set(x, "weekChanging", js.Any.fromFunction2(value))
    
    inline def setWeekChangingUndefined: Self = StObject.set(x, "weekChanging", js.undefined)
    
    inline def setWeekViewSettings(value: IgSchedulerWeekViewSettings): Self = StObject.set(x, "weekViewSettings", value.asInstanceOf[js.Any])
    
    inline def setWeekViewSettingsUndefined: Self = StObject.set(x, "weekViewSettings", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
