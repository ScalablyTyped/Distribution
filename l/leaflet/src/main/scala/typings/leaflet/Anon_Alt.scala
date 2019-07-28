package typings.leaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alt extends js.Object {
  var alt: js.UndefOr[Double] = js.undefined
  var lat: Double
  var lng: Double
}

object Anon_Alt {
  @scala.inline
  def apply(lat: Double, lng: Double, alt: Int | Double = null): Anon_Alt = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng)
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alt]
  }
}

