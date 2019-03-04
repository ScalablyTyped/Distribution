package typings
package leafletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alt extends js.Object {
  var alt: js.UndefOr[scala.Double] = js.undefined
  var lat: scala.Double
  var lng: scala.Double
}

object Anon_Alt {
  @scala.inline
  def apply(lat: scala.Double, lng: scala.Double, alt: scala.Int | scala.Double = null): Anon_Alt = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng)
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alt]
  }
}

