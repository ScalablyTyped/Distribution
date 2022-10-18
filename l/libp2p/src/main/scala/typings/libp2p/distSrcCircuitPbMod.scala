package typings.libp2p

import typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Peer
import typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status
import typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Type
import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitPbMod {
  
  trait CircuitRelay extends StObject {
    
    var code: js.UndefOr[Status] = js.undefined
    
    var dstPeer: js.UndefOr[Peer] = js.undefined
    
    var srcPeer: js.UndefOr[Peer] = js.undefined
    
    var `type`: js.UndefOr[Type] = js.undefined
  }
  object CircuitRelay {
    
    inline def apply(): CircuitRelay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircuitRelay]
    }
    
    @JSImport("libp2p/dist/src/circuit/pb", "CircuitRelay")
    @js.native
    val ^ : js.Any = js.native
    
    trait Peer extends StObject {
      
      var addrs: js.Array[js.typedarray.Uint8Array]
      
      var id: js.typedarray.Uint8Array
    }
    object Peer {
      
      inline def apply(addrs: js.Array[js.typedarray.Uint8Array], id: js.typedarray.Uint8Array): Peer = {
        val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[Peer]
      }
      
      @JSImport("libp2p/dist/src/circuit/pb", "CircuitRelay.Peer")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[Peer] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Peer]]
      
      inline def decode(buf: js.typedarray.Uint8Array): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Peer]
      inline def decode(buf: Uint8ArrayList): Peer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Peer]
      
      inline def encode(obj: Peer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      extension [Self <: Peer](x: Self) {
        
        inline def setAddrs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
        
        inline def setAddrsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "addrs", js.Array(value*))
        
        inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    sealed trait Status extends StObject
    @JSImport("libp2p/dist/src/circuit/pb", "CircuitRelay.Status")
    @js.native
    object Status extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[Status & String] = js.native
      
      @js.native
      sealed trait HOP_CANT_DIAL_DST
        extends StObject
           with Status
      /* "HOP_CANT_DIAL_DST" */ val HOP_CANT_DIAL_DST: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.HOP_CANT_DIAL_DST & String = js.native
      
      @js.native
      sealed trait HOP_CANT_OPEN_DST_STREAM
        extends StObject
           with Status
      /* "HOP_CANT_OPEN_DST_STREAM" */ val HOP_CANT_OPEN_DST_STREAM: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.HOP_CANT_OPEN_DST_STREAM & String = js.native
      
      @js.native
      sealed trait HOP_CANT_RELAY_TO_SELF
        extends StObject
           with Status
      /* "HOP_CANT_RELAY_TO_SELF" */ val HOP_CANT_RELAY_TO_SELF: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.HOP_CANT_RELAY_TO_SELF & String = js.native
      
      @js.native
      sealed trait HOP_CANT_SPEAK_RELAY
        extends StObject
           with Status
      /* "HOP_CANT_SPEAK_RELAY" */ val HOP_CANT_SPEAK_RELAY: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.HOP_CANT_SPEAK_RELAY & String = js.native
      
      @js.native
      sealed trait HOP_DST_ADDR_TOO_LONG
        extends StObject
           with Status
      /* "HOP_DST_ADDR_TOO_LONG" */ val HOP_DST_ADDR_TOO_LONG: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.HOP_DST_ADDR_TOO_LONG & String = js.native
      
      @js.native
      sealed trait HOP_DST_MULTIADDR_INVALID
        extends StObject
           with Status
      /* "HOP_DST_MULTIADDR_INVALID" */ val HOP_DST_MULTIADDR_INVALID: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.HOP_DST_MULTIADDR_INVALID & String = js.native
      
      @js.native
      sealed trait HOP_NO_CONN_TO_DST
        extends StObject
           with Status
      /* "HOP_NO_CONN_TO_DST" */ val HOP_NO_CONN_TO_DST: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.HOP_NO_CONN_TO_DST & String = js.native
      
      @js.native
      sealed trait HOP_SRC_ADDR_TOO_LONG
        extends StObject
           with Status
      /* "HOP_SRC_ADDR_TOO_LONG" */ val HOP_SRC_ADDR_TOO_LONG: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.HOP_SRC_ADDR_TOO_LONG & String = js.native
      
      @js.native
      sealed trait HOP_SRC_MULTIADDR_INVALID
        extends StObject
           with Status
      /* "HOP_SRC_MULTIADDR_INVALID" */ val HOP_SRC_MULTIADDR_INVALID: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.HOP_SRC_MULTIADDR_INVALID & String = js.native
      
      @js.native
      sealed trait MALFORMED_MESSAGE
        extends StObject
           with Status
      /* "MALFORMED_MESSAGE" */ val MALFORMED_MESSAGE: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.MALFORMED_MESSAGE & String = js.native
      
      @js.native
      sealed trait STOP_DST_ADDR_TOO_LONG
        extends StObject
           with Status
      /* "STOP_DST_ADDR_TOO_LONG" */ val STOP_DST_ADDR_TOO_LONG: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.STOP_DST_ADDR_TOO_LONG & String = js.native
      
      @js.native
      sealed trait STOP_DST_MULTIADDR_INVALID
        extends StObject
           with Status
      /* "STOP_DST_MULTIADDR_INVALID" */ val STOP_DST_MULTIADDR_INVALID: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.STOP_DST_MULTIADDR_INVALID & String = js.native
      
      @js.native
      sealed trait STOP_RELAY_REFUSED
        extends StObject
           with Status
      /* "STOP_RELAY_REFUSED" */ val STOP_RELAY_REFUSED: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.STOP_RELAY_REFUSED & String = js.native
      
      @js.native
      sealed trait STOP_SRC_ADDR_TOO_LONG
        extends StObject
           with Status
      /* "STOP_SRC_ADDR_TOO_LONG" */ val STOP_SRC_ADDR_TOO_LONG: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.STOP_SRC_ADDR_TOO_LONG & String = js.native
      
      @js.native
      sealed trait STOP_SRC_MULTIADDR_INVALID
        extends StObject
           with Status
      /* "STOP_SRC_MULTIADDR_INVALID" */ val STOP_SRC_MULTIADDR_INVALID: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.STOP_SRC_MULTIADDR_INVALID & String = js.native
      
      @js.native
      sealed trait SUCCESS
        extends StObject
           with Status
      /* "SUCCESS" */ val SUCCESS: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Status.SUCCESS & String = js.native
      
      def codec(): Codec[Status] = js.native
    }
    
    @js.native
    sealed trait Type extends StObject
    @JSImport("libp2p/dist/src/circuit/pb", "CircuitRelay.Type")
    @js.native
    object Type extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[Type & String] = js.native
      
      @js.native
      sealed trait CAN_HOP
        extends StObject
           with Type
      /* "CAN_HOP" */ val CAN_HOP: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Type.CAN_HOP & String = js.native
      
      @js.native
      sealed trait HOP
        extends StObject
           with Type
      /* "HOP" */ val HOP: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Type.HOP & String = js.native
      
      @js.native
      sealed trait STATUS
        extends StObject
           with Type
      /* "STATUS" */ val STATUS: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Type.STATUS & String = js.native
      
      @js.native
      sealed trait STOP
        extends StObject
           with Type
      /* "STOP" */ val STOP: typings.libp2p.distSrcCircuitPbMod.CircuitRelay.Type.STOP & String = js.native
      
      def codec(): Codec[Type] = js.native
    }
    
    inline def codec(): Codec[CircuitRelay] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[CircuitRelay]]
    
    inline def decode(buf: js.typedarray.Uint8Array): CircuitRelay = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[CircuitRelay]
    inline def decode(buf: Uint8ArrayList): CircuitRelay = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[CircuitRelay]
    
    inline def encode(obj: CircuitRelay): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    extension [Self <: CircuitRelay](x: Self) {
      
      inline def setCode(value: Status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDstPeer(value: Peer): Self = StObject.set(x, "dstPeer", value.asInstanceOf[js.Any])
      
      inline def setDstPeerUndefined: Self = StObject.set(x, "dstPeer", js.undefined)
      
      inline def setSrcPeer(value: Peer): Self = StObject.set(x, "srcPeer", value.asInstanceOf[js.Any])
      
      inline def setSrcPeerUndefined: Self = StObject.set(x, "srcPeer", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
