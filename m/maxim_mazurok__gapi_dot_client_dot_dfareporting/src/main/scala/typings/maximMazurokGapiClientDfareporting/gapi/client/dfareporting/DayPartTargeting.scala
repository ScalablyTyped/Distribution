package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayPartTargeting extends StObject {
  
  /** Days of the week when the ad will serve. Acceptable values are: - "SUNDAY" - "MONDAY" - "TUESDAY" - "WEDNESDAY" - "THURSDAY" - "FRIDAY" - "SATURDAY" */
  var daysOfWeek: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Hours of the day when the ad will serve, where 0 is midnight to 1 AM and 23 is 11 PM to midnight. Can be specified with days of week, in which case the ad would serve during these
    * hours on the specified days. For example if Monday, Wednesday, Friday are the days of week specified and 9-10am, 3-5pm (hours 9, 15, and 16) is specified, the ad would serve Monday,
    * Wednesdays, and Fridays at 9-10am and 3-5pm. Acceptable values are 0 to 23, inclusive.
    */
  var hoursOfDay: js.UndefOr[js.Array[Double]] = js.native
  
  /** Whether or not to use the user's local time. If false, the America/New York time zone applies. */
  var userLocalTime: js.UndefOr[Boolean] = js.native
}
object DayPartTargeting {
  
  @scala.inline
  def apply(): DayPartTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPartTargeting]
  }
  
  @scala.inline
  implicit class DayPartTargetingMutableBuilder[Self <: DayPartTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysOfWeek(value: js.Array[String]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
    
    @scala.inline
    def setDaysOfWeekVarargs(value: String*): Self = StObject.set(x, "daysOfWeek", js.Array(value :_*))
    
    @scala.inline
    def setHoursOfDay(value: js.Array[Double]): Self = StObject.set(x, "hoursOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoursOfDayUndefined: Self = StObject.set(x, "hoursOfDay", js.undefined)
    
    @scala.inline
    def setHoursOfDayVarargs(value: Double*): Self = StObject.set(x, "hoursOfDay", js.Array(value :_*))
    
    @scala.inline
    def setUserLocalTime(value: Boolean): Self = StObject.set(x, "userLocalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLocalTimeUndefined: Self = StObject.set(x, "userLocalTime", js.undefined)
  }
}
