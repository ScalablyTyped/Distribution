package typings.libp2pPeerStore

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pPeerStore.anon.PartialPeerData
import typings.libp2pPeerStore.distSrcPbPeerMod.Peer
import typings.libp2pPeerStore.libp2pPeerStoreStrings.merge
import typings.libp2pPeerStore.libp2pPeerStoreStrings.patch
import typings.libp2pPeerStore.mod.AddressFilter
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsToPeerPbMod {
  
  @JSImport("@libp2p/peer-store/dist/src/utils/to-peer-pb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toPeerPB(peerId: PeerId, data: PartialPeerData, strategy: merge | patch, options: ToPBPeerOptions): js.Promise[Peer] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPeerPB")(peerId.asInstanceOf[js.Any], data.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Peer]]
  
  trait ToPBPeerOptions extends StObject {
    
    var addressFilter: js.UndefOr[AddressFilter] = js.undefined
    
    var existingPeer: js.UndefOr[typings.libp2pInterfacePeerStore.mod.Peer] = js.undefined
  }
  object ToPBPeerOptions {
    
    inline def apply(): ToPBPeerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToPBPeerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToPBPeerOptions] (val x: Self) extends AnyVal {
      
      inline def setAddressFilter(value: (/* peerId */ PeerId, /* multiaddr */ Multiaddr_) => js.Promise[Boolean]): Self = StObject.set(x, "addressFilter", js.Any.fromFunction2(value))
      
      inline def setAddressFilterUndefined: Self = StObject.set(x, "addressFilter", js.undefined)
      
      inline def setExistingPeer(value: typings.libp2pInterfacePeerStore.mod.Peer): Self = StObject.set(x, "existingPeer", value.asInstanceOf[js.Any])
      
      inline def setExistingPeerUndefined: Self = StObject.set(x, "existingPeer", js.undefined)
    }
  }
}
