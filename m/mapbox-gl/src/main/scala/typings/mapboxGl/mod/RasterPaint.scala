package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.linear
import typings.mapboxGl.mapboxGlStrings.nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterPaint extends AnyPaint {
  var `circle-sort-key`: js.UndefOr[Double] = js.undefined
  var `raster-brightness-max`: js.UndefOr[Double | Expression] = js.undefined
  var `raster-brightness-max-transition`: js.UndefOr[Transition] = js.undefined
  var `raster-brightness-min`: js.UndefOr[Double | Expression] = js.undefined
  var `raster-brightness-min-transition`: js.UndefOr[Transition] = js.undefined
  var `raster-contrast`: js.UndefOr[Double | Expression] = js.undefined
  var `raster-contrast-transition`: js.UndefOr[Transition] = js.undefined
  var `raster-fade-duration`: js.UndefOr[Double | Expression] = js.undefined
  var `raster-hue-rotate`: js.UndefOr[Double | Expression] = js.undefined
  var `raster-hue-rotate-transition`: js.UndefOr[Transition] = js.undefined
  var `raster-opacity`: js.UndefOr[Double | Expression] = js.undefined
  var `raster-opacity-transition`: js.UndefOr[Transition] = js.undefined
  var `raster-resampling`: js.UndefOr[linear | nearest] = js.undefined
  var `raster-saturation`: js.UndefOr[Double | Expression] = js.undefined
  var `raster-saturation-transition`: js.UndefOr[Transition] = js.undefined
}

object RasterPaint {
  @scala.inline
  def apply(
    `circle-sort-key`: js.UndefOr[Double] = js.undefined,
    `raster-brightness-max`: Double | Expression = null,
    `raster-brightness-max-transition`: Transition = null,
    `raster-brightness-min`: Double | Expression = null,
    `raster-brightness-min-transition`: Transition = null,
    `raster-contrast`: Double | Expression = null,
    `raster-contrast-transition`: Transition = null,
    `raster-fade-duration`: Double | Expression = null,
    `raster-hue-rotate`: Double | Expression = null,
    `raster-hue-rotate-transition`: Transition = null,
    `raster-opacity`: Double | Expression = null,
    `raster-opacity-transition`: Transition = null,
    `raster-resampling`: linear | nearest = null,
    `raster-saturation`: Double | Expression = null,
    `raster-saturation-transition`: Transition = null
  ): RasterPaint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`circle-sort-key`)) __obj.updateDynamic("circle-sort-key")(`circle-sort-key`.get.asInstanceOf[js.Any])
    if (`raster-brightness-max` != null) __obj.updateDynamic("raster-brightness-max")(`raster-brightness-max`.asInstanceOf[js.Any])
    if (`raster-brightness-max-transition` != null) __obj.updateDynamic("raster-brightness-max-transition")(`raster-brightness-max-transition`.asInstanceOf[js.Any])
    if (`raster-brightness-min` != null) __obj.updateDynamic("raster-brightness-min")(`raster-brightness-min`.asInstanceOf[js.Any])
    if (`raster-brightness-min-transition` != null) __obj.updateDynamic("raster-brightness-min-transition")(`raster-brightness-min-transition`.asInstanceOf[js.Any])
    if (`raster-contrast` != null) __obj.updateDynamic("raster-contrast")(`raster-contrast`.asInstanceOf[js.Any])
    if (`raster-contrast-transition` != null) __obj.updateDynamic("raster-contrast-transition")(`raster-contrast-transition`.asInstanceOf[js.Any])
    if (`raster-fade-duration` != null) __obj.updateDynamic("raster-fade-duration")(`raster-fade-duration`.asInstanceOf[js.Any])
    if (`raster-hue-rotate` != null) __obj.updateDynamic("raster-hue-rotate")(`raster-hue-rotate`.asInstanceOf[js.Any])
    if (`raster-hue-rotate-transition` != null) __obj.updateDynamic("raster-hue-rotate-transition")(`raster-hue-rotate-transition`.asInstanceOf[js.Any])
    if (`raster-opacity` != null) __obj.updateDynamic("raster-opacity")(`raster-opacity`.asInstanceOf[js.Any])
    if (`raster-opacity-transition` != null) __obj.updateDynamic("raster-opacity-transition")(`raster-opacity-transition`.asInstanceOf[js.Any])
    if (`raster-resampling` != null) __obj.updateDynamic("raster-resampling")(`raster-resampling`.asInstanceOf[js.Any])
    if (`raster-saturation` != null) __obj.updateDynamic("raster-saturation")(`raster-saturation`.asInstanceOf[js.Any])
    if (`raster-saturation-transition` != null) __obj.updateDynamic("raster-saturation-transition")(`raster-saturation-transition`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterPaint]
  }
}

