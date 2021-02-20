package typings.googleapis.v2Mod.androidpublisherV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceReviewsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Unique identifier for the Android app for which we want reviews; for
    * example, "com.spiffygame".
    */
  var packageName: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var reviewId: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var translationLanguage: js.UndefOr[String] = js.native
}
object ParamsResourceReviewsGet {
  
  @scala.inline
  def apply(): ParamsResourceReviewsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReviewsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceReviewsGetMutableBuilder[Self <: ParamsResourceReviewsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setReviewId(value: String): Self = StObject.set(x, "reviewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewIdUndefined: Self = StObject.set(x, "reviewId", js.undefined)
    
    @scala.inline
    def setTranslationLanguage(value: String): Self = StObject.set(x, "translationLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationLanguageUndefined: Self = StObject.set(x, "translationLanguage", js.undefined)
  }
}
