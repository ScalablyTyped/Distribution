package typings.got.mod

import typings.got.gotStrings.connect
import typings.got.gotStrings.lookup
import typings.got.gotStrings.request
import typings.got.gotStrings.response
import typings.got.gotStrings.secureConnect
import typings.got.gotStrings.send
import typings.got.gotStrings.socket
import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.got.mod.RequestError
  - typings.got.mod.ReadError
  - typings.got.mod.ParseError
  - typings.got.mod.HTTPError
  - typings.got.mod.MaxRedirectsError
  - typings.got.mod.UnsupportedProtocolError
  - typings.got.mod.CancelError
  - typings.got.mod.TimeoutError
*/
trait GotError extends StObject
object GotError {
  
  inline def CancelError(message: String): typings.got.mod.CancelError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "CancelError")
    __obj.asInstanceOf[typings.got.mod.CancelError]
  }
  
  inline def HTTPError(
    body: Buffer | String | js.Object,
    headers: IncomingHttpHeaders,
    message: String,
    statusCode: Double,
    statusMessage: String
  ): typings.got.mod.HTTPError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = "HTTPError", statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.got.mod.HTTPError]
  }
  
  inline def MaxRedirectsError(message: String, redirectUrls: js.Array[String], statusCode: Double, statusMessage: String): typings.got.mod.MaxRedirectsError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "MaxRedirectsError", redirectUrls = redirectUrls.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.got.mod.MaxRedirectsError]
  }
  
  inline def ParseError(message: String, statusCode: Double, statusMessage: String): typings.got.mod.ParseError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "ParseError", statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.got.mod.ParseError]
  }
  
  inline def ReadError(message: String): typings.got.mod.ReadError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "ReadError")
    __obj.asInstanceOf[typings.got.mod.ReadError]
  }
  
  inline def RequestError(message: String): typings.got.mod.RequestError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "RequestError")
    __obj.asInstanceOf[typings.got.mod.RequestError]
  }
  
  inline def TimeoutError(event: lookup | connect | secureConnect | socket | response | send | request, message: String): typings.got.mod.TimeoutError = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = "TimeoutError")
    __obj.asInstanceOf[typings.got.mod.TimeoutError]
  }
  
  inline def UnsupportedProtocolError(message: String): typings.got.mod.UnsupportedProtocolError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "UnsupportedProtocolError")
    __obj.asInstanceOf[typings.got.mod.UnsupportedProtocolError]
  }
}
