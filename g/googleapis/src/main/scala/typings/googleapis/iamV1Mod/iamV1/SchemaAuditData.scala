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
  def apply(): SchemaAuditData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuditData]
  }
  @scala.inline
  implicit class SchemaAuditDataOps[Self <: SchemaAuditData] (val x: Self) extends AnyVal {
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
    def setPolicyDelta(value: SchemaPolicyDelta): Self = this.set("policyDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyDelta: Self = this.set("policyDelta", js.undefined)
  }
  
}

