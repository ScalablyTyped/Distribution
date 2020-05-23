package typings.heremaps.H.map.Polygon

import typings.heremaps.H.map.ArrowStyle
import typings.heremaps.H.map.SpatialStyle
import typings.heremaps.H.map.provider.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property style {H.map.SpatialStyle | H.map.SpatialStyle.Options} - The style to be used when tracing the spatial object.
  * @property arrows {H.map.ArrowStyle | H.map.ArrowStyle.Options} - The arrows style to be used when rendering the spatial object.
  * @property visibility {boolean}
  * Indicates whether the map object is visible, the default is true A map object is only treated as visible, if it self and all of its nesting parent groups are visible.
  */
trait Options extends js.Object {
  var arrows: js.UndefOr[ArrowStyle | typings.heremaps.H.map.ArrowStyle.Options] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var elevation: js.UndefOr[Double] = js.undefined
  var extrusion: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var provider: js.UndefOr[Provider | Null] = js.undefined
  var style: js.UndefOr[SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options] = js.undefined
  var visibility: js.UndefOr[Boolean] = js.undefined
  var volatility: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arrows: ArrowStyle | typings.heremaps.H.map.ArrowStyle.Options = null,
    data: js.Any = null,
    elevation: js.UndefOr[Double] = js.undefined,
    extrusion: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    provider: js.UndefOr[Null | Provider] = js.undefined,
    style: SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options = null,
    visibility: js.UndefOr[Boolean] = js.undefined,
    volatility: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arrows != null) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(elevation)) __obj.updateDynamic("elevation")(elevation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(extrusion)) __obj.updateDynamic("extrusion")(extrusion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(provider)) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visibility)) __obj.updateDynamic("visibility")(visibility.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volatility)) __obj.updateDynamic("volatility")(volatility.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

