package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlattenedDecryptResult extends StObject {
  
  /** JWE AAD. */
  var additionalAuthenticatedData: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  /** Plaintext. */
  var plaintext: js.typedarray.Uint8Array
  
  /** JWE Protected Header. */
  var protectedHeader: js.UndefOr[JWEHeaderParameters] = js.undefined
  
  /** JWE Shared Unprotected Header. */
  var sharedUnprotectedHeader: js.UndefOr[JWEHeaderParameters] = js.undefined
  
  /** JWE Per-Recipient Unprotected Header. */
  var unprotectedHeader: js.UndefOr[JWEHeaderParameters] = js.undefined
}
object FlattenedDecryptResult {
  
  inline def apply(plaintext: js.typedarray.Uint8Array): FlattenedDecryptResult = {
    val __obj = js.Dynamic.literal(plaintext = plaintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenedDecryptResult]
  }
  
  extension [Self <: FlattenedDecryptResult](x: Self) {
    
    inline def setAdditionalAuthenticatedData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "additionalAuthenticatedData", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAuthenticatedDataUndefined: Self = StObject.set(x, "additionalAuthenticatedData", js.undefined)
    
    inline def setPlaintext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    inline def setProtectedHeader(value: JWEHeaderParameters): Self = StObject.set(x, "protectedHeader", value.asInstanceOf[js.Any])
    
    inline def setProtectedHeaderUndefined: Self = StObject.set(x, "protectedHeader", js.undefined)
    
    inline def setSharedUnprotectedHeader(value: JWEHeaderParameters): Self = StObject.set(x, "sharedUnprotectedHeader", value.asInstanceOf[js.Any])
    
    inline def setSharedUnprotectedHeaderUndefined: Self = StObject.set(x, "sharedUnprotectedHeader", js.undefined)
    
    inline def setUnprotectedHeader(value: JWEHeaderParameters): Self = StObject.set(x, "unprotectedHeader", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedHeaderUndefined: Self = StObject.set(x, "unprotectedHeader", js.undefined)
  }
}
