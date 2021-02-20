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
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def CancelError(message: String, name: typings.got.gotStrings.CancelError): typings.got.mod.CancelError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.got.mod.CancelError]
  }
  
  @scala.inline
  def HTTPError(
    body: Buffer | String | js.Object,
    headers: IncomingHttpHeaders,
    message: String,
    name: typings.got.gotStrings.HTTPError,
    statusCode: Double,
    statusMessage: String
  ): typings.got.mod.HTTPError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.got.mod.HTTPError]
  }
  
  @scala.inline
  def MaxRedirectsError(
    message: String,
    name: typings.got.gotStrings.MaxRedirectsError,
    redirectUrls: js.Array[String],
    statusCode: Double,
    statusMessage: String
  ): typings.got.mod.MaxRedirectsError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], redirectUrls = redirectUrls.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.got.mod.MaxRedirectsError]
  }
  
  @scala.inline
  def ParseError(
    message: String,
    name: typings.got.gotStrings.ParseError,
    statusCode: Double,
    statusMessage: String
  ): typings.got.mod.ParseError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.got.mod.ParseError]
  }
  
  @scala.inline
  def ReadError(message: String, name: typings.got.gotStrings.ReadError): typings.got.mod.ReadError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.got.mod.ReadError]
  }
  
  @scala.inline
  def RequestError(message: String, name: typings.got.gotStrings.RequestError): typings.got.mod.RequestError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.got.mod.RequestError]
  }
  
  @scala.inline
  def TimeoutError(
    event: lookup | connect | secureConnect | socket | response | send | request,
    message: String,
    name: typings.got.gotStrings.TimeoutError
  ): typings.got.mod.TimeoutError = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.got.mod.TimeoutError]
  }
  
  @scala.inline
  def UnsupportedProtocolError(message: String, name: typings.got.gotStrings.UnsupportedProtocolError): typings.got.mod.UnsupportedProtocolError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.got.mod.UnsupportedProtocolError]
  }
}
