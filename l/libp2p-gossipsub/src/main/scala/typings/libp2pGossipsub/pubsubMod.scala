package typings.libp2pGossipsub

import org.scalablytyped.runtime.StringDictionary
import typings.libp2pGossipsub.anon.DebugName
import typings.libp2pGossipsub.anon.EmitSelf
import typings.std.Map
import typings.std.Set
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pubsubMod {
  
  @JSImport("libp2p-gossipsub/src/pubsub", JSImport.Namespace)
  @js.native
  class ^ protected () extends BasicPubSub {
    /**
      * @param {Object} props
      * @param {String} props.debugName log namespace
      * @param {string[]} props.multicodecs protocol identifiers to connect
      * @param {PeerId} props.peerId peer's peerId
      * @param {Object} props.registrar registrar for libp2p protocols
      * @param {function} props.registrar.handle
      * @param {function} props.registrar.register
      * @param {function} props.registrar.unregister
      * @param {Object} [props.options]
      * @param {boolean} [props.options.emitSelf] if publish should emit to self, if subscribed, defaults to false
      * @constructor
      */
    def this(hasDebugNameMulticodecsPeerIdRegistrarOptions: DebugName) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait BasicPubSub
    extends /* x */ StringDictionary[js.Any] {
    
    /**
      * Decode a Uint8Array into an RPC object
      *
      * Override to use an extended protocol-specific protobuf decoder
      *
      * @param {Uint8Array} buf
      * @returns {RPC}
      */
    def _decodeRpc(buf: Uint8Array): js.Any = js.native
    
    def _emitMessage(topics: js.Any, message: js.Any): Unit = js.native
    
    def _emitMessages(topics: js.Any, messages: js.Any): Unit = js.native
    
    /**
      * Peer connected successfully with pubsub protocol.
      * @override
      * @param {PeerId} peerId peer id
      * @param {Connection} conn connection to the peer
      * @returns {Promise<void>}
      */
    def _onPeerConnected(peerId: typings.peerId.mod.^, conn: js.Any): js.Promise[Unit] = js.native
    
    /**
      * Pubsub options
      */
    var _options: EmitSelf = js.native
    
    /**
      * Overriding the implementation of _processConnection should keep the connection and is
      * responsible for processing each RPC message received by other peers.
      * @override
      * @param {string} idB58Str peer id string in base58
      * @param {Connection} conn connection
      * @param {Peer} peer PubSub peer
      * @returns {void}
      *
      */
    def _processMessages(idB58Str: String, conn: js.Any, peer: js.Any): Unit = js.native
    
    /**
      * Handles an rpc request from a peer
      *
      * @param {String} idB58Str
      * @param {Peer} peer
      * @param {RPC} rpc
      * @returns {void}
      */
    def _processRpc(idB58Str: String, peer: js.Any, rpc: js.Any): Unit = js.native
    
    /**
      * Handles an message from a peer
      *
      * @param {Peer} peer
      * @param {RPC.Message} msg
      */
    def _processRpcMessage(peer: js.Any, msg: js.Any): Unit = js.native
    
    /**
      * Handles an subscription change from a peer
      *
      * @param {Peer} peer
      * @param {RPC.SubOpt} subOpt
      */
    def _processRpcSubOpt(peer: js.Any, subOpt: js.Any): Unit = js.native
    
    /**
      * Coerces topic validator result to determine message validity
      *
      * Defaults to true if truthy
      *
      * Override this method to provide custom topic validator result processing (eg: scoring)
      *
      * @param {String} topic
      * @param {Peer} peer
      * @param {RPC.Message} message
      * @param {unknown} result
      * @returns {Boolean}
      */
    def _processTopicValidatorResult(topic: String, peer: js.Any, message: js.Any, result: js.Any): Boolean = js.native
    
    /**
      * Publish messages
      *
      * Note: this function assumes all messages are well-formed RPC objects
      * @param {Array<Message>} msgs
      * @returns {void}
      */
    def _publish(msgs: js.Array[_]): Unit = js.native
    
    /**
      * Subscribes to topics
      *
      * @param {Array<string>} topics
      * @returns {void}
      */
    def _subscribe(topics: js.Array[String]): Unit = js.native
    
    /**
      * Unsubscribes to topics
      *
      * @param {Array<string>} topics
      * @returns {void}
      */
    def _unsubscribe(topics: js.Array[String]): Unit = js.native
    
    /**
      * The default msgID implementation
      * @param {RPC.Message} msg the message object
      * @returns {string} message id as string
      */
    def defaultMsgIdFn(msg: js.Any): String = js.native
    
    /**
      * Child class can override this.
      * @param {RPC.Message} msg the message object
      * @returns {string} message id as string
      */
    def getMsgId(msg: js.Any): String = js.native
    
    /**
      * Get the list of topics which the peer is subscribed to.
      * @override
      * @returns {Array<String>}
      */
    def getTopics(): js.Array[String] = js.native
    
    def publish(topics: String, messages: js.Any): Unit = js.native
    def publish(topics: String, messages: js.Array[_]): Unit = js.native
    def publish(topics: js.Array[String], messages: js.Any): Unit = js.native
    /**
      * Publishes messages to all subscribed peers
      * @override
      * @param {Array<string>|string} topics
      * @param {Array<any>|any} messages
      * @returns {void}
      */
    def publish(topics: js.Array[String], messages: js.Array[_]): Unit = js.native
    
    /**
      * Unmounts the protocol and shuts down every connection
      * @override
      * @returns {void}
      */
    def stop(): Unit = js.native
    
    def subscribe(topics: String): Unit = js.native
    /**
      * Subscribes to topics
      * @override
      * @param {Array<string>|string} topics
      * @returns {void}
      */
    def subscribe(topics: js.Array[String]): Unit = js.native
    
    /**
      * A set of subscriptions
      */
    var subscriptions: Set[_] = js.native
    
    /**
      * Topic validator function
      * @typedef {function(string, Peer, RPC): boolean} validator
      */
    /**
      * Topic validator map
      *
      * Keyed by topic
      * Topic validators are functions with the following input:
      * @type {Map<string, validator>}
      */
    var topicValidators: Map[String, js.Function3[/* arg0 */ String, /* arg1 */ _, /* arg2 */ _, Boolean]] = js.native
    
    def unsubscribe(topics: String): Unit = js.native
    /**
      * Leaves a topic
      * @override
      * @param {Array<string>|string} topics
      * @returns {void}
      */
    def unsubscribe(topics: js.Array[String]): Unit = js.native
    
    /**
      * Validates the given message.
      * @param {RPC.Message} message
      * @param {Peer} [peer]
      * @returns {Promise<Boolean>}
      */
    def validate(message: js.Any): js.Promise[Boolean] = js.native
    def validate(message: js.Any, peer: js.Any): js.Promise[Boolean] = js.native
  }
}
