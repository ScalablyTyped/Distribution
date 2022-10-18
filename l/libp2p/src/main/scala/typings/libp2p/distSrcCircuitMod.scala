package typings.libp2p

import typings.libp2p.mod.HopConfig
import typings.libp2p.mod.RelayConfig
import typings.libp2pComponents.mod.Components
import typings.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`-1`
import typings.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`0`
import typings.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`1`
import typings.libp2pInterfacePeerStore.mod.Address
import typings.libp2pInterfacePeerStore.mod.AddressSorter
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitMod {
  
  @JSImport("libp2p/dist/src/circuit", "Relay")
  @js.native
  open class Relay protected ()
    extends StObject
       with Startable {
    /**
      * Creates an instance of Relay
      */
    def this(components: Components, init: RelayInit) = this()
    
    /**
      * Advertise hop relay service in the network.
      */
    def _advertiseService(): js.Promise[Unit] = js.native
    
    /* private */ val autoRelay: Any = js.native
    
    /* private */ val components: Any = js.native
    
    /* private */ val init: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
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
    
    /* private */ var timeout: Any = js.native
  }
  
  trait AutoRelayConfig extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * maximum number of relays to listen
      */
    var maxListeners: Double
  }
  object AutoRelayConfig {
    
    inline def apply(maxListeners: Double): AutoRelayConfig = {
      val __obj = js.Dynamic.literal(maxListeners = maxListeners.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoRelayConfig]
    }
    
    extension [Self <: AutoRelayConfig](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setMaxListeners(value: Double): Self = StObject.set(x, "maxListeners", value.asInstanceOf[js.Any])
    }
  }
  
  trait RelayAdvertiseConfig extends StObject {
    
    var bootDelay: js.UndefOr[Double] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object RelayAdvertiseConfig {
    
    inline def apply(): RelayAdvertiseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RelayAdvertiseConfig]
    }
    
    extension [Self <: RelayAdvertiseConfig](x: Self) {
      
      inline def setBootDelay(value: Double): Self = StObject.set(x, "bootDelay", value.asInstanceOf[js.Any])
      
      inline def setBootDelayUndefined: Self = StObject.set(x, "bootDelay", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait RelayInit
    extends StObject
       with RelayConfig {
    
    var addressSorter: js.UndefOr[AddressSorter] = js.undefined
  }
  object RelayInit {
    
    inline def apply(advertise: RelayAdvertiseConfig, autoRelay: AutoRelayConfig, enabled: Boolean, hop: HopConfig): RelayInit = {
      val __obj = js.Dynamic.literal(advertise = advertise.asInstanceOf[js.Any], autoRelay = autoRelay.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hop = hop.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelayInit]
    }
    
    extension [Self <: RelayInit](x: Self) {
      
      inline def setAddressSorter(value: (/* a */ Address, /* b */ Address) => `-1` | `0` | `1`): Self = StObject.set(x, "addressSorter", js.Any.fromFunction2(value))
      
      inline def setAddressSorterUndefined: Self = StObject.set(x, "addressSorter", js.undefined)
    }
  }
}
