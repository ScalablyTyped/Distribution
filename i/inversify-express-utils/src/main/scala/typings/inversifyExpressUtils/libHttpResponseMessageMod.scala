package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.libContentHttpContentMod.HttpContent
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHttpResponseMessageMod {
  
  @JSImport("inversify-express-utils/lib/httpResponseMessage", "HttpResponseMessage")
  @js.native
  open class HttpResponseMessage () extends StObject {
    def this(statusCode: Double) = this()
    
    /* private */ var _content: Any = js.native
    
    /* private */ var _headers: Any = js.native
    
    /* private */ var _statusCode: Any = js.native
    
    def content: HttpContent = js.native
    def content_=(value: HttpContent): Unit = js.native
    
    def headers: OutgoingHttpHeaders = js.native
    def headers_=(headers: OutgoingHttpHeaders): Unit = js.native
    
    def statusCode: Double = js.native
    def statusCode_=(code: Double): Unit = js.native
  }
}
