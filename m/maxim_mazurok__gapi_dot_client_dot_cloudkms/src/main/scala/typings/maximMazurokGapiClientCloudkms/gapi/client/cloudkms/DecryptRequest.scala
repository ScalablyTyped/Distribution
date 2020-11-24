package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecryptRequest extends js.Object {
  
  /** Optional. Optional data that must match the data originally supplied in EncryptRequest.additional_authenticated_data. */
  var additionalAuthenticatedData: js.UndefOr[String] = js.native
  
  /**
    * Optional. An optional CRC32C checksum of the DecryptRequest.additional_authenticated_data. If specified, KeyManagementService will verify the integrity of the received
    * DecryptRequest.additional_authenticated_data using this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your
    * client should verify that CRC32C(DecryptRequest.additional_authenticated_data) is equal to DecryptRequest.additional_authenticated_data_crc32c, and if so, perform a limited number
    * of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across
    * different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type. NOTE: This
    * field is in Beta.
    */
  var additionalAuthenticatedDataCrc32c: js.UndefOr[String] = js.native
  
  /** Required. The encrypted data originally returned in EncryptResponse.ciphertext. */
  var ciphertext: js.UndefOr[String] = js.native
  
  /**
    * Optional. An optional CRC32C checksum of the DecryptRequest.ciphertext. If specified, KeyManagementService will verify the integrity of the received DecryptRequest.ciphertext using
    * this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your client should verify that
    * CRC32C(DecryptRequest.ciphertext) is equal to DecryptRequest.ciphertext_crc32c, and if so, perform a limited number of retries. A persistent mismatch may indicate an issue in your
    * computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will
    * never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type. NOTE: This field is in Beta.
    */
  var ciphertextCrc32c: js.UndefOr[String] = js.native
}
object DecryptRequest {
  
  @scala.inline
  def apply(): DecryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptRequest]
  }
  
  @scala.inline
  implicit class DecryptRequestOps[Self <: DecryptRequest] (val x: Self) extends AnyVal {
    
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
    def setAdditionalAuthenticatedData(value: String): Self = this.set("additionalAuthenticatedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalAuthenticatedData: Self = this.set("additionalAuthenticatedData", js.undefined)
    
    @scala.inline
    def setAdditionalAuthenticatedDataCrc32c(value: String): Self = this.set("additionalAuthenticatedDataCrc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalAuthenticatedDataCrc32c: Self = this.set("additionalAuthenticatedDataCrc32c", js.undefined)
    
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
