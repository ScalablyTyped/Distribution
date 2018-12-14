package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgScheduler
  extends /**
	 * Option for igScheduler
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
  var appointmentDialogSuppress: js.UndefOr[scala.Boolean] = js.undefined
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
  var enableTodayButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets/Sets the height of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will fit the editor inside its parent container, if no other heights are defined.
  	 */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
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
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
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
  var selectedDate: js.UndefOr[stdLib.Date] = js.undefined
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
  var viewMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Lists of all the views, rendered in the Scheduler.
  	 *
  	 */
  var views: js.UndefOr[js.Array[_]] = js.undefined
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
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

