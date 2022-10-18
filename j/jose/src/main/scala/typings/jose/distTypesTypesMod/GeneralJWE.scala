package typings.jose.distTypesTypesMod

import typings.jose.anon.PickFlattenedJWEencrypted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<jose.jose/dist/types/types.FlattenedJWE, 'encrypted_key' | 'header'> */
trait GeneralJWE extends StObject {
  
  var aad: js.UndefOr[String] = js.undefined
  
  var ciphertext: String
  
  var iv: String
  
  var `protected`: js.UndefOr[String] = js.undefined
  
  var recipients: js.Array[PickFlattenedJWEencrypted]
  
  var tag: String
  
  var unprotected: js.UndefOr[JWEHeaderParameters] = js.undefined
}
object GeneralJWE {
  
  inline def apply(ciphertext: String, iv: String, recipients: js.Array[PickFlattenedJWEencrypted], tag: String): GeneralJWE = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralJWE]
  }
  
  extension [Self <: GeneralJWE](x: Self) {
    
    inline def setAad(value: String): Self = StObject.set(x, "aad", value.asInstanceOf[js.Any])
    
    inline def setAadUndefined: Self = StObject.set(x, "aad", js.undefined)
    
    inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setProtected(value: String): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
    
    inline def setRecipients(value: js.Array[PickFlattenedJWEencrypted]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsVarargs(value: PickFlattenedJWEencrypted*): Self = StObject.set(x, "recipients", js.Array(value*))
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setUnprotected(value: JWEHeaderParameters): Self = StObject.set(x, "unprotected", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedUndefined: Self = StObject.set(x, "unprotected", js.undefined)
  }
}
