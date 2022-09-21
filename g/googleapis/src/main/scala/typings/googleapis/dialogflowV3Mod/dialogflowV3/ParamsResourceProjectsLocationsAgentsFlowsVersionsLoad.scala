package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsFlowsVersionsLoad
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Version to be loaded to draft flow. Format: `projects//locations//agents//flows//versions/`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowCxV3LoadVersionRequest] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsFlowsVersionsLoad {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsFlowsVersionsLoad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsFlowsVersionsLoad]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsFlowsVersionsLoad](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowCxV3LoadVersionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
