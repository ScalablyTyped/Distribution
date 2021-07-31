package typings.googleapis.gmailV1Mod.gmailV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersMessagesImport
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Mark the email as permanently deleted (not TRASH) and only visible in
    * Google Vault to a Vault administrator. Only used for G Suite accounts.
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Source for Gmail's internal date of the message.
    */
  var internalDateSource: js.UndefOr[String] = js.undefined
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.undefined
  
  /**
    * Ignore the Gmail spam classifier decision and never mark this email as
    * SPAM in the mailbox.
    */
  var neverMarkSpam: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Process calendar invites in the email and add any extracted meetings to
    * the Google Calendar for this user.
    */
  var processForCalendar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaMessage] = js.undefined
  
  /**
    * The user's email address. The special value me can be used to indicate
    * the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersMessagesImport {
  
  @scala.inline
  def apply(): ParamsResourceUsersMessagesImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersMessagesImport]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersMessagesImportMutableBuilder[Self <: ParamsResourceUsersMessagesImport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setInternalDateSource(value: String): Self = StObject.set(x, "internalDateSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalDateSourceUndefined: Self = StObject.set(x, "internalDateSource", js.undefined)
    
    @scala.inline
    def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setNeverMarkSpam(value: Boolean): Self = StObject.set(x, "neverMarkSpam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeverMarkSpamUndefined: Self = StObject.set(x, "neverMarkSpam", js.undefined)
    
    @scala.inline
    def setProcessForCalendar(value: Boolean): Self = StObject.set(x, "processForCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessForCalendarUndefined: Self = StObject.set(x, "processForCalendar", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaMessage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
