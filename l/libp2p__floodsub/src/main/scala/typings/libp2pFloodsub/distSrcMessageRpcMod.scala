package typings.libp2pFloodsub

import typings.libp2pFloodsub.anon.PartialControlGraft
import typings.libp2pFloodsub.anon.PartialControlIHave
import typings.libp2pFloodsub.anon.PartialControlIWant
import typings.libp2pFloodsub.anon.PartialControlMessage
import typings.libp2pFloodsub.anon.PartialControlPrune
import typings.libp2pFloodsub.anon.PartialMessage
import typings.libp2pFloodsub.anon.PartialPeerInfo
import typings.libp2pFloodsub.anon.PartialRPC
import typings.libp2pFloodsub.anon.PartialSubOpts
import typings.libp2pFloodsub.distSrcMessageRpcMod.RPC.Message
import typings.libp2pFloodsub.distSrcMessageRpcMod.RPC.SubOpts
import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMessageRpcMod {
  
  trait ControlGraft extends StObject {
    
    var topic: js.UndefOr[String] = js.undefined
  }
  object ControlGraft {
    
    inline def apply(): ControlGraft = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlGraft]
    }
    
    @JSImport("@libp2p/floodsub/dist/src/message/rpc", "ControlGraft")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[ControlGraft] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[ControlGraft]]
    
    inline def decode(buf: js.typedarray.Uint8Array): ControlGraft = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[ControlGraft]
    inline def decode(buf: Uint8ArrayList): ControlGraft = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[ControlGraft]
    
    inline def encode(obj: PartialControlGraft): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlGraft] (val x: Self) extends AnyVal {
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  trait ControlIHave extends StObject {
    
    var messageIDs: js.Array[js.typedarray.Uint8Array]
    
    var topic: js.UndefOr[String] = js.undefined
  }
  object ControlIHave {
    
    inline def apply(messageIDs: js.Array[js.typedarray.Uint8Array]): ControlIHave = {
      val __obj = js.Dynamic.literal(messageIDs = messageIDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlIHave]
    }
    
    @JSImport("@libp2p/floodsub/dist/src/message/rpc", "ControlIHave")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[ControlIHave] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[ControlIHave]]
    
    inline def decode(buf: js.typedarray.Uint8Array): ControlIHave = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[ControlIHave]
    inline def decode(buf: Uint8ArrayList): ControlIHave = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[ControlIHave]
    
    inline def encode(obj: PartialControlIHave): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlIHave] (val x: Self) extends AnyVal {
      
      inline def setMessageIDs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "messageIDs", value.asInstanceOf[js.Any])
      
      inline def setMessageIDsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "messageIDs", js.Array(value*))
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  trait ControlIWant extends StObject {
    
    var messageIDs: js.Array[js.typedarray.Uint8Array]
  }
  object ControlIWant {
    
    inline def apply(messageIDs: js.Array[js.typedarray.Uint8Array]): ControlIWant = {
      val __obj = js.Dynamic.literal(messageIDs = messageIDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlIWant]
    }
    
    @JSImport("@libp2p/floodsub/dist/src/message/rpc", "ControlIWant")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[ControlIWant] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[ControlIWant]]
    
    inline def decode(buf: js.typedarray.Uint8Array): ControlIWant = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[ControlIWant]
    inline def decode(buf: Uint8ArrayList): ControlIWant = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[ControlIWant]
    
    inline def encode(obj: PartialControlIWant): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlIWant] (val x: Self) extends AnyVal {
      
      inline def setMessageIDs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "messageIDs", value.asInstanceOf[js.Any])
      
      inline def setMessageIDsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "messageIDs", js.Array(value*))
    }
  }
  
  trait ControlMessage extends StObject {
    
    var graft: js.Array[ControlGraft]
    
    var ihave: js.Array[ControlIHave]
    
    var iwant: js.Array[ControlIWant]
    
    var prune: js.Array[ControlPrune]
  }
  object ControlMessage {
    
    inline def apply(
      graft: js.Array[ControlGraft],
      ihave: js.Array[ControlIHave],
      iwant: js.Array[ControlIWant],
      prune: js.Array[ControlPrune]
    ): ControlMessage = {
      val __obj = js.Dynamic.literal(graft = graft.asInstanceOf[js.Any], ihave = ihave.asInstanceOf[js.Any], iwant = iwant.asInstanceOf[js.Any], prune = prune.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlMessage]
    }
    
    @JSImport("@libp2p/floodsub/dist/src/message/rpc", "ControlMessage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[ControlMessage] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[ControlMessage]]
    
    inline def decode(buf: js.typedarray.Uint8Array): ControlMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[ControlMessage]
    inline def decode(buf: Uint8ArrayList): ControlMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[ControlMessage]
    
    inline def encode(obj: PartialControlMessage): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlMessage] (val x: Self) extends AnyVal {
      
      inline def setGraft(value: js.Array[ControlGraft]): Self = StObject.set(x, "graft", value.asInstanceOf[js.Any])
      
      inline def setGraftVarargs(value: ControlGraft*): Self = StObject.set(x, "graft", js.Array(value*))
      
      inline def setIhave(value: js.Array[ControlIHave]): Self = StObject.set(x, "ihave", value.asInstanceOf[js.Any])
      
      inline def setIhaveVarargs(value: ControlIHave*): Self = StObject.set(x, "ihave", js.Array(value*))
      
      inline def setIwant(value: js.Array[ControlIWant]): Self = StObject.set(x, "iwant", value.asInstanceOf[js.Any])
      
      inline def setIwantVarargs(value: ControlIWant*): Self = StObject.set(x, "iwant", js.Array(value*))
      
      inline def setPrune(value: js.Array[ControlPrune]): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
      
      inline def setPruneVarargs(value: ControlPrune*): Self = StObject.set(x, "prune", js.Array(value*))
    }
  }
  
  trait ControlPrune extends StObject {
    
    var backoff: js.UndefOr[js.BigInt] = js.undefined
    
    var peers: js.Array[PeerInfo]
    
    var topic: js.UndefOr[String] = js.undefined
  }
  object ControlPrune {
    
    inline def apply(peers: js.Array[PeerInfo]): ControlPrune = {
      val __obj = js.Dynamic.literal(peers = peers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlPrune]
    }
    
    @JSImport("@libp2p/floodsub/dist/src/message/rpc", "ControlPrune")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[ControlPrune] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[ControlPrune]]
    
    inline def decode(buf: js.typedarray.Uint8Array): ControlPrune = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[ControlPrune]
    inline def decode(buf: Uint8ArrayList): ControlPrune = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[ControlPrune]
    
    inline def encode(obj: PartialControlPrune): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlPrune] (val x: Self) extends AnyVal {
      
      inline def setBackoff(value: js.BigInt): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setPeers(value: js.Array[PeerInfo]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
      
      inline def setPeersVarargs(value: PeerInfo*): Self = StObject.set(x, "peers", js.Array(value*))
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  trait PeerInfo extends StObject {
    
    var peerID: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var signedPeerRecord: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PeerInfo {
    
    inline def apply(): PeerInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeerInfo]
    }
    
    @JSImport("@libp2p/floodsub/dist/src/message/rpc", "PeerInfo")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[PeerInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[PeerInfo]]
    
    inline def decode(buf: js.typedarray.Uint8Array): PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PeerInfo]
    inline def decode(buf: Uint8ArrayList): PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PeerInfo]
    
    inline def encode(obj: PartialPeerInfo): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerInfo] (val x: Self) extends AnyVal {
      
      inline def setPeerID(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerID", value.asInstanceOf[js.Any])
      
      inline def setPeerIDUndefined: Self = StObject.set(x, "peerID", js.undefined)
      
      inline def setSignedPeerRecord(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signedPeerRecord", value.asInstanceOf[js.Any])
      
      inline def setSignedPeerRecordUndefined: Self = StObject.set(x, "signedPeerRecord", js.undefined)
    }
  }
  
  trait RPC extends StObject {
    
    var control: js.UndefOr[ControlMessage] = js.undefined
    
    var messages: js.Array[Message]
    
    var subscriptions: js.Array[SubOpts]
  }
  object RPC {
    
    inline def apply(messages: js.Array[Message], subscriptions: js.Array[SubOpts]): RPC = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[RPC]
    }
    
    @JSImport("@libp2p/floodsub/dist/src/message/rpc", "RPC")
    @js.native
    val ^ : js.Any = js.native
    
    trait Message extends StObject {
      
      var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
      
      var from: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
      
      var key: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
      
      var sequenceNumber: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
      
      var signature: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
      
      var topic: js.UndefOr[String] = js.undefined
    }
    object Message {
      
      inline def apply(): Message = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Message]
      }
      
      @JSImport("@libp2p/floodsub/dist/src/message/rpc", "RPC.Message")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[Message] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Message]]
      
      inline def decode(buf: js.typedarray.Uint8Array): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Message]
      inline def decode(buf: Uint8ArrayList): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Message]
      
      inline def encode(obj: PartialMessage): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
        
        inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setFrom(value: js.typedarray.Uint8Array): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
        
        inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
        
        inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setSequenceNumber(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
        
        inline def setSequenceNumberUndefined: Self = StObject.set(x, "sequenceNumber", js.undefined)
        
        inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
        
        inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
        
        inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
        
        inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
      }
    }
    
    trait SubOpts extends StObject {
      
      var subscribe: js.UndefOr[Boolean] = js.undefined
      
      var topic: js.UndefOr[String] = js.undefined
    }
    object SubOpts {
      
      inline def apply(): SubOpts = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubOpts]
      }
      
      @JSImport("@libp2p/floodsub/dist/src/message/rpc", "RPC.SubOpts")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[SubOpts] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[SubOpts]]
      
      inline def decode(buf: js.typedarray.Uint8Array): SubOpts = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[SubOpts]
      inline def decode(buf: Uint8ArrayList): SubOpts = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[SubOpts]
      
      inline def encode(obj: PartialSubOpts): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SubOpts] (val x: Self) extends AnyVal {
        
        inline def setSubscribe(value: Boolean): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
        
        inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
        
        inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
        
        inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
      }
    }
    
    inline def codec(): Codec[RPC] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[RPC]]
    
    inline def decode(buf: js.typedarray.Uint8Array): RPC = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[RPC]
    inline def decode(buf: Uint8ArrayList): RPC = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[RPC]
    
    inline def encode(obj: PartialRPC): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RPC] (val x: Self) extends AnyVal {
      
      inline def setControl(value: ControlMessage): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setSubscriptions(value: js.Array[SubOpts]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionsVarargs(value: SubOpts*): Self = StObject.set(x, "subscriptions", js.Array(value*))
    }
  }
}
