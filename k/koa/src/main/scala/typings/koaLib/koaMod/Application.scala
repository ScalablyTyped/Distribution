package typings
package koaLib.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application[StateT, CustomT]
  extends nodeLib.eventsMod.EventEmitter {
  var context: koaLib.koaMod.ApplicationNs.BaseContext with CustomT = js.native
  var env: java.lang.String = js.native
  var keys: keygripLib.keygripMod.Keygrip | js.Array[java.lang.String] = js.native
  var middleware: js.Array[koaLib.koaMod.ApplicationNs.Middleware[StateT, CustomT]] = js.native
  var proxy: scala.Boolean = js.native
  var request: koaLib.koaMod.ApplicationNs.BaseRequest = js.native
  var response: koaLib.koaMod.ApplicationNs.BaseResponse = js.native
  var silent: scala.Boolean = js.native
  var subdomainOffset: scala.Double = js.native
  /**
    * Return a request handler callback
    * for node's native http/http2 server.
    */
  def callback(): js.Function2[
    /* req */ nodeLib.httpMod.IncomingMessage | nodeLib.http2Mod.Http2ServerRequest, 
    /* res */ nodeLib.httpMod.ServerResponse | nodeLib.http2Mod.Http2ServerResponse, 
    scala.Unit
  ] = js.native
  /**
    * Initialize a new context.
    *
    * @api private
    */
  def createContext[StateT](req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): koaLib.koaMod.ApplicationNs.ParameterizedContext[StateT, js.Object] = js.native
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
  def listen(): nodeLib.httpMod.Server = js.native
  def listen(handle: js.Any): nodeLib.httpMod.Server = js.native
  def listen(handle: js.Any, backlog: scala.Double): nodeLib.httpMod.Server = js.native
  def listen(handle: js.Any, backlog: scala.Double, listeningListener: js.Function0[scala.Unit]): nodeLib.httpMod.Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function0[scala.Unit]): nodeLib.httpMod.Server = js.native
  def listen(options: nodeLib.netMod.ListenOptions): nodeLib.httpMod.Server = js.native
  def listen(options: nodeLib.netMod.ListenOptions, listeningListener: js.Function0[scala.Unit]): nodeLib.httpMod.Server = js.native
  def listen(path: java.lang.String): nodeLib.httpMod.Server = js.native
  def listen(path: java.lang.String, backlog: scala.Double): nodeLib.httpMod.Server = js.native
  def listen(path: java.lang.String, backlog: scala.Double, listeningListener: js.Function0[scala.Unit]): nodeLib.httpMod.Server = js.native
  def listen(path: java.lang.String, listeningListener: js.Function0[scala.Unit]): nodeLib.httpMod.Server = js.native
  def listen(port: scala.Double): nodeLib.httpMod.Server = js.native
  def listen(port: scala.Double, backlog: scala.Double): nodeLib.httpMod.Server = js.native
  def listen(port: scala.Double, backlog: scala.Double, listeningListener: js.Function0[scala.Unit]): nodeLib.httpMod.Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String): nodeLib.httpMod.Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String, backlog: scala.Double): nodeLib.httpMod.Server = js.native
  def listen(
    port: scala.Double,
    hostname: java.lang.String,
    backlog: scala.Double,
    listeningListener: js.Function0[scala.Unit]
  ): nodeLib.httpMod.Server = js.native
  def listen(port: scala.Double, hostname: java.lang.String, listeningListener: js.Function0[scala.Unit]): nodeLib.httpMod.Server = js.native
  def listen(port: scala.Double, listeningListener: js.Function0[scala.Unit]): nodeLib.httpMod.Server = js.native
  /**
    * Default error handler.
    *
    * @api private
    */
  def onerror(err: nodeLib.Error): scala.Unit = js.native
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
  def use[NewStateT, NewCustomT](middleware: koaLib.koaMod.ApplicationNs.Middleware[StateT with NewStateT, CustomT with NewCustomT]): Application[StateT with NewStateT, CustomT with NewCustomT] = js.native
}

