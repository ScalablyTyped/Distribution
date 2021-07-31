package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An S/MIME email config.
  */
trait SchemaSmimeInfo extends StObject {
  
  /**
    * Encrypted key password, when key is encrypted.
    */
  var encryptedKeyPassword: js.UndefOr[String] = js.undefined
  
  /**
    * When the certificate expires (in milliseconds since epoch).
    */
  var expiration: js.UndefOr[String] = js.undefined
  
  /**
    * The immutable ID for the SmimeInfo.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this SmimeInfo is the default one for this user&#39;s send-as
    * address.
    */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The S/MIME certificate issuer&#39;s common name.
    */
  var issuerCn: js.UndefOr[String] = js.undefined
  
  /**
    * PEM formatted X509 concatenated certificate string (standard base64
    * encoding). Format used for returning key, which includes public key as
    * well as certificate chain (not private key).
    */
  var pem: js.UndefOr[String] = js.undefined
  
  /**
    * PKCS#12 format containing a single private/public key pair and
    * certificate chain. This format is only accepted from client for creating
    * a new SmimeInfo and is never returned, because the private key is not
    * intended to be exported. PKCS#12 may be encrypted, in which case
    * encryptedKeyPassword should be set appropriately.
    */
  var pkcs12: js.UndefOr[String] = js.undefined
}
object SchemaSmimeInfo {
  
  @scala.inline
  def apply(): SchemaSmimeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSmimeInfo]
  }
  
  @scala.inline
  implicit class SchemaSmimeInfoMutableBuilder[Self <: SchemaSmimeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptedKeyPassword(value: String): Self = StObject.set(x, "encryptedKeyPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedKeyPasswordUndefined: Self = StObject.set(x, "encryptedKeyPassword", js.undefined)
    
    @scala.inline
    def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setIssuerCn(value: String): Self = StObject.set(x, "issuerCn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerCnUndefined: Self = StObject.set(x, "issuerCn", js.undefined)
    
    @scala.inline
    def setPem(value: String): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPemUndefined: Self = StObject.set(x, "pem", js.undefined)
    
    @scala.inline
    def setPkcs12(value: String): Self = StObject.set(x, "pkcs12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkcs12Undefined: Self = StObject.set(x, "pkcs12", js.undefined)
  }
}
