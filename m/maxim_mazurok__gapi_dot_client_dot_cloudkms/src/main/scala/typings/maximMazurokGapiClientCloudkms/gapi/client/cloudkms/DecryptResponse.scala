package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecryptResponse extends StObject {
  
  /** The decrypted data originally supplied in EncryptRequest.plaintext. */
  var plaintext: js.UndefOr[String] = js.undefined
  
  /**
    * Integrity verification field. A CRC32C checksum of the returned DecryptResponse.plaintext. An integrity check of DecryptResponse.plaintext can be performed by computing the CRC32C
    * checksum of DecryptResponse.plaintext and comparing your results to this field. Discard the response in case of non-matching checksum values, and perform a limited number of
    * retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: receiving this response message indicates that KeyManagementService is able to
    * successfully decrypt the ciphertext. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which will
    * never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type. NOTE: This field is in Beta.
    */
  var plaintextCrc32c: js.UndefOr[String] = js.undefined
}
object DecryptResponse {
  
  inline def apply(): DecryptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecryptResponse]
  }
  
  extension [Self <: DecryptResponse](x: Self) {
    
    inline def setPlaintext(value: String): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    inline def setPlaintextCrc32c(value: String): Self = StObject.set(x, "plaintextCrc32c", value.asInstanceOf[js.Any])
    
    inline def setPlaintextCrc32cUndefined: Self = StObject.set(x, "plaintextCrc32c", js.undefined)
    
    inline def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
  }
}
