package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvelope extends StObject {
  
  var payload: js.UndefOr[String | Null] = js.undefined
  
  var payloadType: js.UndefOr[String | Null] = js.undefined
  
  var signatures: js.UndefOr[js.Array[SchemaEnvelopeSignature]] = js.undefined
}
object SchemaEnvelope {
  
  inline def apply(): SchemaEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvelope]
  }
  
  extension [Self <: SchemaEnvelope](x: Self) {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadType(value: String): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
    
    inline def setPayloadTypeNull: Self = StObject.set(x, "payloadType", null)
    
    inline def setPayloadTypeUndefined: Self = StObject.set(x, "payloadType", js.undefined)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSignatures(value: js.Array[SchemaEnvelopeSignature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    inline def setSignaturesVarargs(value: SchemaEnvelopeSignature*): Self = StObject.set(x, "signatures", js.Array(value*))
  }
}
