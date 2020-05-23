package typings.mapboxMapboxSdk.mapiErrorMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapiError extends js.Object {
  /**
    * If the server sent a response body, this property exposes that response, parsed as JSON if possible.
    */
  var body: js.UndefOr[js.Any] = js.undefined
  /**
    * Whatever message could be derived from the call site and HTTP response.
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * The errored request.
    */
  var request: MapiRequest
  /**
    * The numeric status code of the HTTP response
    */
  var statusCode: js.UndefOr[Double] = js.undefined
  /**
    * The type of error. Usually this is 'HttpError'.
    * If the request was aborted, so the error was not sent from the server, the type will be 'RequestAbortedError'.
    */
  var `type`: String
}

object MapiError {
  @scala.inline
  def apply(
    request: MapiRequest,
    `type`: String,
    body: js.Any = null,
    message: String = null,
    statusCode: js.UndefOr[Double] = js.undefined
  ): MapiError = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapiError]
  }
}

