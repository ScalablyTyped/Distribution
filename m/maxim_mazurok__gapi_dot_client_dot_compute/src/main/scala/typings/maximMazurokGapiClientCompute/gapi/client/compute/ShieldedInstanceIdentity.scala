package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShieldedInstanceIdentity extends StObject {
  
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
  implicit class ShieldedInstanceIdentityMutableBuilder[Self <: ShieldedInstanceIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionKey(value: ShieldedInstanceIdentityEntry): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSigningKey(value: ShieldedInstanceIdentityEntry): Self = StObject.set(x, "signingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningKeyUndefined: Self = StObject.set(x, "signingKey", js.undefined)
  }
}
