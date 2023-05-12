package typings.libp2p

import typings.libp2p.anon.PartialDial
import typings.libp2p.anon.PartialDialResponse
import typings.libp2p.anon.PartialMessage
import typings.libp2p.anon.PartialPeerInfo
import typings.libp2p.distSrcAutonatPbMod.Message.Dial
import typings.libp2p.distSrcAutonatPbMod.Message.DialResponse
import typings.libp2p.distSrcAutonatPbMod.Message.MessageType
import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAutonatPbMod {
  
  trait Message extends StObject {
    
    var dial: js.UndefOr[Dial] = js.undefined
    
    var dialResponse: js.UndefOr[DialResponse] = js.undefined
    
    var `type`: js.UndefOr[MessageType] = js.undefined
  }
  object Message {
    
    inline def apply(): Message = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Message]
    }
    
    @JSImport("libp2p/dist/src/autonat/pb", "Message")
    @js.native
    val ^ : js.Any = js.native
    
    trait Dial extends StObject {
      
      var peer: js.UndefOr[PeerInfo] = js.undefined
    }
    object Dial {
      
      inline def apply(): Dial = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Dial]
      }
      
      @JSImport("libp2p/dist/src/autonat/pb", "Message.Dial")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[Dial] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Dial]]
      
      inline def decode(buf: js.typedarray.Uint8Array): Dial = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Dial]
      inline def decode(buf: Uint8ArrayList): Dial = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Dial]
      
      inline def encode(obj: PartialDial): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Dial] (val x: Self) extends AnyVal {
        
        inline def setPeer(value: PeerInfo): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
        
        inline def setPeerUndefined: Self = StObject.set(x, "peer", js.undefined)
      }
    }
    
    trait DialResponse extends StObject {
      
      var addr: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
      
      var status: js.UndefOr[ResponseStatus] = js.undefined
      
      var statusText: js.UndefOr[String] = js.undefined
    }
    object DialResponse {
      
      inline def apply(): DialResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DialResponse]
      }
      
      @JSImport("libp2p/dist/src/autonat/pb", "Message.DialResponse")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[DialResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[DialResponse]]
      
      inline def decode(buf: js.typedarray.Uint8Array): DialResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[DialResponse]
      inline def decode(buf: Uint8ArrayList): DialResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[DialResponse]
      
      inline def encode(obj: PartialDialResponse): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DialResponse] (val x: Self) extends AnyVal {
        
        inline def setAddr(value: js.typedarray.Uint8Array): Self = StObject.set(x, "addr", value.asInstanceOf[js.Any])
        
        inline def setAddrUndefined: Self = StObject.set(x, "addr", js.undefined)
        
        inline def setStatus(value: ResponseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
        
        inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    @js.native
    sealed trait MessageType extends StObject
    @JSImport("libp2p/dist/src/autonat/pb", "Message.MessageType")
    @js.native
    object MessageType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[MessageType & String] = js.native
      
      @js.native
      sealed trait DIAL
        extends StObject
           with MessageType
      /* "DIAL" */ val DIAL: typings.libp2p.distSrcAutonatPbMod.Message.MessageType.DIAL & String = js.native
      
      @js.native
      sealed trait DIAL_RESPONSE
        extends StObject
           with MessageType
      /* "DIAL_RESPONSE" */ val DIAL_RESPONSE: typings.libp2p.distSrcAutonatPbMod.Message.MessageType.DIAL_RESPONSE & String = js.native
      
      def codec(): Codec[MessageType] = js.native
    }
    
    trait PeerInfo extends StObject {
      
      var addrs: js.Array[js.typedarray.Uint8Array]
      
      var id: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    }
    object PeerInfo {
      
      inline def apply(addrs: js.Array[js.typedarray.Uint8Array]): PeerInfo = {
        val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any])
        __obj.asInstanceOf[PeerInfo]
      }
      
      @JSImport("libp2p/dist/src/autonat/pb", "Message.PeerInfo")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[PeerInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[PeerInfo]]
      
      inline def decode(buf: js.typedarray.Uint8Array): PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PeerInfo]
      inline def decode(buf: Uint8ArrayList): PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PeerInfo]
      
      inline def encode(obj: PartialPeerInfo): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PeerInfo] (val x: Self) extends AnyVal {
        
        inline def setAddrs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
        
        inline def setAddrsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "addrs", js.Array(value*))
        
        inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      }
    }
    
    @js.native
    sealed trait ResponseStatus extends StObject
    @JSImport("libp2p/dist/src/autonat/pb", "Message.ResponseStatus")
    @js.native
    object ResponseStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[ResponseStatus & String] = js.native
      
      @js.native
      sealed trait E_BAD_REQUEST
        extends StObject
           with ResponseStatus
      /* "E_BAD_REQUEST" */ val E_BAD_REQUEST: typings.libp2p.distSrcAutonatPbMod.Message.ResponseStatus.E_BAD_REQUEST & String = js.native
      
      @js.native
      sealed trait E_DIAL_ERROR
        extends StObject
           with ResponseStatus
      /* "E_DIAL_ERROR" */ val E_DIAL_ERROR: typings.libp2p.distSrcAutonatPbMod.Message.ResponseStatus.E_DIAL_ERROR & String = js.native
      
      @js.native
      sealed trait E_DIAL_REFUSED
        extends StObject
           with ResponseStatus
      /* "E_DIAL_REFUSED" */ val E_DIAL_REFUSED: typings.libp2p.distSrcAutonatPbMod.Message.ResponseStatus.E_DIAL_REFUSED & String = js.native
      
      @js.native
      sealed trait E_INTERNAL_ERROR
        extends StObject
           with ResponseStatus
      /* "E_INTERNAL_ERROR" */ val E_INTERNAL_ERROR: typings.libp2p.distSrcAutonatPbMod.Message.ResponseStatus.E_INTERNAL_ERROR & String = js.native
      
      @js.native
      sealed trait OK
        extends StObject
           with ResponseStatus
      /* "OK" */ val OK: typings.libp2p.distSrcAutonatPbMod.Message.ResponseStatus.OK & String = js.native
      
      def codec(): Codec[ResponseStatus] = js.native
    }
    
    inline def codec(): Codec[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Message]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Message]
    inline def decode(buf: Uint8ArrayList): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Message]
    
    inline def encode(obj: PartialMessage): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setDial(value: Dial): Self = StObject.set(x, "dial", value.asInstanceOf[js.Any])
      
      inline def setDialResponse(value: DialResponse): Self = StObject.set(x, "dialResponse", value.asInstanceOf[js.Any])
      
      inline def setDialResponseUndefined: Self = StObject.set(x, "dialResponse", js.undefined)
      
      inline def setDialUndefined: Self = StObject.set(x, "dial", js.undefined)
      
      inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
