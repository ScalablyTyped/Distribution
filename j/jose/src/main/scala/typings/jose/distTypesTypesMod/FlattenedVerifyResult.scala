package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlattenedVerifyResult extends StObject {
  
  /** JWS Payload. */
  var payload: js.typedarray.Uint8Array
  
  /** JWS Protected Header. */
  var protectedHeader: js.UndefOr[JWSHeaderParameters] = js.undefined
  
  /** JWS Unprotected Header. */
  var unprotectedHeader: js.UndefOr[JWSHeaderParameters] = js.undefined
}
object FlattenedVerifyResult {
  
  inline def apply(payload: js.typedarray.Uint8Array): FlattenedVerifyResult = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenedVerifyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlattenedVerifyResult] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setProtectedHeader(value: JWSHeaderParameters): Self = StObject.set(x, "protectedHeader", value.asInstanceOf[js.Any])
    
    inline def setProtectedHeaderUndefined: Self = StObject.set(x, "protectedHeader", js.undefined)
    
    inline def setUnprotectedHeader(value: JWSHeaderParameters): Self = StObject.set(x, "unprotectedHeader", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedHeaderUndefined: Self = StObject.set(x, "unprotectedHeader", js.undefined)
  }
}
