package typings
package leafletDashDrawLib.leafletMod.DrawOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  /**
  			 * TThe icon displayed when drawing a marker.
  			 *
  			 * Default value: L.Icon.Default()
  			 */
  var icon: js.UndefOr[
    leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon
  ] = js.undefined
  /**
  			 * Determines if the draw tool remains enabled after drawing a shape.
  			 *
  			 * Default value: false
  			 */
  var repeatMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * This should be a high number to ensure that you can draw over all other layers on the map.
  			 *
  			 * Default value: 2000
  			 */
  var zIndexOffset: js.UndefOr[scala.Double] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    icon: leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon = null,
    repeatMode: js.UndefOr[scala.Boolean] = js.undefined,
    zIndexOffset: scala.Int | scala.Double = null
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatMode)) __obj.updateDynamic("repeatMode")(repeatMode)
    if (zIndexOffset != null) __obj.updateDynamic("zIndexOffset")(zIndexOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

