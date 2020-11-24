package typings.libp2pGossipsub.mod

import typings.debug.mod.Debugger
import typings.libp2pGossipsub.heartbeatMod.Heartbeat
import typings.libp2pGossipsub.interfacesMod.Libp2p
import typings.libp2pGossipsub.interfacesMod.MessageIdFunction
import typings.libp2pGossipsub.messageCacheMod.MessageCache
import typings.libp2pGossipsub.messageMod.ControlGraft
import typings.libp2pGossipsub.messageMod.ControlIHave
import typings.libp2pGossipsub.messageMod.ControlIWant
import typings.libp2pGossipsub.messageMod.ControlMessage
import typings.libp2pGossipsub.messageMod.ControlPrune
import typings.libp2pGossipsub.messageMod.Message
import typings.libp2pGossipsub.messageMod.PeerInfo
import typings.libp2pGossipsub.messageMod.RPC
import typings.libp2pGossipsub.scoreMod.PeerScore
import typings.libp2pGossipsub.tracerMod.IWantTracer
import typings.libp2pInterfaces.pubsubMod.InMessage
import typings.node.NodeJS.Timeout
import typings.std.Map
import typings.std.Set
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gossipsub
  extends typings.libp2pInterfaces.pubsubMod.^ {
  
  /**
    * Add standard backoff log for a peer in a topic
    * @param {string} id
    * @param {string} topic
    * @returns {void}
    */
  def _addBackoff(id: String, topic: String): Unit = js.native
  
  /**
    * Apply penalties from broken IHAVE/IWANT promises
    * @returns {void}
    */
  def _applyIwantPenalties(): Unit = js.native
  
  /**
    * Clear expired backoff expiries
    * @returns {void}
    */
  def _clearBackoff(): Unit = js.native
  
  /**
    * Connect to a peer using the gossipsub protocol
    * @param {string} id
    * @returns {void}
    */
  def _connect(id: String): Unit = js.native
  
  /**
    * Maybe reconnect to direct peers
    * @returns {void}
    */
  def _directConnect(): Unit = js.native
  
  var _directPeerInitial: Timeout = js.native
  
  /**
    * Add backoff expiry interval for a peer in a topic
    * @param {string} id
    * @param {string} topic
    * @param {number} interval backoff duration in milliseconds
    * @returns {void}
    */
  def _doAddBackoff(id: String, topic: String, interval: Double): Unit = js.native
  
  /**
    * Emits gossip to peers in a particular topic
    * @param {string} topic
    * @param {Set<string>} exclude peers to exclude
    * @returns {void}
    */
  def _emitGossip(topic: String, exclude: Set[String]): Unit = js.native
  
  /**
    * Encode an RPC object into a Uint8Array
    * Overrided to use an extended protocol-specific protobuf encoder
    * @override
    * @param {RPC} rpc
    * @returns {Uint8Array}
    */
  def _encodeRpc(rpc: RPC): Uint8Array = js.native
  
  /**
    * Flush gossip and control messages
    */
  def _flush(): Unit = js.native
  
  /**
    * Handles Graft messages
    * @param {string} id peer id
    * @param {Array<ControlGraft>} graft
    * @return {Array<ControlPrune>}
    */
  def _handleGraft(id: String, graft: js.Array[ControlGraft]): js.Array[ControlPrune] = js.native
  
  /**
    * Handles IHAVE messages
    * @param {string} id peer id
    * @param {Array<ControlIHave>} ihave
    * @returns {ControlIWant}
    */
  def _handleIHave(id: String, ihave: js.Array[ControlIHave]): js.Array[ControlIWant] = js.native
  
  /**
    * Handles IWANT messages
    * Returns messages to send back to peer
    * @param {string} id peer id
    * @param {Array<ControlIWant>} iwant
    * @returns {Array<Message>}
    */
  def _handleIWant(id: String, iwant: js.Array[ControlIWant]): js.Array[Message] = js.native
  
  /**
    * Handles Prune messages
    * @param {string} id peer id
    * @param {Array<ControlPrune>} prune
    * @returns {void}
    */
  def _handlePrune(id: String, prune: js.Array[ControlPrune]): Unit = js.native
  
  @JSName("_libp2p")
  var _libp2p_Gossipsub: Libp2p = js.native
  
  /**
    * Make a PRUNE control message for a peer in a topic
    * @param {string} id
    * @param {string} topic
    * @param {boolean} doPX
    * @returns {ControlPrune}
    */
  def _makePrune(id: String, topic: String, doPX: Boolean): ControlPrune = js.native
  
  def _msgIdFn(msg: InMessage): Uint8Array = js.native
  @JSName("_msgIdFn")
  var _msgIdFn_Original: MessageIdFunction = js.native
  
  /**
    * Returns the current time in milliseconds
    * @returns {number}
    */
  def _now(): Double = js.native
  
  var _options: GossipOptions = js.native
  
  def _piggybackControl(id: String, outRpc: RPC, ctrl: ControlMessage): Unit = js.native
  
  def _piggybackGossip(id: String, outRpc: RPC, ihave: js.Array[ControlIHave]): Unit = js.native
  
  /**
    * Handles an rpc request from a peer
    *
    * @override
    * @param {String} idB58Str
    * @param {PeerStreams} peerStreams
    * @param {RPC} rpc
    * @returns {boolean}
    */
  def _processRpc(id: String, peerStreams: typings.libp2pInterfaces.peerStreamsMod.^, rpc: RPC): Boolean = js.native
  
  /**
    * Handles an rpc control message from a peer
    * @param {string} id peer id
    * @param {ControlMessage} controlMsg
    * @returns {void}
    */
  def _processRpcControlMessage(id: String, controlMsg: ControlMessage): Unit = js.native
  
  /**
    * Adds new IHAVE messages to pending gossip
    * @param {PeerStreams} peerStreams
    * @param {Array<ControlIHave>} controlIHaveMsgs
    * @returns {void}
    */
  def _pushGossip(id: String, controlIHaveMsgs: ControlIHave): Unit = js.native
  
  /**
    * Maybe attempt connection given signed peer records
    * @param {PeerInfo[]} peers
    * @returns {Promise<void>}
    */
  def _pxConnect(peers: js.Array[PeerInfo]): js.Promise[Unit] = js.native
  
  /**
    * Sends a GRAFT message to a peer
    * @param {string} id peer id
    * @param {string} topic
    * @returns {void}
    */
  def _sendGraft(id: String, topic: String): Unit = js.native
  
  /**
    * Send graft and prune messages
    * @param {Map<string, Array<string>>} tograft peer id => topic[]
    * @param {Map<string, Array<string>>} toprune peer id => topic[]
    */
  def _sendGraftPrune(
    tograft: Map[String, js.Array[String]],
    toprune: Map[String, js.Array[String]],
    noPX: Map[String, Boolean]
  ): Unit = js.native
  
  /**
    * Sends a PRUNE message to a peer
    * @param {string} id peer id
    * @param {string} topic
    * @returns {void}
    */
  def _sendPrune(id: String, topic: String): Unit = js.native
  
  /**
    * @override
    */
  def _sendRpc(id: String, outRpc: RPC): Unit = js.native
  
  var backoff: Map[String, Map[String, Double]] = js.native
  
  var control: Map[String, ControlMessage] = js.native
  
  def defaultMsgIdFn(msg: InMessage): Uint8Array = js.native
  @JSName("defaultMsgIdFn")
  var defaultMsgIdFn_Original: MessageIdFunction = js.native
  
  var direct: Set[String] = js.native
  
  def emit(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
  
  var fanout: Map[String, Set[String]] = js.native
  
  var gossip: Map[String, js.Array[ControlIHave]] = js.native
  
  var gossipTracer: IWantTracer = js.native
  
  var heartbeat: Heartbeat = js.native
  
  var heartbeatTicks: Double = js.native
  
  var iasked: Map[String, Double] = js.native
  
  /**
    * Join topic
    * @param {string} topic
    * @returns {void}
    */
  def join(topic: String): Unit = js.native
  
  var lastpub: Map[String, Double] = js.native
  
  /**
    * Leave topic
    * @param {string} topic
    * @returns {void}
    */
  def leave(topic: String): Unit = js.native
  
  @JSName("log")
  def log_MGossipsub(formatter: js.Any, args: js.Any*): Unit = js.native
  @JSName("log")
  var log_Original: Debugger = js.native
  
  var mesh: Map[String, Set[String]] = js.native
  
  var messageCache: MessageCache = js.native
  
  var outbound: Map[String, Boolean] = js.native
  
  @JSName("peerId")
  var peerId_Gossipsub: typings.peerId.mod.^ = js.native
  
  var peerhave: Map[String, Double] = js.native
  
  var score: PeerScore = js.native
  
  var seenCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TimeCache */ js.Any = js.native
}
