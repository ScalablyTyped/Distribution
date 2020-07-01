package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    domainId: SchemaDomainId = null,
    isInternal: js.UndefOr[Boolean] = js.undefined,
    maliciousEntity: SchemaMaliciousEntity = null,
    messages: js.Array[SchemaGmailMessageInfo] = null
  ): SchemaMailPhishing = {
    val __obj = js.Dynamic.literal()
    if (domainId != null) __obj.updateDynamic("domainId")(domainId.asInstanceOf[js.Any])
    if (!js.isUndefined(isInternal)) __obj.updateDynamic("isInternal")(isInternal.get.asInstanceOf[js.Any])
    if (maliciousEntity != null) __obj.updateDynamic("maliciousEntity")(maliciousEntity.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMailPhishing]
  }
}

