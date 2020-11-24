package typings.gulpConnect.mod

import typings.connect.mod.HandleFunction
import typings.gulpConnect.anon.TypeofconnectModule
import typings.node.httpMod.Server
import typings.node.httpsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectAppOptions extends js.Object {
  
  /** Whether or not to log debug messages. Defaults to false. */
  var debug: js.UndefOr[Boolean] = js.native
  
  /** File to serve if url results in a 404. Defaults to undefined */
  var fallback: js.UndefOr[String] = js.native
  
  /** Host to bind server to. Defaults to localhost. */
  var host: js.UndefOr[String] = js.native
  
  /**
    * Options to pass to http.createServer (or false to disable https).
    * Defaults to false. When https is just set to true, then internally
    * some defaults will be used.
    */
  var https: js.UndefOr[Boolean | ServerOptions] = js.native
  
  /** Value to pass into the serve-static's index option. See serve-static documentation for details. Defaults to true. */
  var index: js.UndefOr[Boolean | String | js.Array[String]] = js.native
  
  /** Enable/disable livereload or set live reload options. Defaults to false. */
  var livereload: js.UndefOr[Boolean | LiveReloadOptions] = js.native
  
  /** Middleware factory function which should return a list of connect handler functions . Defaults to () => []; */
  var middleware: js.UndefOr[MiddlewareFactory] = js.native
  
  /** The name of this server. Used in logs. Defaults to "Server". */
  var name: js.UndefOr[String] = js.native
  
  /** The connect webserver port. Defaults to 8080 */
  var port: js.UndefOr[Double] = js.native
  
  /** The root path. Defaults to directory with gulpfile */
  var root: js.UndefOr[String | js.Array[String]] = js.native
  
  /** A function to run custom initialization on the underlying http or https server */
  var serverInit: js.UndefOr[js.Function1[/* server */ Server | typings.node.httpsMod.Server, Unit]] = js.native
  
  /** Don't log any messages. Defaults to false. */
  var silent: js.UndefOr[Boolean] = js.native
}
object ConnectAppOptions {
  
  @scala.inline
  def apply(): ConnectAppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectAppOptions]
  }
  
  @scala.inline
  implicit class ConnectAppOptionsOps[Self <: ConnectAppOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setFallback(value: String): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHttps(value: Boolean | ServerOptions): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Boolean | String | js.Array[String]): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLivereload(value: Boolean | LiveReloadOptions): Self = this.set("livereload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLivereload: Self = this.set("livereload", js.undefined)
    
    @scala.inline
    def setMiddleware(
      value: (/* connect */ js.Function0[typings.connect.mod.Server] with TypeofconnectModule, /* options */ ConnectAppOptions) => js.Array[HandleFunction | ConnectRouteHandler]
    ): Self = this.set("middleware", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMiddleware: Self = this.set("middleware", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setRootVarargs(value: String*): Self = this.set("root", js.Array(value :_*))
    
    @scala.inline
    def setRoot(value: String | js.Array[String]): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setServerInit(value: /* server */ Server | typings.node.httpsMod.Server => Unit): Self = this.set("serverInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteServerInit: Self = this.set("serverInit", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
}
