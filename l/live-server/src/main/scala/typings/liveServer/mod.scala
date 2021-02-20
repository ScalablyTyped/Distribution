package typings.liveServer

import typings.liveServer.liveServerNumbers.`0`
import typings.liveServer.liveServerNumbers.`1`
import typings.liveServer.liveServerNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("live-server", "shutdown")
  @js.native
  def shutdown(): Unit = js.native
  
  @JSImport("live-server", "start")
  @js.native
  def start(params: LiveServerParams): Unit = js.native
  
  @js.native
  trait LiveServerParams extends StObject {
    
    /** When set, serve this file (server root relative) for every 404 (useful for single-page applications). */
    var file: js.UndefOr[String] = js.native
    
    /**  Set the address to bind to. Defaults to 0.0.0.0 or process.env.IP. */
    var host: js.UndefOr[String] = js.native
    
    /** Comma-separated string for paths to ignore. */
    var ignore: js.UndefOr[String] = js.native
    
    /** 0 = errors only, 1 = some, 2 = lots */
    var logLevel: js.UndefOr[`0` | `1` | `2`] = js.native
    
    /** Takes an array of Connect-compatible middleware that are injected into the server middleware stack. */
    var middleware: js.UndefOr[js.Array[js.Function3[/* req */ _, /* res */ _, /* next */ _, Unit]]] = js.native
    
    /** Mount a directory to a route. */
    var mount: js.UndefOr[js.Array[js.Array[String]]] = js.native
    
    /** When false, it won't load your browser by default. */
    var open: js.UndefOr[Boolean] = js.native
    
    /** Set the server port. Defaults to 8080. */
    var port: js.UndefOr[Double] = js.native
    
    /** Set root directory that's being served. Defaults to cwd. */
    var root: js.UndefOr[String] = js.native
    
    /** Waits for all changes, before reloading. Defaults to 0 sec. */
    @JSName("wait")
    var wait_FLiveServerParams: js.UndefOr[Double] = js.native
  }
  object LiveServerParams {
    
    @scala.inline
    def apply(): LiveServerParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LiveServerParams]
    }
    
    @scala.inline
    implicit class LiveServerParamsMutableBuilder[Self <: LiveServerParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setLogLevel(value: `0` | `1` | `2`): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setMiddleware(value: js.Array[js.Function3[/* req */ _, /* res */ _, /* next */ _, Unit]]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
      
      @scala.inline
      def setMiddlewareVarargs(value: (js.Function3[js.Any, js.Any, js.Any, Unit])*): Self = StObject.set(x, "middleware", js.Array(value :_*))
      
      @scala.inline
      def setMount(value: js.Array[js.Array[String]]): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
      
      @scala.inline
      def setMountVarargs(value: js.Array[String]*): Self = StObject.set(x, "mount", js.Array(value :_*))
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
}
