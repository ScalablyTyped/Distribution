package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentEntitytypesEntitiesBatchdelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the entity type to delete entries for. Supported formats: - `projects//agent/entityTypes/` - `projects//locations//agent/entityTypes/`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest] = js.undefined
}
object ParamsResourceProjectsAgentEntitytypesEntitiesBatchdelete {
  
  inline def apply(): ParamsResourceProjectsAgentEntitytypesEntitiesBatchdelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentEntitytypesEntitiesBatchdelete]
  }
  
  extension [Self <: ParamsResourceProjectsAgentEntitytypesEntitiesBatchdelete](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
