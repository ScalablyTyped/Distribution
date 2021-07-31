package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCommentsSetmoderationstatus
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The banAuthor parameter lets you indicate that you want to automatically
    * reject any additional comments written by the comment's author. Set the
    * parameter value to true to ban the author.  Note: This parameter is only
    * valid if the moderationStatus parameter is also set to rejected.
    */
  var banAuthor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The id parameter specifies a comma-separated list of IDs that identify
    * the comments for which you are updating the moderation status.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the new moderation status of the specified comments.
    */
  var moderationStatus: js.UndefOr[String] = js.undefined
}
object ParamsResourceCommentsSetmoderationstatus {
  
  @scala.inline
  def apply(): ParamsResourceCommentsSetmoderationstatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentsSetmoderationstatus]
  }
  
  @scala.inline
  implicit class ParamsResourceCommentsSetmoderationstatusMutableBuilder[Self <: ParamsResourceCommentsSetmoderationstatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBanAuthor(value: Boolean): Self = StObject.set(x, "banAuthor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBanAuthorUndefined: Self = StObject.set(x, "banAuthor", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setModerationStatus(value: String): Self = StObject.set(x, "moderationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerationStatusUndefined: Self = StObject.set(x, "moderationStatus", js.undefined)
  }
}
