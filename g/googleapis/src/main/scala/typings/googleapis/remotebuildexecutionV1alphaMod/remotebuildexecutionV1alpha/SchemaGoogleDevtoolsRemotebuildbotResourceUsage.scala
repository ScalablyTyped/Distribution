package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildbotResourceUsage extends StObject {
  
  var cpuUsedPercent: js.UndefOr[Double | Null] = js.undefined
  
  var diskUsage: js.UndefOr[SchemaGoogleDevtoolsRemotebuildbotResourceUsageStat] = js.undefined
  
  var memoryUsage: js.UndefOr[SchemaGoogleDevtoolsRemotebuildbotResourceUsageStat] = js.undefined
  
  var totalDiskIoStats: js.UndefOr[SchemaGoogleDevtoolsRemotebuildbotResourceUsageIOStats] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildbotResourceUsage {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildbotResourceUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildbotResourceUsage]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildbotResourceUsage](x: Self) {
    
    inline def setCpuUsedPercent(value: Double): Self = StObject.set(x, "cpuUsedPercent", value.asInstanceOf[js.Any])
    
    inline def setCpuUsedPercentNull: Self = StObject.set(x, "cpuUsedPercent", null)
    
    inline def setCpuUsedPercentUndefined: Self = StObject.set(x, "cpuUsedPercent", js.undefined)
    
    inline def setDiskUsage(value: SchemaGoogleDevtoolsRemotebuildbotResourceUsageStat): Self = StObject.set(x, "diskUsage", value.asInstanceOf[js.Any])
    
    inline def setDiskUsageUndefined: Self = StObject.set(x, "diskUsage", js.undefined)
    
    inline def setMemoryUsage(value: SchemaGoogleDevtoolsRemotebuildbotResourceUsageStat): Self = StObject.set(x, "memoryUsage", value.asInstanceOf[js.Any])
    
    inline def setMemoryUsageUndefined: Self = StObject.set(x, "memoryUsage", js.undefined)
    
    inline def setTotalDiskIoStats(value: SchemaGoogleDevtoolsRemotebuildbotResourceUsageIOStats): Self = StObject.set(x, "totalDiskIoStats", value.asInstanceOf[js.Any])
    
    inline def setTotalDiskIoStatsUndefined: Self = StObject.set(x, "totalDiskIoStats", js.undefined)
  }
}
