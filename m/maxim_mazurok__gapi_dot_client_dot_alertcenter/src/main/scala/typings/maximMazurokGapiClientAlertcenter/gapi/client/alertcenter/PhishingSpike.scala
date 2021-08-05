package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhishingSpike extends StObject {
  
  /** The domain ID. */
  var domainId: js.UndefOr[DomainId] = js.undefined
  
  /** If `true`, the email originated from within the organization. */
  var isInternal: js.UndefOr[Boolean] = js.undefined
  
  /** The entity whose actions triggered a Gmail phishing alert. */
  var maliciousEntity: js.UndefOr[MaliciousEntity] = js.undefined
  
  /** The list of messages contained by this alert. */
  var messages: js.UndefOr[js.Array[GmailMessageInfo]] = js.undefined
}
object PhishingSpike {
  
  inline def apply(): PhishingSpike = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhishingSpike]
  }
  
  extension [Self <: PhishingSpike](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "domainId", js.undefined)
    
    inline def setIsInternal(value: Boolean): Self = StObject.set(x, "isInternal", value.asInstanceOf[js.Any])
    
    inline def setIsInternalUndefined: Self = StObject.set(x, "isInternal", js.undefined)
    
    inline def setMaliciousEntity(value: MaliciousEntity): Self = StObject.set(x, "maliciousEntity", value.asInstanceOf[js.Any])
    
    inline def setMaliciousEntityUndefined: Self = StObject.set(x, "maliciousEntity", js.undefined)
    
    inline def setMessages(value: js.Array[GmailMessageInfo]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: GmailMessageInfo*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
