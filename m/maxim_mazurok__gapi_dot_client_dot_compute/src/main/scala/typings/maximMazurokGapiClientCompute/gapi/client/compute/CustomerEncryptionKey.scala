package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerEncryptionKey extends js.Object {
  
  /** The name of the encryption key that is stored in Google Cloud KMS. */
  var kmsKeyName: js.UndefOr[String] = js.native
  
  /** The service account being used for the encryption request for the given KMS key. If absent, the Compute Engine default service account is used. */
  var kmsKeyServiceAccount: js.UndefOr[String] = js.native
  
  /** Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. */
  var rawKey: js.UndefOr[String] = js.native
  
  /** [Output only] The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied encryption key that protects this resource. */
  var sha256: js.UndefOr[String] = js.native
}
object CustomerEncryptionKey {
  
  @scala.inline
  def apply(): CustomerEncryptionKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerEncryptionKey]
  }
  
  @scala.inline
  implicit class CustomerEncryptionKeyOps[Self <: CustomerEncryptionKey] (val x: Self) extends AnyVal {
    
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
    def setKmsKeyName(value: String): Self = this.set("kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyName: Self = this.set("kmsKeyName", js.undefined)
    
    @scala.inline
    def setKmsKeyServiceAccount(value: String): Self = this.set("kmsKeyServiceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyServiceAccount: Self = this.set("kmsKeyServiceAccount", js.undefined)
    
    @scala.inline
    def setRawKey(value: String): Self = this.set("rawKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawKey: Self = this.set("rawKey", js.undefined)
    
    @scala.inline
    def setSha256(value: String): Self = this.set("sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
  }
}
