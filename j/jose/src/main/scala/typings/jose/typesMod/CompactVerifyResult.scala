package typings.jose.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompactVerifyResult extends StObject {
  
  /** JWS Payload. */
  var payload: js.typedarray.Uint8Array
  
  /** JWS Protected Header. */
  var protectedHeader: CompactJWSHeaderParameters
}
object CompactVerifyResult {
  
  inline def apply(payload: js.typedarray.Uint8Array, protectedHeader: CompactJWSHeaderParameters): CompactVerifyResult = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], protectedHeader = protectedHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactVerifyResult]
  }
  
  extension [Self <: CompactVerifyResult](x: Self) {
    
    inline def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setProtectedHeader(value: CompactJWSHeaderParameters): Self = StObject.set(x, "protectedHeader", value.asInstanceOf[js.Any])
  }
}
