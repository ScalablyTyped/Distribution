package typings.mapboxMapboxSdk.mapiErrorMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapiError extends js.Object {
  /**
    * If the server sent a response body, this property exposes that response, parsed as JSON if possible.
    */
  var body: js.UndefOr[js.Any] = js.native
  /**
    * Whatever message could be derived from the call site and HTTP response.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The errored request.
    */
  var request: MapiRequest = js.native
  /**
    * The numeric status code of the HTTP response
    */
  var statusCode: js.UndefOr[Double] = js.native
  /**
    * The type of error. Usually this is 'HttpError'.
    * If the request was aborted, so the error was not sent from the server, the type will be 'RequestAbortedError'.
    */
  var `type`: String = js.native
}

object MapiError {
  @scala.inline
  def apply(request: MapiRequest, `type`: String): MapiError = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapiError]
  }
  @scala.inline
  implicit class MapiErrorOps[Self <: MapiError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRequest(value: MapiRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
  
}

