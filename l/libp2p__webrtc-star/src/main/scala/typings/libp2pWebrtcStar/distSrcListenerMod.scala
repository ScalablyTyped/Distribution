package typings.libp2pWebrtcStar

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaceTransport.mod.ConnectionHandler
import typings.libp2pInterfaceTransport.mod.Listener
import typings.libp2pInterfaceTransport.mod.Upgrader
import typings.libp2pWebrtcStar.mod.WebRTCStar
import typings.libp2pWebrtcStar.mod.WebRTCStarListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcListenerMod {
  
  @JSImport("@libp2p/webrtc-star/dist/src/listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createListener(
    upgrader: Upgrader,
    handler: ConnectionHandler,
    peerId: PeerId,
    transport: WebRTCStar,
    options: WebRTCStarListenerOptions
  ): WebRTCListener = (^.asInstanceOf[js.Dynamic].applyDynamic("createListener")(upgrader.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], peerId.asInstanceOf[js.Any], transport.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebRTCListener]
  
  @js.native
  trait WebRTCListener extends Listener {
    
    /* private */ val handler: Any = js.native
    
    /* private */ var listeningAddr: Any = js.native
    
    /* private */ val options: Any = js.native
    
    /* private */ val peerId: Any = js.native
    
    /* private */ var signallingUrl: Any = js.native
    
    /* private */ val transport: Any = js.native
    
    /* private */ val upgrader: Any = js.native
  }
}
