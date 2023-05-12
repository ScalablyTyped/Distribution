package typings.httpsProxyAgent

import typings.httpsProxyAgent.anon.Buffered
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseProxyResponseMod {
  
  @JSImport("https-proxy-agent/dist/parse-proxy-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseProxyResponse(socket: Readable): js.Promise[Buffered] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseProxyResponse")(socket.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffered]]
  
  trait ConnectResponse extends StObject {
    
    var headers: IncomingHttpHeaders
    
    var statusCode: Double
    
    var statusText: String
  }
  object ConnectResponse {
    
    inline def apply(headers: IncomingHttpHeaders, statusCode: Double, statusText: String): ConnectResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectResponse] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
}
