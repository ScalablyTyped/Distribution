package typings.libp2p

import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnection.mod.ConnectionStat
import typings.libp2pInterfaceConnection.mod.Stream
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConnectionMod {
  
  @JSImport("libp2p/dist/src/connection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libp2p/dist/src/connection", "ConnectionImpl")
  @js.native
  open class ConnectionImpl protected ()
    extends StObject
       with Connection {
    /**
      * An implementation of the js-libp2p connection.
      * Any libp2p transport should use an upgrader to return this connection.
      */
    def this(init: ConnectionInit) = this()
    
    /**
      * Reference to the close function of the raw connection
      */
    /* private */ val _close: Any = js.native
    
    /* private */ var _closing: Any = js.native
    
    /**
      * Reference to the getStreams function of the muxer
      */
    /* private */ val _getStreams: Any = js.native
    
    /**
      * Reference to the new stream function of the multiplexer
      */
    /* private */ val _newStream: Any = js.native
    
    var get: Any = js.native
    
    /**
      * Get all the streams of the muxer
      */
    @JSName("streams")
    def streams_MConnectionImpl: js.Array[Stream] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[typings.libp2p.libp2pStrings.Connection] = js.native
  }
  
  inline def createConnection(init: ConnectionInit): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(init.asInstanceOf[js.Any]).asInstanceOf[Connection]
  
  @js.native
  trait ConnectionInit extends StObject {
    
    def close(): js.Promise[Unit] = js.native
    
    def getStreams(): js.Array[Stream] = js.native
    
    def newStream(protocols: js.Array[String]): js.Promise[Stream] = js.native
    def newStream(protocols: js.Array[String], options: AbortOptions): js.Promise[Stream] = js.native
    
    var remoteAddr: Multiaddr_ = js.native
    
    var remotePeer: PeerId = js.native
    
    var stat: ConnectionStat = js.native
  }
}
