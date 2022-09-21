package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersImportsshpublickey
  extends StObject
     with StandardParameters {
  
  /**
    * The unique ID for the user in format `users/{user\}`.
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
  
  /**
    * The view configures whether to retrieve security keys information.
    */
  var view: js.UndefOr[String] = js.undefined
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
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
