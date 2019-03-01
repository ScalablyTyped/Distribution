package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSourceOptions extends js.Object {
  var coordinates: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ImageSourceOptions {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[scala.Double]] = null, url: java.lang.String = null): ImageSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ImageSourceOptions]
  }
}

