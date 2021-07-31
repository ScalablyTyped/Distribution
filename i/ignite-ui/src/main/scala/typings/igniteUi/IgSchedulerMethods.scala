package typings.igniteUi

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSchedulerMethods extends StObject {
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.igscheduler#options:language)
    * Note that this method is for rare scenarios, see [language](ui.igscheduler#options:language) or [locale](ui.igscheduler#options:locale) option setter
    */
  def changeLocale(): Unit
  
  /**
    * Creates an appointment and adds it to the appointment collection
    *
    * @param appointment appointment
    */
  def createAppointment(appointment: js.Object): js.Object
  
  /**
    * Gets reference to the date range UI button.
    */
  def dateRangeButton(): String
  
  /**
    * Deletes appointment from the appointment collection
    *
    * @param appointment appointment
    */
  def deleteAppointment(appointment: js.Object): js.Object
  
  /**
    * Destroys the widget
    */
  def destroy(): Unit
  
  /**
    * Deletes appointment from the appointment collection
    *
    * @param appointment appointment
    * @param updateAppoinment updateAppoinment
    */
  def editAppointment(appointment: js.Object, updateAppoinment: js.Object): js.Object
  
  /**
    * Gets reference to a collection of all appointments for the given time range
    *
    * @param start Start date.
    * @param end End date.
    */
  def getAppointmentsInRange(start: Date, end: Date): js.Object
  
  /**
    * Gets reference to the jQuery calendar UI control.
    */
  def getCalendar(): String
  
  /**
    * Gets reference to the next UI button.
    */
  def nextButton(): String
  
  /**
    * Gets reference to the previous UI button.
    */
  def previousButton(): String
  
  /**
    * Gets reference to the today UI button.
    */
  def todayButton(): String
}
object IgSchedulerMethods {
  
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    createAppointment: js.Object => js.Object,
    dateRangeButton: () => String,
    deleteAppointment: js.Object => js.Object,
    destroy: () => Unit,
    editAppointment: (js.Object, js.Object) => js.Object,
    getAppointmentsInRange: (Date, Date) => js.Object,
    getCalendar: () => String,
    nextButton: () => String,
    previousButton: () => String,
    todayButton: () => String
  ): IgSchedulerMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), createAppointment = js.Any.fromFunction1(createAppointment), dateRangeButton = js.Any.fromFunction0(dateRangeButton), deleteAppointment = js.Any.fromFunction1(deleteAppointment), destroy = js.Any.fromFunction0(destroy), editAppointment = js.Any.fromFunction2(editAppointment), getAppointmentsInRange = js.Any.fromFunction2(getAppointmentsInRange), getCalendar = js.Any.fromFunction0(getCalendar), nextButton = js.Any.fromFunction0(nextButton), previousButton = js.Any.fromFunction0(previousButton), todayButton = js.Any.fromFunction0(todayButton))
    __obj.asInstanceOf[IgSchedulerMethods]
  }
  
  @scala.inline
  implicit class IgSchedulerMethodsMutableBuilder[Self <: IgSchedulerMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeGlobalLanguage(value: () => Unit): Self = StObject.set(x, "changeGlobalLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = StObject.set(x, "changeGlobalRegional", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeLocale(value: () => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateAppointment(value: js.Object => js.Object): Self = StObject.set(x, "createAppointment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDateRangeButton(value: () => String): Self = StObject.set(x, "dateRangeButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteAppointment(value: js.Object => js.Object): Self = StObject.set(x, "deleteAppointment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEditAppointment(value: (js.Object, js.Object) => js.Object): Self = StObject.set(x, "editAppointment", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAppointmentsInRange(value: (Date, Date) => js.Object): Self = StObject.set(x, "getAppointmentsInRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCalendar(value: () => String): Self = StObject.set(x, "getCalendar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextButton(value: () => String): Self = StObject.set(x, "nextButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreviousButton(value: () => String): Self = StObject.set(x, "previousButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTodayButton(value: () => String): Self = StObject.set(x, "todayButton", js.Any.fromFunction0(value))
  }
}
