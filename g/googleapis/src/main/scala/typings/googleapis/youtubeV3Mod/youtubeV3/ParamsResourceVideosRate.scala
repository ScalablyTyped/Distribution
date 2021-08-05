package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVideosRate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The id parameter specifies the YouTube video ID of the video that is
    * being rated or having its rating removed.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the rating to record.
    */
  var rating: js.UndefOr[String] = js.undefined
}
object ParamsResourceVideosRate {
  
  inline def apply(): ParamsResourceVideosRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVideosRate]
  }
  
  extension [Self <: ParamsResourceVideosRate](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
  }
}
