package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsFlowsVersionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Flow to create an Version for. Format: `projects//locations//agents//flows/`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1Version] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsFlowsVersionsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsFlowsVersionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsFlowsVersionsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsFlowsVersionsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowCxV3beta1Version): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
