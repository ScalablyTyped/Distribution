package typings.ipfsBitswap

import typings.ipfsBitswap.anon.B100Only
import typings.ipfsBitswap.anon.DebuggererrorDebugger
import typings.ipfsBitswap.anon.Signal
import typings.ipfsBitswap.distSrcBitswapMod.Bitswap
import typings.ipfsBitswap.distSrcMessageMod.BitswapMessage
import typings.ipfsBitswap.distSrcStatsMod.Stats
import typings.libp2p.mod.Libp2p
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNetworkMod {
  
  @JSImport("ipfs-bitswap/dist/src/network", "Network")
  @js.native
  open class Network protected () extends StObject {
    /**
      * @param {import('libp2p').Libp2p} libp2p
      * @param {import('./bitswap').Bitswap} bitswap
      * @param {import('./stats').Stats} stats
      * @param {object} [options]
      * @param {boolean} [options.b100Only]
      * @param {MultihashHasherLoader} [options.hashLoader]
      * @param {number} [options.maxInboundStreams=32]
      * @param {number} [options.maxOutboundStreams=32]
      * @param {number} [options.incomingStreamTimeout=30000]
      */
    def this(libp2p: Libp2p, bitswap: Bitswap, stats: Stats) = this()
    def this(libp2p: Libp2p, bitswap: Bitswap, stats: Stats, options: B100Only) = this()
    
    var _bitswap: Bitswap = js.native
    
    var _hashLoader: js.UndefOr[typings.ipfsBitswap.distSrcTypesMod.MultihashHasherLoader] = js.native
    
    var _incomingStreamTimeout: Double = js.native
    
    var _libp2p: Libp2p = js.native
    
    def _log(formatter: Any, args: Any*): Unit = js.native
    @JSName("_log")
    var _log_Original: DebuggererrorDebugger = js.native
    
    var _maxInboundStreams: Double = js.native
    
    var _maxOutboundStreams: Double = js.native
    
    /**
      * Handles both types of incoming bitswap messages
      *
      * @private
      * @param {object} connection
      * @param {Stream} connection.stream - A duplex iterable stream
      * @param {Connection} connection.connection - A libp2p Connection
      */
    /* private */ var _onConnection: Any = js.native
    
    /**
      * @private
      * @param {PeerId} peerId
      */
    /* private */ var _onPeerConnect: Any = js.native
    
    /**
      * @private
      * @param {PeerId} peerId
      */
    /* private */ var _onPeerDisconnect: Any = js.native
    
    var _protocols: js.Array[String] = js.native
    
    /** @type {string[]} */
    var _registrarIds: js.UndefOr[js.Array[String]] = js.native
    
    var _running: Boolean = js.native
    
    var _stats: Stats = js.native
    
    /**
      * @private
      * @param {PeerId} peer
      * @param {Map<string, Uint8Array>} blocks
      */
    /* private */ var _updateSentStats: Any = js.native
    
    def connectTo(peer: Multiaddr): js.Promise[Connection] = js.native
    def connectTo(peer: Multiaddr, options: Signal): js.Promise[Connection] = js.native
    /**
      * Connects to another peer
      *
      * @param {PeerId|Multiaddr} peer
      * @param {object} [options]
      * @param {AbortSignal} [options.signal]
      * @returns {Promise<Connection>}
      */
    def connectTo(peer: PeerId): js.Promise[Connection] = js.native
    def connectTo(peer: PeerId, options: Signal): js.Promise[Connection] = js.native
    
    /**
      * Find the providers of a given `cid` and connect to them.
      *
      * @param {CID} cid
      * @param {object} [options]
      * @param {AbortSignal} [options.signal]
      */
    def findAndConnect(cid: CID): js.Promise[Unit] = js.native
    def findAndConnect(cid: CID, options: Signal): js.Promise[Unit] = js.native
    
    /**
      * Find providers given a `cid`.
      *
      * @param {CID} cid
      * @param {object} [options]
      * @param {AbortSignal} [options.signal]
      * @returns {AsyncIterable<Provider>}
      */
    def findProviders(cid: CID): AsyncIterable[Provider] = js.native
    def findProviders(cid: CID, options: Signal): AsyncIterable[Provider] = js.native
    
    /**
      * Tell the network we can provide content for the passed CID
      *
      * @param {CID} cid
      * @param {object} [options]
      * @param {AbortSignal} [options.signal]
      */
    def provide(cid: CID): js.Promise[Unit] = js.native
    def provide(cid: CID, options: Signal): js.Promise[Unit] = js.native
    
    /**
      * Connect to the given peer
      * Send the given msg (instance of Message) to the given peer
      *
      * @param {PeerId} peer
      * @param {Message} msg
      */
    def sendMessage(peer: PeerId, msg: BitswapMessage): js.Promise[Unit] = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[Unit] = js.native
  }
  
  type CID = typings.multiformats.mod.CID[Any, Double, Double, Version]
  
  type Connection = typings.libp2pInterfaceConnection.mod.Connection
  
  type Duplex = typings.itStreamTypes.mod.Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]]
  
  type Multiaddr = Multiaddr_
  
  type MultihashHasherLoader = typings.ipfsBitswap.distSrcTypesMod.MultihashHasherLoader
  
  type PeerId = typings.libp2pInterfacePeerId.mod.PeerId
  
  trait Provider extends StObject {
    
    var id: PeerId
    
    var multiaddrs: js.Array[Multiaddr]
  }
  object Provider {
    
    inline def apply(id: PeerId, multiaddrs: js.Array[Multiaddr]): Provider = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
      
      inline def setId(value: PeerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrs(value: js.Array[Multiaddr]): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrsVarargs(value: Multiaddr*): Self = StObject.set(x, "multiaddrs", js.Array(value*))
    }
  }
  
  type Stream = typings.libp2pInterfaceConnection.mod.Stream
}
