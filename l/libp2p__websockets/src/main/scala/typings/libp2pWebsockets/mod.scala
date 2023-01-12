package typings.libp2pWebsockets

import org.scalablytyped.runtime.Instantiable1
import typings.itWs.distSrcClientMod.WebSocketOptions
import typings.libp2pInterfaceTransport.mod.MultiaddrFilter
import typings.libp2pInterfaceTransport.mod.Transport
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/websockets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def webSockets(): js.Function1[/* components */ js.UndefOr[Any], Transport] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSockets")().asInstanceOf[js.Function1[/* components */ js.UndefOr[Any], Transport]]
  inline def webSockets(init: WebSocketsInit): js.Function1[/* components */ js.UndefOr[Any], Transport] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSockets")(init.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* components */ js.UndefOr[Any], Transport]]
  
  trait WebSocketsInit
    extends StObject
       with AbortOptions
       with WebSocketOptions {
    
    var filter: js.UndefOr[MultiaddrFilter] = js.undefined
    
    var server: js.UndefOr[
        Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.undefined
  }
  object WebSocketsInit {
    
    inline def apply(): WebSocketsInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebSocketsInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebSocketsInit] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: /* multiaddrs */ js.Array[Multiaddr_] => js.Array[Multiaddr_]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setServer(
        value: Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
}
