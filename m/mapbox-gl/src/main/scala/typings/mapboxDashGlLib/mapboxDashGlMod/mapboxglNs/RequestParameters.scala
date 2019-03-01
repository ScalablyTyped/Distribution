package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParameters extends js.Object {
  var collectResourceTiming: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use `'include'` to send cookies with cross-origin requests.
    */
  var credentials: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.`same-origin` | mapboxDashGlLib.mapboxDashGlLibStrings.include
  ] = js.undefined
  /**
    * The headers to be sent with the request.
    */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var method: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.GET | mapboxDashGlLib.mapboxDashGlLibStrings.POST | mapboxDashGlLib.mapboxDashGlLibStrings.PUT
  ] = js.undefined
  /**
    * The URL to be requested.
    */
  var url: java.lang.String
}

object RequestParameters {
  @scala.inline
  def apply(
    url: java.lang.String,
    collectResourceTiming: js.UndefOr[scala.Boolean] = js.undefined,
    credentials: mapboxDashGlLib.mapboxDashGlLibStrings.`same-origin` | mapboxDashGlLib.mapboxDashGlLibStrings.include = null,
    headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    method: mapboxDashGlLib.mapboxDashGlLibStrings.GET | mapboxDashGlLib.mapboxDashGlLibStrings.POST | mapboxDashGlLib.mapboxDashGlLibStrings.PUT = null
  ): RequestParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (!js.isUndefined(collectResourceTiming)) __obj.updateDynamic("collectResourceTiming")(collectResourceTiming)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParameters]
  }
}

