package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentEntitytypesEntitiesBatchupdate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the entity type to update or create entities in. Format: `projects//agent/entityTypes/`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2BatchUpdateEntitiesRequest] = js.undefined
}
object ParamsResourceProjectsAgentEntitytypesEntitiesBatchupdate {
  
  inline def apply(): ParamsResourceProjectsAgentEntitytypesEntitiesBatchupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentEntitytypesEntitiesBatchupdate]
  }
  
  extension [Self <: ParamsResourceProjectsAgentEntitytypesEntitiesBatchupdate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2BatchUpdateEntitiesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
