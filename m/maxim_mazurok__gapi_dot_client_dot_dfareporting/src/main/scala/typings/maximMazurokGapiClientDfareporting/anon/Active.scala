package typings.maximMazurokGapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Active extends js.Object {
  
  /** Whether the schedule is active or not. Must be set to either true or false. */
  var active: js.UndefOr[Boolean] = js.native
  
  /** Defines every how many days, weeks or months the report should be run. Needs to be set when "repeats" is either "DAILY", "WEEKLY" or "MONTHLY". */
  var every: js.UndefOr[Double] = js.native
  
  var expirationDate: js.UndefOr[String] = js.native
  
  /**
    * The interval for which the report is repeated. Note: - "DAILY" also requires field "every" to be set. - "WEEKLY" also requires fields "every" and "repeatsOnWeekDays" to be set.
    * - "MONTHLY" also requires fields "every" and "runsOnDayOfMonth" to be set.
    */
  var repeats: js.UndefOr[String] = js.native
  
  /** List of week days "WEEKLY" on which scheduled reports should run. */
  var repeatsOnWeekDays: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Enum to define for "MONTHLY" scheduled reports whether reports should be repeated on the same day of the month as "startDate" or the same day of the week of the month. Example:
    * If 'startDate' is Monday, April 2nd 2012 (2012-04-02), "DAY_OF_MONTH" would run subsequent reports on the 2nd of every Month, and "WEEK_OF_MONTH" would run subsequent reports on
    * the first Monday of the month.
    */
  var runsOnDayOfMonth: js.UndefOr[String] = js.native
  
  var startDate: js.UndefOr[String] = js.native
}
object Active {
  
  @scala.inline
  def apply(): Active = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit class ActiveOps[Self <: Active] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setEvery(value: Double): Self = this.set("every", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvery: Self = this.set("every", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    
    @scala.inline
    def setRepeats(value: String): Self = this.set("repeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeats: Self = this.set("repeats", js.undefined)
    
    @scala.inline
    def setRepeatsOnWeekDaysVarargs(value: String*): Self = this.set("repeatsOnWeekDays", js.Array(value :_*))
    
    @scala.inline
    def setRepeatsOnWeekDays(value: js.Array[String]): Self = this.set("repeatsOnWeekDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatsOnWeekDays: Self = this.set("repeatsOnWeekDays", js.undefined)
    
    @scala.inline
    def setRunsOnDayOfMonth(value: String): Self = this.set("runsOnDayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunsOnDayOfMonth: Self = this.set("runsOnDayOfMonth", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
}
