package typings.libp2pPeerStore

import typings.interfaceDatastore.keyMod.Key
import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsPeerIdToDatastoreKeyMod {
  
  @JSImport("@libp2p/peer-store/dist/src/utils/peer-id-to-datastore-key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@libp2p/peer-store/dist/src/utils/peer-id-to-datastore-key", "NAMESPACE_COMMON")
  @js.native
  val NAMESPACE_COMMON: /* "/peers/" */ String = js.native
  
  inline def peerIdToDatastoreKey(peerId: PeerId): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("peerIdToDatastoreKey")(peerId.asInstanceOf[js.Any]).asInstanceOf[Key]
}
