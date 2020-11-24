package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsymmetricDecryptResponse extends js.Object {
  
  /** The decrypted data originally encrypted with the matching public key. */
  var plaintext: js.UndefOr[String] = js.native
  
  /**
    * Integrity verification field. A CRC32C checksum of the returned AsymmetricDecryptResponse.plaintext. An integrity check of AsymmetricDecryptResponse.plaintext can be performed by
    * computing the CRC32C checksum of AsymmetricDecryptResponse.plaintext and comparing your results to this field. Discard the response in case of non-matching checksum values, and
    * perform a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
    * compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support
    * this type. NOTE: This field is in Beta.
    */
  var plaintextCrc32c: js.UndefOr[String] = js.native
  
  /**
    * Integrity verification field. A flag indicating whether AsymmetricDecryptRequest.ciphertext_crc32c was received by KeyManagementService and used for the integrity verification of
    * the ciphertext. A false value of this field indicates either that AsymmetricDecryptRequest.ciphertext_crc32c was left unset or that it was not delivered to KeyManagementService. If
    * you've set AsymmetricDecryptRequest.ciphertext_crc32c but this field is still false, discard the response and perform a limited number of retries. NOTE: This field is in Beta.
    */
  var verifiedCiphertextCrc32c: js.UndefOr[Boolean] = js.native
}
object AsymmetricDecryptResponse {
  
  @scala.inline
  def apply(): AsymmetricDecryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsymmetricDecryptResponse]
  }
  
  @scala.inline
  implicit class AsymmetricDecryptResponseOps[Self <: AsymmetricDecryptResponse] (val x: Self) extends AnyVal {
    
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
    def setPlaintext(value: String): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaintext: Self = this.set("plaintext", js.undefined)
    
    @scala.inline
    def setPlaintextCrc32c(value: String): Self = this.set("plaintextCrc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaintextCrc32c: Self = this.set("plaintextCrc32c", js.undefined)
    
    @scala.inline
    def setVerifiedCiphertextCrc32c(value: Boolean): Self = this.set("verifiedCiphertextCrc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifiedCiphertextCrc32c: Self = this.set("verifiedCiphertextCrc32c", js.undefined)
  }
}
