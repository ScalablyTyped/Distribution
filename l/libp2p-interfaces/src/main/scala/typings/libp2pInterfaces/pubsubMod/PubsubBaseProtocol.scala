package typings.libp2pInterfaces.pubsubMod

import typings.libp2pInterfaces.anon.Connection
import typings.node.Buffer
import typings.std.Error
import typings.std.Map
import typings.std.Set
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @typedef {Object} InMessage
  * @property {string} [from]
  * @property {string} receivedFrom
  * @property {string[]} topicIDs
  * @property {Uint8Array} [seqno]
  * @property {Uint8Array} data
  * @property {Uint8Array} [signature]
  * @property {Uint8Array} [key]
  *
  * @typedef PeerId
  * @type import('peer-id')
  */
/**
* PubsubBaseProtocol handles the peers and connections logic for pubsub routers
* and specifies the API that pubsub routers should have.
*/
@js.native
trait PubsubBaseProtocol extends js.Object {
  
  /**
    * Whether to accept a message from a peer
    * Override to create a graylist
    * @override
    * @param {string} id
    * @returns {boolean}
    */
  def _acceptFrom(id: String): Boolean = js.native
  
  /**
    * Notifies the router that a peer has been connected
    * @private
    * @param {PeerId} peerId
    * @param {string} protocol
    * @returns {PeerStreams}
    */
  def _addPeer(peerId: typings.peerId.mod.^, protocol: String): typings.libp2pInterfaces.peerStreamsMod.^ = js.native
  
  /**
    * Normalizes the message and signs it, if signing is enabled.
    * Should be used by the routers to create the message to send.
    * @private
    * @param {Message} message
    * @returns {Promise<Message>}
    */
  def _buildMessage(message: js.Any): js.Promise[_] = js.native
  
  /**
    * Decode Uint8Array into an RPC object.
    * This can be override to use a custom router protobuf.
    * @param {Uint8Array} bytes
    * @returns {RPC}
    */
  def _decodeRpc(bytes: Uint8Array): js.Any = js.native
  
  /**
    * Emit a message from a peer
    * @param {InMessage} message
    */
  def _emitMessage(message: InMessage): Unit = js.native
  
  /**
    * Encode RPC object into a Uint8Array.
    * This can be override to use a custom router protobuf.
    * @param {RPC} rpc
    * @returns {Uint8Array}
    */
  def _encodeRpc(rpc: js.Any): Uint8Array = js.native
  
  var _libp2p: js.Any = js.native
  
  /**
    * On an inbound stream opened.
    * @private
    * @param {Object} props
    * @param {string} props.protocol
    * @param {DuplexIterableStream} props.stream
    * @param {Connection} props.connection connection
    */
  def _onIncomingStream(hasProtocolStreamConnection: Connection): Unit = js.native
  
  /**
    * Registrar notifies an established connection with pubsub protocol.
    * @private
    * @param {PeerId} peerId remote peer-id
    * @param {Connection} conn connection to the peer
    */
  def _onPeerConnected(peerId: typings.peerId.mod.^, conn: js.Any): js.Promise[Unit] = js.native
  
  /**
    * Registrar notifies a closing connection with pubsub protocol.
    * @private
    * @param {PeerId} peerId peerId
    * @param {Error} err error for connection end
    */
  def _onPeerDisconnected(peerId: typings.peerId.mod.^, err: Error): Unit = js.native
  
  /**
    * Responsible for processing each RPC message received by other peers.
    * @param {string} idB58Str peer id string in base58
    * @param {DuplexIterableStream} stream inbound stream
    * @param {PeerStreams} peerStreams PubSub peer
    * @returns {Promise<void>}
    */
  def _processMessages(idB58Str: String, stream: js.Any, peerStreams: typings.libp2pInterfaces.peerStreamsMod.^): js.Promise[Unit] = js.native
  
  /**
    * Handles an rpc request from a peer
    * @param {String} idB58Str
    * @param {PeerStreams} peerStreams
    * @param {RPC} rpc
    * @returns {boolean}
    */
  def _processRpc(idB58Str: String, peerStreams: typings.libp2pInterfaces.peerStreamsMod.^, rpc: js.Any): Boolean = js.native
  
  /**
    * Handles an message from a peer
    * @param {InMessage} msg
    * @returns {Promise<void>}
    */
  def _processRpcMessage(msg: InMessage): js.Promise[Unit] = js.native
  
  /**
    * Handles a subscription change from a peer
    * @param {string} id
    * @param {RPC.SubOpt} subOpt
    */
  def _processRpcSubOpt(id: String, subOpt: js.Any): Unit = js.native
  
  /**
    * Overriding the implementation of publish should handle the appropriate algorithms for the publish/subscriber implementation.
    * For example, a Floodsub implementation might simply publish each message to each topic for every peer
    * @abstract
    * @param {InMessage} message
    * @returns {Promise<void>}
    *
    */
  def _publish(message: InMessage): js.Promise[Unit] = js.native
  
  var _registrarId: js.Any = js.native
  
  /**
    * Notifies the router that a peer has been disconnected.
    * @private
    * @param {PeerId} peerId
    * @returns {PeerStreams | undefined}
    */
  def _removePeer(peerId: typings.peerId.mod.^): typings.libp2pInterfaces.peerStreamsMod.^ = js.native
  
  /**
    * Send an rpc object to a peer
    * @param {string} id peer id
    * @param {RPC} rpc
    * @returns {void}
    */
  def _sendRpc(id: String, rpc: js.Any): Unit = js.native
  
  /**
    * Send subscroptions to a peer
    * @param {string} id peer id
    * @param {string[]} topics
    * @param {boolean} subscribe set to false for unsubscriptions
    * @returns {void}
    */
  def _sendSubscriptions(id: String, topics: js.Array[String], subscribe: Boolean): Unit = js.native
  
  /**
    * If router can relay received messages, even if not subscribed
    * @type {boolean}
    */
  var canRelayMessage: Boolean = js.native
  
  /**
    * if publish should emit to self, if subscribed
    * @type {boolean}
    */
  var emitSelf: Boolean = js.native
  
  /**
    * The default msgID implementation
    * Child class can override this.
    * @param {RPC.Message} msg the message object
    * @returns {Uint8Array} message id as bytes
    */
  def getMsgId(msg: js.Any): Uint8Array = js.native
  
  /**
    * Get a list of the peer-ids that are subscribed to one topic.
    * @param {string} topic
    * @returns {Array<string>}
    */
  def getSubscribers(topic: String): js.Array[String] = js.native
  
  /**
    * Get the list of topics which the peer is subscribed to.
    * @override
    * @returns {Array<String>}
    */
  def getTopics(): js.Array[String] = js.native
  
  /**
    * The signature policy to follow by default
    *
    * @type {string}
    */
  var globalSignaturePolicy: String = js.native
  
  var log: js.Any = js.native
  
  /**
    * @type {Array<string>}
    */
  var multicodecs: js.Array[String] = js.native
  
  /**
    * @type {PeerId}
    */
  var peerId: PeerId = js.native
  
  /**
    * Map of peer streams
    *
    * @type {Map<string, import('./peer-streams')>}
    */
  var peers: Map[String, typings.libp2pInterfaces.peerStreamsMod.^] = js.native
  
  /**
    * Publishes messages to all subscribed peers
    * @override
    * @param {string} topic
    * @param {Buffer} message
    * @returns {Promise<void>}
    */
  def publish(topic: String, message: Buffer): js.Promise[Unit] = js.native
  
  var registrar: js.Any = js.native
  
  /**
    * Register the pubsub protocol onto the libp2p node.
    * @returns {void}
    */
  def start(): Unit = js.native
  
  var started: Boolean = js.native
  
  /**
    * Unregister the pubsub protocol and the streams with other peers will be closed.
    * @returns {void}
    */
  def stop(): Unit = js.native
  
  /**
    * Subscribes to a given topic.
    * @abstract
    * @param {string} topic
    * @returns {void}
    */
  def subscribe(topic: String): Unit = js.native
  
  /**
    * List of our subscriptions
    * @type {Set<string>}
    */
  var subscriptions: Set[String] = js.native
  
  /**
    * Topic validator function
    * @typedef {function(string, InMessage): Promise<void>} validator
    */
  /**
    * Topic validator map
    *
    * Keyed by topic
    * Topic validators are functions with the following input:
    * @type {Map<string, validator>}
    */
  var topicValidators: Map[String, validator] = js.native
  
  /**
    * Map of topics to which peers are subscribed to
    *
    * @type {Map<string, Set<string>>}
    */
  var topics: Map[String, Set[String]] = js.native
  
  /**
    * Unsubscribe from the given topic.
    * @override
    * @param {string} topic
    * @returns {void}
    */
  def unsubscribe(topic: String): Unit = js.native
  
  /**
    * Validates the given message. The signature will be checked for authenticity.
    * Throws an error on invalid messages
    * @param {InMessage} message
    * @returns {Promise<void>}
    */
  def validate(message: InMessage): js.Promise[Unit] = js.native
}
object PubsubBaseProtocol {
  
  @scala.inline
  def apply(
    _acceptFrom: String => Boolean,
    _addPeer: (typings.peerId.mod.^, String) => typings.libp2pInterfaces.peerStreamsMod.^,
    _buildMessage: js.Any => js.Promise[_],
    _decodeRpc: Uint8Array => js.Any,
    _emitMessage: InMessage => Unit,
    _encodeRpc: js.Any => Uint8Array,
    _libp2p: js.Any,
    _onIncomingStream: Connection => Unit,
    _onPeerConnected: (typings.peerId.mod.^, js.Any) => js.Promise[Unit],
    _onPeerDisconnected: (typings.peerId.mod.^, Error) => Unit,
    _processMessages: (String, js.Any, typings.libp2pInterfaces.peerStreamsMod.^) => js.Promise[Unit],
    _processRpc: (String, typings.libp2pInterfaces.peerStreamsMod.^, js.Any) => Boolean,
    _processRpcMessage: InMessage => js.Promise[Unit],
    _processRpcSubOpt: (String, js.Any) => Unit,
    _publish: InMessage => js.Promise[Unit],
    _registrarId: js.Any,
    _removePeer: typings.peerId.mod.^ => typings.libp2pInterfaces.peerStreamsMod.^,
    _sendRpc: (String, js.Any) => Unit,
    _sendSubscriptions: (String, js.Array[String], Boolean) => Unit,
    canRelayMessage: Boolean,
    emitSelf: Boolean,
    getMsgId: js.Any => Uint8Array,
    getSubscribers: String => js.Array[String],
    getTopics: () => js.Array[String],
    globalSignaturePolicy: String,
    log: js.Any,
    multicodecs: js.Array[String],
    peerId: PeerId,
    peers: Map[String, typings.libp2pInterfaces.peerStreamsMod.^],
    publish: (String, Buffer) => js.Promise[Unit],
    registrar: js.Any,
    start: () => Unit,
    started: Boolean,
    stop: () => Unit,
    subscribe: String => Unit,
    subscriptions: Set[String],
    topicValidators: Map[String, validator],
    topics: Map[String, Set[String]],
    unsubscribe: String => Unit,
    validate: InMessage => js.Promise[Unit]
  ): PubsubBaseProtocol = {
    val __obj = js.Dynamic.literal(_acceptFrom = js.Any.fromFunction1(_acceptFrom), _addPeer = js.Any.fromFunction2(_addPeer), _buildMessage = js.Any.fromFunction1(_buildMessage), _decodeRpc = js.Any.fromFunction1(_decodeRpc), _emitMessage = js.Any.fromFunction1(_emitMessage), _encodeRpc = js.Any.fromFunction1(_encodeRpc), _libp2p = _libp2p.asInstanceOf[js.Any], _onIncomingStream = js.Any.fromFunction1(_onIncomingStream), _onPeerConnected = js.Any.fromFunction2(_onPeerConnected), _onPeerDisconnected = js.Any.fromFunction2(_onPeerDisconnected), _processMessages = js.Any.fromFunction3(_processMessages), _processRpc = js.Any.fromFunction3(_processRpc), _processRpcMessage = js.Any.fromFunction1(_processRpcMessage), _processRpcSubOpt = js.Any.fromFunction2(_processRpcSubOpt), _publish = js.Any.fromFunction1(_publish), _registrarId = _registrarId.asInstanceOf[js.Any], _removePeer = js.Any.fromFunction1(_removePeer), _sendRpc = js.Any.fromFunction2(_sendRpc), _sendSubscriptions = js.Any.fromFunction3(_sendSubscriptions), canRelayMessage = canRelayMessage.asInstanceOf[js.Any], emitSelf = emitSelf.asInstanceOf[js.Any], getMsgId = js.Any.fromFunction1(getMsgId), getSubscribers = js.Any.fromFunction1(getSubscribers), getTopics = js.Any.fromFunction0(getTopics), globalSignaturePolicy = globalSignaturePolicy.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], multicodecs = multicodecs.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peers = peers.asInstanceOf[js.Any], publish = js.Any.fromFunction2(publish), registrar = registrar.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), started = started.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), subscribe = js.Any.fromFunction1(subscribe), subscriptions = subscriptions.asInstanceOf[js.Any], topicValidators = topicValidators.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction1(unsubscribe), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[PubsubBaseProtocol]
  }
  
  @scala.inline
  implicit class PubsubBaseProtocolOps[Self <: PubsubBaseProtocol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_acceptFrom(value: String => Boolean): Self = this.set("_acceptFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_addPeer(value: (typings.peerId.mod.^, String) => typings.libp2pInterfaces.peerStreamsMod.^): Self = this.set("_addPeer", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_buildMessage(value: js.Any => js.Promise[_]): Self = this.set("_buildMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_decodeRpc(value: Uint8Array => js.Any): Self = this.set("_decodeRpc", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_emitMessage(value: InMessage => Unit): Self = this.set("_emitMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_encodeRpc(value: js.Any => Uint8Array): Self = this.set("_encodeRpc", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_libp2p(value: js.Any): Self = this.set("_libp2p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onIncomingStream(value: Connection => Unit): Self = this.set("_onIncomingStream", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_onPeerConnected(value: (typings.peerId.mod.^, js.Any) => js.Promise[Unit]): Self = this.set("_onPeerConnected", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_onPeerDisconnected(value: (typings.peerId.mod.^, Error) => Unit): Self = this.set("_onPeerDisconnected", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_processMessages(value: (String, js.Any, typings.libp2pInterfaces.peerStreamsMod.^) => js.Promise[Unit]): Self = this.set("_processMessages", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_processRpc(value: (String, typings.libp2pInterfaces.peerStreamsMod.^, js.Any) => Boolean): Self = this.set("_processRpc", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_processRpcMessage(value: InMessage => js.Promise[Unit]): Self = this.set("_processRpcMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_processRpcSubOpt(value: (String, js.Any) => Unit): Self = this.set("_processRpcSubOpt", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_publish(value: InMessage => js.Promise[Unit]): Self = this.set("_publish", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_registrarId(value: js.Any): Self = this.set("_registrarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_removePeer(value: typings.peerId.mod.^ => typings.libp2pInterfaces.peerStreamsMod.^): Self = this.set("_removePeer", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_sendRpc(value: (String, js.Any) => Unit): Self = this.set("_sendRpc", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_sendSubscriptions(value: (String, js.Array[String], Boolean) => Unit): Self = this.set("_sendSubscriptions", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCanRelayMessage(value: Boolean): Self = this.set("canRelayMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitSelf(value: Boolean): Self = this.set("emitSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMsgId(value: js.Any => Uint8Array): Self = this.set("getMsgId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSubscribers(value: String => js.Array[String]): Self = this.set("getSubscribers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTopics(value: () => js.Array[String]): Self = this.set("getTopics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGlobalSignaturePolicy(value: String): Self = this.set("globalSignaturePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: js.Any): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMulticodecsVarargs(value: String*): Self = this.set("multicodecs", js.Array(value :_*))
    
    @scala.inline
    def setMulticodecs(value: js.Array[String]): Self = this.set("multicodecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerId(value: PeerId): Self = this.set("peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeers(value: Map[String, typings.libp2pInterfaces.peerStreamsMod.^]): Self = this.set("peers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublish(value: (String, Buffer) => js.Promise[Unit]): Self = this.set("publish", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegistrar(value: js.Any): Self = this.set("registrar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStarted(value: Boolean): Self = this.set("started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubscribe(value: String => Unit): Self = this.set("subscribe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubscriptions(value: Set[String]): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicValidators(value: Map[String, validator]): Self = this.set("topicValidators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopics(value: Map[String, Set[String]]): Self = this.set("topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribe(value: String => Unit): Self = this.set("unsubscribe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidate(value: InMessage => js.Promise[Unit]): Self = this.set("validate", js.Any.fromFunction1(value))
  }
}
