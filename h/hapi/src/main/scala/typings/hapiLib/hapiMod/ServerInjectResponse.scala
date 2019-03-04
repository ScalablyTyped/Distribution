package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInjectResponse
  extends shotLib.shotMod.ResponseObject {
  /**
    * the request object.
    */
  var request: Request
  /**
    * the raw handler response (e.g. when not a stream or a view) before it is serialized for transmission. If not available, the value is set to payload. Useful for inspection and reuse of the
    * internal objects returned (instead of parsing the response string).
    */
  var result: js.UndefOr[js.Object]
}

object ServerInjectResponse {
  @scala.inline
  def apply(
    headers: shotLib.shotMod.Headers,
    payload: java.lang.String,
    raw: shotLib.Anon_Req,
    rawPayload: nodeLib.Buffer,
    request: Request,
    statusCode: scala.Double,
    statusMessage: java.lang.String,
    trailers: org.scalablytyped.runtime.StringDictionary[js.Any],
    result: js.Object = null
  ): ServerInjectResponse = {
    val __obj = js.Dynamic.literal(headers = headers, payload = payload, raw = raw, rawPayload = rawPayload, request = request, statusCode = statusCode, statusMessage = statusMessage, trailers = trailers)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[ServerInjectResponse]
  }
}

