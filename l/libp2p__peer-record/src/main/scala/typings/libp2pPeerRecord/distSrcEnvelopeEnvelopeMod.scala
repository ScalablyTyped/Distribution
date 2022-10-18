package typings.libp2pPeerRecord

import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEnvelopeEnvelopeMod {
  
  trait Envelope extends StObject {
    
    var payload: js.typedarray.Uint8Array
    
    var payloadType: js.typedarray.Uint8Array
    
    var publicKey: js.typedarray.Uint8Array
    
    var signature: js.typedarray.Uint8Array
  }
  object Envelope {
    
    inline def apply(
      payload: js.typedarray.Uint8Array,
      payloadType: js.typedarray.Uint8Array,
      publicKey: js.typedarray.Uint8Array,
      signature: js.typedarray.Uint8Array
    ): Envelope = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Envelope]
    }
    
    @JSImport("@libp2p/peer-record/dist/src/envelope/envelope", "Envelope")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Envelope] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Envelope]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Envelope = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Envelope]
    inline def decode(buf: Uint8ArrayList): Envelope = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Envelope]
    
    inline def encode(obj: Envelope): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    extension [Self <: Envelope](x: Self) {
      
      inline def setPayload(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadType(value: js.typedarray.Uint8Array): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
