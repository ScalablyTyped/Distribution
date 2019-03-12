package typings
package httpDashProxyLib.httpDashProxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends nodeLib.eventsMod.EventEmitter {
  def addListener(event: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * A function that closes the inner webserver and stops listening on given port
    */
  def close(): scala.Unit = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * A function that wraps the object in a webserver, for your convenience
    * @param port - Port to listen on
    */
  def listen(port: scala.Double): Server = js.native
  def on(event: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_close(
    event: httpDashProxyLib.httpDashProxyLibStrings.close,
    listener: js.Function3[
      /* proxyRes */ nodeLib.httpMod.IncomingMessage, 
      /* proxySocket */ nodeLib.netMod.Socket, 
      /* proxyHead */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_econnreset(
    event: httpDashProxyLib.httpDashProxyLibStrings.econnreset,
    listener: js.Function4[
      /* err */ stdLib.Error, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      /* target */ httpDashProxyLib.ProxyTargetUrl, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_end(
    event: httpDashProxyLib.httpDashProxyLibStrings.end,
    listener: js.Function3[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      /* proxyRes */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: httpDashProxyLib.httpDashProxyLibStrings.error, listener: httpDashProxyLib.ErrorCallback): this.type = js.native
  @JSName("on")
  def on_proxyReq(
    event: httpDashProxyLib.httpDashProxyLibStrings.proxyReq,
    listener: js.Function4[
      /* proxyReq */ nodeLib.httpMod.ClientRequest, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      /* options */ httpDashProxyLib.httpDashProxyMod.ServerNs.ServerOptions, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_proxyReqWs(
    event: httpDashProxyLib.httpDashProxyLibStrings.proxyReqWs,
    listener: js.Function5[
      /* proxyReq */ nodeLib.httpMod.ClientRequest, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* socket */ nodeLib.netMod.Socket, 
      /* options */ httpDashProxyLib.httpDashProxyMod.ServerNs.ServerOptions, 
      /* head */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_proxyRes(
    event: httpDashProxyLib.httpDashProxyLibStrings.proxyRes,
    listener: js.Function3[
      /* proxyRes */ nodeLib.httpMod.IncomingMessage, 
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_start(
    event: httpDashProxyLib.httpDashProxyLibStrings.start,
    listener: js.Function3[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      /* target */ httpDashProxyLib.ProxyTargetUrl, 
      scala.Unit
    ]
  ): this.type = js.native
  def once(event: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  def removeListener(event: java.lang.String, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Used for proxying regular HTTP(S) requests
    * @param req - Client request.
    * @param res - Client response.
    * @param options - Additionnal options.
    */
  def web(req: nodeLib.httpMod.IncomingMessage, res: nodeLib.httpMod.ServerResponse): scala.Unit = js.native
  def web(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    options: httpDashProxyLib.httpDashProxyMod.ServerNs.ServerOptions
  ): scala.Unit = js.native
  def web(
    req: nodeLib.httpMod.IncomingMessage,
    res: nodeLib.httpMod.ServerResponse,
    options: httpDashProxyLib.httpDashProxyMod.ServerNs.ServerOptions,
    callback: httpDashProxyLib.ErrorCallback
  ): scala.Unit = js.native
  /**
    * Used for proxying regular HTTP(S) requests
    * @param req - Client request.
    * @param socket - Client socket.
    * @param head - Client head.
    * @param options - Additionnal options.
    */
  def ws(req: nodeLib.httpMod.IncomingMessage, socket: js.Any, head: js.Any): scala.Unit = js.native
  def ws(
    req: nodeLib.httpMod.IncomingMessage,
    socket: js.Any,
    head: js.Any,
    options: httpDashProxyLib.httpDashProxyMod.ServerNs.ServerOptions
  ): scala.Unit = js.native
}

