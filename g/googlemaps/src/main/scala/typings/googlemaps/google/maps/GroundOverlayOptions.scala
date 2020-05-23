package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroundOverlayOptions extends js.Object {
  var clickable: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[Map[Element]] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object GroundOverlayOptions {
  @scala.inline
  def apply(
    clickable: js.UndefOr[Boolean] = js.undefined,
    map: Map[Element] = null,
    opacity: js.UndefOr[Double] = js.undefined
  ): GroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroundOverlayOptions]
  }
}

