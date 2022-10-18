package typings.libp2p.mod

import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Libp2pEvents extends StObject {
  
  @JSName("peer:discovery")
  var peerColondiscovery: CustomEvent[PeerInfo]
}
object Libp2pEvents {
  
  inline def apply(peerColondiscovery: CustomEvent[PeerInfo]): Libp2pEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("peer:discovery")(peerColondiscovery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Libp2pEvents]
  }
  
  extension [Self <: Libp2pEvents](x: Self) {
    
    inline def setPeerColondiscovery(value: CustomEvent[PeerInfo]): Self = StObject.set(x, "peer:discovery", value.asInstanceOf[js.Any])
  }
}
