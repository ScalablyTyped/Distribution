package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsTestcasesImport
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The agent to import test cases to. Format: `projects//locations//agents/`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1ImportTestCasesRequest] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsTestcasesImport {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsTestcasesImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsTestcasesImport]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsTestcasesImport](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowCxV3beta1ImportTestCasesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
