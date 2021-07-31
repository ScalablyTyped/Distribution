package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPUTime extends StObject {
  
  /** Average CPU utilization rate (% non-idle cpu / second) since previous sample. */
  var rate: js.UndefOr[Double] = js.undefined
  
  /** Timestamp of the measurement. */
  var timestamp: js.UndefOr[String] = js.undefined
  
  /** Total active CPU time across all cores (ie., non-idle) in milliseconds since start-up. */
  var totalMs: js.UndefOr[String] = js.undefined
}
object CPUTime {
  
  @scala.inline
  def apply(): CPUTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CPUTime]
  }
  
  @scala.inline
  implicit class CPUTimeMutableBuilder[Self <: CPUTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setTotalMs(value: String): Self = StObject.set(x, "totalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalMsUndefined: Self = StObject.set(x, "totalMs", js.undefined)
  }
}
