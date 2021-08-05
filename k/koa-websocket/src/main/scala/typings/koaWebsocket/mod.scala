package typings.koaWebsocket

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.node.httpMod.IncomingMessage
import typings.node.httpsMod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[StateT, CustomT](app: typings.koa.mod.^[StateT, CustomT]): App[StateT, CustomT] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[App[StateT, CustomT]]
  inline def apply[StateT, CustomT](app: typings.koa.mod.^[StateT, CustomT], wsOptions: Unit, httpsOptions: ServerOptions): App[StateT, CustomT] = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], wsOptions.asInstanceOf[js.Any], httpsOptions.asInstanceOf[js.Any])).asInstanceOf[App[StateT, CustomT]]
  inline def apply[StateT, CustomT](app: typings.koa.mod.^[StateT, CustomT], wsOptions: typings.ws.mod.ServerOptions): App[StateT, CustomT] = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], wsOptions.asInstanceOf[js.Any])).asInstanceOf[App[StateT, CustomT]]
  inline def apply[StateT, CustomT](
    app: typings.koa.mod.^[StateT, CustomT],
    wsOptions: typings.ws.mod.ServerOptions,
    httpsOptions: ServerOptions
  ): App[StateT, CustomT] = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], wsOptions.asInstanceOf[js.Any], httpsOptions.asInstanceOf[js.Any])).asInstanceOf[App[StateT, CustomT]]
  
  @JSImport("koa-websocket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("koa-websocket", "Server")
  @js.native
  class Server[StateT, CustomT] protected () extends StObject {
    def this(app: typings.koa.mod.^[StateT, CustomT]) = this()
    
    var app: App[DefaultState, DefaultContext] = js.native
    
    def listen(options: typings.ws.mod.ServerOptions): typings.ws.mod.Server = js.native
    
    var middleware: js.Array[Middleware[StateT, CustomT]] = js.native
    
    def onConnection(socket: typings.ws.mod.^, request: IncomingMessage): Unit = js.native
    
    var server: js.UndefOr[typings.ws.mod.Server] = js.native
    
    def use(middleware: Middleware[StateT, CustomT]): this.type = js.native
  }
  
  @js.native
  trait App[StateT, CustomT]
    extends typings.koa.mod.^[StateT, CustomT] {
    
    var ws: Server[StateT, CustomT] = js.native
  }
  
  type Middleware[StateT, CustomT] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compose.Middleware<MiddlewareContext<StateT> & CustomT> */ js.Any
  
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
      
      var websocket: typings.ws.mod.^
    }
    object Context {
      
      inline def apply(path: String, websocket: typings.ws.mod.^): typings.koaWebsocket.mod.koaAugmentingMod.Context = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], websocket = websocket.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.koaWebsocket.mod.koaAugmentingMod.Context]
      }
      
      extension [Self <: typings.koaWebsocket.mod.koaAugmentingMod.Context](x: Self) {
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setWebsocket(value: typings.ws.mod.^): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
      }
    }
  }
}
