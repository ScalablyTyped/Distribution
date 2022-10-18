package typings.libp2p

import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIdentifyPbMessageMod {
  
  trait Identify extends StObject {
    
    var agentVersion: js.UndefOr[String] = js.undefined
    
    var listenAddrs: js.Array[js.typedarray.Uint8Array]
    
    var observedAddr: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var protocolVersion: js.UndefOr[String] = js.undefined
    
    var protocols: js.Array[String]
    
    var publicKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var signedPeerRecord: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object Identify {
    
    inline def apply(listenAddrs: js.Array[js.typedarray.Uint8Array], protocols: js.Array[String]): Identify = {
      val __obj = js.Dynamic.literal(listenAddrs = listenAddrs.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identify]
    }
    
    @JSImport("libp2p/dist/src/identify/pb/message", "Identify")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Identify] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Identify]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Identify = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Identify]
    inline def decode(buf: Uint8ArrayList): Identify = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Identify]
    
    inline def encode(obj: Identify): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    extension [Self <: Identify](x: Self) {
      
      inline def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
      
      inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
      
      inline def setListenAddrs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "listenAddrs", value.asInstanceOf[js.Any])
      
      inline def setListenAddrsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "listenAddrs", js.Array(value*))
      
      inline def setObservedAddr(value: js.typedarray.Uint8Array): Self = StObject.set(x, "observedAddr", value.asInstanceOf[js.Any])
      
      inline def setObservedAddrUndefined: Self = StObject.set(x, "observedAddr", js.undefined)
      
      inline def setProtocolVersion(value: String): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
      
      inline def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      inline def setSignedPeerRecord(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signedPeerRecord", value.asInstanceOf[js.Any])
      
      inline def setSignedPeerRecordUndefined: Self = StObject.set(x, "signedPeerRecord", js.undefined)
    }
  }
}
