package typings.libp2pInterfaceAddressManager

import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait AddressManager extends StObject {
    
    /**
      * Add peer observed addresses.  These will then appear in the output of getObservedAddrs
      * but not getAddresses() until their dialability has been confirmed via a call to
      * confirmObservedAddr.
      */
    def addObservedAddr(addr: Multiaddr_): Unit
    
    /**
      * Signal that we have confidence an observed multiaddr is publicly dialable -
      * this will make it appear in the output of getAddresses()
      */
    def confirmObservedAddr(addr: Multiaddr_): Unit
    
    /**
      * Get the current node's addresses
      */
    def getAddresses(): js.Array[Multiaddr_]
    
    /**
      * Get peer announcing multiaddrs
      */
    def getAnnounceAddrs(): js.Array[Multiaddr_]
    
    /**
      * Get peer listen multiaddrs
      */
    def getListenAddrs(): js.Array[Multiaddr_]
    
    /**
      * Get observed multiaddrs - these addresses may not have been confirmed as
      * publicly dialable yet
      */
    def getObservedAddrs(): js.Array[Multiaddr_]
    
    /**
      * Signal that we do not have confidence an observed multiaddr is publicly dialable -
      * this will remove it from the output of getObservedAddrs()
      */
    def removeObservedAddr(addr: Multiaddr_): Unit
  }
  object AddressManager {
    
    inline def apply(
      addObservedAddr: Multiaddr_ => Unit,
      confirmObservedAddr: Multiaddr_ => Unit,
      getAddresses: () => js.Array[Multiaddr_],
      getAnnounceAddrs: () => js.Array[Multiaddr_],
      getListenAddrs: () => js.Array[Multiaddr_],
      getObservedAddrs: () => js.Array[Multiaddr_],
      removeObservedAddr: Multiaddr_ => Unit
    ): AddressManager = {
      val __obj = js.Dynamic.literal(addObservedAddr = js.Any.fromFunction1(addObservedAddr), confirmObservedAddr = js.Any.fromFunction1(confirmObservedAddr), getAddresses = js.Any.fromFunction0(getAddresses), getAnnounceAddrs = js.Any.fromFunction0(getAnnounceAddrs), getListenAddrs = js.Any.fromFunction0(getListenAddrs), getObservedAddrs = js.Any.fromFunction0(getObservedAddrs), removeObservedAddr = js.Any.fromFunction1(removeObservedAddr))
      __obj.asInstanceOf[AddressManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddressManager] (val x: Self) extends AnyVal {
      
      inline def setAddObservedAddr(value: Multiaddr_ => Unit): Self = StObject.set(x, "addObservedAddr", js.Any.fromFunction1(value))
      
      inline def setConfirmObservedAddr(value: Multiaddr_ => Unit): Self = StObject.set(x, "confirmObservedAddr", js.Any.fromFunction1(value))
      
      inline def setGetAddresses(value: () => js.Array[Multiaddr_]): Self = StObject.set(x, "getAddresses", js.Any.fromFunction0(value))
      
      inline def setGetAnnounceAddrs(value: () => js.Array[Multiaddr_]): Self = StObject.set(x, "getAnnounceAddrs", js.Any.fromFunction0(value))
      
      inline def setGetListenAddrs(value: () => js.Array[Multiaddr_]): Self = StObject.set(x, "getListenAddrs", js.Any.fromFunction0(value))
      
      inline def setGetObservedAddrs(value: () => js.Array[Multiaddr_]): Self = StObject.set(x, "getObservedAddrs", js.Any.fromFunction0(value))
      
      inline def setRemoveObservedAddr(value: Multiaddr_ => Unit): Self = StObject.set(x, "removeObservedAddr", js.Any.fromFunction1(value))
    }
  }
}
