package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobExecutionInfo extends js.Object {
  
  /** A mapping from each stage to the information about that stage. */
  var stages: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.JobExecutionStageInfo}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.JobExecutionInfo with TopLevel[js.Any]
  ] = js.native
}
object JobExecutionInfo {
  
  @scala.inline
  def apply(): JobExecutionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionInfo]
  }
  
  @scala.inline
  implicit class JobExecutionInfoOps[Self <: JobExecutionInfo] (val x: Self) extends AnyVal {
    
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
    def setStages(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.JobExecutionStageInfo}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.JobExecutionInfo with TopLevel[js.Any]
    ): Self = this.set("stages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStages: Self = this.set("stages", js.undefined)
  }
}
