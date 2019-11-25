package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSourceOptions extends js.Object {
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ImageSourceOptions {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[Double]] = null, url: String = null): ImageSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSourceOptions]
  }
}

