package typings.maximMazurokGapiClientDfareporting.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Active extends StObject {
  
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
  implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setEvery(value: Double): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    @scala.inline
    def setRepeats(value: String): Self = StObject.set(x, "repeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatsOnWeekDays(value: js.Array[String]): Self = StObject.set(x, "repeatsOnWeekDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatsOnWeekDaysUndefined: Self = StObject.set(x, "repeatsOnWeekDays", js.undefined)
    
    @scala.inline
    def setRepeatsOnWeekDaysVarargs(value: String*): Self = StObject.set(x, "repeatsOnWeekDays", js.Array(value :_*))
    
    @scala.inline
    def setRepeatsUndefined: Self = StObject.set(x, "repeats", js.undefined)
    
    @scala.inline
    def setRunsOnDayOfMonth(value: String): Self = StObject.set(x, "runsOnDayOfMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunsOnDayOfMonthUndefined: Self = StObject.set(x, "runsOnDayOfMonth", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
