package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CutoffTime extends StObject {
  
  /** Hour of the cutoff time until which an order has to be placed to be processed in the same day. Required. */
  var hour: js.UndefOr[Double] = js.undefined
  
  /** Minute of the cutoff time until which an order has to be placed to be processed in the same day. Required. */
  var minute: js.UndefOr[Double] = js.undefined
  
  /** Timezone identifier for the cutoff time. A list of identifiers can be found in the AdWords API documentation. E.g. "Europe/Zurich". Required. */
  var timezone: js.UndefOr[String] = js.undefined
}
object CutoffTime {
  
  @scala.inline
  def apply(): CutoffTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CutoffTime]
  }
  
  @scala.inline
  implicit class CutoffTimeMutableBuilder[Self <: CutoffTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    @scala.inline
    def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
