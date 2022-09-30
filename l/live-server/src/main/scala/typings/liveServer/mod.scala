package typings.liveServer

import typings.liveServer.liveServerInts.`0`
import typings.liveServer.liveServerInts.`1`
import typings.liveServer.liveServerInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("live-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shutdown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")().asInstanceOf[Unit]
  
  inline def start(params: LiveServerParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait LiveServerParams extends StObject {
    
    /** When set, serve this file (server root relative) for every 404 (useful for single-page applications). */
    var file: js.UndefOr[String] = js.undefined
    
    /**  Set the address to bind to. Defaults to 0.0.0.0 or process.env.IP. */
    var host: js.UndefOr[String] = js.undefined
    
    /** Comma-separated string for paths to ignore. */
    var ignore: js.UndefOr[String] = js.undefined
    
    /** 0 = errors only, 1 = some, 2 = lots */
    var logLevel: js.UndefOr[`0` | `1` | `2`] = js.undefined
    
    /** Takes an array of Connect-compatible middleware that are injected into the server middleware stack. */
    var middleware: js.UndefOr[js.Array[js.Function3[/* req */ Any, /* res */ Any, /* next */ Any, Unit]]] = js.undefined
    
    /** Mount a directory to a route. */
    var mount: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
    
    /** When false, it won't load your browser by default. */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /** Set the server port. Defaults to 8080. */
    var port: js.UndefOr[Double] = js.undefined
    
    /** Set root directory that's being served. Defaults to cwd. */
    var root: js.UndefOr[String] = js.undefined
    
    /** Waits for all changes, before reloading. Defaults to 0 sec. */
    @JSName("wait")
    var wait_FLiveServerParams: js.UndefOr[Double] = js.undefined
  }
  object LiveServerParams {
    
    inline def apply(): LiveServerParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LiveServerParams]
    }
    
    extension [Self <: LiveServerParams](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setLogLevel(value: `0` | `1` | `2`): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMiddleware(value: js.Array[js.Function3[/* req */ Any, /* res */ Any, /* next */ Any, Unit]]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
      
      inline def setMiddlewareVarargs(value: (js.Function3[/* req */ Any, /* res */ Any, /* next */ Any, Unit])*): Self = StObject.set(x, "middleware", js.Array(value*))
      
      inline def setMount(value: js.Array[js.Array[String]]): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      inline def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
      
      inline def setMountVarargs(value: js.Array[String]*): Self = StObject.set(x, "mount", js.Array(value*))
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
}
