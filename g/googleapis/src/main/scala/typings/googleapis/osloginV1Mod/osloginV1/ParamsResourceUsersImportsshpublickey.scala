package typings.googleapis.osloginV1Mod.osloginV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersImportsshpublickey
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The unique ID for the user in format `users/{user\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID of the Google Cloud Platform project.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSshPublicKey] = js.undefined
}
object ParamsResourceUsersImportsshpublickey {
  
  inline def apply(): ParamsResourceUsersImportsshpublickey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersImportsshpublickey]
  }
  
  extension [Self <: ParamsResourceUsersImportsshpublickey](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRequestBody(value: SchemaSshPublicKey): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
