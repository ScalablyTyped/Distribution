package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVmUtilizationMetrics extends StObject {
  
  /**
    * Average CPU usage, percent.
    */
  var cpuAverage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Average CPU usage, percent.
    */
  var cpuAveragePercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Max CPU usage, percent.
    */
  var cpuMax: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Max CPU usage, percent.
    */
  var cpuMaxPercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Average disk IO rate, in kilobytes per second.
    */
  var diskIoRateAverage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Average disk IO rate, in kilobytes per second.
    */
  var diskIoRateAverageKbps: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max disk IO rate, in kilobytes per second.
    */
  var diskIoRateMax: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max disk IO rate, in kilobytes per second.
    */
  var diskIoRateMaxKbps: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Average memory usage, percent.
    */
  var memoryAverage: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Average memory usage, percent.
    */
  var memoryAveragePercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Max memory usage, percent.
    */
  var memoryMax: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Max memory usage, percent.
    */
  var memoryMaxPercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
    */
  var networkThroughputAverage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
    */
  var networkThroughputAverageKbps: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
    */
  var networkThroughputMax: js.UndefOr[String | Null] = js.undefined
  
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
    
    inline def setCpuAverage(value: Double): Self = StObject.set(x, "cpuAverage", value.asInstanceOf[js.Any])
    
    inline def setCpuAverageNull: Self = StObject.set(x, "cpuAverage", null)
    
    inline def setCpuAveragePercent(value: Double): Self = StObject.set(x, "cpuAveragePercent", value.asInstanceOf[js.Any])
    
    inline def setCpuAveragePercentNull: Self = StObject.set(x, "cpuAveragePercent", null)
    
    inline def setCpuAveragePercentUndefined: Self = StObject.set(x, "cpuAveragePercent", js.undefined)
    
    inline def setCpuAverageUndefined: Self = StObject.set(x, "cpuAverage", js.undefined)
    
    inline def setCpuMax(value: Double): Self = StObject.set(x, "cpuMax", value.asInstanceOf[js.Any])
    
    inline def setCpuMaxNull: Self = StObject.set(x, "cpuMax", null)
    
    inline def setCpuMaxPercent(value: Double): Self = StObject.set(x, "cpuMaxPercent", value.asInstanceOf[js.Any])
    
    inline def setCpuMaxPercentNull: Self = StObject.set(x, "cpuMaxPercent", null)
    
    inline def setCpuMaxPercentUndefined: Self = StObject.set(x, "cpuMaxPercent", js.undefined)
    
    inline def setCpuMaxUndefined: Self = StObject.set(x, "cpuMax", js.undefined)
    
    inline def setDiskIoRateAverage(value: String): Self = StObject.set(x, "diskIoRateAverage", value.asInstanceOf[js.Any])
    
    inline def setDiskIoRateAverageKbps(value: String): Self = StObject.set(x, "diskIoRateAverageKbps", value.asInstanceOf[js.Any])
    
    inline def setDiskIoRateAverageKbpsNull: Self = StObject.set(x, "diskIoRateAverageKbps", null)
    
    inline def setDiskIoRateAverageKbpsUndefined: Self = StObject.set(x, "diskIoRateAverageKbps", js.undefined)
    
    inline def setDiskIoRateAverageNull: Self = StObject.set(x, "diskIoRateAverage", null)
    
    inline def setDiskIoRateAverageUndefined: Self = StObject.set(x, "diskIoRateAverage", js.undefined)
    
    inline def setDiskIoRateMax(value: String): Self = StObject.set(x, "diskIoRateMax", value.asInstanceOf[js.Any])
    
    inline def setDiskIoRateMaxKbps(value: String): Self = StObject.set(x, "diskIoRateMaxKbps", value.asInstanceOf[js.Any])
    
    inline def setDiskIoRateMaxKbpsNull: Self = StObject.set(x, "diskIoRateMaxKbps", null)
    
    inline def setDiskIoRateMaxKbpsUndefined: Self = StObject.set(x, "diskIoRateMaxKbps", js.undefined)
    
    inline def setDiskIoRateMaxNull: Self = StObject.set(x, "diskIoRateMax", null)
    
    inline def setDiskIoRateMaxUndefined: Self = StObject.set(x, "diskIoRateMax", js.undefined)
    
    inline def setMemoryAverage(value: Double): Self = StObject.set(x, "memoryAverage", value.asInstanceOf[js.Any])
    
    inline def setMemoryAverageNull: Self = StObject.set(x, "memoryAverage", null)
    
    inline def setMemoryAveragePercent(value: Double): Self = StObject.set(x, "memoryAveragePercent", value.asInstanceOf[js.Any])
    
    inline def setMemoryAveragePercentNull: Self = StObject.set(x, "memoryAveragePercent", null)
    
    inline def setMemoryAveragePercentUndefined: Self = StObject.set(x, "memoryAveragePercent", js.undefined)
    
    inline def setMemoryAverageUndefined: Self = StObject.set(x, "memoryAverage", js.undefined)
    
    inline def setMemoryMax(value: Double): Self = StObject.set(x, "memoryMax", value.asInstanceOf[js.Any])
    
    inline def setMemoryMaxNull: Self = StObject.set(x, "memoryMax", null)
    
    inline def setMemoryMaxPercent(value: Double): Self = StObject.set(x, "memoryMaxPercent", value.asInstanceOf[js.Any])
    
    inline def setMemoryMaxPercentNull: Self = StObject.set(x, "memoryMaxPercent", null)
    
    inline def setMemoryMaxPercentUndefined: Self = StObject.set(x, "memoryMaxPercent", js.undefined)
    
    inline def setMemoryMaxUndefined: Self = StObject.set(x, "memoryMax", js.undefined)
    
    inline def setNetworkThroughputAverage(value: String): Self = StObject.set(x, "networkThroughputAverage", value.asInstanceOf[js.Any])
    
    inline def setNetworkThroughputAverageKbps(value: String): Self = StObject.set(x, "networkThroughputAverageKbps", value.asInstanceOf[js.Any])
    
    inline def setNetworkThroughputAverageKbpsNull: Self = StObject.set(x, "networkThroughputAverageKbps", null)
    
    inline def setNetworkThroughputAverageKbpsUndefined: Self = StObject.set(x, "networkThroughputAverageKbps", js.undefined)
    
    inline def setNetworkThroughputAverageNull: Self = StObject.set(x, "networkThroughputAverage", null)
    
    inline def setNetworkThroughputAverageUndefined: Self = StObject.set(x, "networkThroughputAverage", js.undefined)
    
    inline def setNetworkThroughputMax(value: String): Self = StObject.set(x, "networkThroughputMax", value.asInstanceOf[js.Any])
    
    inline def setNetworkThroughputMaxKbps(value: String): Self = StObject.set(x, "networkThroughputMaxKbps", value.asInstanceOf[js.Any])
    
    inline def setNetworkThroughputMaxKbpsNull: Self = StObject.set(x, "networkThroughputMaxKbps", null)
    
    inline def setNetworkThroughputMaxKbpsUndefined: Self = StObject.set(x, "networkThroughputMaxKbps", js.undefined)
    
    inline def setNetworkThroughputMaxNull: Self = StObject.set(x, "networkThroughputMax", null)
    
    inline def setNetworkThroughputMaxUndefined: Self = StObject.set(x, "networkThroughputMax", js.undefined)
  }
}
