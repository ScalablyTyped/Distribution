package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Alert for setting the domain or IP that malicious email comes from as
  * whitelisted domain or IP in Gmail advanced settings.
  */
trait SchemaBadWhitelist extends StObject {
  
  /**
    * The domain ID.
    */
  var domainId: js.UndefOr[SchemaDomainId] = js.undefined
  
  /**
    * The entity whose actions triggered a Gmail phishing alert.
    */
  var maliciousEntity: js.UndefOr[SchemaMaliciousEntity] = js.undefined
  
  /**
    * The list of messages contained by this alert.
    */
  var messages: js.UndefOr[js.Array[SchemaGmailMessageInfo]] = js.undefined
  
  /**
    * The source IP address of the malicious email, for example, `127.0.0.1`.
    */
  var sourceIp: js.UndefOr[String] = js.undefined
}
object SchemaBadWhitelist {
  
  inline def apply(): SchemaBadWhitelist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBadWhitelist]
  }
  
  extension [Self <: SchemaBadWhitelist](x: Self) {
    
    inline def setDomainId(value: SchemaDomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "domainId", js.undefined)
    
    inline def setMaliciousEntity(value: SchemaMaliciousEntity): Self = StObject.set(x, "maliciousEntity", value.asInstanceOf[js.Any])
    
    inline def setMaliciousEntityUndefined: Self = StObject.set(x, "maliciousEntity", js.undefined)
    
    inline def setMessages(value: js.Array[SchemaGmailMessageInfo]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: SchemaGmailMessageInfo*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    inline def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
    
    inline def setSourceIpUndefined: Self = StObject.set(x, "sourceIp", js.undefined)
  }
}
