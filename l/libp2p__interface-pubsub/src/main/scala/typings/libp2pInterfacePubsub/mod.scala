package typings.libp2pInterfacePubsub

import org.scalablytyped.runtime.StringDictionary
import typings.itPushable.mod.Pushable_
import typings.libp2pInterfaceConnection.mod.Stream
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePubsub.libp2pInterfacePubsubStrings.signed
import typings.libp2pInterfacePubsub.libp2pInterfacePubsubStrings.unsigned
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.AsyncIterable
import typings.std.CustomEvent
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/interface-pubsub", "StrictNoSign")
  @js.native
  val StrictNoSign: /* "StrictNoSign" */ String = js.native
  
  @JSImport("@libp2p/interface-pubsub", "StrictSign")
  @js.native
  val StrictSign: /* "StrictSign" */ String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.libp2pInterfacePubsub.mod.SignedMessage
    - typings.libp2pInterfacePubsub.mod.UnsignedMessage
  */
  trait Message extends StObject
  object Message {
    
    inline def SignedMessage(
      data: js.typedarray.Uint8Array,
      from: PeerId,
      key: js.typedarray.Uint8Array,
      sequenceNumber: js.BigInt,
      signature: js.typedarray.Uint8Array,
      topic: String
    ): typings.libp2pInterfacePubsub.mod.SignedMessage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("signed")
      __obj.asInstanceOf[typings.libp2pInterfacePubsub.mod.SignedMessage]
    }
    
    inline def UnsignedMessage(data: js.typedarray.Uint8Array, topic: String): typings.libp2pInterfacePubsub.mod.UnsignedMessage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unsigned")
      __obj.asInstanceOf[typings.libp2pInterfacePubsub.mod.UnsignedMessage]
    }
  }
  
  trait PeerStreamEvents extends StObject {
    
    var close: CustomEvent[scala.Nothing]
    
    @JSName("stream:inbound")
    var streamColoninbound: CustomEvent[scala.Nothing]
    
    @JSName("stream:outbound")
    var streamColonoutbound: CustomEvent[scala.Nothing]
  }
  object PeerStreamEvents {
    
    inline def apply(
      close: CustomEvent[scala.Nothing],
      streamColoninbound: CustomEvent[scala.Nothing],
      streamColonoutbound: CustomEvent[scala.Nothing]
    ): PeerStreamEvents = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
      __obj.updateDynamic("stream:inbound")(streamColoninbound.asInstanceOf[js.Any])
      __obj.updateDynamic("stream:outbound")(streamColonoutbound.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerStreamEvents]
    }
    
    extension [Self <: PeerStreamEvents](x: Self) {
      
      inline def setClose(value: CustomEvent[scala.Nothing]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setStreamColoninbound(value: CustomEvent[scala.Nothing]): Self = StObject.set(x, "stream:inbound", value.asInstanceOf[js.Any])
      
      inline def setStreamColonoutbound(value: CustomEvent[scala.Nothing]): Self = StObject.set(x, "stream:outbound", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PeerStreams extends EventEmitter[PeerStreamEvents] {
    
    def attachInboundStream(stream: Stream): AsyncIterable[Uint8ArrayList] = js.native
    
    def attachOutboundStream(stream: Stream): js.Promise[Pushable_[Uint8ArrayList]] = js.native
    
    def close(): Unit = js.native
    
    var id: PeerId = js.native
    
    var inboundStream: js.UndefOr[AsyncIterable[Uint8ArrayList]] = js.native
    
    var isWritable: Boolean = js.native
    
    var outboundStream: js.UndefOr[Pushable_[Uint8ArrayList]] = js.native
    
    var protocol: String = js.native
    
    def write(buf: js.typedarray.Uint8Array): Unit = js.native
    def write(buf: Uint8ArrayList): Unit = js.native
  }
  
  @js.native
  trait PubSub[Events /* <: StringDictionary[Any] */] extends EventEmitter[Events] {
    
    def getPeers(): js.Array[PeerId] = js.native
    
    def getSubscribers(topic: String): js.Array[PeerId] = js.native
    
    def getTopics(): js.Array[String] = js.native
    
    var globalSignaturePolicy: /* "StrictSign" */ String = js.native
    
    var multicodecs: js.Array[String] = js.native
    
    def publish(topic: String, data: js.typedarray.Uint8Array): js.Promise[PublishResult] = js.native
    
    def subscribe(topic: String): Unit = js.native
    
    def unsubscribe(topic: String): Unit = js.native
  }
  
  trait PubSubEvents extends StObject {
    
    var message: CustomEvent[Message]
    
    var `subscription-change`: CustomEvent[SubscriptionChangeData]
  }
  object PubSubEvents {
    
    inline def apply(message: CustomEvent[Message], `subscription-change`: CustomEvent[SubscriptionChangeData]): PubSubEvents = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("subscription-change")(`subscription-change`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PubSubEvents]
    }
    
    extension [Self <: PubSubEvents](x: Self) {
      
      inline def setMessage(value: CustomEvent[Message]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def `setSubscription-change`(value: CustomEvent[SubscriptionChangeData]): Self = StObject.set(x, "subscription-change", value.asInstanceOf[js.Any])
    }
  }
  
  trait PubSubInit extends StObject {
    
    /**
      * if can relay messages not subscribed
      */
    var canRelayMessage: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if publish should emit to self, if subscribed
      */
    var emitSelf: js.UndefOr[Boolean] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * defines how signatures should be handled
      */
    var globalSignaturePolicy: js.UndefOr[SignaturePolicy] = js.undefined
    
    /**
      * How many parallel incoming streams to allow on the pubsub protocol per-connection
      */
    var maxInboundStreams: js.UndefOr[Double] = js.undefined
    
    /**
      * How many parallel outgoing streams to allow on the pubsub protocol per-connection
      */
    var maxOutboundStreams: js.UndefOr[Double] = js.undefined
    
    /**
      * handle this many incoming pubsub messages concurrently
      */
    var messageProcessingConcurrency: js.UndefOr[Double] = js.undefined
    
    var multicodecs: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PubSubInit {
    
    inline def apply(): PubSubInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PubSubInit]
    }
    
    extension [Self <: PubSubInit](x: Self) {
      
      inline def setCanRelayMessage(value: Boolean): Self = StObject.set(x, "canRelayMessage", value.asInstanceOf[js.Any])
      
      inline def setCanRelayMessageUndefined: Self = StObject.set(x, "canRelayMessage", js.undefined)
      
      inline def setEmitSelf(value: Boolean): Self = StObject.set(x, "emitSelf", value.asInstanceOf[js.Any])
      
      inline def setEmitSelfUndefined: Self = StObject.set(x, "emitSelf", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setGlobalSignaturePolicy(value: SignaturePolicy): Self = StObject.set(x, "globalSignaturePolicy", value.asInstanceOf[js.Any])
      
      inline def setGlobalSignaturePolicyUndefined: Self = StObject.set(x, "globalSignaturePolicy", js.undefined)
      
      inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
      
      inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
      
      inline def setMessageProcessingConcurrency(value: Double): Self = StObject.set(x, "messageProcessingConcurrency", value.asInstanceOf[js.Any])
      
      inline def setMessageProcessingConcurrencyUndefined: Self = StObject.set(x, "messageProcessingConcurrency", js.undefined)
      
      inline def setMulticodecs(value: js.Array[String]): Self = StObject.set(x, "multicodecs", value.asInstanceOf[js.Any])
      
      inline def setMulticodecsUndefined: Self = StObject.set(x, "multicodecs", js.undefined)
      
      inline def setMulticodecsVarargs(value: String*): Self = StObject.set(x, "multicodecs", js.Array(value*))
    }
  }
  
  trait PubSubRPC extends StObject {
    
    var messages: js.Array[PubSubRPCMessage]
    
    var subscriptions: js.Array[PubSubRPCSubscription]
  }
  object PubSubRPC {
    
    inline def apply(messages: js.Array[PubSubRPCMessage], subscriptions: js.Array[PubSubRPCSubscription]): PubSubRPC = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[PubSubRPC]
    }
    
    extension [Self <: PubSubRPC](x: Self) {
      
      inline def setMessages(value: js.Array[PubSubRPCMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: PubSubRPCMessage*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setSubscriptions(value: js.Array[PubSubRPCSubscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionsVarargs(value: PubSubRPCSubscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
    }
  }
  
  trait PubSubRPCMessage extends StObject {
    
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var from: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var key: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var sequenceNumber: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var signature: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var topic: js.UndefOr[String] = js.undefined
  }
  object PubSubRPCMessage {
    
    inline def apply(): PubSubRPCMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PubSubRPCMessage]
    }
    
    extension [Self <: PubSubRPCMessage](x: Self) {
      
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
  
  trait PubSubRPCSubscription extends StObject {
    
    var subscribe: js.UndefOr[Boolean] = js.undefined
    
    var topic: js.UndefOr[String] = js.undefined
  }
  object PubSubRPCSubscription {
    
    inline def apply(): PubSubRPCSubscription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PubSubRPCSubscription]
    }
    
    extension [Self <: PubSubRPCSubscription](x: Self) {
      
      inline def setSubscribe(value: Boolean): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  trait PublishResult extends StObject {
    
    var recipients: js.Array[PeerId]
  }
  object PublishResult {
    
    inline def apply(recipients: js.Array[PeerId]): PublishResult = {
      val __obj = js.Dynamic.literal(recipients = recipients.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishResult]
    }
    
    extension [Self <: PublishResult](x: Self) {
      
      inline def setRecipients(value: js.Array[PeerId]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      inline def setRecipientsVarargs(value: PeerId*): Self = StObject.set(x, "recipients", js.Array(value*))
    }
  }
  
  type SignaturePolicy = /* "StrictSign" */ String
  
  trait SignedMessage
    extends StObject
       with Message {
    
    var data: js.typedarray.Uint8Array
    
    var from: PeerId
    
    var key: js.typedarray.Uint8Array
    
    var sequenceNumber: js.BigInt
    
    var signature: js.typedarray.Uint8Array
    
    var topic: String
    
    var `type`: signed
  }
  object SignedMessage {
    
    inline def apply(
      data: js.typedarray.Uint8Array,
      from: PeerId,
      key: js.typedarray.Uint8Array,
      sequenceNumber: js.BigInt,
      signature: js.typedarray.Uint8Array,
      topic: String
    ): SignedMessage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("signed")
      __obj.asInstanceOf[SignedMessage]
    }
    
    extension [Self <: SignedMessage](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: PeerId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumber(value: js.BigInt): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setType(value: signed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Subscription extends StObject {
    
    var subscribe: Boolean
    
    var topic: String
  }
  object Subscription {
    
    inline def apply(subscribe: Boolean, topic: String): Subscription = {
      val __obj = js.Dynamic.literal(subscribe = subscribe.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setSubscribe(value: Boolean): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscriptionChangeData extends StObject {
    
    var peerId: PeerId
    
    var subscriptions: js.Array[Subscription]
  }
  object SubscriptionChangeData {
    
    inline def apply(peerId: PeerId, subscriptions: js.Array[Subscription]): SubscriptionChangeData = {
      val __obj = js.Dynamic.literal(peerId = peerId.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionChangeData]
    }
    
    extension [Self <: SubscriptionChangeData](x: Self) {
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setSubscriptions(value: js.Array[Subscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
    }
  }
  
  trait UnsignedMessage
    extends StObject
       with Message {
    
    var data: js.typedarray.Uint8Array
    
    var topic: String
    
    var `type`: unsigned
  }
  object UnsignedMessage {
    
    inline def apply(data: js.typedarray.Uint8Array, topic: String): UnsignedMessage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unsigned")
      __obj.asInstanceOf[UnsignedMessage]
    }
    
    extension [Self <: UnsignedMessage](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setType(value: unsigned): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
