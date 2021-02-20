package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobExecutionInfo extends StObject {
  
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
  implicit class JobExecutionInfoMutableBuilder[Self <: JobExecutionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStages(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.JobExecutionStageInfo}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.JobExecutionInfo with TopLevel[js.Any]
    ): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
  }
}
