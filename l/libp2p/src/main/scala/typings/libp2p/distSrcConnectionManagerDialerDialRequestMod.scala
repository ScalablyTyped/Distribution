package typings.libp2p

import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnectionManager.mod.Dialer
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConnectionManagerDialerDialRequestMod {
  
  @JSImport("libp2p/dist/src/connection-manager/dialer/dial-request", "DialRequest")
  @js.native
  open class DialRequest protected () extends StObject {
    /**
      * Manages running the `dialAction` on multiple provided `addrs` in parallel
      * up to a maximum determined by the number of tokens returned
      * from `dialer.getTokens`. Once a DialRequest is created, it can be
      * started using `DialRequest.run(options)`. Once a single dial has succeeded,
      * all other dials in the request will be cancelled.
      */
    def this(options: DialRequestOptions) = this()
    
    /* private */ val addrs: Any = js.native
    
    /* private */ val dialAction: Any = js.native
    
    /* private */ val dialer: Any = js.native
    
    def run(): js.Promise[Connection] = js.native
    def run(options: AbortOptions): js.Promise[Connection] = js.native
  }
  
  type DialAction = js.Function2[/* m */ Multiaddr_, /* options */ AbortOptions, js.Promise[Connection]]
  
  trait DialRequestOptions extends StObject {
    
    var addrs: js.Array[Multiaddr_]
    
    def dialAction(m: Multiaddr_, options: AbortOptions): js.Promise[Connection]
    @JSName("dialAction")
    var dialAction_Original: DialAction
    
    var dialer: Dialer
  }
  object DialRequestOptions {
    
    inline def apply(
      addrs: js.Array[Multiaddr_],
      dialAction: (/* m */ Multiaddr_, /* options */ AbortOptions) => js.Promise[Connection],
      dialer: Dialer
    ): DialRequestOptions = {
      val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], dialAction = js.Any.fromFunction2(dialAction), dialer = dialer.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialRequestOptions]
    }
    
    extension [Self <: DialRequestOptions](x: Self) {
      
      inline def setAddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
      
      inline def setAddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "addrs", js.Array(value*))
      
      inline def setDialAction(value: (/* m */ Multiaddr_, /* options */ AbortOptions) => js.Promise[Connection]): Self = StObject.set(x, "dialAction", js.Any.fromFunction2(value))
      
      inline def setDialer(value: Dialer): Self = StObject.set(x, "dialer", value.asInstanceOf[js.Any])
    }
  }
}
