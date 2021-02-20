package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePhotosBatchget extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
    * information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. If
    * language_code is unspecified, the user's language preference for Google
    * services is used.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Required. IDs of the Photos. For HTTP GET requests, the URL query
    * parameter should be `photoIds=<id1>&photoIds=<id2>&...`.
    */
  var photoIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies if a download URL for the photo bytes should be returned in the
    * Photo response.
    */
  var view: js.UndefOr[String] = js.native
}
object ParamsResourcePhotosBatchget {
  
  @scala.inline
  def apply(): ParamsResourcePhotosBatchget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePhotosBatchget]
  }
  
  @scala.inline
  implicit class ParamsResourcePhotosBatchgetMutableBuilder[Self <: ParamsResourcePhotosBatchget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setPhotoIds(value: js.Array[String]): Self = StObject.set(x, "photoIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoIdsUndefined: Self = StObject.set(x, "photoIds", js.undefined)
    
    @scala.inline
    def setPhotoIdsVarargs(value: String*): Self = StObject.set(x, "photoIds", js.Array(value :_*))
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
