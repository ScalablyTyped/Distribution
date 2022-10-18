package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompactDecryptResult extends StObject {
  
  /** Plaintext. */
  var plaintext: js.typedarray.Uint8Array
  
  /** JWE Protected Header. */
  var protectedHeader: CompactJWEHeaderParameters
}
object CompactDecryptResult {
  
  inline def apply(plaintext: js.typedarray.Uint8Array, protectedHeader: CompactJWEHeaderParameters): CompactDecryptResult = {
    val __obj = js.Dynamic.literal(plaintext = plaintext.asInstanceOf[js.Any], protectedHeader = protectedHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactDecryptResult]
  }
  
  extension [Self <: CompactDecryptResult](x: Self) {
    
    inline def setPlaintext(value: js.typedarray.Uint8Array): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    inline def setProtectedHeader(value: CompactJWEHeaderParameters): Self = StObject.set(x, "protectedHeader", value.asInstanceOf[js.Any])
  }
}
