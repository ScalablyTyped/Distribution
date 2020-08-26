package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSchedulerMonthViewSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets the scope of appointments that are displayed in a MonthView's AgendaView.
    *
    * allAppointments  Indicates that appointments for all days should be displayed in an AgendaView when it is a secondary view within a MonthView.
    * onlyAppointmentsForSelectedMonthViewDay  Indicates that only appointments for the day that is current selected in the associated MonthView should be displayed in an AgendaView that is associated with a MonthView as a secondary view.
    */
  var agendaVisibilityType: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the type of content displayed in a MonthView day.
    *
    * auto  Depending on the screen size, indicates square indicator mode for the appointment in the Month View, if scheduler size is larger than 768px, otherwise identifies horizontal one.
    * indicator  Indicates that a square indicator should be displayed.
    * detailed  Indicates that the subject should be displayed.
    */
  var appointmentMode: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the visibility of an AgendaView in a MonthView.  When true, the MonthView will display an AgendaView showing the Appointments for the currently selected day at the top of its list of Appointments.
    *
    */
  var isAgendaVisible: js.UndefOr[Boolean] = js.native
  /**
    * Gets/sets the visibility of the horizontal separators between weeks in the MonthView.
    *
    */
  var isHorizontalSeparatorVisibile: js.UndefOr[Boolean] = js.native
  /**
    * Gets/sets the visibility of the days from the next month that occur in the last week of a given month.
    *
    */
  var isNextMonthShown: js.UndefOr[Boolean] = js.native
  /**
    * Gets/sets the visibility of the days from the previous month that occur in the first week of a given month.
    *
    */
  var isPreviousMonthShown: js.UndefOr[Boolean] = js.native
  /**
    * Gets/sets the visibility of the vertical separators between days of the week in a MonthView.
    *
    */
  var isVerticalSeparatorVisibile: js.UndefOr[Boolean] = js.native
  /**
    * Gets/sets the visibility of the week numbers in a MonthView.
    *
    */
  var isWeekNumberVisible: js.UndefOr[Boolean] = js.native
  /**
    * Gets/sets the visibility of the weekday names in MonthView.
    *
    */
  var isWeekdayVisible: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets the orientation, which determines whether the MonthView and AgendaView views are split vertically or horizontally. This option can be used when the AgendaView is displayed in the MonthView.
    *
    * auto  Depending on the screen size, identifies vertical split if scheduler size is larger than 768px, otherwise identifies horizontal one.
    * vertical  Identifies a vertical split between the Scheduler's views.
    * horizontal  Identifies a horizontal split between the Scheduler's views.
    */
  var viewSplitOrientation: js.UndefOr[String] = js.native
}

object IgSchedulerMonthViewSettings {
  @scala.inline
  def apply(): IgSchedulerMonthViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSchedulerMonthViewSettings]
  }
  @scala.inline
  implicit class IgSchedulerMonthViewSettingsOps[Self <: IgSchedulerMonthViewSettings] (val x: Self) extends AnyVal {
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
    def setAgendaVisibilityType(value: String): Self = this.set("agendaVisibilityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgendaVisibilityType: Self = this.set("agendaVisibilityType", js.undefined)
    @scala.inline
    def setAppointmentMode(value: String): Self = this.set("appointmentMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppointmentMode: Self = this.set("appointmentMode", js.undefined)
    @scala.inline
    def setIsAgendaVisible(value: Boolean): Self = this.set("isAgendaVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAgendaVisible: Self = this.set("isAgendaVisible", js.undefined)
    @scala.inline
    def setIsHorizontalSeparatorVisibile(value: Boolean): Self = this.set("isHorizontalSeparatorVisibile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHorizontalSeparatorVisibile: Self = this.set("isHorizontalSeparatorVisibile", js.undefined)
    @scala.inline
    def setIsNextMonthShown(value: Boolean): Self = this.set("isNextMonthShown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNextMonthShown: Self = this.set("isNextMonthShown", js.undefined)
    @scala.inline
    def setIsPreviousMonthShown(value: Boolean): Self = this.set("isPreviousMonthShown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPreviousMonthShown: Self = this.set("isPreviousMonthShown", js.undefined)
    @scala.inline
    def setIsVerticalSeparatorVisibile(value: Boolean): Self = this.set("isVerticalSeparatorVisibile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVerticalSeparatorVisibile: Self = this.set("isVerticalSeparatorVisibile", js.undefined)
    @scala.inline
    def setIsWeekNumberVisible(value: Boolean): Self = this.set("isWeekNumberVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsWeekNumberVisible: Self = this.set("isWeekNumberVisible", js.undefined)
    @scala.inline
    def setIsWeekdayVisible(value: Boolean): Self = this.set("isWeekdayVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsWeekdayVisible: Self = this.set("isWeekdayVisible", js.undefined)
    @scala.inline
    def setViewSplitOrientation(value: String): Self = this.set("viewSplitOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewSplitOrientation: Self = this.set("viewSplitOrientation", js.undefined)
  }
  
}

