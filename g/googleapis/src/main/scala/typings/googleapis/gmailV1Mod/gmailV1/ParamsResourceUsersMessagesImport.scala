package typings.googleapis.gmailV1Mod.gmailV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUsersMessagesImport extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Mark the email as permanently deleted (not TRASH) and only visible in
    * Google Vault to a Vault administrator. Only used for G Suite accounts.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * Source for Gmail's internal date of the message.
    */
  var internalDateSource: js.UndefOr[String] = js.native
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.native
  
  /**
    * Ignore the Gmail spam classifier decision and never mark this email as
    * SPAM in the mailbox.
    */
  var neverMarkSpam: js.UndefOr[Boolean] = js.native
  
  /**
    * Process calendar invites in the email and add any extracted meetings to
    * the Google Calendar for this user.
    */
  var processForCalendar: js.UndefOr[Boolean] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaMessage] = js.native
  
  /**
    * The user's email address. The special value me can be used to indicate
    * the authenticated user.
    */
  var userId: js.UndefOr[String] = js.native
}
object ParamsResourceUsersMessagesImport {
  
  @scala.inline
  def apply(): ParamsResourceUsersMessagesImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersMessagesImport]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersMessagesImportOps[Self <: ParamsResourceUsersMessagesImport] (val x: Self) extends AnyVal {
    
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
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setInternalDateSource(value: String): Self = this.set("internalDateSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalDateSource: Self = this.set("internalDateSource", js.undefined)
    
    @scala.inline
    def setMedia(value: Body): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setNeverMarkSpam(value: Boolean): Self = this.set("neverMarkSpam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeverMarkSpam: Self = this.set("neverMarkSpam", js.undefined)
    
    @scala.inline
    def setProcessForCalendar(value: Boolean): Self = this.set("processForCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessForCalendar: Self = this.set("processForCalendar", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaMessage): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
