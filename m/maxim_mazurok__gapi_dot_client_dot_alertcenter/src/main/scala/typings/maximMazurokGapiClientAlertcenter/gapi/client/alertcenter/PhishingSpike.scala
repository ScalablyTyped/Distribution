package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhishingSpike extends js.Object {
  
  /** The domain ID. */
  var domainId: js.UndefOr[DomainId] = js.native
  
  /** If `true`, the email originated from within the organization. */
  var isInternal: js.UndefOr[Boolean] = js.native
  
  /** The entity whose actions triggered a Gmail phishing alert. */
  var maliciousEntity: js.UndefOr[MaliciousEntity] = js.native
  
  /** The list of messages contained by this alert. */
  var messages: js.UndefOr[js.Array[GmailMessageInfo]] = js.native
}
object PhishingSpike {
  
  @scala.inline
  def apply(): PhishingSpike = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhishingSpike]
  }
  
  @scala.inline
  implicit class PhishingSpikeOps[Self <: PhishingSpike] (val x: Self) extends AnyVal {
    
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
    def setDomainId(value: DomainId): Self = this.set("domainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainId: Self = this.set("domainId", js.undefined)
    
    @scala.inline
    def setIsInternal(value: Boolean): Self = this.set("isInternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInternal: Self = this.set("isInternal", js.undefined)
    
    @scala.inline
    def setMaliciousEntity(value: MaliciousEntity): Self = this.set("maliciousEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaliciousEntity: Self = this.set("maliciousEntity", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: GmailMessageInfo*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[GmailMessageInfo]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
  }
}
