package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.httpContentMod.HttpContent
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpResponseMessageMod {
  
  @JSImport("inversify-express-utils/dts/httpResponseMessage", "HttpResponseMessage")
  @js.native
  class HttpResponseMessage () extends StObject {
    def this(statusCode: Double) = this()
    
    var _content: js.Any = js.native
    
    var _headers: js.Any = js.native
    
    var _statusCode: js.Any = js.native
    
    var content: HttpContent = js.native
    
    var headers: OutgoingHttpHeaders = js.native
    
    var statusCode: Double = js.native
  }
}
