package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroundOverlayOptions extends js.Object {
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object GroundOverlayOptions {
  @scala.inline
  def apply(
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    map: Map = null,
    opacity: scala.Int | scala.Double = null
  ): GroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (map != null) __obj.updateDynamic("map")(map)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroundOverlayOptions]
  }
}

