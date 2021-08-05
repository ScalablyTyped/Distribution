package typings.googleapis.v2Mod.androidpublisherV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReviewsReply
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Unique identifier for the Android app for which we want reviews; for
    * example, "com.spiffygame".
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReviewsReplyRequest] = js.undefined
  
  /**
    *
    */
  var reviewId: js.UndefOr[String] = js.undefined
}
object ParamsResourceReviewsReply {
  
  inline def apply(): ParamsResourceReviewsReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReviewsReply]
  }
  
  extension [Self <: ParamsResourceReviewsReply](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setRequestBody(value: SchemaReviewsReplyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setReviewId(value: String): Self = StObject.set(x, "reviewId", value.asInstanceOf[js.Any])
    
    inline def setReviewIdUndefined: Self = StObject.set(x, "reviewId", js.undefined)
  }
}
