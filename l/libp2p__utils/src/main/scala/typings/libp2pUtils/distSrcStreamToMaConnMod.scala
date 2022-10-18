package typings.libp2pUtils

import typings.itStreamTypes.mod.Duplex
import typings.libp2pInterfaceConnection.mod.MultiaddrConnection
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.AbortSignal
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStreamToMaConnMod {
  
  @JSImport("@libp2p/utils/dist/src/stream-to-ma-conn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def streamToMaConnection(props: StreamProperties): MultiaddrConnection = ^.asInstanceOf[js.Dynamic].applyDynamic("streamToMaConnection")(props.asInstanceOf[js.Any]).asInstanceOf[MultiaddrConnection]
  inline def streamToMaConnection(props: StreamProperties, options: StreamOptions): MultiaddrConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("streamToMaConnection")(props.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MultiaddrConnection]
  
  trait StreamOptions extends StObject {
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object StreamOptions {
    
    inline def apply(): StreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamOptions]
    }
    
    extension [Self <: StreamOptions](x: Self) {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  trait StreamProperties extends StObject {
    
    var localAddr: Multiaddr_
    
    var remoteAddr: Multiaddr_
    
    var stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  }
  object StreamProperties {
    
    inline def apply(
      localAddr: Multiaddr_,
      remoteAddr: Multiaddr_,
      stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
    ): StreamProperties = {
      val __obj = js.Dynamic.literal(localAddr = localAddr.asInstanceOf[js.Any], remoteAddr = remoteAddr.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamProperties]
    }
    
    extension [Self <: StreamProperties](x: Self) {
      
      inline def setLocalAddr(value: Multiaddr_): Self = StObject.set(x, "localAddr", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddr(value: Multiaddr_): Self = StObject.set(x, "remoteAddr", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait Timeline extends StObject {
    
    /**
      * Connection closed timestamp
      */
    var close: js.UndefOr[Double] = js.undefined
    
    /**
      * Connection opening timestamp
      */
    var open: Double
    
    /**
      * Connection upgraded timestamp
      */
    var upgraded: js.UndefOr[Double] = js.undefined
  }
  object Timeline {
    
    inline def apply(open: Double): Timeline = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timeline]
    }
    
    extension [Self <: Timeline](x: Self) {
      
      inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setUpgraded(value: Double): Self = StObject.set(x, "upgraded", value.asInstanceOf[js.Any])
      
      inline def setUpgradedUndefined: Self = StObject.set(x, "upgraded", js.undefined)
    }
  }
}
