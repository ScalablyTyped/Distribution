package typings.atMapboxMapboxDashSdk.libClassesMapiDashResponseMod

import typings.atMapboxMapboxDashSdk.libClassesMapiDashRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapiResponse extends js.Object {
  /**
    * The response body, parsed as JSON.
    */
  var body: js.Any
  /**
    * The parsed response headers.
    */
  var headers: js.Any
  /**
    * The parsed response links
    */
  var links: js.Any
  /**
    * The raw response body.
    */
  var rawBody: String
  /**
    * The response's originating MapiRequest.
    */
  var request: MapiRequest
  /**
    * The response's status code.
    */
  var statusCode: Double
  def hasNextPage(): Boolean
  def nextPage(): MapiRequest
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
}

