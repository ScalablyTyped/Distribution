package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Audit log information specific to Cloud IAM. This message is serialized as
  * an `Any` type in the `ServiceData` message of an `AuditLog` message.
  */
@js.native
trait SchemaAuditData extends js.Object {
  /**
    * Policy delta between the original policy and the newly set policy.
    */
  var policyDelta: js.UndefOr[SchemaPolicyDelta] = js.native
}

object SchemaAuditData {
  @scala.inline
  def apply(policyDelta: SchemaPolicyDelta = null): SchemaAuditData = {
    val __obj = js.Dynamic.literal()
    if (policyDelta != null) __obj.updateDynamic("policyDelta")(policyDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuditData]
  }
}

