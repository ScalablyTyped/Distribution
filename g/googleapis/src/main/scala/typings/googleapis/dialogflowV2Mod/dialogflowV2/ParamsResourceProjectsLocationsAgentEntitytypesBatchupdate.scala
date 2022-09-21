package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentEntitytypesBatchupdate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the agent to update or create entity types in. Format: `projects//agent`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2BatchUpdateEntityTypesRequest] = js.undefined
}
object ParamsResourceProjectsLocationsAgentEntitytypesBatchupdate {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentEntitytypesBatchupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentEntitytypesBatchupdate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentEntitytypesBatchupdate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2BatchUpdateEntityTypesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
