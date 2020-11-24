package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportCryptoKeyVersionRequest extends js.Object {
  
  /** Required. The algorithm of the key being imported. This does not need to match the version_template of the CryptoKey this version imports into. */
  var algorithm: js.UndefOr[String] = js.native
  
  /** Required. The name of the ImportJob that was used to wrap this key material. */
  var importJob: js.UndefOr[String] = js.native
  
  /**
    * Wrapped key material produced with RSA_OAEP_3072_SHA1_AES_256 or RSA_OAEP_4096_SHA1_AES_256. This field contains the concatenation of two wrapped keys: 1. An ephemeral AES-256
    * wrapping key wrapped with the public_key using RSAES-OAEP with SHA-1, MGF1 with SHA-1, and an empty label. 2. The key to be imported, wrapped with the ephemeral AES-256 key using
    * AES-KWP (RFC 5649). If importing symmetric key material, it is expected that the unwrapped key contains plain bytes. If importing asymmetric key material, it is expected that the
    * unwrapped key is in PKCS#8-encoded DER format (the PrivateKeyInfo structure from RFC 5208). This format is the same as the format produced by PKCS#11 mechanism CKM_RSA_AES_KEY_WRAP.
    */
  var rsaAesWrappedKey: js.UndefOr[String] = js.native
}
object ImportCryptoKeyVersionRequest {
  
  @scala.inline
  def apply(): ImportCryptoKeyVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportCryptoKeyVersionRequest]
  }
  
  @scala.inline
  implicit class ImportCryptoKeyVersionRequestOps[Self <: ImportCryptoKeyVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setImportJob(value: String): Self = this.set("importJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportJob: Self = this.set("importJob", js.undefined)
    
    @scala.inline
    def setRsaAesWrappedKey(value: String): Self = this.set("rsaAesWrappedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRsaAesWrappedKey: Self = this.set("rsaAesWrappedKey", js.undefined)
  }
}
