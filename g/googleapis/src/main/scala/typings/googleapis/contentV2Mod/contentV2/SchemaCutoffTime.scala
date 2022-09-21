package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCutoffTime extends StObject {
  
  /**
    * Hour of the cutoff time until which an order has to be placed to be processed in the same day. Required.
    */
  var hour: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Minute of the cutoff time until which an order has to be placed to be processed in the same day. Required.
    */
  var minute: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Timezone identifier for the cutoff time. A list of identifiers can be found in the AdWords API documentation. E.g. "Europe/Zurich". Required.
    */
  var timezone: js.UndefOr[String | Null] = js.undefined
}
object SchemaCutoffTime {
  
  inline def apply(): SchemaCutoffTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCutoffTime]
  }
  
  extension [Self <: SchemaCutoffTime](x: Self) {
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourNull: Self = StObject.set(x, "hour", null)
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteNull: Self = StObject.set(x, "minute", null)
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneNull: Self = StObject.set(x, "timezone", null)
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
