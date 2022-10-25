package typings.libp2pWebrtcStar

import typings.libp2pInterfacePeerDiscovery.mod.PeerDiscovery
import typings.libp2pInterfaceTransport.mod.Transport
import typings.libp2pWebrtcStar.distSrcTransportMod.WebRTCStarComponents
import typings.libp2pWebrtcStar.distSrcTransportMod.WebRTCStarInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/webrtc-star", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def webRTCStar(): WebRTCStarTuple = ^.asInstanceOf[js.Dynamic].applyDynamic("webRTCStar")().asInstanceOf[WebRTCStarTuple]
  inline def webRTCStar(init: WebRTCStarInit): WebRTCStarTuple = ^.asInstanceOf[js.Dynamic].applyDynamic("webRTCStar")(init.asInstanceOf[js.Any]).asInstanceOf[WebRTCStarTuple]
  
  @js.native
  trait WebRTCStarTuple extends StObject {
    
    def discovery(): PeerDiscovery = js.native
    def discovery(components: WebRTCStarComponents): PeerDiscovery = js.native
    
    def transport(components: WebRTCStarComponents): Transport = js.native
  }
}
