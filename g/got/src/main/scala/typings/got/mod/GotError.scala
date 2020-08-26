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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait GotError extends js.Object

object GotError {
  @scala.inline
  def CancelError(message: String, name: typings.got.gotStrings.CancelError): GotError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotError]
  }
  @scala.inline
  def ReadError(message: String, name: typings.got.gotStrings.ReadError): GotError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotError]
  }
  @scala.inline
  def ParseError(
    message: String,
    name: typings.got.gotStrings.ParseError,
    statusCode: Double,
    statusMessage: String
  ): GotError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotError]
  }
  @scala.inline
  def TimeoutError(
    event: lookup | connect | secureConnect | socket | response | send | request,
    message: String,
    name: typings.got.gotStrings.TimeoutError
  ): GotError = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotError]
  }
  @scala.inline
  def UnsupportedProtocolError(message: String, name: typings.got.gotStrings.UnsupportedProtocolError): GotError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotError]
  }
  @scala.inline
  def RequestError(message: String, name: typings.got.gotStrings.RequestError): GotError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotError]
  }
  @scala.inline
  def HTTPError(
    body: Buffer | String | js.Object,
    headers: IncomingHttpHeaders,
    message: String,
    name: typings.got.gotStrings.HTTPError,
    statusCode: Double,
    statusMessage: String
  ): GotError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotError]
  }
  @scala.inline
  def MaxRedirectsError(
    message: String,
    name: typings.got.gotStrings.MaxRedirectsError,
    redirectUrls: js.Array[String],
    statusCode: Double,
    statusMessage: String
  ): GotError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], redirectUrls = redirectUrls.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotError]
  }
}

