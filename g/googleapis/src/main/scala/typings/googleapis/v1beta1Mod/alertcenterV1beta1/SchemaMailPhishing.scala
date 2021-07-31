package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Proto for all phishing alerts with common payload. Supported types are any
  * of the following:  * User reported phishing * User reported spam spike *
  * Suspicious message reported * Phishing reclassification * Malware
  * reclassification
  */
trait SchemaMailPhishing extends StObject {
  
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
object SchemaMailPhishing {
  
  @scala.inline
  def apply(): SchemaMailPhishing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMailPhishing]
  }
  
  @scala.inline
  implicit class SchemaMailPhishingMutableBuilder[Self <: SchemaMailPhishing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainId(value: SchemaDomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainIdUndefined: Self = StObject.set(x, "domainId", js.undefined)
    
    @scala.inline
    def setIsInternal(value: Boolean): Self = StObject.set(x, "isInternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInternalUndefined: Self = StObject.set(x, "isInternal", js.undefined)
    
    @scala.inline
    def setMaliciousEntity(value: SchemaMaliciousEntity): Self = StObject.set(x, "maliciousEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaliciousEntityUndefined: Self = StObject.set(x, "maliciousEntity", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Array[SchemaGmailMessageInfo]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: SchemaGmailMessageInfo*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
