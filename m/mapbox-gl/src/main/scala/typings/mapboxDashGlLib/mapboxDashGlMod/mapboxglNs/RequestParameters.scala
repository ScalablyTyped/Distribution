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

