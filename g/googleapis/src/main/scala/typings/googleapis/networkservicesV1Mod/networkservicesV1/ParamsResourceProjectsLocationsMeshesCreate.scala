package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsMeshesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Short name of the Mesh resource to be created.
    */
  var meshId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource of the Mesh. Must be in the format `projects/x/locations/global`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaMesh] = js.undefined
}
object ParamsResourceProjectsLocationsMeshesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsMeshesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsMeshesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsMeshesCreate](x: Self) {
    
    inline def setMeshId(value: String): Self = StObject.set(x, "meshId", value.asInstanceOf[js.Any])
    
    inline def setMeshIdUndefined: Self = StObject.set(x, "meshId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaMesh): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
