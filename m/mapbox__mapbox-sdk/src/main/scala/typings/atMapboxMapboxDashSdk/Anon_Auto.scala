package typings.atMapboxMapboxDashSdk

import typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.auto
import typings.mapboxDashGl.mapboxDashGlMod.LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var bearing: js.UndefOr[Double] = js.undefined
  var coordinates: LngLatLike | auto
  var pitch: js.UndefOr[Double] = js.undefined
  var zoom: Double
}

object Anon_Auto {
  @scala.inline
  def apply(
    coordinates: LngLatLike | auto,
    zoom: Double,
    bearing: Int | Double = null,
    pitch: Int | Double = null
  ): Anon_Auto = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auto]
  }
}

