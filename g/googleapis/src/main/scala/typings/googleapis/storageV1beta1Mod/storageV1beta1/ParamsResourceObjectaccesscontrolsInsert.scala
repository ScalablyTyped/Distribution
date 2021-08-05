package typings.googleapis.storageV1beta1Mod.storageV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceObjectaccesscontrolsInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Name of a bucket.
    */
  var bucket: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the object.
    */
  var `object`: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaObjectAccessControl] = js.undefined
}
object ParamsResourceObjectaccesscontrolsInsert {
  
  inline def apply(): ParamsResourceObjectaccesscontrolsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceObjectaccesscontrolsInsert]
  }
  
  extension [Self <: ParamsResourceObjectaccesscontrolsInsert](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setRequestBody(value: SchemaObjectAccessControl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
