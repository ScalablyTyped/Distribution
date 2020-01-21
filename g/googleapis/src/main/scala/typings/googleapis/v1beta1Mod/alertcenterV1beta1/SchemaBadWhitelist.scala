package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    domainId: SchemaDomainId = null,
    maliciousEntity: SchemaMaliciousEntity = null,
    messages: js.Array[SchemaGmailMessageInfo] = null,
    sourceIp: String = null
  ): SchemaBadWhitelist = {
    val __obj = js.Dynamic.literal()
    if (domainId != null) __obj.updateDynamic("domainId")(domainId.asInstanceOf[js.Any])
    if (maliciousEntity != null) __obj.updateDynamic("maliciousEntity")(maliciousEntity.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (sourceIp != null) __obj.updateDynamic("sourceIp")(sourceIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBadWhitelist]
  }
}

