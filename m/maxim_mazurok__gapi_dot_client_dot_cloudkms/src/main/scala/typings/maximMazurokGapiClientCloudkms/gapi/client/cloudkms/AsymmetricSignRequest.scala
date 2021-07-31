package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsymmetricSignRequest extends StObject {
  
  /** Required. The digest of the data to sign. The digest must be produced with the same digest algorithm as specified by the key version's algorithm. */
  var digest: js.UndefOr[Digest] = js.undefined
  
  /**
    * Optional. An optional CRC32C checksum of the AsymmetricSignRequest.digest. If specified, KeyManagementService will verify the integrity of the received AsymmetricSignRequest.digest
    * using this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your client should verify that
    * CRC32C(AsymmetricSignRequest.digest) is equal to AsymmetricSignRequest.digest_crc32c, and if so, perform a limited number of retries. A persistent mismatch may indicate an issue in
    * your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which
    * will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type. NOTE: This field is in Beta.
    */
  var digestCrc32c: js.UndefOr[String] = js.undefined
}
object AsymmetricSignRequest {
  
  @scala.inline
  def apply(): AsymmetricSignRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsymmetricSignRequest]
  }
  
  @scala.inline
  implicit class AsymmetricSignRequestMutableBuilder[Self <: AsymmetricSignRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestCrc32c(value: String): Self = StObject.set(x, "digestCrc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestCrc32cUndefined: Self = StObject.set(x, "digestCrc32c", js.undefined)
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
  }
}
