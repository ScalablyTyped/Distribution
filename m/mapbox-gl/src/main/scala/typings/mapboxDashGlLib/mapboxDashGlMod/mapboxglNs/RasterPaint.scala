package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterPaint extends js.Object {
  var `raster-brightness-max`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `raster-brightness-max-transition`: js.UndefOr[Transition] = js.undefined
  var `raster-brightness-min`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `raster-brightness-min-transition`: js.UndefOr[Transition] = js.undefined
  var `raster-contrast`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `raster-contrast-transition`: js.UndefOr[Transition] = js.undefined
  var `raster-fade-duration`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `raster-hue-rotate`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `raster-hue-rotate-transition`: js.UndefOr[Transition] = js.undefined
  var `raster-opacity`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `raster-opacity-transition`: js.UndefOr[Transition] = js.undefined
  var `raster-resample`: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.linear | mapboxDashGlLib.mapboxDashGlLibStrings.nearest
  ] = js.undefined
  var `raster-saturation`: js.UndefOr[scala.Double | Expression] = js.undefined
  var `raster-saturation-transition`: js.UndefOr[Transition] = js.undefined
}

object RasterPaint {
  @scala.inline
  def apply(
    `raster-brightness-max`: scala.Double | Expression = null,
    `raster-brightness-max-transition`: Transition = null,
    `raster-brightness-min`: scala.Double | Expression = null,
    `raster-brightness-min-transition`: Transition = null,
    `raster-contrast`: scala.Double | Expression = null,
    `raster-contrast-transition`: Transition = null,
    `raster-fade-duration`: scala.Double | Expression = null,
    `raster-hue-rotate`: scala.Double | Expression = null,
    `raster-hue-rotate-transition`: Transition = null,
    `raster-opacity`: scala.Double | Expression = null,
    `raster-opacity-transition`: Transition = null,
    `raster-resample`: mapboxDashGlLib.mapboxDashGlLibStrings.linear | mapboxDashGlLib.mapboxDashGlLibStrings.nearest = null,
    `raster-saturation`: scala.Double | Expression = null,
    `raster-saturation-transition`: Transition = null
  ): RasterPaint = {
    val __obj = js.Dynamic.literal()
    if (`raster-brightness-max` != null) __obj.updateDynamic("raster-brightness-max")(`raster-brightness-max`.asInstanceOf[js.Any])
    if (`raster-brightness-max-transition` != null) __obj.updateDynamic("raster-brightness-max-transition")(`raster-brightness-max-transition`)
    if (`raster-brightness-min` != null) __obj.updateDynamic("raster-brightness-min")(`raster-brightness-min`.asInstanceOf[js.Any])
    if (`raster-brightness-min-transition` != null) __obj.updateDynamic("raster-brightness-min-transition")(`raster-brightness-min-transition`)
    if (`raster-contrast` != null) __obj.updateDynamic("raster-contrast")(`raster-contrast`.asInstanceOf[js.Any])
    if (`raster-contrast-transition` != null) __obj.updateDynamic("raster-contrast-transition")(`raster-contrast-transition`)
    if (`raster-fade-duration` != null) __obj.updateDynamic("raster-fade-duration")(`raster-fade-duration`.asInstanceOf[js.Any])
    if (`raster-hue-rotate` != null) __obj.updateDynamic("raster-hue-rotate")(`raster-hue-rotate`.asInstanceOf[js.Any])
    if (`raster-hue-rotate-transition` != null) __obj.updateDynamic("raster-hue-rotate-transition")(`raster-hue-rotate-transition`)
    if (`raster-opacity` != null) __obj.updateDynamic("raster-opacity")(`raster-opacity`.asInstanceOf[js.Any])
    if (`raster-opacity-transition` != null) __obj.updateDynamic("raster-opacity-transition")(`raster-opacity-transition`)
    if (`raster-resample` != null) __obj.updateDynamic("raster-resample")(`raster-resample`.asInstanceOf[js.Any])
    if (`raster-saturation` != null) __obj.updateDynamic("raster-saturation")(`raster-saturation`.asInstanceOf[js.Any])
    if (`raster-saturation-transition` != null) __obj.updateDynamic("raster-saturation-transition")(`raster-saturation-transition`)
    __obj.asInstanceOf[RasterPaint]
  }
}

