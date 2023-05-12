package typings.libp2p

import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaceTransport.mod.TransportManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUpnpNatMod {
  
  @JSImport("libp2p/dist/src/upnp-nat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uPnPNATService(): js.Function1[/* components */ UPnPNATComponents, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("uPnPNATService")().asInstanceOf[js.Function1[/* components */ UPnPNATComponents, js.Object]]
  inline def uPnPNATService(init: UPnPNATInit): js.Function1[/* components */ UPnPNATComponents, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("uPnPNATService")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ UPnPNATComponents, js.Object]]
  
  trait PMPOptions extends StObject {
    
    /**
      * Whether to enable PMP as well as UPnP
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
  }
  object PMPOptions {
    
    inline def apply(): PMPOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PMPOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PMPOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
  
  trait UPnPNATComponents extends StObject {
    
    var addressManager: AddressManager
    
    var peerId: PeerId
    
    var transportManager: TransportManager
  }
  object UPnPNATComponents {
    
    inline def apply(addressManager: AddressManager, peerId: PeerId, transportManager: TransportManager): UPnPNATComponents = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], transportManager = transportManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[UPnPNATComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UPnPNATComponents] (val x: Self) extends AnyVal {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setTransportManager(value: TransportManager): Self = StObject.set(x, "transportManager", value.asInstanceOf[js.Any])
    }
  }
  
  trait UPnPNATInit extends StObject {
    
    /**
      * A string value to use for the port mapping description on the gateway
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Pass a value to use instead of auto-detection
      */
    var externalAddress: js.UndefOr[String] = js.undefined
    
    /**
      * Pass a value to use instead of auto-detection
      */
    var gateway: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to automatically refresh UPnP port mappings when their TTL is reached
      */
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pass a value to use instead of auto-detection
      */
    var localAddress: js.UndefOr[String] = js.undefined
    
    /**
      * How long UPnP port mappings should last for in seconds (minimum 1200)
      */
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object UPnPNATInit {
    
    inline def apply(): UPnPNATInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UPnPNATInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UPnPNATInit] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExternalAddress(value: String): Self = StObject.set(x, "externalAddress", value.asInstanceOf[js.Any])
      
      inline def setExternalAddressUndefined: Self = StObject.set(x, "externalAddress", js.undefined)
      
      inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
