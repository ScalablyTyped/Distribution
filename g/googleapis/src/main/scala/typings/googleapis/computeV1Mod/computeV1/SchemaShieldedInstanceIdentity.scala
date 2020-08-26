package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A shielded Instance identity entry.
  */
@js.native
trait SchemaShieldedInstanceIdentity extends js.Object {
  /**
    * An Endorsement Key (EK) issued to the Shielded Instance&#39;s vTPM.
    */
  var encryptionKey: js.UndefOr[SchemaShieldedInstanceIdentityEntry] = js.native
  /**
    * [Output Only] Type of the resource. Always
    * compute#shieldedInstanceIdentity for shielded Instance identity entry.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * An Attestation Key (AK) issued to the Shielded Instance&#39;s vTPM.
    */
  var signingKey: js.UndefOr[SchemaShieldedInstanceIdentityEntry] = js.native
}

object SchemaShieldedInstanceIdentity {
  @scala.inline
  def apply(): SchemaShieldedInstanceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShieldedInstanceIdentity]
  }
  @scala.inline
  implicit class SchemaShieldedInstanceIdentityOps[Self <: SchemaShieldedInstanceIdentity] (val x: Self) extends AnyVal {
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
    def setEncryptionKey(value: SchemaShieldedInstanceIdentityEntry): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSigningKey(value: SchemaShieldedInstanceIdentityEntry): Self = this.set("signingKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigningKey: Self = this.set("signingKey", js.undefined)
  }
  
}

