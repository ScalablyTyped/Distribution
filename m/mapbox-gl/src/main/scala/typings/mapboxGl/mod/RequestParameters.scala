package typings.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mapboxGl.mapboxGlStrings.GET
import typings.mapboxGl.mapboxGlStrings.POST
import typings.mapboxGl.mapboxGlStrings.PUT
import typings.mapboxGl.mapboxGlStrings.`same-origin`
import typings.mapboxGl.mapboxGlStrings.include
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParameters extends js.Object {
  var collectResourceTiming: js.UndefOr[Boolean] = js.undefined
  /**
    * Use `'include'` to send cookies with cross-origin requests.
    */
  var credentials: js.UndefOr[`same-origin` | include] = js.undefined
  /**
    * The headers to be sent with the request.
    */
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var method: js.UndefOr[GET | POST | PUT] = js.undefined
  /**
    * The URL to be requested.
    */
  var url: String
}

object RequestParameters {
  @scala.inline
  def apply(
    url: String,
    collectResourceTiming: js.UndefOr[Boolean] = js.undefined,
    credentials: `same-origin` | include = null,
    headers: StringDictionary[js.Any] = null,
    method: GET | POST | PUT = null
  ): RequestParameters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(collectResourceTiming)) __obj.updateDynamic("collectResourceTiming")(collectResourceTiming.get.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParameters]
  }
}

