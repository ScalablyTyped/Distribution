package typings.libp2pPeerStore

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.Address
import typings.libp2pPeerStore.mod.AddressFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsDedupeAddressesMod {
  
  @JSImport("@libp2p/peer-store/dist/src/utils/dedupe-addresses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dedupeFilterAndSortAddresses(
    peerId: PeerId,
    filter: AddressFilter,
    addresses: js.Array[js.UndefOr[Address | typings.libp2pPeerStore.distSrcPbPeerMod.Address]]
  ): js.Promise[js.Array[typings.libp2pPeerStore.distSrcPbPeerMod.Address]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dedupeFilterAndSortAddresses")(peerId.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], addresses.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.libp2pPeerStore.distSrcPbPeerMod.Address]]]
}
