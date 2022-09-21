package typings.jose.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlattenedJWE extends StObject {
  
  /**
    * The "aad" member MUST be present and contain the value BASE64URL(JWE AAD)) when the JWE AAD
    * value is non-empty; otherwise, it MUST be absent. A JWE AAD value can be included to supply a
    * base64url-encoded value to be integrity protected but not encrypted.
    */
  var aad: js.UndefOr[String] = js.undefined
  
  /** The "ciphertext" member MUST be present and contain the value BASE64URL(JWE Ciphertext). */
  var ciphertext: String
  
  /**
    * The "encrypted_key" member MUST be present and contain the value BASE64URL(JWE Encrypted Key)
    * when the JWE Encrypted Key value is non-empty; otherwise, it MUST be absent.
    */
  var encrypted_key: js.UndefOr[String] = js.undefined
  
  /**
    * The "header" member MUST be present and contain the value JWE Per- Recipient Unprotected Header
    * when the JWE Per-Recipient Unprotected Header value is non-empty; otherwise, it MUST be absent.
    * This value is represented as an unencoded JSON object, rather than as a string. These Header
    * Parameter values are not integrity protected.
    */
  var header: js.UndefOr[JWEHeaderParameters] = js.undefined
  
  /**
    * The "iv" member MUST be present and contain the value BASE64URL(JWE Initialization Vector) when
    * the JWE Initialization Vector value is non-empty; otherwise, it MUST be absent.
    */
  var iv: String
  
  /**
    * The "protected" member MUST be present and contain the value BASE64URL(UTF8(JWE Protected
    * Header)) when the JWE Protected Header value is non-empty; otherwise, it MUST be absent. These
    * Header Parameter values are integrity protected.
    */
  var `protected`: js.UndefOr[String] = js.undefined
  
  /**
    * The "tag" member MUST be present and contain the value BASE64URL(JWE Authentication Tag) when
    * the JWE Authentication Tag value is non-empty; otherwise, it MUST be absent.
    */
  var tag: String
  
  /**
    * The "unprotected" member MUST be present and contain the value JWE Shared Unprotected Header
    * when the JWE Shared Unprotected Header value is non-empty; otherwise, it MUST be absent. This
    * value is represented as an unencoded JSON object, rather than as a string. These Header
    * Parameter values are not integrity protected.
    */
  var unprotected: js.UndefOr[JWEHeaderParameters] = js.undefined
}
object FlattenedJWE {
  
  inline def apply(ciphertext: String, iv: String, tag: String): FlattenedJWE = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenedJWE]
  }
  
  extension [Self <: FlattenedJWE](x: Self) {
    
    inline def setAad(value: String): Self = StObject.set(x, "aad", value.asInstanceOf[js.Any])
    
    inline def setAadUndefined: Self = StObject.set(x, "aad", js.undefined)
    
    inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    inline def setEncrypted_key(value: String): Self = StObject.set(x, "encrypted_key", value.asInstanceOf[js.Any])
    
    inline def setEncrypted_keyUndefined: Self = StObject.set(x, "encrypted_key", js.undefined)
    
    inline def setHeader(value: JWEHeaderParameters): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setProtected(value: String): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setUnprotected(value: JWEHeaderParameters): Self = StObject.set(x, "unprotected", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedUndefined: Self = StObject.set(x, "unprotected", js.undefined)
  }
}
