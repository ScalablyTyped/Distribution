package typings.ipfsBitswap

import typings.ipfsBitswap.anon.Error
import typings.ipfsBitswap.distSrcBitswapMod.DefaultBitswap
import typings.ipfsBitswap.distSrcMessageMod.BitswapMessage
import typings.ipfsBitswap.distSrcStatsMod.Stats
import typings.ipfsBitswap.ipfsBitswapStrings.`bitswapColonnetworkColonfind-providers`
import typings.ipfsBitswap.ipfsBitswapStrings.`bitswapColonnetworkColonsend-wantlistColonerror`
import typings.ipfsBitswap.ipfsBitswapStrings.`bitswapColonnetworkColonsend-wantlist`
import typings.ipfsBitswap.ipfsBitswapStrings.bitswapColonnetworkColondial
import typings.ipfsBitswap.ipfsBitswapStrings.bitswapColonnetworkColonprovide
import typings.ipfsBitswap.mod.MultihashHasherLoader
import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceLibp2p.mod.Libp2p
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pInterfaceRegistrar.mod.IncomingStreamData
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.progressEvents.mod.ProgressEvent
import typings.progressEvents.mod.ProgressOptions
import typings.std.AsyncIterable
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNetworkMod {
  
  @JSImport("ipfs-bitswap/dist/src/network", "Network")
  @js.native
  open class Network protected () extends StObject {
    def this(libp2p: Libp2p[Record[String, Any]], bitswap: DefaultBitswap, stats: Stats) = this()
    def this(
      libp2p: Libp2p[Record[String, Any]],
      bitswap: DefaultBitswap,
      stats: Stats,
      options: NetworkOptions
    ) = this()
    
    /* private */ val _bitswap: Any = js.native
    
    /* private */ val _hashLoader: Any = js.native
    
    /* private */ val _incomingStreamTimeout: Any = js.native
    
    /* private */ val _libp2p: Any = js.native
    
    /* private */ val _log: Any = js.native
    
    /* private */ val _maxInboundStreams: Any = js.native
    
    /* private */ val _maxOutboundStreams: Any = js.native
    
    /**
      * Handles both types of incoming bitswap messages
      */
    def _onConnection(info: IncomingStreamData): Unit = js.native
    
    def _onPeerConnect(peerId: PeerId): Unit = js.native
    
    def _onPeerDisconnect(peerId: PeerId): Unit = js.native
    
    var _protocols: js.Array[String] = js.native
    
    /* private */ var _registrarIds: Any = js.native
    
    /* private */ var _running: Any = js.native
    
    /* private */ val _stats: Any = js.native
    
    def _updateSentStats(peer: PeerId, blocks: Map[String, js.typedarray.Uint8Array]): Unit = js.native
    
    def _writeMessage(peerId: PeerId, msg: BitswapMessage): js.Promise[Unit] = js.native
    def _writeMessage(peerId: PeerId, msg: BitswapMessage, options: ProgressOptions[BitswapNetworkWantProgressEvents]): js.Promise[Unit] = js.native
    
    /**
      * Connects to another peer
      */
    def connectTo(peer: PeerId): js.Promise[Connection] = js.native
    def connectTo(peer: PeerId, options: AbortOptions & ProgressOptions[BitswapNetworkProgressEvents]): js.Promise[Connection] = js.native
    
    /**
      * Find the providers of a given `cid` and connect to them.
      */
    def findAndConnect(cid: CID[Any, Double, Double, Version]): js.Promise[Unit] = js.native
    def findAndConnect(
      cid: CID[Any, Double, Double, Version],
      options: AbortOptions & ProgressOptions[BitswapNetworkWantProgressEvents]
    ): js.Promise[Unit] = js.native
    
    /**
      * Find providers given a `cid`.
      */
    def findProviders(cid: CID[Any, Double, Double, Version]): AsyncIterable[PeerInfo] = js.native
    def findProviders(
      cid: CID[Any, Double, Double, Version],
      options: AbortOptions & ProgressOptions[BitswapNetworkWantProgressEvents]
    ): AsyncIterable[PeerInfo] = js.native
    
    /**
      * Tell the network we can provide content for the passed CID
      */
    def provide(cid: CID[Any, Double, Double, Version]): js.Promise[Unit] = js.native
    def provide(
      cid: CID[Any, Double, Double, Version],
      options: AbortOptions & ProgressOptions[BitswapNetworkNotifyProgressEvents]
    ): js.Promise[Unit] = js.native
    
    /**
      * Connect to the given peer
      * Send the given msg (instance of Message) to the given peer
      */
    def sendMessage(peer: PeerId, msg: BitswapMessage): js.Promise[Unit] = js.native
    def sendMessage(peer: PeerId, msg: BitswapMessage, options: ProgressOptions[BitswapNetworkWantProgressEvents]): js.Promise[Unit] = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[Unit] = js.native
  }
  
  type BitswapNetworkNotifyProgressEvents = (ProgressEvent[bitswapColonnetworkColonprovide, CID[Any, Double, Double, Version]]) | BitswapNetworkProgressEvents
  
  type BitswapNetworkProgressEvents = ProgressEvent[bitswapColonnetworkColondial, PeerId]
  
  type BitswapNetworkWantProgressEvents = (ProgressEvent[
    `bitswapColonnetworkColonsend-wantlist` | `bitswapColonnetworkColonsend-wantlistColonerror` | `bitswapColonnetworkColonfind-providers`, 
    (CID[Any, Double, Double, Version]) | Error | PeerId
  ]) | BitswapNetworkProgressEvents
  
  trait NetworkOptions extends StObject {
    
    var b100Only: js.UndefOr[Boolean] = js.undefined
    
    var hashLoader: js.UndefOr[MultihashHasherLoader] = js.undefined
    
    var incomingStreamTimeout: js.UndefOr[Double] = js.undefined
    
    var maxInboundStreams: js.UndefOr[Double] = js.undefined
    
    var maxOutboundStreams: js.UndefOr[Double] = js.undefined
  }
  object NetworkOptions {
    
    inline def apply(): NetworkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkOptions] (val x: Self) extends AnyVal {
      
      inline def setB100Only(value: Boolean): Self = StObject.set(x, "b100Only", value.asInstanceOf[js.Any])
      
      inline def setB100OnlyUndefined: Self = StObject.set(x, "b100Only", js.undefined)
      
      inline def setHashLoader(value: MultihashHasherLoader): Self = StObject.set(x, "hashLoader", value.asInstanceOf[js.Any])
      
      inline def setHashLoaderUndefined: Self = StObject.set(x, "hashLoader", js.undefined)
      
      inline def setIncomingStreamTimeout(value: Double): Self = StObject.set(x, "incomingStreamTimeout", value.asInstanceOf[js.Any])
      
      inline def setIncomingStreamTimeoutUndefined: Self = StObject.set(x, "incomingStreamTimeout", js.undefined)
      
      inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
      
      inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
    }
  }
  
  trait Provider extends StObject {
    
    var id: PeerId
    
    var multiaddrs: js.Array[Multiaddr_]
  }
  object Provider {
    
    inline def apply(id: PeerId, multiaddrs: js.Array[Multiaddr_]): Provider = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
      
      inline def setId(value: PeerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "multiaddrs", js.Array(value*))
    }
  }
}
