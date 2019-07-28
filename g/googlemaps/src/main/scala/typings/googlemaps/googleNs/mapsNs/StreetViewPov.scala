package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewPov extends js.Object {
  var heading: js.UndefOr[Double] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
}

object StreetViewPov {
  @scala.inline
  def apply(heading: Int | Double = null, pitch: Int | Double = null): StreetViewPov = {
    val __obj = js.Dynamic.literal()
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewPov]
  }
}

