package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgScheduler
  extends /**
	 * Option for igScheduler
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
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgScheduler {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igScheduler
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    agendaRangeChanged: AgendaRangeChangedEvent = null,
    agendaRangeChanging: AgendaRangeChangingEvent = null,
    agendaViewSettings: IgSchedulerAgendaViewSettings = null,
    appointmentCreated: AppointmentCreatedEvent = null,
    appointmentCreating: AppointmentCreatingEvent = null,
    appointmentDeleted: AppointmentDeletedEvent = null,
    appointmentDeleting: AppointmentDeletingEvent = null,
    appointmentDialogClosed: AppointmentDialogClosedEvent = null,
    appointmentDialogClosing: AppointmentDialogClosingEvent = null,
    appointmentDialogOpened: AppointmentDialogOpenedEvent = null,
    appointmentDialogOpening: AppointmentDialogOpeningEvent = null,
    appointmentDialogSuppress: js.UndefOr[Boolean] = js.undefined,
    appointmentEdited: AppointmentEditedEvent = null,
    appointmentEditing: AppointmentEditingEvent = null,
    dataSource: js.Any = null,
    dayChanged: DayChangedEvent = null,
    dayChanging: DayChangingEvent = null,
    daySelected: DaySelectedEvent = null,
    dayViewSettings: IgSchedulerDayViewSettings = null,
    enableTodayButton: js.UndefOr[Boolean] = js.undefined,
    height: String | Double = null,
    language: String = null,
    locale: js.Any = null,
    monthChanged: MonthChangedEvent = null,
    monthChanging: MonthChangingEvent = null,
    monthViewSettings: IgSchedulerMonthViewSettings = null,
    regional: String | js.Object = null,
    rendered: RenderedEvent = null,
    rendering: RenderingEvent = null,
    resources: js.Any = null,
    selectedDate: Date = null,
    viewChanged: ViewChangedEvent = null,
    viewChanging: ViewChangingEvent = null,
    viewMode: String = null,
    views: js.Array[_] = null,
    weekChanged: WeekChangedEvent = null,
    weekChanging: WeekChangingEvent = null,
    weekViewSettings: IgSchedulerWeekViewSettings = null,
    width: String | Double = null
  ): IgScheduler = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (agendaRangeChanged != null) __obj.updateDynamic("agendaRangeChanged")(agendaRangeChanged)
    if (agendaRangeChanging != null) __obj.updateDynamic("agendaRangeChanging")(agendaRangeChanging)
    if (agendaViewSettings != null) __obj.updateDynamic("agendaViewSettings")(agendaViewSettings)
    if (appointmentCreated != null) __obj.updateDynamic("appointmentCreated")(appointmentCreated)
    if (appointmentCreating != null) __obj.updateDynamic("appointmentCreating")(appointmentCreating)
    if (appointmentDeleted != null) __obj.updateDynamic("appointmentDeleted")(appointmentDeleted)
    if (appointmentDeleting != null) __obj.updateDynamic("appointmentDeleting")(appointmentDeleting)
    if (appointmentDialogClosed != null) __obj.updateDynamic("appointmentDialogClosed")(appointmentDialogClosed)
    if (appointmentDialogClosing != null) __obj.updateDynamic("appointmentDialogClosing")(appointmentDialogClosing)
    if (appointmentDialogOpened != null) __obj.updateDynamic("appointmentDialogOpened")(appointmentDialogOpened)
    if (appointmentDialogOpening != null) __obj.updateDynamic("appointmentDialogOpening")(appointmentDialogOpening)
    if (!js.isUndefined(appointmentDialogSuppress)) __obj.updateDynamic("appointmentDialogSuppress")(appointmentDialogSuppress)
    if (appointmentEdited != null) __obj.updateDynamic("appointmentEdited")(appointmentEdited)
    if (appointmentEditing != null) __obj.updateDynamic("appointmentEditing")(appointmentEditing)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dayChanged != null) __obj.updateDynamic("dayChanged")(dayChanged)
    if (dayChanging != null) __obj.updateDynamic("dayChanging")(dayChanging)
    if (daySelected != null) __obj.updateDynamic("daySelected")(daySelected)
    if (dayViewSettings != null) __obj.updateDynamic("dayViewSettings")(dayViewSettings)
    if (!js.isUndefined(enableTodayButton)) __obj.updateDynamic("enableTodayButton")(enableTodayButton)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (monthChanged != null) __obj.updateDynamic("monthChanged")(monthChanged)
    if (monthChanging != null) __obj.updateDynamic("monthChanging")(monthChanging)
    if (monthViewSettings != null) __obj.updateDynamic("monthViewSettings")(monthViewSettings)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(rendered)
    if (rendering != null) __obj.updateDynamic("rendering")(rendering)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (selectedDate != null) __obj.updateDynamic("selectedDate")(selectedDate)
    if (viewChanged != null) __obj.updateDynamic("viewChanged")(viewChanged)
    if (viewChanging != null) __obj.updateDynamic("viewChanging")(viewChanging)
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode)
    if (views != null) __obj.updateDynamic("views")(views)
    if (weekChanged != null) __obj.updateDynamic("weekChanged")(weekChanged)
    if (weekChanging != null) __obj.updateDynamic("weekChanging")(weekChanging)
    if (weekViewSettings != null) __obj.updateDynamic("weekViewSettings")(weekViewSettings)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgScheduler]
  }
}

