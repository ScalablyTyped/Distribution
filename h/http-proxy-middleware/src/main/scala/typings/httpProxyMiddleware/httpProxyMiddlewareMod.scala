package typings.httpProxyMiddleware

import typings.httpProxyMiddleware.typesMod.Filter
import typings.httpProxyMiddleware.typesMod.Options
import typings.httpProxyMiddleware.typesMod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpProxyMiddlewareMod {
  
  @JSImport("http-proxy-middleware/dist/http-proxy-middleware", "HttpProxyMiddleware")
  @js.native
  open class HttpProxyMiddleware protected () extends StObject {
    def this(context: Filter) = this()
    def this(context: Options) = this()
    def this(context: Filter, opts: Options) = this()
    def this(context: Options, opts: Options) = this()
    
    /* private */ var applyPathRewrite: Any = js.native
    
    /* private */ var applyRouter: Any = js.native
    
    /* private */ var catchUpgradeRequest: Any = js.native
    
    /* private */ var config: Any = js.native
    
    /* private */ var handleUpgrade: Any = js.native
    
    /* private */ var logError: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    var middleware: RequestHandler = js.native
    
    /* private */ var pathRewriter: Any = js.native
    
    /**
      * Apply option.router and option.pathRewrite
      * Order matters:
      *    Router uses original path for routing;
      *    NOT the modified path, after it has been rewritten by pathRewrite
      * @param {Object} req
      * @return {Object} proxy options
      */
    /* private */ var prepareProxyRequest: Any = js.native
    
    /* private */ var proxy: Any = js.native
    
    /* private */ var proxyOptions: Any = js.native
    
    /* private */ var serverOnCloseSubscribed: Any = js.native
    
    /**
      * Determine whether request should be proxied.
      *
      * @private
      * @param  {String} context [description]
      * @param  {Object} req     [description]
      * @return {Boolean}
      */
    /* private */ var shouldProxy: Any = js.native
    
    /* private */ var wsInternalSubscribed: Any = js.native
  }
}
