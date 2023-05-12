package typings.libp2pMdns

import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfacePeerDiscovery.mod.PeerDiscovery_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/mdns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdns(): js.Function1[/* components */ MulticastDNSComponents, PeerDiscovery_] = ^.asInstanceOf[js.Dynamic].applyDynamic("mdns")().asInstanceOf[js.Function1[/* components */ MulticastDNSComponents, PeerDiscovery_]]
  inline def mdns(init: MulticastDNSInit): js.Function1[/* components */ MulticastDNSComponents, PeerDiscovery_] = ^.asInstanceOf[js.Dynamic].applyDynamic("mdns")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ MulticastDNSComponents, PeerDiscovery_]]
  
  trait MulticastDNSComponents extends StObject {
    
    var addressManager: AddressManager
  }
  object MulticastDNSComponents {
    
    inline def apply(addressManager: AddressManager): MulticastDNSComponents = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[MulticastDNSComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MulticastDNSComponents] (val x: Self) extends AnyVal {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
    }
  }
  
  trait MulticastDNSInit extends StObject {
    
    var broadcast: js.UndefOr[Boolean] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var ip: js.UndefOr[String] = js.undefined
    
    var peerName: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var serviceTag: js.UndefOr[String] = js.undefined
  }
  object MulticastDNSInit {
    
    inline def apply(): MulticastDNSInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MulticastDNSInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MulticastDNSInit] (val x: Self) extends AnyVal {
      
      inline def setBroadcast(value: Boolean): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
      
      inline def setBroadcastUndefined: Self = StObject.set(x, "broadcast", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      inline def setPeerName(value: String): Self = StObject.set(x, "peerName", value.asInstanceOf[js.Any])
      
      inline def setPeerNameUndefined: Self = StObject.set(x, "peerName", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setServiceTag(value: String): Self = StObject.set(x, "serviceTag", value.asInstanceOf[js.Any])
      
      inline def setServiceTagUndefined: Self = StObject.set(x, "serviceTag", js.undefined)
    }
  }
}
