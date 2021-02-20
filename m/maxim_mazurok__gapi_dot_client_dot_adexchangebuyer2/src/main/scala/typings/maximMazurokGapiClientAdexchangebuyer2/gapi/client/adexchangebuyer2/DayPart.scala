package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayPart extends StObject {
  
  /** The day of the week to target. If unspecified, applicable to all days. */
  var dayOfWeek: js.UndefOr[String] = js.native
  
  /** The ending time of the day for the ad to show (minute level granularity). The end time is exclusive. This field is not available for filtering in PQL queries. */
  var endTime: js.UndefOr[TimeOfDay] = js.native
  
  /** The starting time of day for the ad to show (minute level granularity). The start time is inclusive. This field is not available for filtering in PQL queries. */
  var startTime: js.UndefOr[TimeOfDay] = js.native
}
object DayPart {
  
  @scala.inline
  def apply(): DayPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPart]
  }
  
  @scala.inline
  implicit class DayPartMutableBuilder[Self <: DayPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    @scala.inline
    def setEndTime(value: TimeOfDay): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: TimeOfDay): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
