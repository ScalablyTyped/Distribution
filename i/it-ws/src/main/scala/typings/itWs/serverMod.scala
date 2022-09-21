package typings.itWs

import org.scalablytyped.runtime.Instantiable1
import typings.itWs.anon.Port
import typings.itWs.duplexMod.DuplexWebSocket
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import typings.ws.anon.Origin
import typings.ws.mod.AddressInfo
import typings.ws.mod.VerifyClientCallbackAsync
import typings.ws.mod.VerifyClientCallbackSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("it-ws/dist/src/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createServer(): WebSocketServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[WebSocketServer]
  inline def createServer(opts: ServerOptions): WebSocketServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(opts.asInstanceOf[js.Any]).asInstanceOf[WebSocketServer]
  
  trait ServerOptions extends StObject {
    
    var cert: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var onConnection: js.UndefOr[js.Function1[/* connection */ DuplexWebSocket, Unit]] = js.undefined
    
    var server: js.UndefOr[
        (Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]) | (typings.node.httpsMod.Server[
          Instantiable1[/* socket */ Socket, typings.node.nodeHttpMod.IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typings.node.nodeHttpMod.ServerResponse[IncomingMessage]
          ]
        ])
      ] = js.undefined
    
    var verifyClient: js.UndefOr[VerifyClientCallbackAsync | VerifyClientCallbackSync] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    extension [Self <: ServerOptions](x: Self) {
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnConnection(value: /* connection */ DuplexWebSocket => Unit): Self = StObject.set(x, "onConnection", js.Any.fromFunction1(value))
      
      inline def setOnConnectionUndefined: Self = StObject.set(x, "onConnection", js.undefined)
      
      inline def setServer(
        value: (Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]) | (typings.node.httpsMod.Server[
              Instantiable1[/* socket */ Socket, typings.node.nodeHttpMod.IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                typings.node.nodeHttpMod.ServerResponse[IncomingMessage]
              ]
            ])
      ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setVerifyClient(value: VerifyClientCallbackAsync | VerifyClientCallbackSync): Self = StObject.set(x, "verifyClient", value.asInstanceOf[js.Any])
      
      inline def setVerifyClientFunction1(value: /* info */ Origin => Boolean): Self = StObject.set(x, "verifyClient", js.Any.fromFunction1(value))
      
      inline def setVerifyClientFunction2(
        value: (/* info */ Origin, /* callback */ js.Function4[
              /* res */ Boolean, 
              /* code */ js.UndefOr[Double], 
              /* message */ js.UndefOr[String], 
              /* headers */ js.UndefOr[OutgoingHttpHeaders], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "verifyClient", js.Any.fromFunction2(value))
      
      inline def setVerifyClientUndefined: Self = StObject.set(x, "verifyClient", js.undefined)
    }
  }
  
  @js.native
  trait WebSocketServer extends EventEmitter {
    
    def address(): String | AddressInfo | Null = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def listen(addrInfo: Double): js.Promise[WebSocketServer] = js.native
    def listen(addrInfo: Port): js.Promise[WebSocketServer] = js.native
  }
}
