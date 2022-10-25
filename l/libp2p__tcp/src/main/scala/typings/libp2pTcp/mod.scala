package typings.libp2pTcp

import typings.libp2pInterfaceTransport.mod.CreateListenerOptions
import typings.libp2pInterfaceTransport.mod.DialOptions
import typings.libp2pInterfaceTransport.mod.Transport
import typings.libp2pInterfaceTransport.mod.Upgrader
import typings.multiformatsMultiaddr.mod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/tcp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tcp(): js.Function1[/* components */ js.UndefOr[Any], Transport] = ^.asInstanceOf[js.Dynamic].applyDynamic("tcp")().asInstanceOf[js.Function1[/* components */ js.UndefOr[Any], Transport]]
  inline def tcp(init: TCPOptions): js.Function1[/* components */ js.UndefOr[Any], Transport] = ^.asInstanceOf[js.Dynamic].applyDynamic("tcp")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ js.UndefOr[Any], Transport]]
  
  trait TCPCreateListenerOptions
    extends StObject
       with CreateListenerOptions
       with TCPSocketOptions
  object TCPCreateListenerOptions {
    
    inline def apply(upgrader: Upgrader): TCPCreateListenerOptions = {
      val __obj = js.Dynamic.literal(upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[TCPCreateListenerOptions]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.multiformatsMultiaddr.mod.AbortOptions because var conflicts: signal. Inlined 
  - typings.libp2pTcp.mod.TCPSocketOptions because var conflicts: signal. Inlined noDelay, keepAlive, keepAliveInitialDelay, allowHalfOpen */ trait TCPDialOptions
    extends StObject
       with DialOptions {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var keepAliveInitialDelay: js.UndefOr[Double] = js.undefined
    
    var noDelay: js.UndefOr[Boolean] = js.undefined
  }
  object TCPDialOptions {
    
    inline def apply(upgrader: Upgrader): TCPDialOptions = {
      val __obj = js.Dynamic.literal(upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[TCPDialOptions]
    }
    
    extension [Self <: TCPDialOptions](x: Self) {
      
      inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      inline def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelay(value: Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
      
      inline def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
    }
  }
  
  trait TCPOptions extends StObject {
    
    /**
      * An optional number in ms that is used as an inactivity timeout after which the socket will be closed
      */
    var inboundSocketInactivityTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Set this property to reject connections when the server's connection count gets high.
      * https://nodejs.org/api/net.html#servermaxconnections
      */
    var maxConnections: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional number in ms that is used as an inactivity timeout after which the socket will be closed
      */
    var outboundSocketInactivityTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * When closing a socket, wait this long for it to close gracefully before it is closed more forcibly
      */
    var socketCloseTimeout: js.UndefOr[Double] = js.undefined
  }
  object TCPOptions {
    
    inline def apply(): TCPOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TCPOptions]
    }
    
    extension [Self <: TCPOptions](x: Self) {
      
      inline def setInboundSocketInactivityTimeout(value: Double): Self = StObject.set(x, "inboundSocketInactivityTimeout", value.asInstanceOf[js.Any])
      
      inline def setInboundSocketInactivityTimeoutUndefined: Self = StObject.set(x, "inboundSocketInactivityTimeout", js.undefined)
      
      inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      inline def setOutboundSocketInactivityTimeout(value: Double): Self = StObject.set(x, "outboundSocketInactivityTimeout", value.asInstanceOf[js.Any])
      
      inline def setOutboundSocketInactivityTimeoutUndefined: Self = StObject.set(x, "outboundSocketInactivityTimeout", js.undefined)
      
      inline def setSocketCloseTimeout(value: Double): Self = StObject.set(x, "socketCloseTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketCloseTimeoutUndefined: Self = StObject.set(x, "socketCloseTimeout", js.undefined)
    }
  }
  
  trait TCPSocketOptions
    extends StObject
       with AbortOptions {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var keepAliveInitialDelay: js.UndefOr[Double] = js.undefined
    
    var noDelay: js.UndefOr[Boolean] = js.undefined
  }
  object TCPSocketOptions {
    
    inline def apply(): TCPSocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TCPSocketOptions]
    }
    
    extension [Self <: TCPSocketOptions](x: Self) {
      
      inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      inline def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelay(value: Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
      
      inline def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
    }
  }
}
