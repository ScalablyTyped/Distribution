package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptRequest extends js.Object {
  
  /**
    * Optional. Optional data that, if specified, must also be provided during decryption through DecryptRequest.additional_authenticated_data. The maximum size depends on the key
    * version's protection_level. For SOFTWARE keys, the AAD must be no larger than 64KiB. For HSM keys, the combined length of the plaintext and additional_authenticated_data fields must
    * be no larger than 8KiB.
    */
  var additionalAuthenticatedData: js.UndefOr[String] = js.native
  
  /**
    * Optional. An optional CRC32C checksum of the EncryptRequest.additional_authenticated_data. If specified, KeyManagementService will verify the integrity of the received
    * EncryptRequest.additional_authenticated_data using this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your
    * client should verify that CRC32C(EncryptRequest.additional_authenticated_data) is equal to EncryptRequest.additional_authenticated_data_crc32c, and if so, perform a limited number
    * of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across
    * different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type. NOTE: This
    * field is in Beta.
    */
  var additionalAuthenticatedDataCrc32c: js.UndefOr[String] = js.native
  
  /**
    * Required. The data to encrypt. Must be no larger than 64KiB. The maximum size depends on the key version's protection_level. For SOFTWARE keys, the plaintext must be no larger than
    * 64KiB. For HSM keys, the combined length of the plaintext and additional_authenticated_data fields must be no larger than 8KiB.
    */
  var plaintext: js.UndefOr[String] = js.native
  
  /**
    * Optional. An optional CRC32C checksum of the EncryptRequest.plaintext. If specified, KeyManagementService will verify the integrity of the received EncryptRequest.plaintext using
    * this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your client should verify that
    * CRC32C(EncryptRequest.plaintext) is equal to EncryptRequest.plaintext_crc32c, and if so, perform a limited number of retries. A persistent mismatch may indicate an issue in your
    * computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will
    * never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type. NOTE: This field is in Beta.
    */
  var plaintextCrc32c: js.UndefOr[String] = js.native
}
object EncryptRequest {
  
  @scala.inline
  def apply(): EncryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptRequest]
  }
  
  @scala.inline
  implicit class EncryptRequestOps[Self <: EncryptRequest] (val x: Self) extends AnyVal {
    
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
    def setPlaintext(value: String): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaintext: Self = this.set("plaintext", js.undefined)
    
    @scala.inline
    def setPlaintextCrc32c(value: String): Self = this.set("plaintextCrc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaintextCrc32c: Self = this.set("plaintextCrc32c", js.undefined)
  }
}
