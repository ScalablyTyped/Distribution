package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobExecutionInfo extends StObject {
  
  /** A mapping from each stage to the information about that stage. */
  var stages: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.JobExecutionStageInfo}
    */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.JobExecutionInfo & TopLevel[Any]
  ] = js.undefined
}
object JobExecutionInfo {
  
  inline def apply(): JobExecutionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionInfo]
  }
  
  extension [Self <: JobExecutionInfo](x: Self) {
    
    inline def setStages(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.JobExecutionStageInfo}
      */ typings.maximMazurokGapiClientDataflow.maximMazurokGapiClientDataflowStrings.JobExecutionInfo & TopLevel[Any]
    ): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
  }
}
