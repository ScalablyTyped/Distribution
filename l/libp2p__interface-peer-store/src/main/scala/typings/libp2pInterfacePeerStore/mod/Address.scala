package typings.libp2pInterfacePeerStore.mod

import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  /**
    * Obtained from a signed peer record
    */
  var isCertified: Boolean
  
  /**
    * Peer multiaddr
    */
  var multiaddr: Multiaddr_
}
object Address {
  
  inline def apply(isCertified: Boolean, multiaddr: Multiaddr_): Address = {
    val __obj = js.Dynamic.literal(isCertified = isCertified.asInstanceOf[js.Any], multiaddr = multiaddr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setIsCertified(value: Boolean): Self = StObject.set(x, "isCertified", value.asInstanceOf[js.Any])
    
    inline def setMultiaddr(value: Multiaddr_): Self = StObject.set(x, "multiaddr", value.asInstanceOf[js.Any])
  }
}
