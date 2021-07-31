package typings.libp2pGossipsub

import typings.debug.mod.Debugger
import typings.libp2pGossipsub.anon.PartialGossipInputOptions
import typings.libp2pGossipsub.anon.PartialPeerScoreParams
import typings.libp2pGossipsub.anon.PartialPeerScoreThreshold
import typings.libp2pGossipsub.heartbeatMod.Heartbeat
import typings.libp2pGossipsub.interfacesMod.AddrInfo
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
import typings.libp2pGossipsub.peerScoreParamsMod.PeerScoreParams
import typings.libp2pGossipsub.peerScoreThresholdsMod.PeerScoreThresholds
import typings.libp2pGossipsub.scoreMod.PeerScore
import typings.libp2pGossipsub.tracerMod.IWantTracer
import typings.libp2pInterfaces.pubsubMod.InMessage
import typings.node.NodeJS.Timeout
import typings.std.Map
import typings.std.Set
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("libp2p-gossipsub", JSImport.Namespace)
  @js.native
  class ^ protected () extends Gossipsub {
    /**
      * @param {Libp2p} libp2p
      * @param {Object} [options]
      * @param {bool} [options.emitSelf] if publish should emit to self, if subscribed, defaults to false
      * @param {bool} [options.gossipIncoming] if incoming messages on a subscribed topic should be automatically gossiped, defaults to true
      * @param {bool} [options.fallbackToFloodsub] if dial should fallback to floodsub, defaults to true
      * @param {bool} [options.floodPublish] if self-published messages should be sent to all peers, defaults to true
      * @param {bool} [options.doPX] whether PX is enabled; this should be enabled in bootstrappers and other well connected/trusted nodes. defaults to false
      * @param {Object} [options.messageCache] override the default MessageCache
      * @param {string} [options.globalSignaturePolicy] signing policy to apply across all messages (default: "StrictSign")
      * @param {Object} [options.scoreParams] peer score parameters
      * @param {Object} [options.scoreThresholds] peer score thresholds
      * @param {AddrInfo[]} [options.directPeers] peers with which we will maintain direct connections
      * @constructor
      */
    def this(libp2p: Libp2p) = this()
    def this(libp2p: Libp2p, options: PartialGossipInputOptions) = this()
  }
  @JSImport("libp2p-gossipsub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("libp2p-gossipsub", "multicodec")
  @js.native
  def multicodec: String = js.native
  @scala.inline
  def multicodec_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multicodec")(x.asInstanceOf[js.Any])
  
  trait GossipInputOptions extends StObject {
    
    /**
      * D sets the optimal degree for a Gossipsub topic mesh.
      */
    var D: Double
    
    /**
      * Dhi sets the upper bound on the number of peers we keep in a Gossipsub topic mesh.
      */
    var Dhi: Double
    
    /**
      * Dlazy affects how many peers we will emit gossip to at each heartbeat.
      */
    var Dlazy: Double
    
    /**
      * Dlo sets the lower bound on the number of peers we keep in a Gossipsub topic mesh.
      */
    var Dlo: Double
    
    /**
      * Dout sets the quota for the number of outbound connections to maintain in a topic mesh.
      */
    var Dout: Double
    
    /**
      * Dscore affects how peers are selected when pruning a mesh due to over subscription.
      */
    var Dscore: Double
    
    var directPeers: js.Array[AddrInfo]
    
    var doPX: Boolean
    
    var emitSelf: Boolean
    
    var fallbackToFloodsub: Boolean
    
    var floodPublish: Boolean
    
    var globalSignaturePolicy: String
    
    var gossipIncoming: Boolean
    
    var messageCache: MessageCache
    
    def msgIdFn(msg: InMessage): Uint8Array
    @JSName("msgIdFn")
    var msgIdFn_Original: MessageIdFunction
    
    var scoreParams: PartialPeerScoreParams
    
    var scoreThresholds: PartialPeerScoreThreshold
  }
  object GossipInputOptions {
    
    @scala.inline
    def apply(
      D: Double,
      Dhi: Double,
      Dlazy: Double,
      Dlo: Double,
      Dout: Double,
      Dscore: Double,
      directPeers: js.Array[AddrInfo],
      doPX: Boolean,
      emitSelf: Boolean,
      fallbackToFloodsub: Boolean,
      floodPublish: Boolean,
      globalSignaturePolicy: String,
      gossipIncoming: Boolean,
      messageCache: MessageCache,
      msgIdFn: /* msg */ InMessage => Uint8Array,
      scoreParams: PartialPeerScoreParams,
      scoreThresholds: PartialPeerScoreThreshold
    ): GossipInputOptions = {
      val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], Dhi = Dhi.asInstanceOf[js.Any], Dlazy = Dlazy.asInstanceOf[js.Any], Dlo = Dlo.asInstanceOf[js.Any], Dout = Dout.asInstanceOf[js.Any], Dscore = Dscore.asInstanceOf[js.Any], directPeers = directPeers.asInstanceOf[js.Any], doPX = doPX.asInstanceOf[js.Any], emitSelf = emitSelf.asInstanceOf[js.Any], fallbackToFloodsub = fallbackToFloodsub.asInstanceOf[js.Any], floodPublish = floodPublish.asInstanceOf[js.Any], globalSignaturePolicy = globalSignaturePolicy.asInstanceOf[js.Any], gossipIncoming = gossipIncoming.asInstanceOf[js.Any], messageCache = messageCache.asInstanceOf[js.Any], msgIdFn = js.Any.fromFunction1(msgIdFn), scoreParams = scoreParams.asInstanceOf[js.Any], scoreThresholds = scoreThresholds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GossipInputOptions]
    }
    
    @scala.inline
    implicit class GossipInputOptionsMutableBuilder[Self <: GossipInputOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhi(value: Double): Self = StObject.set(x, "Dhi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectPeers(value: js.Array[AddrInfo]): Self = StObject.set(x, "directPeers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectPeersVarargs(value: AddrInfo*): Self = StObject.set(x, "directPeers", js.Array(value :_*))
      
      @scala.inline
      def setDlazy(value: Double): Self = StObject.set(x, "Dlazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDlo(value: Double): Self = StObject.set(x, "Dlo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoPX(value: Boolean): Self = StObject.set(x, "doPX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDout(value: Double): Self = StObject.set(x, "Dout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDscore(value: Double): Self = StObject.set(x, "Dscore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitSelf(value: Boolean): Self = StObject.set(x, "emitSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackToFloodsub(value: Boolean): Self = StObject.set(x, "fallbackToFloodsub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodPublish(value: Boolean): Self = StObject.set(x, "floodPublish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSignaturePolicy(value: String): Self = StObject.set(x, "globalSignaturePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGossipIncoming(value: Boolean): Self = StObject.set(x, "gossipIncoming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageCache(value: MessageCache): Self = StObject.set(x, "messageCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsgIdFn(value: /* msg */ InMessage => Uint8Array): Self = StObject.set(x, "msgIdFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScoreParams(value: PartialPeerScoreParams): Self = StObject.set(x, "scoreParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScoreThresholds(value: PartialPeerScoreThreshold): Self = StObject.set(x, "scoreThresholds", value.asInstanceOf[js.Any])
    }
  }
  
  trait GossipOptions
    extends StObject
       with GossipInputOptions {
    
    @JSName("scoreParams")
    var scoreParams_GossipOptions: PeerScoreParams
    
    @JSName("scoreThresholds")
    var scoreThresholds_GossipOptions: PeerScoreThresholds
  }
  object GossipOptions {
    
    @scala.inline
    def apply(
      D: Double,
      Dhi: Double,
      Dlazy: Double,
      Dlo: Double,
      Dout: Double,
      Dscore: Double,
      directPeers: js.Array[AddrInfo],
      doPX: Boolean,
      emitSelf: Boolean,
      fallbackToFloodsub: Boolean,
      floodPublish: Boolean,
      globalSignaturePolicy: String,
      gossipIncoming: Boolean,
      messageCache: MessageCache,
      msgIdFn: /* msg */ InMessage => Uint8Array,
      scoreParams: PeerScoreParams,
      scoreThresholds: PeerScoreThresholds
    ): GossipOptions = {
      val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], Dhi = Dhi.asInstanceOf[js.Any], Dlazy = Dlazy.asInstanceOf[js.Any], Dlo = Dlo.asInstanceOf[js.Any], Dout = Dout.asInstanceOf[js.Any], Dscore = Dscore.asInstanceOf[js.Any], directPeers = directPeers.asInstanceOf[js.Any], doPX = doPX.asInstanceOf[js.Any], emitSelf = emitSelf.asInstanceOf[js.Any], fallbackToFloodsub = fallbackToFloodsub.asInstanceOf[js.Any], floodPublish = floodPublish.asInstanceOf[js.Any], globalSignaturePolicy = globalSignaturePolicy.asInstanceOf[js.Any], gossipIncoming = gossipIncoming.asInstanceOf[js.Any], messageCache = messageCache.asInstanceOf[js.Any], msgIdFn = js.Any.fromFunction1(msgIdFn), scoreParams = scoreParams.asInstanceOf[js.Any], scoreThresholds = scoreThresholds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GossipOptions]
    }
    
    @scala.inline
    implicit class GossipOptionsMutableBuilder[Self <: GossipOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScoreParams(value: PeerScoreParams): Self = StObject.set(x, "scoreParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScoreThresholds(value: PeerScoreThresholds): Self = StObject.set(x, "scoreThresholds", value.asInstanceOf[js.Any])
    }
  }
  
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
}
