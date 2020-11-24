package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Proto for all phishing alerts with common payload. Supported types are any
  * of the following:  * User reported phishing * User reported spam spike *
  * Suspicious message reported * Phishing reclassification * Malware
  * reclassification
  */
@js.native
trait SchemaMailPhishing extends js.Object {
  
  /**
    * The domain ID.
    */
  var domainId: js.UndefOr[SchemaDomainId] = js.native
  
  /**
    * If `true`, the email originated from within the organization.
    */
  var isInternal: js.UndefOr[Boolean] = js.native
  
  /**
    * The entity whose actions triggered a Gmail phishing alert.
    */
  var maliciousEntity: js.UndefOr[SchemaMaliciousEntity] = js.native
  
  /**
    * The list of messages contained by this alert.
    */
  var messages: js.UndefOr[js.Array[SchemaGmailMessageInfo]] = js.native
}
object SchemaMailPhishing {
  
  @scala.inline
  def apply(): SchemaMailPhishing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMailPhishing]
  }
  
  @scala.inline
  implicit class SchemaMailPhishingOps[Self <: SchemaMailPhishing] (val x: Self) extends AnyVal {
    
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
    def setDomainId(value: SchemaDomainId): Self = this.set("domainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainId: Self = this.set("domainId", js.undefined)
    
    @scala.inline
    def setIsInternal(value: Boolean): Self = this.set("isInternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInternal: Self = this.set("isInternal", js.undefined)
    
    @scala.inline
    def setMaliciousEntity(value: SchemaMaliciousEntity): Self = this.set("maliciousEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaliciousEntity: Self = this.set("maliciousEntity", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: SchemaGmailMessageInfo*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[SchemaGmailMessageInfo]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
  }
}
