package typings.httpProxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-proxy", JSImport.Namespace)
@js.native
/**
  * Creates the proxy server with specified options.
  * @param options - Config object passed to the proxy
  */
class ^ () extends Server {
  def this(options: ServerOptions) = this()
}
@JSImport("http-proxy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Creates the proxy server with specified options.
    * @param options Config object passed to the proxy
    * @returns Proxy object with handlers for `ws` and `web` requests
    */
  def createProxy(): Server = js.native
  def createProxy(options: ServerOptions): Server = js.native
  
  /**
    * Creates the proxy server with specified options.
    * @param options Config object passed to the proxy
    * @returns Proxy object with handlers for `ws` and `web` requests
    */
  def createProxyServer(): Server = js.native
  def createProxyServer(options: ServerOptions): Server = js.native
  
  /**
    * Creates the proxy server with specified options.
    * @param options Config object passed to the proxy
    * @returns Proxy object with handlers for `ws` and `web` requests
    */
  def createServer(): Server = js.native
  def createServer(options: ServerOptions): Server = js.native
}
