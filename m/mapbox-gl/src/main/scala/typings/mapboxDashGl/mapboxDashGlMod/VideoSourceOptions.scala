package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSourceOptions extends js.Object {
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
}

object VideoSourceOptions {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[Double]] = null, urls: js.Array[String] = null): VideoSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSourceOptions]
  }
}

