package typings.libp2pInterfacePeerStore.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerStoreInit extends StObject {
  
  var addressFilter: js.UndefOr[AddressFilter] = js.undefined
}
object PeerStoreInit {
  
  inline def apply(): PeerStoreInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeerStoreInit]
  }
  
  extension [Self <: PeerStoreInit](x: Self) {
    
    inline def setAddressFilter(value: (/* peerId */ PeerId, /* multiaddr */ Multiaddr_) => js.Promise[Boolean]): Self = StObject.set(x, "addressFilter", js.Any.fromFunction2(value))
    
    inline def setAddressFilterUndefined: Self = StObject.set(x, "addressFilter", js.undefined)
  }
}
