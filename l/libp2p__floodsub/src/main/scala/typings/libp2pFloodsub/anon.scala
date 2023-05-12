package typings.libp2pFloodsub

import typings.libp2pFloodsub.distSrcMessageRpcMod.ControlGraft
import typings.libp2pFloodsub.distSrcMessageRpcMod.ControlIHave
import typings.libp2pFloodsub.distSrcMessageRpcMod.ControlIWant
import typings.libp2pFloodsub.distSrcMessageRpcMod.ControlMessage
import typings.libp2pFloodsub.distSrcMessageRpcMod.ControlPrune
import typings.libp2pFloodsub.distSrcMessageRpcMod.PeerInfo
import typings.libp2pFloodsub.distSrcMessageRpcMod.RPC.Message
import typings.libp2pFloodsub.distSrcMessageRpcMod.RPC.SubOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@libp2p/floodsub.@libp2p/floodsub/dist/src/message/rpc.ControlGraft> */
  trait PartialControlGraft extends StObject {
    
    var topic: js.UndefOr[String] = js.undefined
  }
  object PartialControlGraft {
    
    inline def apply(): PartialControlGraft = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialControlGraft]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialControlGraft] (val x: Self) extends AnyVal {
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@libp2p/floodsub.@libp2p/floodsub/dist/src/message/rpc.ControlIHave> */
  trait PartialControlIHave extends StObject {
    
    var messageIDs: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.undefined
    
    var topic: js.UndefOr[String] = js.undefined
  }
  object PartialControlIHave {
    
    inline def apply(): PartialControlIHave = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialControlIHave]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialControlIHave] (val x: Self) extends AnyVal {
      
      inline def setMessageIDs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "messageIDs", value.asInstanceOf[js.Any])
      
      inline def setMessageIDsUndefined: Self = StObject.set(x, "messageIDs", js.undefined)
      
      inline def setMessageIDsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "messageIDs", js.Array(value*))
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@libp2p/floodsub.@libp2p/floodsub/dist/src/message/rpc.ControlIWant> */
  trait PartialControlIWant extends StObject {
    
    var messageIDs: js.UndefOr[js.Array[js.typedarray.Uint8Array]] = js.undefined
  }
  object PartialControlIWant {
    
    inline def apply(): PartialControlIWant = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialControlIWant]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialControlIWant] (val x: Self) extends AnyVal {
      
      inline def setMessageIDs(value: js.Array[js.typedarray.Uint8Array]): Self = StObject.set(x, "messageIDs", value.asInstanceOf[js.Any])
      
      inline def setMessageIDsUndefined: Self = StObject.set(x, "messageIDs", js.undefined)
      
      inline def setMessageIDsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "messageIDs", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<@libp2p/floodsub.@libp2p/floodsub/dist/src/message/rpc.ControlMessage> */
  trait PartialControlMessage extends StObject {
    
    var graft: js.UndefOr[js.Array[ControlGraft]] = js.undefined
    
    var ihave: js.UndefOr[js.Array[ControlIHave]] = js.undefined
    
    var iwant: js.UndefOr[js.Array[ControlIWant]] = js.undefined
    
    var prune: js.UndefOr[js.Array[ControlPrune]] = js.undefined
  }
  object PartialControlMessage {
    
    inline def apply(): PartialControlMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialControlMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialControlMessage] (val x: Self) extends AnyVal {
      
      inline def setGraft(value: js.Array[ControlGraft]): Self = StObject.set(x, "graft", value.asInstanceOf[js.Any])
      
      inline def setGraftUndefined: Self = StObject.set(x, "graft", js.undefined)
      
      inline def setGraftVarargs(value: ControlGraft*): Self = StObject.set(x, "graft", js.Array(value*))
      
      inline def setIhave(value: js.Array[ControlIHave]): Self = StObject.set(x, "ihave", value.asInstanceOf[js.Any])
      
      inline def setIhaveUndefined: Self = StObject.set(x, "ihave", js.undefined)
      
      inline def setIhaveVarargs(value: ControlIHave*): Self = StObject.set(x, "ihave", js.Array(value*))
      
      inline def setIwant(value: js.Array[ControlIWant]): Self = StObject.set(x, "iwant", value.asInstanceOf[js.Any])
      
      inline def setIwantUndefined: Self = StObject.set(x, "iwant", js.undefined)
      
      inline def setIwantVarargs(value: ControlIWant*): Self = StObject.set(x, "iwant", js.Array(value*))
      
      inline def setPrune(value: js.Array[ControlPrune]): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
      
      inline def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
      
      inline def setPruneVarargs(value: ControlPrune*): Self = StObject.set(x, "prune", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<@libp2p/floodsub.@libp2p/floodsub/dist/src/message/rpc.ControlPrune> */
  trait PartialControlPrune extends StObject {
    
    var backoff: js.UndefOr[js.BigInt] = js.undefined
    
    var peers: js.UndefOr[js.Array[PeerInfo]] = js.undefined
    
    var topic: js.UndefOr[String] = js.undefined
  }
  object PartialControlPrune {
    
    inline def apply(): PartialControlPrune = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialControlPrune]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialControlPrune] (val x: Self) extends AnyVal {
      
      inline def setBackoff(value: js.BigInt): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setPeers(value: js.Array[PeerInfo]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
      
      inline def setPeersUndefined: Self = StObject.set(x, "peers", js.undefined)
      
      inline def setPeersVarargs(value: PeerInfo*): Self = StObject.set(x, "peers", js.Array(value*))
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@libp2p/floodsub.@libp2p/floodsub/dist/src/message/rpc.RPC.Message> */
  trait PartialMessage extends StObject {
    
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var from: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var key: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var sequenceNumber: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var signature: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var topic: js.UndefOr[String] = js.undefined
  }
  object PartialMessage {
    
    inline def apply(): PartialMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMessage] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined std.Partial<@libp2p/floodsub.@libp2p/floodsub/dist/src/message/rpc.PeerInfo> */
  trait PartialPeerInfo extends StObject {
    
    var peerID: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var signedPeerRecord: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PartialPeerInfo {
    
    inline def apply(): PartialPeerInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPeerInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPeerInfo] (val x: Self) extends AnyVal {
      
      inline def setPeerID(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerID", value.asInstanceOf[js.Any])
      
      inline def setPeerIDUndefined: Self = StObject.set(x, "peerID", js.undefined)
      
      inline def setSignedPeerRecord(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signedPeerRecord", value.asInstanceOf[js.Any])
      
      inline def setSignedPeerRecordUndefined: Self = StObject.set(x, "signedPeerRecord", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@libp2p/floodsub.@libp2p/floodsub/dist/src/message/rpc.RPC> */
  trait PartialRPC extends StObject {
    
    var control: js.UndefOr[ControlMessage] = js.undefined
    
    var messages: js.UndefOr[js.Array[Message]] = js.undefined
    
    var subscriptions: js.UndefOr[js.Array[SubOpts]] = js.undefined
  }
  object PartialRPC {
    
    inline def apply(): PartialRPC = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRPC]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRPC] (val x: Self) extends AnyVal {
      
      inline def setControl(value: ControlMessage): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setSubscriptions(value: js.Array[SubOpts]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionsUndefined: Self = StObject.set(x, "subscriptions", js.undefined)
      
      inline def setSubscriptionsVarargs(value: SubOpts*): Self = StObject.set(x, "subscriptions", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<@libp2p/floodsub.@libp2p/floodsub/dist/src/message/rpc.RPC.SubOpts> */
  trait PartialSubOpts extends StObject {
    
    var subscribe: js.UndefOr[Boolean] = js.undefined
    
    var topic: js.UndefOr[String] = js.undefined
  }
  object PartialSubOpts {
    
    inline def apply(): PartialSubOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSubOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSubOpts] (val x: Self) extends AnyVal {
      
      inline def setSubscribe(value: Boolean): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
}
