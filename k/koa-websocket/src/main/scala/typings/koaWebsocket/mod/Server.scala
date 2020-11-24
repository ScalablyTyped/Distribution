package typings.koaWebsocket.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.node.httpMod.IncomingMessage
import typings.ws.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("koa-websocket", "Server")
@js.native
class Server[StateT, CustomT] protected () extends js.Object {
  def this(app: typings.koa.mod.^[StateT, CustomT]) = this()
  
  var app: App[DefaultState, DefaultContext] = js.native
  
  def listen(options: ServerOptions): typings.ws.mod.Server = js.native
  
  var middleware: js.Array[Middleware[StateT, CustomT]] = js.native
  
  def onConnection(socket: typings.ws.mod.^, request: IncomingMessage): Unit = js.native
  
  var server: js.UndefOr[typings.ws.mod.Server] = js.native
  
  def use(middleware: Middleware[StateT, CustomT]): this.type = js.native
}
