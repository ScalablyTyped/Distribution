package typings.koaWebsocket

import org.scalablytyped.runtime.Instantiable1
import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.node.httpsMod.ServerOptions
import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[StateT, ContextT](app: typings.koa.mod.^[StateT, ContextT]): App[StateT, ContextT] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[App[StateT, ContextT]]
  inline def apply[StateT, ContextT](
    app: typings.koa.mod.^[StateT, ContextT],
    wsOptions: Unit,
    httpsOptions: ServerOptions[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typings.node.httpMod.IncomingMessage]
      ]
    ]
  ): App[StateT, ContextT] = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], wsOptions.asInstanceOf[js.Any], httpsOptions.asInstanceOf[js.Any])).asInstanceOf[App[StateT, ContextT]]
  inline def apply[StateT, ContextT](app: typings.koa.mod.^[StateT, ContextT], wsOptions: typings.ws.mod.ServerOptions): App[StateT, ContextT] = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], wsOptions.asInstanceOf[js.Any])).asInstanceOf[App[StateT, ContextT]]
  inline def apply[StateT, ContextT](
    app: typings.koa.mod.^[StateT, ContextT],
    wsOptions: typings.ws.mod.ServerOptions,
    httpsOptions: ServerOptions[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typings.node.httpMod.IncomingMessage]
      ]
    ]
  ): App[StateT, ContextT] = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], wsOptions.asInstanceOf[js.Any], httpsOptions.asInstanceOf[js.Any])).asInstanceOf[App[StateT, ContextT]]
  
  @JSImport("koa-websocket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("koa-websocket", "Server")
  @js.native
  open class Server[StateT, ContextT] protected () extends StObject {
    def this(app: typings.koa.mod.^[StateT, ContextT]) = this()
    
    var app: App[DefaultState, DefaultContext] = js.native
    
    def listen(options: typings.ws.mod.ServerOptions): typings.ws.mod.Server[WebSocket] = js.native
    
    var middleware: js.Array[Middleware[StateT, ContextT]] = js.native
    
    def onConnection(socket: WebSocket, request: typings.node.httpMod.IncomingMessage): Unit = js.native
    
    var server: js.UndefOr[typings.ws.mod.Server[WebSocket]] = js.native
    
    def use(middleware: Middleware[StateT, ContextT]): this.type = js.native
  }
  
  @js.native
  trait App[StateT, ContextT]
    extends typings.koa.mod.^[StateT, ContextT] {
    
    var ws: Server[StateT, ContextT] = js.native
  }
  
  type Middleware[StateT, ContextT] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compose.Middleware<MiddlewareContext<StateT> & ContextT> */ Any
  
  @js.native
  trait MiddlewareContext[StateT]
    extends StObject
       with Context {
    
    // Limitation: Declaration merging cannot overwrap existing properties.
    // That's why this property is here, not in the merged declaration above.
    @JSName("app")
    var app_MiddlewareContext: App[DefaultState, DefaultContext] = js.native
    
    @JSName("state")
    var state_MiddlewareContext: StateT = js.native
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait Context extends StObject {
      
      var path: String
      
      var websocket: WebSocket
    }
    object Context {
      
      inline def apply(path: String, websocket: WebSocket): typings.koaWebsocket.mod.koaAugmentingMod.Context = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], websocket = websocket.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.koaWebsocket.mod.koaAugmentingMod.Context]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.koaWebsocket.mod.koaAugmentingMod.Context] (val x: Self) extends AnyVal {
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setWebsocket(value: WebSocket): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
      }
    }
  }
}
