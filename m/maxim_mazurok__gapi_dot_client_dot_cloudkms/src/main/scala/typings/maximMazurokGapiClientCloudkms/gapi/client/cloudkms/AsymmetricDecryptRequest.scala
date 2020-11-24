package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsymmetricDecryptRequest extends js.Object {
  
  /** Required. The data encrypted with the named CryptoKeyVersion's public key using OAEP. */
  var ciphertext: js.UndefOr[String] = js.native
  
  /**
    * Optional. An optional CRC32C checksum of the AsymmetricDecryptRequest.ciphertext. If specified, KeyManagementService will verify the integrity of the received
    * AsymmetricDecryptRequest.ciphertext using this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your client
    * should verify that CRC32C(AsymmetricDecryptRequest.ciphertext) is equal to AsymmetricDecryptRequest.ciphertext_crc32c, and if so, perform a limited number of retries. A persistent
    * mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it
    * is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type. NOTE: This field is in Beta.
    */
  var ciphertextCrc32c: js.UndefOr[String] = js.native
}
object AsymmetricDecryptRequest {
  
  @scala.inline
  def apply(): AsymmetricDecryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsymmetricDecryptRequest]
  }
  
  @scala.inline
  implicit class AsymmetricDecryptRequestOps[Self <: AsymmetricDecryptRequest] (val x: Self) extends AnyVal {
    
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
    def setCiphertext(value: String): Self = this.set("ciphertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCiphertext: Self = this.set("ciphertext", js.undefined)
    
    @scala.inline
    def setCiphertextCrc32c(value: String): Self = this.set("ciphertextCrc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCiphertextCrc32c: Self = this.set("ciphertextCrc32c", js.undefined)
  }
}
