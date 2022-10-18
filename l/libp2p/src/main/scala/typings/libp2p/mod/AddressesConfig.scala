package typings.libp2p.mod

import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressesConfig extends StObject {
  
  var announce: js.Array[String]
  
  def announceFilter(multiaddrs: js.Array[Multiaddr_]): js.Array[Multiaddr_]
  
  var listen: js.Array[String]
  
  var noAnnounce: js.Array[String]
}
object AddressesConfig {
  
  inline def apply(
    announce: js.Array[String],
    announceFilter: js.Array[Multiaddr_] => js.Array[Multiaddr_],
    listen: js.Array[String],
    noAnnounce: js.Array[String]
  ): AddressesConfig = {
    val __obj = js.Dynamic.literal(announce = announce.asInstanceOf[js.Any], announceFilter = js.Any.fromFunction1(announceFilter), listen = listen.asInstanceOf[js.Any], noAnnounce = noAnnounce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressesConfig]
  }
  
  extension [Self <: AddressesConfig](x: Self) {
    
    inline def setAnnounce(value: js.Array[String]): Self = StObject.set(x, "announce", value.asInstanceOf[js.Any])
    
    inline def setAnnounceFilter(value: js.Array[Multiaddr_] => js.Array[Multiaddr_]): Self = StObject.set(x, "announceFilter", js.Any.fromFunction1(value))
    
    inline def setAnnounceVarargs(value: String*): Self = StObject.set(x, "announce", js.Array(value*))
    
    inline def setListen(value: js.Array[String]): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
    
    inline def setListenVarargs(value: String*): Self = StObject.set(x, "listen", js.Array(value*))
    
    inline def setNoAnnounce(value: js.Array[String]): Self = StObject.set(x, "noAnnounce", value.asInstanceOf[js.Any])
    
    inline def setNoAnnounceVarargs(value: String*): Self = StObject.set(x, "noAnnounce", js.Array(value*))
  }
}
