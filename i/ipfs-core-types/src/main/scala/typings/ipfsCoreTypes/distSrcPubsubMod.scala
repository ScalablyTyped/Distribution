package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePubsub.mod.Message
import typings.libp2pInterfaces.distSrcEventsMod.EventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPubsubMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    /**
      * Returns the list of subscriptions the peer is subscribed to
      */
    def ls(): js.Promise[js.Array[String]] = js.native
    def ls(options: AbortOptions & OptionExtension): js.Promise[js.Array[String]] = js.native
    
    /**
      * Returns the peers that are subscribed to one topic.
      *
      * @example
      * ```js
      * const topic = 'fruit-of-the-day'
      *
      * const peerIds = await ipfs.pubsub.peers(topic)
      * console.log(peerIds)
      * ```
      */
    def peers(topic: String): js.Promise[js.Array[PeerId]] = js.native
    def peers(topic: String, options: AbortOptions & OptionExtension): js.Promise[js.Array[PeerId]] = js.native
    
    /**
      * Publish a data message to a pubsub topic
      *
      * @example
      * ```js
      * const topic = 'fruit-of-the-day'
      * const msg = new TextEncoder().encode('banana')
      *
      * await ipfs.pubsub.publish(topic, msg)
      * // msg was broadcasted
      * console.log(`published to ${topic}`)
      * ```
      */
    def publish(topic: String, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def publish(topic: String, data: js.typedarray.Uint8Array, options: AbortOptions & OptionExtension): js.Promise[Unit] = js.native
    
    var setMaxListeners: js.UndefOr[js.Function1[/* max */ Double, Unit]] = js.native
    
    /**
      * Subscribe to a pubsub topic
      *
      * @example
      * ```js
      * const topic = 'fruit-of-the-day'
      * const receiveMsg = (msg) => console.log(msg.data.toString())
      *
      * await ipfs.pubsub.subscribe(topic, receiveMsg)
      * console.log(`subscribed to ${topic}`)
      * ```
      */
    def subscribe(topic: String, handler: EventHandler[Message]): js.Promise[Unit] = js.native
    def subscribe(topic: String, handler: EventHandler[Message], options: SubscribeOptions & OptionExtension): js.Promise[Unit] = js.native
    
    /**
      * Unsubscribes from a pubsub topic
      *
      * @example
      * ```js
      * const topic = 'fruit-of-the-day'
      * const receiveMsg = (msg) => console.log(msg.toString())
      *
      * await ipfs.pubsub.subscribe(topic, receiveMsg)
      * console.log(`subscribed to ${topic}`)
      *
      * await ipfs.pubsub.unsubscribe(topic, receiveMsg)
      * console.log(`unsubscribed from ${topic}`)
      *
      * // Or removing all listeners:
      *
      * const topic = 'fruit-of-the-day'
      * const receiveMsg = (msg) => console.log(msg.toString())
      * await ipfs.pubsub.subscribe(topic, receiveMsg);
      * // Will unsubscribe ALL handlers for the given topic
      * await ipfs.pubsub.unsubscribe(topic);
      * ```
      */
    def unsubscribe(topic: String): js.Promise[Unit] = js.native
    def unsubscribe(topic: String, handler: Unit, options: AbortOptions & OptionExtension): js.Promise[Unit] = js.native
    def unsubscribe(topic: String, handler: EventHandler[Message]): js.Promise[Unit] = js.native
    def unsubscribe(topic: String, handler: EventHandler[Message], options: AbortOptions & OptionExtension): js.Promise[Unit] = js.native
  }
  
  trait SubscribeOptions
    extends StObject
       with AbortOptions {
    
    /**
      * A callback to receive an error if one occurs during processing
      * subscription messages. Only supported by ipfs-http-client.
      */
    var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  }
  object SubscribeOptions {
    
    inline def apply(): SubscribeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
      
      inline def setOnError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    }
  }
}
