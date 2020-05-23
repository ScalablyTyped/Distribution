package typings.mapboxMapboxSdk.anon

import typings.mapboxGl.mod.LngLatLike
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bearing extends js.Object {
  var bearing: js.UndefOr[Double] = js.undefined
  var coordinates: LngLatLike | auto
  var pitch: js.UndefOr[Double] = js.undefined
  var zoom: Double
}

object Bearing {
  @scala.inline
  def apply(
    coordinates: LngLatLike | auto,
    zoom: Double,
    bearing: js.UndefOr[Double] = js.undefined,
    pitch: js.UndefOr[Double] = js.undefined
  ): Bearing = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    if (!js.isUndefined(bearing)) __obj.updateDynamic("bearing")(bearing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bearing]
  }
}

