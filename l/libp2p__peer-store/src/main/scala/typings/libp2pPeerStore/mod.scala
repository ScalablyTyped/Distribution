package typings.libp2pPeerStore

import typings.libp2pComponents.mod.Components
import typings.libp2pComponents.mod.Initializable
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfacePeerStore.mod.PeerStoreInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/peer-store", "PersistentPeerStore")
  @js.native
  open class PersistentPeerStore ()
    extends PeerStore
       with Initializable {
    def this(init: PeerStoreInit) = this()
    
    /* private */ var components: Any = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /* private */ val store: Any = js.native
  }
}
