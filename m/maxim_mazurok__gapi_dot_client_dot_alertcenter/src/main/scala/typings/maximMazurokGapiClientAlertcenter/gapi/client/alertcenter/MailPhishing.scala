package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailPhishing extends StObject {
  
  /** The domain ID. */
  var domainId: js.UndefOr[DomainId] = js.native
  
  /** If `true`, the email originated from within the organization. */
  var isInternal: js.UndefOr[Boolean] = js.native
  
  /** The entity whose actions triggered a Gmail phishing alert. */
  var maliciousEntity: js.UndefOr[MaliciousEntity] = js.native
  
  /** The list of messages contained by this alert. */
  var messages: js.UndefOr[js.Array[GmailMessageInfo]] = js.native
  
  /** System actions on the messages. */
  var systemActionType: js.UndefOr[String] = js.native
}
object MailPhishing {
  
  @scala.inline
  def apply(): MailPhishing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailPhishing]
  }
  
  @scala.inline
  implicit class MailPhishingMutableBuilder[Self <: MailPhishing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainIdUndefined: Self = StObject.set(x, "domainId", js.undefined)
    
    @scala.inline
    def setIsInternal(value: Boolean): Self = StObject.set(x, "isInternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInternalUndefined: Self = StObject.set(x, "isInternal", js.undefined)
    
    @scala.inline
    def setMaliciousEntity(value: MaliciousEntity): Self = StObject.set(x, "maliciousEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaliciousEntityUndefined: Self = StObject.set(x, "maliciousEntity", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Array[GmailMessageInfo]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: GmailMessageInfo*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setSystemActionType(value: String): Self = StObject.set(x, "systemActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemActionTypeUndefined: Self = StObject.set(x, "systemActionType", js.undefined)
  }
}
