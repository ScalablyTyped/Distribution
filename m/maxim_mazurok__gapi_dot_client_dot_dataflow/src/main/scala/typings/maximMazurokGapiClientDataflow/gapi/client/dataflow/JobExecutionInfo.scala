package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobExecutionInfo extends StObject {
  
  /** A mapping from each stage to the information about that stage. */
  var stages: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.JobExecutionStageInfo} */ js.Any
  ] = js.undefined
}
object JobExecutionInfo {
  
  inline def apply(): JobExecutionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobExecutionInfo] (val x: Self) extends AnyVal {
    
    inline def setStages(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.JobExecutionStageInfo} */ js.Any
    ): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
  }
}
