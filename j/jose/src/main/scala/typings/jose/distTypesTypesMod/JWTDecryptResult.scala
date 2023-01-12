package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWTDecryptResult extends StObject {
  
  /** JWT Claims Set. */
  var payload: JWTPayload
  
  /** JWE Protected Header. */
  var protectedHeader: CompactJWEHeaderParameters
}
object JWTDecryptResult {
  
  inline def apply(payload: JWTPayload, protectedHeader: CompactJWEHeaderParameters): JWTDecryptResult = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], protectedHeader = protectedHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWTDecryptResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JWTDecryptResult] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: JWTPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setProtectedHeader(value: CompactJWEHeaderParameters): Self = StObject.set(x, "protectedHeader", value.asInstanceOf[js.Any])
  }
}
