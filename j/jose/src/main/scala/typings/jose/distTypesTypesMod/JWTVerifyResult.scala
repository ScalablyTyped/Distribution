package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JWTVerifyResult extends StObject {
  
  /** JWT Claims Set. */
  var payload: JWTPayload
  
  /** JWS Protected Header. */
  var protectedHeader: JWTHeaderParameters
}
object JWTVerifyResult {
  
  inline def apply(payload: JWTPayload, protectedHeader: JWTHeaderParameters): JWTVerifyResult = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], protectedHeader = protectedHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWTVerifyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JWTVerifyResult] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: JWTPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setProtectedHeader(value: JWTHeaderParameters): Self = StObject.set(x, "protectedHeader", value.asInstanceOf[js.Any])
  }
}
