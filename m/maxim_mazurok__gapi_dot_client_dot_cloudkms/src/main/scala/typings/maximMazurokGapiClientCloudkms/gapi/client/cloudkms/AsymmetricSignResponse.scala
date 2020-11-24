package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsymmetricSignResponse extends js.Object {
  
  /** The resource name of the CryptoKeyVersion used for signing. Check this field to verify that the intended resource was used for signing. NOTE: This field is in Beta. */
  var name: js.UndefOr[String] = js.native
  
  /** The created signature. */
  var signature: js.UndefOr[String] = js.native
  
  /**
    * Integrity verification field. A CRC32C checksum of the returned AsymmetricSignResponse.signature. An integrity check of AsymmetricSignResponse.signature can be performed by
    * computing the CRC32C checksum of AsymmetricSignResponse.signature and comparing your results to this field. Discard the response in case of non-matching checksum values, and perform
    * a limited number of retries. A persistent mismatch may indicate an issue in your computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
    * compatibility across different languages. However, it is a non-negative integer, which will never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support
    * this type. NOTE: This field is in Beta.
    */
  var signatureCrc32c: js.UndefOr[String] = js.native
  
  /**
    * Integrity verification field. A flag indicating whether AsymmetricSignRequest.digest_crc32c was received by KeyManagementService and used for the integrity verification of the
    * digest. A false value of this field indicates either that AsymmetricSignRequest.digest_crc32c was left unset or that it was not delivered to KeyManagementService. If you've set
    * AsymmetricSignRequest.digest_crc32c but this field is still false, discard the response and perform a limited number of retries. NOTE: This field is in Beta.
    */
  var verifiedDigestCrc32c: js.UndefOr[Boolean] = js.native
}
object AsymmetricSignResponse {
  
  @scala.inline
  def apply(): AsymmetricSignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsymmetricSignResponse]
  }
  
  @scala.inline
  implicit class AsymmetricSignResponseOps[Self <: AsymmetricSignResponse] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setSignatureCrc32c(value: String): Self = this.set("signatureCrc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureCrc32c: Self = this.set("signatureCrc32c", js.undefined)
    
    @scala.inline
    def setVerifiedDigestCrc32c(value: Boolean): Self = this.set("verifiedDigestCrc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifiedDigestCrc32c: Self = this.set("verifiedDigestCrc32c", js.undefined)
  }
}
