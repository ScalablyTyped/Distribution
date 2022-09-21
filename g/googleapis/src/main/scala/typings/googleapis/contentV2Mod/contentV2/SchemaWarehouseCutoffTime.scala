package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWarehouseCutoffTime extends StObject {
  
  /**
    * Required. Hour (24-hour clock) of the cutoff time until which an order has to be placed to be processed in the same day by the warehouse. Hour is based on the timezone of warehouse.
    */
  var hour: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. Minute of the cutoff time until which an order has to be placed to be processed in the same day by the warehouse. Minute is based on the timezone of warehouse.
    */
  var minute: js.UndefOr[Double | Null] = js.undefined
}
object SchemaWarehouseCutoffTime {
  
  inline def apply(): SchemaWarehouseCutoffTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWarehouseCutoffTime]
  }
  
  extension [Self <: SchemaWarehouseCutoffTime](x: Self) {
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourNull: Self = StObject.set(x, "hour", null)
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteNull: Self = StObject.set(x, "minute", null)
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
  }
}
