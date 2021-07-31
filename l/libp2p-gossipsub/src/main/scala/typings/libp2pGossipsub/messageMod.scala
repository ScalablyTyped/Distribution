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
    
    @scala.inline
    def apply(): ControlGraft = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlGraft]
    }
    
    @scala.inline
    implicit class ControlGraftMutableBuilder[Self <: ControlGraft] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTopicID(value: String): Self = StObject.set(x, "topicID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicIDUndefined: Self = StObject.set(x, "topicID", js.undefined)
    }
  }
  
  trait ControlIHave extends StObject {
    
    var messageIDs: js.Array[Uint8Array]
    
    var topicID: js.UndefOr[String] = js.undefined
  }
  object ControlIHave {
    
    @scala.inline
    def apply(messageIDs: js.Array[Uint8Array]): ControlIHave = {
      val __obj = js.Dynamic.literal(messageIDs = messageIDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlIHave]
    }
    
    @scala.inline
    implicit class ControlIHaveMutableBuilder[Self <: ControlIHave] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageIDs(value: js.Array[Uint8Array]): Self = StObject.set(x, "messageIDs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIDsVarargs(value: Uint8Array*): Self = StObject.set(x, "messageIDs", js.Array(value :_*))
      
      @scala.inline
      def setTopicID(value: String): Self = StObject.set(x, "topicID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicIDUndefined: Self = StObject.set(x, "topicID", js.undefined)
    }
  }
  
  trait ControlIWant extends StObject {
    
    var messageIDs: js.Array[Uint8Array]
  }
  object ControlIWant {
    
    @scala.inline
    def apply(messageIDs: js.Array[Uint8Array]): ControlIWant = {
      val __obj = js.Dynamic.literal(messageIDs = messageIDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlIWant]
    }
    
    @scala.inline
    implicit class ControlIWantMutableBuilder[Self <: ControlIWant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageIDs(value: js.Array[Uint8Array]): Self = StObject.set(x, "messageIDs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIDsVarargs(value: Uint8Array*): Self = StObject.set(x, "messageIDs", js.Array(value :_*))
    }
  }
  
  trait ControlMessage extends StObject {
    
    var graft: js.Array[ControlGraft]
    
    var ihave: js.Array[ControlIHave]
    
    var iwant: js.Array[ControlIWant]
    
    var prune: js.Array[ControlPrune]
  }
  object ControlMessage {
    
    @scala.inline
    def apply(
      graft: js.Array[ControlGraft],
      ihave: js.Array[ControlIHave],
      iwant: js.Array[ControlIWant],
      prune: js.Array[ControlPrune]
    ): ControlMessage = {
      val __obj = js.Dynamic.literal(graft = graft.asInstanceOf[js.Any], ihave = ihave.asInstanceOf[js.Any], iwant = iwant.asInstanceOf[js.Any], prune = prune.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlMessage]
    }
    
    @scala.inline
    implicit class ControlMessageMutableBuilder[Self <: ControlMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGraft(value: js.Array[ControlGraft]): Self = StObject.set(x, "graft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraftVarargs(value: ControlGraft*): Self = StObject.set(x, "graft", js.Array(value :_*))
      
      @scala.inline
      def setIhave(value: js.Array[ControlIHave]): Self = StObject.set(x, "ihave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIhaveVarargs(value: ControlIHave*): Self = StObject.set(x, "ihave", js.Array(value :_*))
      
      @scala.inline
      def setIwant(value: js.Array[ControlIWant]): Self = StObject.set(x, "iwant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIwantVarargs(value: ControlIWant*): Self = StObject.set(x, "iwant", js.Array(value :_*))
      
      @scala.inline
      def setPrune(value: js.Array[ControlPrune]): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPruneVarargs(value: ControlPrune*): Self = StObject.set(x, "prune", js.Array(value :_*))
    }
  }
  
  trait ControlPrune extends StObject {
    
    var backoff: js.UndefOr[Double] = js.undefined
    
    var peers: js.Array[PeerInfo]
    
    var topicID: js.UndefOr[String] = js.undefined
  }
  object ControlPrune {
    
    @scala.inline
    def apply(peers: js.Array[PeerInfo]): ControlPrune = {
      val __obj = js.Dynamic.literal(peers = peers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlPrune]
    }
    
    @scala.inline
    implicit class ControlPruneMutableBuilder[Self <: ControlPrune] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackoff(value: Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      @scala.inline
      def setPeers(value: js.Array[PeerInfo]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeersVarargs(value: PeerInfo*): Self = StObject.set(x, "peers", js.Array(value :_*))
      
      @scala.inline
      def setTopicID(value: String): Self = StObject.set(x, "topicID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicIDUndefined: Self = StObject.set(x, "topicID", js.undefined)
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
    
    @scala.inline
    def apply(topicIDs: js.Array[String]): Message = {
      val __obj = js.Dynamic.literal(topicIDs = topicIDs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFrom(value: Uint8Array): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setKey(value: Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setSeqno(value: Uint8Array): Self = StObject.set(x, "seqno", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeqnoUndefined: Self = StObject.set(x, "seqno", js.undefined)
      
      @scala.inline
      def setSignature(value: Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      @scala.inline
      def setTopicIDs(value: js.Array[String]): Self = StObject.set(x, "topicIDs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicIDsVarargs(value: String*): Self = StObject.set(x, "topicIDs", js.Array(value :_*))
    }
  }
  
  trait PeerInfo extends StObject {
    
    var peerID: js.UndefOr[Uint8Array] = js.undefined
    
    var signedPeerRecord: js.UndefOr[Uint8Array] = js.undefined
  }
  object PeerInfo {
    
    @scala.inline
    def apply(): PeerInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeerInfo]
    }
    
    @scala.inline
    implicit class PeerInfoMutableBuilder[Self <: PeerInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPeerID(value: Uint8Array): Self = StObject.set(x, "peerID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerIDUndefined: Self = StObject.set(x, "peerID", js.undefined)
      
      @scala.inline
      def setSignedPeerRecord(value: Uint8Array): Self = StObject.set(x, "signedPeerRecord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedPeerRecordUndefined: Self = StObject.set(x, "signedPeerRecord", js.undefined)
    }
  }
  
  trait ProtoCodec[T] extends StObject {
    
    def decode(buf: Uint8Array): T
    
    def encode(obj: T): Uint8Array
  }
  object ProtoCodec {
    
    @scala.inline
    def apply[T](decode: Uint8Array => T, encode: T => Uint8Array): ProtoCodec[T] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[ProtoCodec[T]]
    }
    
    @scala.inline
    implicit class ProtoCodecMutableBuilder[Self <: ProtoCodec[?], T] (val x: Self & ProtoCodec[T]) extends AnyVal {
      
      @scala.inline
      def setDecode(value: Uint8Array => T): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncode(value: T => Uint8Array): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  trait RPC extends StObject {
    
    var control: js.UndefOr[ControlMessage] = js.undefined
    
    var msgs: js.Array[Message]
    
    var subscriptions: js.Array[SubOpts]
  }
  object RPC {
    
    @scala.inline
    def apply(msgs: js.Array[Message], subscriptions: js.Array[SubOpts]): RPC = {
      val __obj = js.Dynamic.literal(msgs = msgs.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[RPC]
    }
    
    @scala.inline
    implicit class RPCMutableBuilder[Self <: RPC] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControl(value: ControlMessage): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      @scala.inline
      def setMsgs(value: js.Array[Message]): Self = StObject.set(x, "msgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgsVarargs(value: Message*): Self = StObject.set(x, "msgs", js.Array(value :_*))
      
      @scala.inline
      def setSubscriptions(value: js.Array[SubOpts]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionsVarargs(value: SubOpts*): Self = StObject.set(x, "subscriptions", js.Array(value :_*))
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
    
    @scala.inline
    def apply(): SubOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubOpts]
    }
    
    @scala.inline
    implicit class SubOptsMutableBuilder[Self <: SubOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubscribe(value: Boolean): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
      
      @scala.inline
      def setTopicID(value: String): Self = StObject.set(x, "topicID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicIDUndefined: Self = StObject.set(x, "topicID", js.undefined)
    }
  }
}
