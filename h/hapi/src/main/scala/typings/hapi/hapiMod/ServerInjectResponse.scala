package typings.hapi.hapiMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.shot.shotMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInjectResponse
  extends typings.shot.shotMod.ResponseObject {
  /**
    * the request object.
    */
  var request: Request
  /**
    * the raw handler response (e.g. when not a stream or a view) before it is serialized for transmission. If not available, the value is set to payload. Useful for inspection and reuse of the
    * internal objects returned (instead of parsing the response string).
    */
  var result: js.UndefOr[js.Object] = js.undefined
}

object ServerInjectResponse {
  @scala.inline
  def apply(
    headers: Headers,
    payload: String,
    raw: typings.shot.Anon_Req,
    rawPayload: Buffer,
    request: Request,
    statusCode: Double,
    statusMessage: String,
    trailers: StringDictionary[js.Any],
    result: js.Object = null
  ): ServerInjectResponse = {
    val __obj = js.Dynamic.literal(headers = headers, payload = payload, raw = raw, rawPayload = rawPayload, request = request, statusCode = statusCode, statusMessage = statusMessage, trailers = trailers)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[ServerInjectResponse]
  }
}

