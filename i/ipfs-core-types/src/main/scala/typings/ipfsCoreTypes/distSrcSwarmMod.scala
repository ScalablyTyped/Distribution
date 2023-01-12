package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsCoreTypes.ipfsCoreTypesStrings.inbound
import typings.ipfsCoreTypes.ipfsCoreTypesStrings.outbound
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSwarmMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    /**
      * List of known addresses of each peer connected
      */
    def addrs(): js.Promise[js.Array[AddrsResult]] = js.native
    def addrs(options: AbortOptions & OptionExtension): js.Promise[js.Array[AddrsResult]] = js.native
    
    def connect(multiaddrOrPeerId: PeerId): js.Promise[Unit] = js.native
    def connect(multiaddrOrPeerId: PeerId, options: AbortOptions & OptionExtension): js.Promise[Unit] = js.native
    /**
      * Open a connection to a given address or peer id
      */
    def connect(multiaddrOrPeerId: Multiaddr_): js.Promise[Unit] = js.native
    def connect(multiaddrOrPeerId: Multiaddr_, options: AbortOptions & OptionExtension): js.Promise[Unit] = js.native
    
    def disconnect(multiaddrOrPeerId: PeerId): js.Promise[Unit] = js.native
    def disconnect(multiaddrOrPeerId: PeerId, options: AbortOptions & OptionExtension): js.Promise[Unit] = js.native
    /**
      * Close a connection to a given address or peer id
      */
    def disconnect(multiaddrOrPeerId: Multiaddr_): js.Promise[Unit] = js.native
    def disconnect(multiaddrOrPeerId: Multiaddr_, options: AbortOptions & OptionExtension): js.Promise[Unit] = js.native
    
    /**
      * Local addresses this node is listening on
      */
    def localAddrs(): js.Promise[js.Array[Multiaddr_]] = js.native
    def localAddrs(options: AbortOptions & OptionExtension): js.Promise[js.Array[Multiaddr_]] = js.native
    
    /**
      * Return a list of connected peers
      */
    def peers(): js.Promise[js.Array[PeersResult]] = js.native
    def peers(options: PeersOptions & OptionExtension): js.Promise[js.Array[PeersResult]] = js.native
  }
  
  trait AddrsResult extends StObject {
    
    var addrs: js.Array[Multiaddr_]
    
    var id: PeerId
  }
  object AddrsResult {
    
    inline def apply(addrs: js.Array[Multiaddr_], id: PeerId): AddrsResult = {
      val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddrsResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddrsResult] (val x: Self) extends AnyVal {
      
      inline def setAddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
      
      inline def setAddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "addrs", js.Array(value*))
      
      inline def setId(value: PeerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait PeersOptions
    extends StObject
       with AbortOptions {
    
    var direction: js.UndefOr[Boolean] = js.undefined
    
    var latency: js.UndefOr[Boolean] = js.undefined
    
    var streams: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object PeersOptions {
    
    inline def apply(): PeersOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeersOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeersOptions] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: Boolean): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setLatency(value: Boolean): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
      
      inline def setStreams(value: Boolean): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait PeersResult extends StObject {
    
    var addr: Multiaddr_
    
    var direction: js.UndefOr[inbound | outbound] = js.undefined
    
    var latency: js.UndefOr[String] = js.undefined
    
    var muxer: js.UndefOr[String] = js.undefined
    
    var peer: PeerId
    
    var streams: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PeersResult {
    
    inline def apply(addr: Multiaddr_, peer: PeerId): PeersResult = {
      val __obj = js.Dynamic.literal(addr = addr.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeersResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeersResult] (val x: Self) extends AnyVal {
      
      inline def setAddr(value: Multiaddr_): Self = StObject.set(x, "addr", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: inbound | outbound): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setLatency(value: String): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
      
      inline def setMuxer(value: String): Self = StObject.set(x, "muxer", value.asInstanceOf[js.Any])
      
      inline def setMuxerUndefined: Self = StObject.set(x, "muxer", js.undefined)
      
      inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setStreams(value: js.Array[String]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
      
      inline def setStreamsVarargs(value: String*): Self = StObject.set(x, "streams", js.Array(value*))
    }
  }
}
