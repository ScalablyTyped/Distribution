package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSchedulerMonthViewSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets the scope of appointments that are displayed in a MonthView's AgendaView.
    *
    * allAppointments  Indicates that appointments for all days should be displayed in an AgendaView when it is a secondary view within a MonthView.
    * onlyAppointmentsForSelectedMonthViewDay  Indicates that only appointments for the day that is current selected in the associated MonthView should be displayed in an AgendaView that is associated with a MonthView as a secondary view.
    */
  var agendaVisibilityType: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the type of content displayed in a MonthView day.
    *
    * auto  Depending on the screen size, indicates square indicator mode for the appointment in the Month View, if scheduler size is larger than 768px, otherwise identifies horizontal one.
    * indicator  Indicates that a square indicator should be displayed.
    * detailed  Indicates that the subject should be displayed.
    */
  var appointmentMode: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/Sets the visibility of an AgendaView in a MonthView.  When true, the MonthView will display an AgendaView showing the Appointments for the currently selected day at the top of its list of Appointments.
    *
    */
  var isAgendaVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/sets the visibility of the horizontal separators between weeks in the MonthView.
    *
    */
  var isHorizontalSeparatorVisibile: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/sets the visibility of the days from the next month that occur in the last week of a given month.
    *
    */
  var isNextMonthShown: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/sets the visibility of the days from the previous month that occur in the first week of a given month.
    *
    */
  var isPreviousMonthShown: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/sets the visibility of the vertical separators between days of the week in a MonthView.
    *
    */
  var isVerticalSeparatorVisibile: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/sets the visibility of the week numbers in a MonthView.
    *
    */
  var isWeekNumberVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/sets the visibility of the weekday names in MonthView.
    *
    */
  var isWeekdayVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets the orientation, which determines whether the MonthView and AgendaView views are split vertically or horizontally. This option can be used when the AgendaView is displayed in the MonthView.
    *
    * auto  Depending on the screen size, identifies vertical split if scheduler size is larger than 768px, otherwise identifies horizontal one.
    * vertical  Identifies a vertical split between the Scheduler's views.
    * horizontal  Identifies a horizontal split between the Scheduler's views.
    */
  var viewSplitOrientation: js.UndefOr[String] = js.undefined
}
object IgSchedulerMonthViewSettings {
  
  @scala.inline
  def apply(): IgSchedulerMonthViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSchedulerMonthViewSettings]
  }
  
  @scala.inline
  implicit class IgSchedulerMonthViewSettingsMutableBuilder[Self <: IgSchedulerMonthViewSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgendaVisibilityType(value: String): Self = StObject.set(x, "agendaVisibilityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgendaVisibilityTypeUndefined: Self = StObject.set(x, "agendaVisibilityType", js.undefined)
    
    @scala.inline
    def setAppointmentMode(value: String): Self = StObject.set(x, "appointmentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppointmentModeUndefined: Self = StObject.set(x, "appointmentMode", js.undefined)
    
    @scala.inline
    def setIsAgendaVisible(value: Boolean): Self = StObject.set(x, "isAgendaVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAgendaVisibleUndefined: Self = StObject.set(x, "isAgendaVisible", js.undefined)
    
    @scala.inline
    def setIsHorizontalSeparatorVisibile(value: Boolean): Self = StObject.set(x, "isHorizontalSeparatorVisibile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHorizontalSeparatorVisibileUndefined: Self = StObject.set(x, "isHorizontalSeparatorVisibile", js.undefined)
    
    @scala.inline
    def setIsNextMonthShown(value: Boolean): Self = StObject.set(x, "isNextMonthShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNextMonthShownUndefined: Self = StObject.set(x, "isNextMonthShown", js.undefined)
    
    @scala.inline
    def setIsPreviousMonthShown(value: Boolean): Self = StObject.set(x, "isPreviousMonthShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPreviousMonthShownUndefined: Self = StObject.set(x, "isPreviousMonthShown", js.undefined)
    
    @scala.inline
    def setIsVerticalSeparatorVisibile(value: Boolean): Self = StObject.set(x, "isVerticalSeparatorVisibile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVerticalSeparatorVisibileUndefined: Self = StObject.set(x, "isVerticalSeparatorVisibile", js.undefined)
    
    @scala.inline
    def setIsWeekNumberVisible(value: Boolean): Self = StObject.set(x, "isWeekNumberVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWeekNumberVisibleUndefined: Self = StObject.set(x, "isWeekNumberVisible", js.undefined)
    
    @scala.inline
    def setIsWeekdayVisible(value: Boolean): Self = StObject.set(x, "isWeekdayVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWeekdayVisibleUndefined: Self = StObject.set(x, "isWeekdayVisible", js.undefined)
    
    @scala.inline
    def setViewSplitOrientation(value: String): Self = StObject.set(x, "viewSplitOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewSplitOrientationUndefined: Self = StObject.set(x, "viewSplitOrientation", js.undefined)
  }
}
