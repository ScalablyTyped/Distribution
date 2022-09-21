package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsHmackeysUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the HMAC key being updated.
    */
  var accessId: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID owning the service account of the updated key.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaHmacKeyMetadata] = js.undefined
  
  /**
    * The project to be billed for this request.
    */
  var userProject: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsHmackeysUpdate {
  
  inline def apply(): ParamsResourceProjectsHmackeysUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHmackeysUpdate]
  }
  
  extension [Self <: ParamsResourceProjectsHmackeysUpdate](x: Self) {
    
    inline def setAccessId(value: String): Self = StObject.set(x, "accessId", value.asInstanceOf[js.Any])
    
    inline def setAccessIdUndefined: Self = StObject.set(x, "accessId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRequestBody(value: SchemaHmacKeyMetadata): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
