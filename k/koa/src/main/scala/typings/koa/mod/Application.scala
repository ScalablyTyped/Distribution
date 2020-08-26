package typings.koa.mod

import typings.keygrip.mod.Keygrip
import typings.node.eventsMod.EventEmitter
import typings.node.http2Mod.Http2ServerRequest
import typings.node.http2Mod.Http2ServerResponse
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.netMod.ListenOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application[StateT, CustomT] extends EventEmitter {
  var context: BaseContext with CustomT = js.native
  var env: String = js.native
  var keys: Keygrip | js.Array[String] = js.native
  var maxIpsCount: Double = js.native
  var middleware: js.Array[Middleware[StateT, CustomT]] = js.native
  var proxy: Boolean = js.native
  var proxyIpHeader: String = js.native
  var request: BaseRequest = js.native
  var response: BaseResponse = js.native
  var silent: Boolean = js.native
  var subdomainOffset: Double = js.native
  /**
    * Return a request handler callback
    * for node's native http/http2 server.
    */
  def callback(): js.Function2[
    /* req */ IncomingMessage | Http2ServerRequest, 
    /* res */ ServerResponse | Http2ServerResponse, 
    js.Promise[Unit]
  ] = js.native
  /**
    * Initialize a new context.
    *
    * @api private
    */
  def createContext[StateT](req: IncomingMessage, res: ServerResponse): ParameterizedContext[StateT, DefaultContext] = js.native
  /**
    * Return JSON representation.
    * We only bother showing settings.
    */
  def inspect(): js.Any = js.native
  /**
    * Shorthand for:
    *
    *    http.createServer(app.callback()).listen(...)
    */
  def listen(): Server = js.native
  def listen(handle: js.Any): Server = js.native
  def listen(handle: js.Any, backlog: js.UndefOr[scala.Nothing], listeningListener: js.Function0[Unit]): Server = js.native
  def listen(handle: js.Any, backlog: Double): Server = js.native
  def listen(handle: js.Any, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(options: ListenOptions): Server = js.native
  def listen(options: ListenOptions, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(path: String): Server = js.native
  def listen(path: String, backlog: js.UndefOr[scala.Nothing], listeningListener: js.Function0[Unit]): Server = js.native
  def listen(path: String, backlog: Double): Server = js.native
  def listen(path: String, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(path: String, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(
    port: js.UndefOr[scala.Nothing],
    hostname: js.UndefOr[scala.Nothing],
    backlog: js.UndefOr[scala.Nothing],
    listeningListener: js.Function0[Unit]
  ): Server = js.native
  def listen(port: js.UndefOr[scala.Nothing], hostname: js.UndefOr[scala.Nothing], backlog: Double): Server = js.native
  def listen(
    port: js.UndefOr[scala.Nothing],
    hostname: js.UndefOr[scala.Nothing],
    backlog: Double,
    listeningListener: js.Function0[Unit]
  ): Server = js.native
  def listen(port: js.UndefOr[scala.Nothing], hostname: String): Server = js.native
  def listen(
    port: js.UndefOr[scala.Nothing],
    hostname: String,
    backlog: js.UndefOr[scala.Nothing],
    listeningListener: js.Function0[Unit]
  ): Server = js.native
  def listen(port: js.UndefOr[scala.Nothing], hostname: String, backlog: Double): Server = js.native
  def listen(
    port: js.UndefOr[scala.Nothing],
    hostname: String,
    backlog: Double,
    listeningListener: js.Function0[Unit]
  ): Server = js.native
  def listen(port: Double): Server = js.native
  def listen(port: Double, backlog: Double): Server = js.native
  def listen(port: Double, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(
    port: Double,
    hostname: js.UndefOr[scala.Nothing],
    backlog: js.UndefOr[scala.Nothing],
    listeningListener: js.Function0[Unit]
  ): Server = js.native
  def listen(port: Double, hostname: js.UndefOr[scala.Nothing], backlog: Double): Server = js.native
  def listen(
    port: Double,
    hostname: js.UndefOr[scala.Nothing],
    backlog: Double,
    listeningListener: js.Function0[Unit]
  ): Server = js.native
  def listen(port: Double, hostname: js.UndefOr[scala.Nothing], listeningListener: js.Function0[Unit]): Server = js.native
  def listen(port: Double, hostname: String): Server = js.native
  def listen(
    port: Double,
    hostname: String,
    backlog: js.UndefOr[scala.Nothing],
    listeningListener: js.Function0[Unit]
  ): Server = js.native
  def listen(port: Double, hostname: String, backlog: Double): Server = js.native
  def listen(port: Double, hostname: String, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(port: Double, hostname: String, listeningListener: js.Function0[Unit]): Server = js.native
  def listen(port: Double, listeningListener: js.Function0[Unit]): Server = js.native
  /**
    * Default error handler.
    *
    * @api private
    */
  def onerror(err: Error): Unit = js.native
  /**
    * Return JSON representation.
    * We only bother showing settings.
    */
  def toJSON(): js.Any = js.native
  /**
    * Use the given middleware `fn`.
    *
    * Old-style middleware will be converted.
    */
  def use[NewStateT, NewCustomT](middleware: Middleware[StateT with NewStateT, CustomT with NewCustomT]): Application[StateT with NewStateT, CustomT with NewCustomT] = js.native
}

