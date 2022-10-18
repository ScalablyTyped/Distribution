package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Extra
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDhtMapEventMod {
  
  @JSImport("ipfs-http-client/dist/src/dht/map-event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapEvent(event: Extra): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mapEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  type Multiaddr = Multiaddr_
  
  type PeerId = typings.libp2pInterfacePeerId.mod.PeerId
}
