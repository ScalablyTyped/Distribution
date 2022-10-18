package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceUtilizationReport extends StObject {
  
  /** Per container information. Key: container name. */
  var containers: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.ResourceUtilizationReport} */ js.Any
  ] = js.undefined
  
  /** CPU utilization samples. */
  var cpuTime: js.UndefOr[js.Array[CPUTime]] = js.undefined
  
  /** Memory utilization samples. */
  var memoryInfo: js.UndefOr[js.Array[MemInfo]] = js.undefined
}
object ResourceUtilizationReport {
  
  inline def apply(): ResourceUtilizationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUtilizationReport]
  }
  
  extension [Self <: ResourceUtilizationReport](x: Self) {
    
    inline def setContainers(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.ResourceUtilizationReport} */ js.Any
    ): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setCpuTime(value: js.Array[CPUTime]): Self = StObject.set(x, "cpuTime", value.asInstanceOf[js.Any])
    
    inline def setCpuTimeUndefined: Self = StObject.set(x, "cpuTime", js.undefined)
    
    inline def setCpuTimeVarargs(value: CPUTime*): Self = StObject.set(x, "cpuTime", js.Array(value*))
    
    inline def setMemoryInfo(value: js.Array[MemInfo]): Self = StObject.set(x, "memoryInfo", value.asInstanceOf[js.Any])
    
    inline def setMemoryInfoUndefined: Self = StObject.set(x, "memoryInfo", js.undefined)
    
    inline def setMemoryInfoVarargs(value: MemInfo*): Self = StObject.set(x, "memoryInfo", js.Array(value*))
  }
}
