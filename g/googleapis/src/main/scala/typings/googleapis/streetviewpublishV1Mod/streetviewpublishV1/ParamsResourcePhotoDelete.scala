package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePhotoDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. ID of the Photo.
    */
  var photoId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePhotoDelete {
  
  inline def apply(): ParamsResourcePhotoDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePhotoDelete]
  }
  
  extension [Self <: ParamsResourcePhotoDelete](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setPhotoId(value: String): Self = StObject.set(x, "photoId", value.asInstanceOf[js.Any])
    
    inline def setPhotoIdUndefined: Self = StObject.set(x, "photoId", js.undefined)
  }
}
