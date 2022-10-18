package typings.httpProxyMiddleware

import typings.httpProxyMiddleware.distHandlersResponseInterceptorMod.Interceptor
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHandlersMod {
  
  @JSImport("http-proxy-middleware/dist/handlers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixRequestBody(proxyReq: ClientRequest, req: IncomingMessage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixRequestBody")(proxyReq.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def responseInterceptor(interceptor: Interceptor): js.Function3[
    /* proxyRes */ IncomingMessage, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    js.Promise[Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("responseInterceptor")(interceptor.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* proxyRes */ IncomingMessage, 
    /* req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    js.Promise[Unit]
  ]]
}
