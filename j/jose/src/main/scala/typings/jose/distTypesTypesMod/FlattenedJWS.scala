package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<jose.jose/dist/types/types.FlattenedJWSInput> */
trait FlattenedJWS extends StObject {
  
  var header: js.UndefOr[JWSHeaderParameters] = js.undefined
  
  var payload: String
  
  var `protected`: js.UndefOr[String] = js.undefined
  
  var signature: String
}
object FlattenedJWS {
  
  inline def apply(payload: String, signature: String): FlattenedJWS = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenedJWS]
  }
  
  extension [Self <: FlattenedJWS](x: Self) {
    
    inline def setHeader(value: JWSHeaderParameters): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setProtected(value: String): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    inline def setProtectedUndefined: Self = StObject.set(x, "protected", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
