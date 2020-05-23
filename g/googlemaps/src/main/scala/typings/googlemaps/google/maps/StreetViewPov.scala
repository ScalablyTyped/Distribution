package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewPov extends js.Object {
  var heading: js.UndefOr[Double] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
}

object StreetViewPov {
  @scala.inline
  def apply(heading: js.UndefOr[Double] = js.undefined, pitch: js.UndefOr[Double] = js.undefined): StreetViewPov = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(heading)) __obj.updateDynamic("heading")(heading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pitch)) __obj.updateDynamic("pitch")(pitch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewPov]
  }
}

