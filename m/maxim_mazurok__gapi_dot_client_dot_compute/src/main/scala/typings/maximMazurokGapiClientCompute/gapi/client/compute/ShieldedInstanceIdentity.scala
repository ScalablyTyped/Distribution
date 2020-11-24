package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShieldedInstanceIdentity extends js.Object {
  
  /** An Endorsement Key (EK) made by the RSA 2048 algorithm issued to the Shielded Instance's vTPM. */
  var encryptionKey: js.UndefOr[ShieldedInstanceIdentityEntry] = js.native
  
  /** [Output Only] Type of the resource. Always compute#shieldedInstanceIdentity for shielded Instance identity entry. */
  var kind: js.UndefOr[String] = js.native
  
  /** An Attestation Key (AK) made by the RSA 2048 algorithm issued to the Shielded Instance's vTPM. */
  var signingKey: js.UndefOr[ShieldedInstanceIdentityEntry] = js.native
}
object ShieldedInstanceIdentity {
  
  @scala.inline
  def apply(): ShieldedInstanceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShieldedInstanceIdentity]
  }
  
  @scala.inline
  implicit class ShieldedInstanceIdentityOps[Self <: ShieldedInstanceIdentity] (val x: Self) extends AnyVal {
    
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
    def setEncryptionKey(value: ShieldedInstanceIdentityEntry): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSigningKey(value: ShieldedInstanceIdentityEntry): Self = this.set("signingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningKey: Self = this.set("signingKey", js.undefined)
  }
}
