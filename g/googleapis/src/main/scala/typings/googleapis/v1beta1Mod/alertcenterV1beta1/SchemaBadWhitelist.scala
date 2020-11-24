package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Alert for setting the domain or IP that malicious email comes from as
  * whitelisted domain or IP in Gmail advanced settings.
  */
@js.native
trait SchemaBadWhitelist extends js.Object {
  
  /**
    * The domain ID.
    */
  var domainId: js.UndefOr[SchemaDomainId] = js.native
  
  /**
    * The entity whose actions triggered a Gmail phishing alert.
    */
  var maliciousEntity: js.UndefOr[SchemaMaliciousEntity] = js.native
  
  /**
    * The list of messages contained by this alert.
    */
  var messages: js.UndefOr[js.Array[SchemaGmailMessageInfo]] = js.native
  
  /**
    * The source IP address of the malicious email, for example, `127.0.0.1`.
    */
  var sourceIp: js.UndefOr[String] = js.native
}
object SchemaBadWhitelist {
  
  @scala.inline
  def apply(): SchemaBadWhitelist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBadWhitelist]
  }
  
  @scala.inline
  implicit class SchemaBadWhitelistOps[Self <: SchemaBadWhitelist] (val x: Self) extends AnyVal {
    
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
    def setMaliciousEntity(value: SchemaMaliciousEntity): Self = this.set("maliciousEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaliciousEntity: Self = this.set("maliciousEntity", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: SchemaGmailMessageInfo*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[SchemaGmailMessageInfo]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setSourceIp(value: String): Self = this.set("sourceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceIp: Self = this.set("sourceIp", js.undefined)
  }
}
