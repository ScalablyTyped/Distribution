package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportCryptoKeyVersionRequest extends StObject {
  
  /** Required. The algorithm of the key being imported. This does not need to match the version_template of the CryptoKey this version imports into. */
  var algorithm: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The optional name of an existing CryptoKeyVersion to target for an import operation. If this field is not present, a new CryptoKeyVersion containing the supplied key
    * material is created. If this field is present, the supplied key material is imported into the existing CryptoKeyVersion. To import into an existing CryptoKeyVersion, the
    * CryptoKeyVersion must be a child of ImportCryptoKeyVersionRequest.parent, have been previously created via ImportCryptoKeyVersion, and be in DESTROYED or IMPORT_FAILED state. The
    * key material and algorithm must match the previous CryptoKeyVersion exactly if the CryptoKeyVersion has ever contained key material.
    */
  var cryptoKeyVersion: js.UndefOr[String] = js.undefined
  
  /** Required. The name of the ImportJob that was used to wrap this key material. */
  var importJob: js.UndefOr[String] = js.undefined
  
  /** Optional. This field has the same meaning as wrapped_key. Prefer to use that field in new work. Either that field or this field (but not both) must be specified. */
  var rsaAesWrappedKey: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The wrapped key material to import. Before wrapping, key material must be formatted. If importing symmetric key material, the expected key material format is plain bytes.
    * If importing asymmetric key material, the expected key material format is PKCS#8-encoded DER (the PrivateKeyInfo structure from RFC 5208). When wrapping with import methods
    * (RSA_OAEP_3072_SHA1_AES_256 or RSA_OAEP_4096_SHA1_AES_256 or RSA_OAEP_3072_SHA256_AES_256 or RSA_OAEP_4096_SHA256_AES_256), this field must contain the concatenation of: 1. An
    * ephemeral AES-256 wrapping key wrapped with the public_key using RSAES-OAEP with SHA-1/SHA-256, MGF1 with SHA-1/SHA-256, and an empty label. 2. The formatted key to be imported,
    * wrapped with the ephemeral AES-256 key using AES-KWP (RFC 5649). This format is the same as the format produced by PKCS#11 mechanism CKM_RSA_AES_KEY_WRAP. When wrapping with import
    * methods (RSA_OAEP_3072_SHA256 or RSA_OAEP_4096_SHA256), this field must contain the formatted key to be imported, wrapped with the public_key using RSAES-OAEP with SHA-256, MGF1
    * with SHA-256, and an empty label.
    */
  var wrappedKey: js.UndefOr[String] = js.undefined
}
object ImportCryptoKeyVersionRequest {
  
  inline def apply(): ImportCryptoKeyVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportCryptoKeyVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportCryptoKeyVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setCryptoKeyVersion(value: String): Self = StObject.set(x, "cryptoKeyVersion", value.asInstanceOf[js.Any])
    
    inline def setCryptoKeyVersionUndefined: Self = StObject.set(x, "cryptoKeyVersion", js.undefined)
    
    inline def setImportJob(value: String): Self = StObject.set(x, "importJob", value.asInstanceOf[js.Any])
    
    inline def setImportJobUndefined: Self = StObject.set(x, "importJob", js.undefined)
    
    inline def setRsaAesWrappedKey(value: String): Self = StObject.set(x, "rsaAesWrappedKey", value.asInstanceOf[js.Any])
    
    inline def setRsaAesWrappedKeyUndefined: Self = StObject.set(x, "rsaAesWrappedKey", js.undefined)
    
    inline def setWrappedKey(value: String): Self = StObject.set(x, "wrappedKey", value.asInstanceOf[js.Any])
    
    inline def setWrappedKeyUndefined: Self = StObject.set(x, "wrappedKey", js.undefined)
  }
}
