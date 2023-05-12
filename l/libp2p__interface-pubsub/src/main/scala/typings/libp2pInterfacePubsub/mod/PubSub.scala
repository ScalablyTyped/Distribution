package typings.libp2pInterfacePubsub.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubSub[Events /* <: Record[String, Any] */] extends EventEmitter[Events] {
  
  def getPeers(): js.Array[PeerId] = js.native
  
  /**
    * Gets a list of the PeerIds that are subscribed to one topic.
    *
    * @example
    *
    * ```js
    * const peerIds = libp2p.pubsub.getSubscribers(topic)
    * ```
    */
  def getSubscribers(topic: String): js.Array[PeerId] = js.native
  
  /**
    * Gets a list of topics the node is subscribed to.
    *
    * ```js
    * const topics = libp2p.pubsub.getTopics()
    * ```
    */
  def getTopics(): js.Array[String] = js.native
  
  /**
    * The global signature policy controls whether or not we sill send and receive
    * signed or unsigned messages.
    *
    * Signed messages prevent spoofing message senders and should be preferred to
    * using unsigned messages.
    */
  var globalSignaturePolicy: /* "StrictSign" */ String = js.native
  
  /**
    * A list of multicodecs that contain the pubsub protocol name.
    */
  var multicodecs: js.Array[String] = js.native
  
  /**
    * Publishes messages to the given topic.
    *
    * @example
    *
    * ```js
    * const topic = 'topic'
    * const data = uint8ArrayFromString('data')
    *
    * await libp2p.pubsub.publish(topic, data)
    * ```
    */
  def publish(topic: String, data: js.typedarray.Uint8Array): js.Promise[PublishResult] = js.native
  
  /**
    * Subscribes to a pubsub topic.
    *
    * @example
    *
    * ```js
    * const topic = 'topic'
    * const handler = (msg) => {
    *   if (msg.topic === topic) {
    *     // msg.data - pubsub data received
    *   }
    * }
    *
    * libp2p.pubsub.addEventListener('message', handler)
    * libp2p.pubsub.subscribe(topic)
    * ```
    */
  def subscribe(topic: String): Unit = js.native
  
  /**
    * Pubsub routers support message validators per topic, which will validate the message
    * before its propagations. They are stored in a map where keys are the topic name and
    * values are the validators.
    *
    * @example
    *
    * ```js
    * const topic = 'topic'
    * const validateMessage = (msgTopic, msg) => {
    *   const input = uint8ArrayToString(msg.data)
    *   const validInputs = ['a', 'b', 'c']
    *
    *   if (!validInputs.includes(input)) {
    *     throw new Error('no valid input received')
    *   }
    * }
    * libp2p.pubsub.topicValidators.set(topic, validateMessage)
    * ```
    */
  var topicValidators: Map[String, TopicValidatorFn] = js.native
  
  /**
    * Unsubscribes from a pubsub topic.
    *
    * @example
    *
    * ```js
    * const topic = 'topic'
    * const handler = (msg) => {
    *   // msg.data - pubsub data received
    * }
    *
    * libp2p.pubsub.removeEventListener(topic handler)
    * libp2p.pubsub.unsubscribe(topic)
    * ```
    */
  def unsubscribe(topic: String): Unit = js.native
}
