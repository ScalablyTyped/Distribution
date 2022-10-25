package typings.libp2pInterfaceAddressManager

import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait AddressManager extends EventEmitter[AddressManagerEvents] {
    
    /**
      * Add peer observed addresses.  These will then appear in the output of getObservedAddrs
      * but not getAddresses() until their dialability has been confirmed via a call to
      * confirmObservedAddr.
      */
    def addObservedAddr(addr: Multiaddr_): Unit = js.native
    
    /**
      * Signal that we have confidence an observed multiaddr is publicly dialable -
      * this will make it appear in the output of getAddresses()
      */
    def confirmObservedAddr(addr: Multiaddr_): Unit = js.native
    
    /**
      * Get the current node's addresses
      */
    def getAddresses(): js.Array[Multiaddr_] = js.native
    
    /**
      * Get peer announcing multiaddrs
      */
    def getAnnounceAddrs(): js.Array[Multiaddr_] = js.native
    
    /**
      * Get peer listen multiaddrs
      */
    def getListenAddrs(): js.Array[Multiaddr_] = js.native
    
    /**
      * Get observed multiaddrs - these addresses may not have been confirmed as
      * publicly dialable yet
      */
    def getObservedAddrs(): js.Array[Multiaddr_] = js.native
    
    /**
      * Signal that we do not have confidence an observed multiaddr is publicly dialable -
      * this will remove it from the output of getObservedAddrs()
      */
    def removeObservedAddr(addr: Multiaddr_): Unit = js.native
  }
  
  trait AddressManagerEvents extends StObject {
    
    /**
      * Emitted when the current node's addresses change
      */
    @JSName("change:addresses")
    var changeColonaddresses: CustomEvent[Any]
  }
  object AddressManagerEvents {
    
    inline def apply(changeColonaddresses: CustomEvent[Any]): AddressManagerEvents = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("change:addresses")(changeColonaddresses.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressManagerEvents]
    }
    
    extension [Self <: AddressManagerEvents](x: Self) {
      
      inline def setChangeColonaddresses(value: CustomEvent[Any]): Self = StObject.set(x, "change:addresses", value.asInstanceOf[js.Any])
    }
  }
}
