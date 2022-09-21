package typings.googleapis.osloginV1betaMod.osloginV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityKey extends StObject {
  
  /**
    * Hardware-backed private key text in SSH format.
    */
  var privateKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Public key text in SSH format, defined by [RFC4253]("https://www.ietf.org/rfc/rfc4253.txt") section 6.6.
    */
  var publicKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The U2F protocol type.
    */
  var universalTwoFactor: js.UndefOr[SchemaUniversalTwoFactor] = js.undefined
  
  /**
    * The Web Authentication protocol type.
    */
  var webAuthn: js.UndefOr[SchemaWebAuthn] = js.undefined
}
object SchemaSecurityKey {
  
  inline def apply(): SchemaSecurityKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityKey]
  }
  
  extension [Self <: SchemaSecurityKey](x: Self) {
    
    inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyNull: Self = StObject.set(x, "privateKey", null)
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyNull: Self = StObject.set(x, "publicKey", null)
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setUniversalTwoFactor(value: SchemaUniversalTwoFactor): Self = StObject.set(x, "universalTwoFactor", value.asInstanceOf[js.Any])
    
    inline def setUniversalTwoFactorUndefined: Self = StObject.set(x, "universalTwoFactor", js.undefined)
    
    inline def setWebAuthn(value: SchemaWebAuthn): Self = StObject.set(x, "webAuthn", value.asInstanceOf[js.Any])
    
    inline def setWebAuthnUndefined: Self = StObject.set(x, "webAuthn", js.undefined)
  }
}
