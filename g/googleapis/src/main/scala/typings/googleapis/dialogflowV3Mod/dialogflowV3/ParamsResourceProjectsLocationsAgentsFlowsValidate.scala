package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsFlowsValidate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The flow to validate. Format: `projects//locations//agents//flows/`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowCxV3ValidateFlowRequest] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsFlowsValidate {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsFlowsValidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsFlowsValidate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsFlowsValidate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowCxV3ValidateFlowRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
