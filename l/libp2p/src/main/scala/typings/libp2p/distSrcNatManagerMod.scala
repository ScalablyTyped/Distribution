package typings.libp2p

import typings.achingbrainNatPortMapper.mod.NatAPI
import typings.libp2pComponents.mod.Components
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcNatManagerMod {
  
  @JSImport("libp2p/dist/src/nat-manager", "NatManager")
  @js.native
  open class NatManager protected ()
    extends StObject
       with Startable {
    def this(components: Components, init: NatManagerInit) = this()
    
    def _getClient(): js.Promise[NatAPI] = js.native
    
    def _start(): js.Promise[Unit] = js.native
    
    /**
      * Attempt to use uPnP to configure port mapping using the current gateway.
      *
      * Run after start to ensure the transport manager has all addresses configured.
      */
    @JSName("afterStart")
    def afterStart_MNatManager(): Unit = js.native
    
    /* private */ var client: Any = js.native
    
    /* private */ val components: Any = js.native
    
    /* private */ val description: Any = js.native
    
    /* private */ val enabled: Any = js.native
    
    /* private */ val externalAddress: Any = js.native
    
    /* private */ val gateway: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val keepAlive: Any = js.native
    
    /* private */ val localAddress: Any = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
    
    /* private */ val ttl: Any = js.native
  }
  
  trait NatManagerInit extends StObject {
    
    /**
      * A string value to use for the port mapping description on the gateway
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to enable the NAT manager
      */
    var enabled: Boolean
    
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
    var keepAlive: Boolean
    
    /**
      * Pass a value to use instead of auto-detection
      */
    var localAddress: js.UndefOr[String] = js.undefined
    
    /**
      * How long UPnP port mappings should last for in seconds (minimum 1200)
      */
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object NatManagerInit {
    
    inline def apply(enabled: Boolean, keepAlive: Boolean): NatManagerInit = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any])
      __obj.asInstanceOf[NatManagerInit]
    }
    
    extension [Self <: NatManagerInit](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setExternalAddress(value: String): Self = StObject.set(x, "externalAddress", value.asInstanceOf[js.Any])
      
      inline def setExternalAddressUndefined: Self = StObject.set(x, "externalAddress", js.undefined)
      
      inline def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
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
    
    extension [Self <: PMPOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
}
