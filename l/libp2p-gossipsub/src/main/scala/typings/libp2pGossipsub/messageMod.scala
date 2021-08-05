package typings.libp2pGossipsub

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("libp2p-gossipsub/src/message", "RPCCodec")
  @js.native
  val RPCCodec: ProtoCodec[RPC] = js.native
  
  trait ControlGraft extends StObject {
    
    var topicID: js.UndefOr[String] = js.undefined
  }
  object ControlGraft {
    
    inline def apply(): ControlGraft = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlGraft]
    }
    
    extension [Self <: ControlGraft](x: Self) {
      
      inline def setTopicID(value: String): Self = StObject.set(x, "topicID", value.asInstanceOf[js.Any])
      
      inline def setTopicIDUndefined: Self = StObject.set(x, "topicID", js.undefined)
    }
  }
  
  trait ControlIHave extends StObject {
    
    var messageIDs: js.Array[Uint8Array]
    
    var topicID: js.UndefOr[String] = js.undefined
  }
  object ControlIHave {
    
    inline def apply(messageIDs: js.Array[Uint8Array]): ControlIHave = {
      val __obj = js.Dynamic.literal(messageIDs = messageIDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlIHave]
    }
    
    extension [Self <: ControlIHave](x: Self) {
      
      inline def setMessageIDs(value: js.Array[Uint8Array]): Self = StObject.set(x, "messageIDs", value.asInstanceOf[js.Any])
      
      inline def setMessageIDsVarargs(value: Uint8Array*): Self = StObject.set(x, "messageIDs", js.Array(value :_*))
      
      inline def setTopicID(value: String): Self = StObject.set(x, "topicID", value.asInstanceOf[js.Any])
      
      inline def setTopicIDUndefined: Self = StObject.set(x, "topicID", js.undefined)
    }
  }
  
  trait ControlIWant extends StObject {
    
    var messageIDs: js.Array[Uint8Array]
  }
  object ControlIWant {
    
    inline def apply(messageIDs: js.Array[Uint8Array]): ControlIWant = {
      val __obj = js.Dynamic.literal(messageIDs = messageIDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlIWant]
    }
    
    extension [Self <: ControlIWant](x: Self) {
      
      inline def setMessageIDs(value: js.Array[Uint8Array]): Self = StObject.set(x, "messageIDs", value.asInstanceOf[js.Any])
      
      inline def setMessageIDsVarargs(value: Uint8Array*): Self = StObject.set(x, "messageIDs", js.Array(value :_*))
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
    
    extension [Self <: ControlMessage](x: Self) {
      
      inline def setGraft(value: js.Array[ControlGraft]): Self = StObject.set(x, "graft", value.asInstanceOf[js.Any])
      
      inline def setGraftVarargs(value: ControlGraft*): Self = StObject.set(x, "graft", js.Array(value :_*))
      
      inline def setIhave(value: js.Array[ControlIHave]): Self = StObject.set(x, "ihave", value.asInstanceOf[js.Any])
      
      inline def setIhaveVarargs(value: ControlIHave*): Self = StObject.set(x, "ihave", js.Array(value :_*))
      
      inline def setIwant(value: js.Array[ControlIWant]): Self = StObject.set(x, "iwant", value.asInstanceOf[js.Any])
      
      inline def setIwantVarargs(value: ControlIWant*): Self = StObject.set(x, "iwant", js.Array(value :_*))
      
      inline def setPrune(value: js.Array[ControlPrune]): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
      
      inline def setPruneVarargs(value: ControlPrune*): Self = StObject.set(x, "prune", js.Array(value :_*))
    }
  }
  
  trait ControlPrune extends StObject {
    
    var backoff: js.UndefOr[Double] = js.undefined
    
    var peers: js.Array[PeerInfo]
    
    var topicID: js.UndefOr[String] = js.undefined
  }
  object ControlPrune {
    
    inline def apply(peers: js.Array[PeerInfo]): ControlPrune = {
      val __obj = js.Dynamic.literal(peers = peers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlPrune]
    }
    
    extension [Self <: ControlPrune](x: Self) {
      
      inline def setBackoff(value: Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      inline def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      inline def setPeers(value: js.Array[PeerInfo]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
      
      inline def setPeersVarargs(value: PeerInfo*): Self = StObject.set(x, "peers", js.Array(value :_*))
      
      inline def setTopicID(value: String): Self = StObject.set(x, "topicID", value.asInstanceOf[js.Any])
      
      inline def setTopicIDUndefined: Self = StObject.set(x, "topicID", js.undefined)
    }
  }
  
  trait Message extends StObject {
    
    /**
      * Opaque blob of data
      */
    var data: js.UndefOr[Uint8Array] = js.undefined
    
    /**
      * Peer id of the author of the message
      *
      * Note: This is not necessarily the peer who sent the RPC this message is contained in
      */
    var from: js.UndefOr[Uint8Array] = js.undefined
    
    /**
      * Signing key
      */
    var key: js.UndefOr[Uint8Array] = js.undefined
    
    /**
      * 64-bit big-endian uint
      *
      * No two messages on a topic from the same peer should have the same seqno value
      */
    var seqno: js.UndefOr[Uint8Array] = js.undefined
    
    /**
      * Signature of the message
      *
      * The signature is computed over the marshalled message protobuf excluding the key field
      * The protobuf bloc is prefixed by the string `libp2p-pubsub:` before signing
      */
    var signature: js.UndefOr[Uint8Array] = js.undefined
    
    /**
      * Set of topics being published to
      */
    var topicIDs: js.Array[String]
  }
  object Message {
    
    inline def apply(topicIDs: js.Array[String]): Message = {
      val __obj = js.Dynamic.literal(topicIDs = topicIDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFrom(value: Uint8Array): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setKey(value: Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setSeqno(value: Uint8Array): Self = StObject.set(x, "seqno", value.asInstanceOf[js.Any])
      
      inline def setSeqnoUndefined: Self = StObject.set(x, "seqno", js.undefined)
      
      inline def setSignature(value: Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      inline def setTopicIDs(value: js.Array[String]): Self = StObject.set(x, "topicIDs", value.asInstanceOf[js.Any])
      
      inline def setTopicIDsVarargs(value: String*): Self = StObject.set(x, "topicIDs", js.Array(value :_*))
    }
  }
  
  trait PeerInfo extends StObject {
    
    var peerID: js.UndefOr[Uint8Array] = js.undefined
    
    var signedPeerRecord: js.UndefOr[Uint8Array] = js.undefined
  }
  object PeerInfo {
    
    inline def apply(): PeerInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeerInfo]
    }
    
    extension [Self <: PeerInfo](x: Self) {
      
      inline def setPeerID(value: Uint8Array): Self = StObject.set(x, "peerID", value.asInstanceOf[js.Any])
      
      inline def setPeerIDUndefined: Self = StObject.set(x, "peerID", js.undefined)
      
      inline def setSignedPeerRecord(value: Uint8Array): Self = StObject.set(x, "signedPeerRecord", value.asInstanceOf[js.Any])
      
      inline def setSignedPeerRecordUndefined: Self = StObject.set(x, "signedPeerRecord", js.undefined)
    }
  }
  
  trait ProtoCodec[T] extends StObject {
    
    def decode(buf: Uint8Array): T
    
    def encode(obj: T): Uint8Array
  }
  object ProtoCodec {
    
    inline def apply[T](decode: Uint8Array => T, encode: T => Uint8Array): ProtoCodec[T] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[ProtoCodec[T]]
    }
    
    extension [Self <: ProtoCodec[?], T](x: Self & ProtoCodec[T]) {
      
      inline def setDecode(value: Uint8Array => T): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: T => Uint8Array): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  trait RPC extends StObject {
    
    var control: js.UndefOr[ControlMessage] = js.undefined
    
    var msgs: js.Array[Message]
    
    var subscriptions: js.Array[SubOpts]
  }
  object RPC {
    
    inline def apply(msgs: js.Array[Message], subscriptions: js.Array[SubOpts]): RPC = {
      val __obj = js.Dynamic.literal(msgs = msgs.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[RPC]
    }
    
    extension [Self <: RPC](x: Self) {
      
      inline def setControl(value: ControlMessage): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      inline def setMsgs(value: js.Array[Message]): Self = StObject.set(x, "msgs", value.asInstanceOf[js.Any])
      
      inline def setMsgsVarargs(value: Message*): Self = StObject.set(x, "msgs", js.Array(value :_*))
      
      inline def setSubscriptions(value: js.Array[SubOpts]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionsVarargs(value: SubOpts*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
    }
  }
  
  trait SubOpts extends StObject {
    
    /**
      * Whether to subscribe of unsubscribe
      * true for subscribe, false for unsubscribe
      */
    var subscribe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Topic ID
      */
    var topicID: js.UndefOr[String] = js.undefined
  }
  object SubOpts {
    
    inline def apply(): SubOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubOpts]
    }
    
    extension [Self <: SubOpts](x: Self) {
      
      inline def setSubscribe(value: Boolean): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
      
      inline def setTopicID(value: String): Self = StObject.set(x, "topicID", value.asInstanceOf[js.Any])
      
      inline def setTopicIDUndefined: Self = StObject.set(x, "topicID", js.undefined)
    }
  }
}
