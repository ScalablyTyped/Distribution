package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVmUtilizationMetrics extends StObject {
  
  /**
    * Average CPU usage, percent.
    */
  var cpuAveragePercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Max CPU usage, percent.
    */
  var cpuMaxPercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Average disk IO rate, in kilobytes per second.
    */
  var diskIoRateAverageKbps: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max disk IO rate, in kilobytes per second.
    */
  var diskIoRateMaxKbps: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Average memory usage, percent.
    */
  var memoryAveragePercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Max memory usage, percent.
    */
  var memoryMaxPercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
    */
  var networkThroughputAverageKbps: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
    */
  var networkThroughputMaxKbps: js.UndefOr[String | Null] = js.undefined
}
object SchemaVmUtilizationMetrics {
  
  inline def apply(): SchemaVmUtilizationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmUtilizationMetrics]
  }
  
  extension [Self <: SchemaVmUtilizationMetrics](x: Self) {
    
    inline def setCpuAveragePercent(value: Double): Self = StObject.set(x, "cpuAveragePercent", value.asInstanceOf[js.Any])
    
    inline def setCpuAveragePercentNull: Self = StObject.set(x, "cpuAveragePercent", null)
    
    inline def setCpuAveragePercentUndefined: Self = StObject.set(x, "cpuAveragePercent", js.undefined)
    
    inline def setCpuMaxPercent(value: Double): Self = StObject.set(x, "cpuMaxPercent", value.asInstanceOf[js.Any])
    
    inline def setCpuMaxPercentNull: Self = StObject.set(x, "cpuMaxPercent", null)
    
    inline def setCpuMaxPercentUndefined: Self = StObject.set(x, "cpuMaxPercent", js.undefined)
    
    inline def setDiskIoRateAverageKbps(value: String): Self = StObject.set(x, "diskIoRateAverageKbps", value.asInstanceOf[js.Any])
    
    inline def setDiskIoRateAverageKbpsNull: Self = StObject.set(x, "diskIoRateAverageKbps", null)
    
    inline def setDiskIoRateAverageKbpsUndefined: Self = StObject.set(x, "diskIoRateAverageKbps", js.undefined)
    
    inline def setDiskIoRateMaxKbps(value: String): Self = StObject.set(x, "diskIoRateMaxKbps", value.asInstanceOf[js.Any])
    
    inline def setDiskIoRateMaxKbpsNull: Self = StObject.set(x, "diskIoRateMaxKbps", null)
    
    inline def setDiskIoRateMaxKbpsUndefined: Self = StObject.set(x, "diskIoRateMaxKbps", js.undefined)
    
    inline def setMemoryAveragePercent(value: Double): Self = StObject.set(x, "memoryAveragePercent", value.asInstanceOf[js.Any])
    
    inline def setMemoryAveragePercentNull: Self = StObject.set(x, "memoryAveragePercent", null)
    
    inline def setMemoryAveragePercentUndefined: Self = StObject.set(x, "memoryAveragePercent", js.undefined)
    
    inline def setMemoryMaxPercent(value: Double): Self = StObject.set(x, "memoryMaxPercent", value.asInstanceOf[js.Any])
    
    inline def setMemoryMaxPercentNull: Self = StObject.set(x, "memoryMaxPercent", null)
    
    inline def setMemoryMaxPercentUndefined: Self = StObject.set(x, "memoryMaxPercent", js.undefined)
    
    inline def setNetworkThroughputAverageKbps(value: String): Self = StObject.set(x, "networkThroughputAverageKbps", value.asInstanceOf[js.Any])
    
    inline def setNetworkThroughputAverageKbpsNull: Self = StObject.set(x, "networkThroughputAverageKbps", null)
    
    inline def setNetworkThroughputAverageKbpsUndefined: Self = StObject.set(x, "networkThroughputAverageKbps", js.undefined)
    
    inline def setNetworkThroughputMaxKbps(value: String): Self = StObject.set(x, "networkThroughputMaxKbps", value.asInstanceOf[js.Any])
    
    inline def setNetworkThroughputMaxKbpsNull: Self = StObject.set(x, "networkThroughputMaxKbps", null)
    
    inline def setNetworkThroughputMaxKbpsUndefined: Self = StObject.set(x, "networkThroughputMaxKbps", js.undefined)
  }
}
