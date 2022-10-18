package typings.jose.distTypesTypesMod

import typings.jose.anon.OmitFlattenedJWSInputpayl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralJWS extends StObject {
  
  var payload: String
  
  var signatures: js.Array[OmitFlattenedJWSInputpayl]
}
object GeneralJWS {
  
  inline def apply(payload: String, signatures: js.Array[OmitFlattenedJWSInputpayl]): GeneralJWS = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralJWS]
  }
  
  extension [Self <: GeneralJWS](x: Self) {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSignatures(value: js.Array[OmitFlattenedJWSInputpayl]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesVarargs(value: OmitFlattenedJWSInputpayl*): Self = StObject.set(x, "signatures", js.Array(value*))
  }
}
