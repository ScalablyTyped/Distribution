package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadWhitelist extends StObject {
  
  /** The domain ID. */
  var domainId: js.UndefOr[DomainId] = js.undefined
  
  /** The entity whose actions triggered a Gmail phishing alert. */
  var maliciousEntity: js.UndefOr[MaliciousEntity] = js.undefined
  
  /** The list of messages contained by this alert. */
  var messages: js.UndefOr[js.Array[GmailMessageInfo]] = js.undefined
  
  /** The source IP address of the malicious email, for example, `127.0.0.1`. */
  var sourceIp: js.UndefOr[String] = js.undefined
}
object BadWhitelist {
  
  inline def apply(): BadWhitelist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BadWhitelist]
  }
  
  extension [Self <: BadWhitelist](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "domainId", js.undefined)
    
    inline def setMaliciousEntity(value: MaliciousEntity): Self = StObject.set(x, "maliciousEntity", value.asInstanceOf[js.Any])
    
    inline def setMaliciousEntityUndefined: Self = StObject.set(x, "maliciousEntity", js.undefined)
    
    inline def setMessages(value: js.Array[GmailMessageInfo]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: GmailMessageInfo*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    inline def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
    
    inline def setSourceIpUndefined: Self = StObject.set(x, "sourceIp", js.undefined)
  }
}
