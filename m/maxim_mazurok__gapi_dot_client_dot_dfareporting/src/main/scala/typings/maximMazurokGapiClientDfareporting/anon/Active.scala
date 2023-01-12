package typings.maximMazurokGapiClientDfareporting.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Active extends StObject {
  
  /** Whether the schedule is active or not. Must be set to either true or false. */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** Defines every how many days, weeks or months the report should be run. Needs to be set when "repeats" is either "DAILY", "WEEKLY" or "MONTHLY". */
  var every: js.UndefOr[Double] = js.undefined
  
  var expirationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The interval for which the report is repeated. Note: - "DAILY" also requires field "every" to be set. - "WEEKLY" also requires fields "every" and "repeatsOnWeekDays" to be set.
    * - "MONTHLY" also requires fields "every" and "runsOnDayOfMonth" to be set.
    */
  var repeats: js.UndefOr[String] = js.undefined
  
  /** List of week days "WEEKLY" on which scheduled reports should run. */
  var repeatsOnWeekDays: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Enum to define for "MONTHLY" scheduled reports whether reports should be repeated on the same day of the month as "startDate" or the same day of the week of the month. Example:
    * If 'startDate' is Monday, April 2nd 2012 (2012-04-02), "DAY_OF_MONTH" would run subsequent reports on the 2nd of every Month, and "WEEK_OF_MONTH" would run subsequent reports on
    * the first Monday of the month.
    */
  var runsOnDayOfMonth: js.UndefOr[String] = js.undefined
  
  var startDate: js.UndefOr[String] = js.undefined
}
object Active {
  
  inline def apply(): Active = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setEvery(value: Double): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
    
    inline def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setRepeats(value: String): Self = StObject.set(x, "repeats", value.asInstanceOf[js.Any])
    
    inline def setRepeatsOnWeekDays(value: js.Array[String]): Self = StObject.set(x, "repeatsOnWeekDays", value.asInstanceOf[js.Any])
    
    inline def setRepeatsOnWeekDaysUndefined: Self = StObject.set(x, "repeatsOnWeekDays", js.undefined)
    
    inline def setRepeatsOnWeekDaysVarargs(value: String*): Self = StObject.set(x, "repeatsOnWeekDays", js.Array(value*))
    
    inline def setRepeatsUndefined: Self = StObject.set(x, "repeats", js.undefined)
    
    inline def setRunsOnDayOfMonth(value: String): Self = StObject.set(x, "runsOnDayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setRunsOnDayOfMonthUndefined: Self = StObject.set(x, "runsOnDayOfMonth", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
