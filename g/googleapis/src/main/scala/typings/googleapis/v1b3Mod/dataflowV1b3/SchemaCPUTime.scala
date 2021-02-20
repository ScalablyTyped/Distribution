package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Modeled after information exposed by /proc/stat.
  */
@js.native
trait SchemaCPUTime extends StObject {
  
  /**
    * Average CPU utilization rate (% non-idle cpu / second) since previous
    * sample.
    */
  var rate: js.UndefOr[Double] = js.native
  
  /**
    * Timestamp of the measurement.
    */
  var timestamp: js.UndefOr[String] = js.native
  
  /**
    * Total active CPU time across all cores (ie., non-idle) in milliseconds
    * since start-up.
    */
  var totalMs: js.UndefOr[String] = js.native
}
object SchemaCPUTime {
  
  @scala.inline
  def apply(): SchemaCPUTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCPUTime]
  }
  
  @scala.inline
  implicit class SchemaCPUTimeMutableBuilder[Self <: SchemaCPUTime] (val x: Self) extends AnyVal {
    
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
