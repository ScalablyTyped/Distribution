package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsTestcasesBatchrun
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Agent name. Format: `projects//locations//agents/ `.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesRequest] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsTestcasesBatchrun {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsTestcasesBatchrun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsTestcasesBatchrun]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsTestcasesBatchrun](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
