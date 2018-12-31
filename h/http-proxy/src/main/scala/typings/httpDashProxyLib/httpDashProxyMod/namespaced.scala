package typings
package httpDashProxyLib.httpDashProxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-proxy", JSImport.Namespace)
@js.native
/**
  * Creates the proxy server with specified options.
  * @param options - Config object passed to the proxy
  */
class namespaced () extends Server {
  def this(options: httpDashProxyLib.httpDashProxyMod.ServerNs.ServerOptions) = this()
}

@JSImport("http-proxy", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
    * Creates the proxy server with specified options.
    * @param options Config object passed to the proxy
    * @returns Proxy object with handlers for `ws` and `web` requests
    */
  def createProxy(): httpDashProxyLib.httpDashProxyMod.Server = js.native
  def createProxy(options: httpDashProxyLib.httpDashProxyMod.ServerNs.ServerOptions): httpDashProxyLib.httpDashProxyMod.Server = js.native
  /**
    * Creates the proxy server with specified options.
    * @param options Config object passed to the proxy
    * @returns Proxy object with handlers for `ws` and `web` requests
    */
  def createProxyServer(): httpDashProxyLib.httpDashProxyMod.Server = js.native
  def createProxyServer(options: httpDashProxyLib.httpDashProxyMod.ServerNs.ServerOptions): httpDashProxyLib.httpDashProxyMod.Server = js.native
  /**
    * Creates the proxy server with specified options.
    * @param options Config object passed to the proxy
    * @returns Proxy object with handlers for `ws` and `web` requests
    */
  def createServer(): httpDashProxyLib.httpDashProxyMod.Server = js.native
  def createServer(options: httpDashProxyLib.httpDashProxyMod.ServerNs.ServerOptions): httpDashProxyLib.httpDashProxyMod.Server = js.native
}

