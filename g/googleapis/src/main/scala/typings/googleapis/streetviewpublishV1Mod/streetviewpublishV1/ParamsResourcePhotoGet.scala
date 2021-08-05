package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePhotoGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
    * information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. If
    * language_code is unspecified, the user's language preference for Google
    * services is used.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. ID of the Photo.
    */
  var photoId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if a download URL for the photo bytes should be returned in the
    * Photo response.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourcePhotoGet {
  
  inline def apply(): ParamsResourcePhotoGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePhotoGet]
  }
  
  extension [Self <: ParamsResourcePhotoGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPhotoId(value: String): Self = StObject.set(x, "photoId", value.asInstanceOf[js.Any])
    
    inline def setPhotoIdUndefined: Self = StObject.set(x, "photoId", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
