package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceUtilizationReport extends StObject {
  
  /** Per container information. Key: container name. */
  var containers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.ResourceUtilizationReport}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.ResourceUtilizationReport & TopLevel[js.Any]
  ] = js.undefined
  
  /** CPU utilization samples. */
  var cpuTime: js.UndefOr[js.Array[CPUTime]] = js.undefined
  
  /** Memory utilization samples. */
  var memoryInfo: js.UndefOr[js.Array[MemInfo]] = js.undefined
}
object ResourceUtilizationReport {
  
  @scala.inline
  def apply(): ResourceUtilizationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUtilizationReport]
  }
  
  @scala.inline
  implicit class ResourceUtilizationReportMutableBuilder[Self <: ResourceUtilizationReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainers(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.ResourceUtilizationReport}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.ResourceUtilizationReport & TopLevel[js.Any]
    ): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    @scala.inline
    def setCpuTime(value: js.Array[CPUTime]): Self = StObject.set(x, "cpuTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuTimeUndefined: Self = StObject.set(x, "cpuTime", js.undefined)
    
    @scala.inline
    def setCpuTimeVarargs(value: CPUTime*): Self = StObject.set(x, "cpuTime", js.Array(value :_*))
    
    @scala.inline
    def setMemoryInfo(value: js.Array[MemInfo]): Self = StObject.set(x, "memoryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryInfoUndefined: Self = StObject.set(x, "memoryInfo", js.undefined)
    
    @scala.inline
    def setMemoryInfoVarargs(value: MemInfo*): Self = StObject.set(x, "memoryInfo", js.Array(value :_*))
  }
}
