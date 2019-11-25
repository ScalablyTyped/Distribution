package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewLink extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var heading: js.UndefOr[Double] = js.undefined
  var pano: js.UndefOr[String] = js.undefined
}

object StreetViewLink {
  @scala.inline
  def apply(description: String = null, heading: Int | Double = null, pano: String = null): StreetViewLink = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (pano != null) __obj.updateDynamic("pano")(pano.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewLink]
  }
}

