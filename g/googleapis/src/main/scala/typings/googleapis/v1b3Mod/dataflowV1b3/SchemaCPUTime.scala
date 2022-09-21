package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCPUTime extends StObject {
  
  /**
    * Average CPU utilization rate (% non-idle cpu / second) since previous sample.
    */
  var rate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Timestamp of the measurement.
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total active CPU time across all cores (ie., non-idle) in milliseconds since start-up.
    */
  var totalMs: js.UndefOr[String | Null] = js.undefined
}
object SchemaCPUTime {
  
  inline def apply(): SchemaCPUTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCPUTime]
  }
  
  extension [Self <: SchemaCPUTime](x: Self) {
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateNull: Self = StObject.set(x, "rate", null)
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTotalMs(value: String): Self = StObject.set(x, "totalMs", value.asInstanceOf[js.Any])
    
    inline def setTotalMsNull: Self = StObject.set(x, "totalMs", null)
    
    inline def setTotalMsUndefined: Self = StObject.set(x, "totalMs", js.undefined)
  }
}
