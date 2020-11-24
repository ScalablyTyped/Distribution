package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsymmetricSignRequest extends js.Object {
  
  /** Required. The digest of the data to sign. The digest must be produced with the same digest algorithm as specified by the key version's algorithm. */
  var digest: js.UndefOr[Digest] = js.native
  
  /**
    * Optional. An optional CRC32C checksum of the AsymmetricSignRequest.digest. If specified, KeyManagementService will verify the integrity of the received AsymmetricSignRequest.digest
    * using this checksum. KeyManagementService will report an error if the checksum verification fails. If you receive a checksum error, your client should verify that
    * CRC32C(AsymmetricSignRequest.digest) is equal to AsymmetricSignRequest.digest_crc32c, and if so, perform a limited number of retries. A persistent mismatch may indicate an issue in
    * your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of compatibility across different languages. However, it is a non-negative integer, which
    * will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this type. NOTE: This field is in Beta.
    */
  var digestCrc32c: js.UndefOr[String] = js.native
}
object AsymmetricSignRequest {
  
  @scala.inline
  def apply(): AsymmetricSignRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsymmetricSignRequest]
  }
  
  @scala.inline
  implicit class AsymmetricSignRequestOps[Self <: AsymmetricSignRequest] (val x: Self) extends AnyVal {
    
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
    def setDigest(value: Digest): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
    
    @scala.inline
    def setDigestCrc32c(value: String): Self = this.set("digestCrc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigestCrc32c: Self = this.set("digestCrc32c", js.undefined)
  }
}
