package typings.igniteUi

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgSchedulerMethods extends js.Object {
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.igscheduler#options:language)
    * Note that this method is for rare scenarios, see [language](ui.igscheduler#options:language) or [locale](ui.igscheduler#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  
  /**
    * Creates an appointment and adds it to the appointment collection
    *
    * @param appointment appointment
    */
  def createAppointment(appointment: js.Object): js.Object = js.native
  
  /**
    * Gets reference to the date range UI button.
    */
  def dateRangeButton(): String = js.native
  
  /**
    * Deletes appointment from the appointment collection
    *
    * @param appointment appointment
    */
  def deleteAppointment(appointment: js.Object): js.Object = js.native
  
  /**
    * Destroys the widget
    */
  def destroy(): Unit = js.native
  
  /**
    * Deletes appointment from the appointment collection
    *
    * @param appointment appointment
    * @param updateAppoinment updateAppoinment
    */
  def editAppointment(appointment: js.Object, updateAppoinment: js.Object): js.Object = js.native
  
  /**
    * Gets reference to a collection of all appointments for the given time range
    *
    * @param start Start date.
    * @param end End date.
    */
  def getAppointmentsInRange(start: Date, end: Date): js.Object = js.native
  
  /**
    * Gets reference to the jQuery calendar UI control.
    */
  def getCalendar(): String = js.native
  
  /**
    * Gets reference to the next UI button.
    */
  def nextButton(): String = js.native
  
  /**
    * Gets reference to the previous UI button.
    */
  def previousButton(): String = js.native
  
  /**
    * Gets reference to the today UI button.
    */
  def todayButton(): String = js.native
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
  implicit class IgSchedulerMethodsOps[Self <: IgSchedulerMethods] (val x: Self) extends AnyVal {
    
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
    def setChangeGlobalLanguage(value: () => Unit): Self = this.set("changeGlobalLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = this.set("changeGlobalRegional", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeLocale(value: () => Unit): Self = this.set("changeLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateAppointment(value: js.Object => js.Object): Self = this.set("createAppointment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDateRangeButton(value: () => String): Self = this.set("dateRangeButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteAppointment(value: js.Object => js.Object): Self = this.set("deleteAppointment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEditAppointment(value: (js.Object, js.Object) => js.Object): Self = this.set("editAppointment", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAppointmentsInRange(value: (Date, Date) => js.Object): Self = this.set("getAppointmentsInRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCalendar(value: () => String): Self = this.set("getCalendar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextButton(value: () => String): Self = this.set("nextButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreviousButton(value: () => String): Self = this.set("previousButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTodayButton(value: () => String): Self = this.set("todayButton", js.Any.fromFunction0(value))
  }
}
