package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Alert for a spike in user reported phishing. &lt;aside
  * class=&quot;warning&quot;&gt;&lt;b&gt;Warning&lt;/b&gt;: This type has been
  * deprecated. Use
  * [MailPhishing](/admin-sdk/alertcenter/reference/rest/v1beta1/MailPhishing)
  * instead.&lt;/aside&gt;
  */
trait SchemaPhishingSpike extends StObject {
  
  /**
    * The domain ID.
    */
  var domainId: js.UndefOr[SchemaDomainId] = js.undefined
  
  /**
    * If `true`, the email originated from within the organization.
    */
  var isInternal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The entity whose actions triggered a Gmail phishing alert.
    */
  var maliciousEntity: js.UndefOr[SchemaMaliciousEntity] = js.undefined
  
  /**
    * The list of messages contained by this alert.
    */
  var messages: js.UndefOr[js.Array[SchemaGmailMessageInfo]] = js.undefined
}
object SchemaPhishingSpike {
  
  inline def apply(): SchemaPhishingSpike = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhishingSpike]
  }
  
  extension [Self <: SchemaPhishingSpike](x: Self) {
    
    inline def setDomainId(value: SchemaDomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "domainId", js.undefined)
    
    inline def setIsInternal(value: Boolean): Self = StObject.set(x, "isInternal", value.asInstanceOf[js.Any])
    
    inline def setIsInternalUndefined: Self = StObject.set(x, "isInternal", js.undefined)
    
    inline def setMaliciousEntity(value: SchemaMaliciousEntity): Self = StObject.set(x, "maliciousEntity", value.asInstanceOf[js.Any])
    
    inline def setMaliciousEntityUndefined: Self = StObject.set(x, "maliciousEntity", js.undefined)
    
    inline def setMessages(value: js.Array[SchemaGmailMessageInfo]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: SchemaGmailMessageInfo*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
