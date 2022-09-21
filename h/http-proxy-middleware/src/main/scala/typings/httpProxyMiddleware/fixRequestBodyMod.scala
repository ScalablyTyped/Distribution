package typings.httpProxyMiddleware

import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixRequestBodyMod {
  
  @JSImport("http-proxy-middleware/dist/handlers/fix-request-body", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixRequestBody(proxyReq: ClientRequest, req: IncomingMessage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixRequestBody")(proxyReq.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
