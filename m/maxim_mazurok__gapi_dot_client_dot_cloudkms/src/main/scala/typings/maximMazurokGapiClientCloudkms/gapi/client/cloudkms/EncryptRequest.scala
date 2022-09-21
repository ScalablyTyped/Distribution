package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptRequest extends StObject {
  
  /**
    * Optional. Optional data that, if specified, must also be provided during decryption through DecryptRequest.additional_authenticated_data. The maximum size depends on the key
    * version's protection_level. For SOFTWARE, EXTERNAL, and EXTERNAL_VPC keys the AAD must be no larger than 64KiB. For HSM keys, the combined length of the plaintext and
    * additional_authenticated_data fields must be no larger than 8KiB.
    */
  var additionalAuthenticatedData: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. An optional CRC32C checksum of the EncryptRequest.additional_authenticated_data. If specified, KeyManagementService will verify the integrity of the received
    * EncryptRequest.additional_authenticated_data using this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your
    * client should verify that CRC32C(EncryptRequest.additional_authenticated_data) is equal to EncryptRequest.additional_authenticated_data_crc32c, and if so, perform a limited number
    * of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across
    * different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type.
    */
  var additionalAuthenticatedDataCrc32c: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The data to encrypt. Must be no larger than 64KiB. The maximum size depends on the key version's protection_level. For SOFTWARE, EXTERNAL, and EXTERNAL_VPC keys, the
    * plaintext must be no larger than 64KiB. For HSM keys, the combined length of the plaintext and additional_authenticated_data fields must be no larger than 8KiB.
    */
  var plaintext: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. An optional CRC32C checksum of the EncryptRequest.plaintext. If specified, KeyManagementService will verify the integrity of the received EncryptRequest.plaintext using
    * this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your client should verify that
    * CRC32C(EncryptRequest.plaintext) is equal to EncryptRequest.plaintext_crc32c, and if so, perform a limited number of retries. A persistent mismatch may indicate an issue in your
    * computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will
    * never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type.
    */
  var plaintextCrc32c: js.UndefOr[String] = js.undefined
}
object EncryptRequest {
  
  inline def apply(): EncryptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptRequest]
  }
  
  extension [Self <: EncryptRequest](x: Self) {
    
    inline def setAdditionalAuthenticatedData(value: String): Self = StObject.set(x, "additionalAuthenticatedData", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAuthenticatedDataCrc32c(value: String): Self = StObject.set(x, "additionalAuthenticatedDataCrc32c", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAuthenticatedDataCrc32cUndefined: Self = StObject.set(x, "additionalAuthenticatedDataCrc32c", js.undefined)
    
    inline def setAdditionalAuthenticatedDataUndefined: Self = StObject.set(x, "additionalAuthenticatedData", js.undefined)
    
    inline def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    inline def setPlaintextCrc32c(value: String): Self = StObject.set(x, "plaintextCrc32c", value.asInstanceOf[js.Any])
    
    inline def setPlaintextCrc32cUndefined: Self = StObject.set(x, "plaintextCrc32c", js.undefined)
    
    inline def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
  }
}
