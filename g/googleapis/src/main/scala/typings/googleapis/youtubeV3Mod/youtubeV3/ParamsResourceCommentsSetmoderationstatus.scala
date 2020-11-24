package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCommentsSetmoderationstatus extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The banAuthor parameter lets you indicate that you want to automatically
    * reject any additional comments written by the comment's author. Set the
    * parameter value to true to ban the author.  Note: This parameter is only
    * valid if the moderationStatus parameter is also set to rejected.
    */
  var banAuthor: js.UndefOr[Boolean] = js.native
  
  /**
    * The id parameter specifies a comma-separated list of IDs that identify
    * the comments for which you are updating the moderation status.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies the new moderation status of the specified comments.
    */
  var moderationStatus: js.UndefOr[String] = js.native
}
object ParamsResourceCommentsSetmoderationstatus {
  
  @scala.inline
  def apply(): ParamsResourceCommentsSetmoderationstatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCommentsSetmoderationstatus]
  }
  
  @scala.inline
  implicit class ParamsResourceCommentsSetmoderationstatusOps[Self <: ParamsResourceCommentsSetmoderationstatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setBanAuthor(value: Boolean): Self = this.set("banAuthor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBanAuthor: Self = this.set("banAuthor", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setModerationStatus(value: String): Self = this.set("moderationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModerationStatus: Self = this.set("moderationStatus", js.undefined)
  }
}
