package typings.mapboxMapboxSdk.mapiResponseMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapiResponse extends js.Object {
  /**
    * The response body, parsed as JSON.
    */
  var body: js.Any = js.native
  /**
    * The parsed response headers.
    */
  var headers: js.Any = js.native
  /**
    * The parsed response links
    */
  var links: js.Any = js.native
  /**
    * The raw response body.
    */
  var rawBody: String = js.native
  /**
    * The response's originating MapiRequest.
    */
  var request: MapiRequest = js.native
  /**
    * The response's status code.
    */
  var statusCode: Double = js.native
  def hasNextPage(): Boolean = js.native
  def nextPage(): MapiRequest = js.native
}

object MapiResponse {
  @scala.inline
  def apply(
    body: js.Any,
    hasNextPage: () => Boolean,
    headers: js.Any,
    links: js.Any,
    nextPage: () => MapiRequest,
    rawBody: String,
    request: MapiRequest,
    statusCode: Double
  ): MapiResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], hasNextPage = js.Any.fromFunction0(hasNextPage), headers = headers.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage), rawBody = rawBody.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapiResponse]
  }
  @scala.inline
  implicit class MapiResponseOps[Self <: MapiResponse] (val x: Self) extends AnyVal {
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
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasNextPage(value: () => Boolean): Self = this.set("hasNextPage", js.Any.fromFunction0(value))
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinks(value: js.Any): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextPage(value: () => MapiRequest): Self = this.set("nextPage", js.Any.fromFunction0(value))
    @scala.inline
    def setRawBody(value: String): Self = this.set("rawBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: MapiRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

