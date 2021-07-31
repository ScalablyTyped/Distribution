package typings.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimedCount extends StObject {
  
  /** Approximate number of occurrences in the given time period. */
  var count: js.UndefOr[String] = js.undefined
  
  /** End of the time period to which `count` refers (excluded). */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Start of the time period to which `count` refers (included). */
  var startTime: js.UndefOr[String] = js.undefined
}
object TimedCount {
  
  @scala.inline
  def apply(): TimedCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimedCount]
  }
  
  @scala.inline
  implicit class TimedCountMutableBuilder[Self <: TimedCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
