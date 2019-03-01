package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreetViewLink extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var heading: js.UndefOr[scala.Double] = js.undefined
  var pano: js.UndefOr[java.lang.String] = js.undefined
}

object StreetViewLink {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    heading: scala.Int | scala.Double = null,
    pano: java.lang.String = null
  ): StreetViewLink = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (pano != null) __obj.updateDynamic("pano")(pano)
    __obj.asInstanceOf[StreetViewLink]
  }
}

