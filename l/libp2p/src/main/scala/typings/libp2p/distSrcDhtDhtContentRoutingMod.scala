package typings.libp2p

import typings.libp2pInterfaceContentRouting.mod.ContentRouting
import typings.libp2pInterfaceDht.mod.DHT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDhtDhtContentRoutingMod {
  
  @JSImport("libp2p/dist/src/dht/dht-content-routing", "DHTContentRouting")
  @js.native
  open class DHTContentRouting protected ()
    extends StObject
       with ContentRouting {
    def this(dht: DHT) = this()
    
    /* private */ val dht: Any = js.native
  }
}
