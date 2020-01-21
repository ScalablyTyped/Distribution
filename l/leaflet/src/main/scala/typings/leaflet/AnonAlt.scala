package typings.leaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlt extends js.Object {
  var alt: js.UndefOr[Double] = js.undefined
  var lat: Double
  var lng: Double
}

object AnonAlt {
  @scala.inline
  def apply(lat: Double, lng: Double, alt: Int | Double = null): AnonAlt = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlt]
  }
}

