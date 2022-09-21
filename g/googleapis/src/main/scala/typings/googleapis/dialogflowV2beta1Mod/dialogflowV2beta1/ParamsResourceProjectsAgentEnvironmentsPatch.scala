package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentEnvironmentsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. This field is used to prevent accidental overwrite of the draft environment, which is an operation that cannot be undone. To confirm that the caller desires this overwrite, this field must be explicitly set to true when updating the draft environment (environment ID = `-`).
    */
  var allowLoadToDraftAndDiscardChanges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. The unique identifier of this agent environment. Supported formats: - `projects//agent/environments/` - `projects//locations//agent/environments/`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1Environment] = js.undefined
  
  /**
    * Required. The mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAgentEnvironmentsPatch {
  
  inline def apply(): ParamsResourceProjectsAgentEnvironmentsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentEnvironmentsPatch]
  }
  
  extension [Self <: ParamsResourceProjectsAgentEnvironmentsPatch](x: Self) {
    
    inline def setAllowLoadToDraftAndDiscardChanges(value: Boolean): Self = StObject.set(x, "allowLoadToDraftAndDiscardChanges", value.asInstanceOf[js.Any])
    
    inline def setAllowLoadToDraftAndDiscardChangesUndefined: Self = StObject.set(x, "allowLoadToDraftAndDiscardChanges", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2beta1Environment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
