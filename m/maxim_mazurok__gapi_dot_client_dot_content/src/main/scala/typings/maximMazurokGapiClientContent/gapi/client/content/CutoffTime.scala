package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CutoffTime extends StObject {
  
  /** Hour of the cutoff time until which an order has to be placed to be processed in the same day. Required. */
  var hour: js.UndefOr[Double] = js.undefined
  
  /** Minute of the cutoff time until which an order has to be placed to be processed in the same day. Required. */
  var minute: js.UndefOr[Double] = js.undefined
  
  /** Timezone identifier for the cutoff time (for example, "Europe/Zurich"). List of identifiers. Required. */
  var timezone: js.UndefOr[String] = js.undefined
}
object CutoffTime {
  
  inline def apply(): CutoffTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CutoffTime]
  }
  
  extension [Self <: CutoffTime](x: Self) {
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
