package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSourceOptions extends js.Object {
  var coordinates: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object VideoSourceOptions {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[scala.Double]] = null, urls: js.Array[java.lang.String] = null): VideoSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[VideoSourceOptions]
  }
}

