package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathElevationRequest extends js.Object {
  var path: js.UndefOr[js.Array[LatLng]] = js.undefined
  var samples: js.UndefOr[Double] = js.undefined
}

object PathElevationRequest {
  @scala.inline
  def apply(path: js.Array[LatLng] = null, samples: js.UndefOr[Double] = js.undefined): PathElevationRequest = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(samples)) __obj.updateDynamic("samples")(samples.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathElevationRequest]
  }
}

