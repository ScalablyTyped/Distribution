package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceUtilizationReport extends js.Object {
  
  /** Per container information. Key: container name. */
  var containers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.ResourceUtilizationReport}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.ResourceUtilizationReport with TopLevel[js.Any]
  ] = js.native
  
  /** CPU utilization samples. */
  var cpuTime: js.UndefOr[js.Array[CPUTime]] = js.native
  
  /** Memory utilization samples. */
  var memoryInfo: js.UndefOr[js.Array[MemInfo]] = js.native
}
object ResourceUtilizationReport {
  
  @scala.inline
  def apply(): ResourceUtilizationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceUtilizationReport]
  }
  
  @scala.inline
  implicit class ResourceUtilizationReportOps[Self <: ResourceUtilizationReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainers(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.ResourceUtilizationReport}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.ResourceUtilizationReport with TopLevel[js.Any]
    ): Self = this.set("containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainers: Self = this.set("containers", js.undefined)
    
    @scala.inline
    def setCpuTimeVarargs(value: CPUTime*): Self = this.set("cpuTime", js.Array(value :_*))
    
    @scala.inline
    def setCpuTime(value: js.Array[CPUTime]): Self = this.set("cpuTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuTime: Self = this.set("cpuTime", js.undefined)
    
    @scala.inline
    def setMemoryInfoVarargs(value: MemInfo*): Self = this.set("memoryInfo", js.Array(value :_*))
    
    @scala.inline
    def setMemoryInfo(value: js.Array[MemInfo]): Self = this.set("memoryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryInfo: Self = this.set("memoryInfo", js.undefined)
  }
}
