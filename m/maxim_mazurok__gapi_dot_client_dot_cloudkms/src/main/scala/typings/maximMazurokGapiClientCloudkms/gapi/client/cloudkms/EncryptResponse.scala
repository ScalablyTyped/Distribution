package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptResponse extends StObject {
  
  /** The encrypted data. */
  var ciphertext: js.UndefOr[String] = js.undefined
  
  /**
    * Integrity verification field. A CRC32C checksum of the returned EncryptResponse.ciphertext. An integrity check of EncryptResponse.ciphertext can be performed by computing the CRC32C
    * checksum of EncryptResponse.ciphertext and comparing your results to this field. Discard the response in case of non-matching checksum values, and perform a limited number of
    * retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different
    * languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type. NOTE: This field is
    * in Beta.
    */
  var ciphertextCrc32c: js.UndefOr[String] = js.undefined
  
  /** The resource name of the CryptoKeyVersion used in encryption. Check this field to verify that the intended resource was used for encryption. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Integrity verification field. A flag indicating whether EncryptRequest.additional_authenticated_data_crc32c was received by KeyManagementService and used for the integrity
    * verification of the AAD. A false value of this field indicates either that EncryptRequest.additional_authenticated_data_crc32c was left unset or that it was not delivered to
    * KeyManagementService. If you've set EncryptRequest.additional_authenticated_data_crc32c but this field is still false, discard the response and perform a limited number of retries.
    * NOTE: This field is in Beta.
    */
  var verifiedAdditionalAuthenticatedDataCrc32c: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Integrity verification field. A flag indicating whether EncryptRequest.plaintext_crc32c was received by KeyManagementService and used for the integrity verification of the
    * plaintext. A false value of this field indicates either that EncryptRequest.plaintext_crc32c was left unset or that it was not delivered to KeyManagementService. If you've set
    * EncryptRequest.plaintext_crc32c but this field is still false, discard the response and perform a limited number of retries. NOTE: This field is in Beta.
    */
  var verifiedPlaintextCrc32c: js.UndefOr[Boolean] = js.undefined
}
object EncryptResponse {
  
  @scala.inline
  def apply(): EncryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptResponse]
  }
  
  @scala.inline
  implicit class EncryptResponseMutableBuilder[Self <: EncryptResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphertextCrc32c(value: String): Self = StObject.set(x, "ciphertextCrc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphertextCrc32cUndefined: Self = StObject.set(x, "ciphertextCrc32c", js.undefined)
    
    @scala.inline
    def setCiphertextUndefined: Self = StObject.set(x, "ciphertext", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setVerifiedAdditionalAuthenticatedDataCrc32c(value: Boolean): Self = StObject.set(x, "verifiedAdditionalAuthenticatedDataCrc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedAdditionalAuthenticatedDataCrc32cUndefined: Self = StObject.set(x, "verifiedAdditionalAuthenticatedDataCrc32c", js.undefined)
    
    @scala.inline
    def setVerifiedPlaintextCrc32c(value: Boolean): Self = StObject.set(x, "verifiedPlaintextCrc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedPlaintextCrc32cUndefined: Self = StObject.set(x, "verifiedPlaintextCrc32c", js.undefined)
  }
}
