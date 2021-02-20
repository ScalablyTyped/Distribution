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
trait ParamsResourcePhotosList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The filter expression. For example:
    * `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`.  The only filter supported at the
    * moment is `placeId`.
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
    * information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. If
    * language_code is unspecified, the user's language preference for Google
    * services is used.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of photos to return. `pageSize` must be non-negative.
    * If `pageSize` is zero or is not provided, the default page size of 100 is
    * used. The number of photos returned in the response may be less than
    * `pageSize` if the number of photos that belong to the user is less than
    * `pageSize`.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The nextPageToken value returned from a previous ListPhotos request, if
    * any.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Specifies if a download URL for the photos bytes should be returned in
    * the Photos response.
    */
  var view: js.UndefOr[String] = js.native
}
object ParamsResourcePhotosList {
  
  @scala.inline
  def apply(): ParamsResourcePhotosList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePhotosList]
  }
  
  @scala.inline
  implicit class ParamsResourcePhotosListMutableBuilder[Self <: ParamsResourcePhotosList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
