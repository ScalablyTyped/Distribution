package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsEnvironmentsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the environment. Format: `projects//locations//agents//environments/`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1Environment] = js.undefined
  
  /**
    * Required. The mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsEnvironmentsPatch {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsEnvironmentsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsEnvironmentsPatch]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsEnvironmentsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowCxV3beta1Environment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
