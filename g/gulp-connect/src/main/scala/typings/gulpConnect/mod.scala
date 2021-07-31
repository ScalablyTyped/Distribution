package typings.gulpConnect

import typings.connect.mod.HandleFunction
import typings.node.httpMod.Server
import typings.node.httpsMod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-connect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def reload(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")().asInstanceOf[js.Any]
  
  @scala.inline
  def server(): ConnectAppOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("server")().asInstanceOf[ConnectAppOptions]
  @scala.inline
  def server(options: ConnectAppOptions): ConnectAppOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("server")(options.asInstanceOf[js.Any]).asInstanceOf[ConnectAppOptions]
  
  @scala.inline
  def serverClose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("serverClose")().asInstanceOf[Unit]
  
  trait ConnectAppOptions extends StObject {
    
    /** Whether or not to log debug messages. Defaults to false. */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /** File to serve if url results in a 404. Defaults to undefined */
    var fallback: js.UndefOr[String] = js.undefined
    
    /** Host to bind server to. Defaults to localhost. */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Options to pass to http.createServer (or false to disable https).
      * Defaults to false. When https is just set to true, then internally
      * some defaults will be used.
      */
    var https: js.UndefOr[Boolean | ServerOptions] = js.undefined
    
    /** Value to pass into the serve-static's index option. See serve-static documentation for details. Defaults to true. */
    var index: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
    
    /** Enable/disable livereload or set live reload options. Defaults to false. */
    var livereload: js.UndefOr[Boolean | LiveReloadOptions] = js.undefined
    
    /** Middleware factory function which should return a list of connect handler functions . Defaults to () => []; */
    var middleware: js.UndefOr[MiddlewareFactory] = js.undefined
    
    /** The name of this server. Used in logs. Defaults to "Server". */
    var name: js.UndefOr[String] = js.undefined
    
    /** The connect webserver port. Defaults to 8080 */
    var port: js.UndefOr[Double] = js.undefined
    
    /** The root path. Defaults to directory with gulpfile */
    var root: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** A function to run custom initialization on the underlying http or https server */
    var serverInit: js.UndefOr[js.Function1[/* server */ Server | typings.node.httpsMod.Server, Unit]] = js.undefined
    
    /** Don't log any messages. Defaults to false. */
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectAppOptions {
    
    @scala.inline
    def apply(): ConnectAppOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectAppOptions]
    }
    
    @scala.inline
    implicit class ConnectAppOptionsMutableBuilder[Self <: ConnectAppOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHttps(value: Boolean | ServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setIndex(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
      
      @scala.inline
      def setLivereload(value: Boolean | LiveReloadOptions): Self = StObject.set(x, "livereload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivereloadUndefined: Self = StObject.set(x, "livereload", js.undefined)
      
      @scala.inline
      def setMiddleware(
        value: (/* connect */ js.Function0[typings.connect.mod.Server], /* options */ ConnectAppOptions) => js.Array[HandleFunction | ConnectRouteHandler]
      ): Self = StObject.set(x, "middleware", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRoot(value: String | js.Array[String]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setRootVarargs(value: String*): Self = StObject.set(x, "root", js.Array(value :_*))
      
      @scala.inline
      def setServerInit(value: /* server */ Server | typings.node.httpsMod.Server => Unit): Self = StObject.set(x, "serverInit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setServerInitUndefined: Self = StObject.set(x, "serverInit", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  type ConnectRouteHandler = js.Tuple2[String, HandleFunction]
  
  trait LiveReloadOptions extends StObject {
    
    /** Hostname to bind live reload server to */
    var hostname: js.UndefOr[String] = js.undefined
    
    /** Port to run live reload server on. Defauls to 35729. */
    var port: Double
  }
  object LiveReloadOptions {
    
    @scala.inline
    def apply(port: Double): LiveReloadOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveReloadOptions]
    }
    
    @scala.inline
    implicit class LiveReloadOptionsMutableBuilder[Self <: LiveReloadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  type MiddlewareFactory = js.Function2[
    /* connect */ js.Function0[typings.connect.mod.Server], 
    /* options */ ConnectAppOptions, 
    js.Array[HandleFunction | ConnectRouteHandler]
  ]
}
