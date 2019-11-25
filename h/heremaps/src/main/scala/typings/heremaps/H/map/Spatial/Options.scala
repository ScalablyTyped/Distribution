package typings.heremaps.H.map.Spatial

import typings.heremaps.H.map.ArrowStyle
import typings.heremaps.H.map.SpatialStyle
import typings.heremaps.H.map.provider.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which are used to initialize spatial object object
  * @property style {(H.map.SpatialStyle | H.map.SpatialStyle.Options)=} - the style to be used when tracing the spatial object
  * @property arrows {(H.map.ArrowStyle | H.map.ArrowStyle.Options)=} - The arrows style to be used when rendering the spatial.
  * @property visibility {boolean=} - An optional boolean value indicating whether this map object is visible, default is true
  * @property zIndex {number=} - The z-index value of the map object, default is 0
  * @property min {number=} - The minimum zoom level for which the object is visible, default is -Infinity
  * @property max {number=} - The maximum zoom level for which the object is visible, default is Infinity
  * @property provider {(H.map.provider.Provider | null)=} - The provider of this object. This property is only needed if a customized Implementation of ObjectProvider wants to instantiate
  * an object.
  * @property data {*} - Optional arbitrary data to be stored with this map object. This data can be retrieved by calling getData.
  */
trait Options extends js.Object {
  var arrows: js.UndefOr[ArrowStyle | typings.heremaps.H.map.ArrowStyle.Options] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var provider: js.UndefOr[Provider] = js.undefined
  var style: js.UndefOr[SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options] = js.undefined
  var visibility: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arrows: ArrowStyle | typings.heremaps.H.map.ArrowStyle.Options = null,
    data: js.Any = null,
    max: Int | Double = null,
    min: Int | Double = null,
    provider: Provider = null,
    style: SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options = null,
    visibility: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arrows != null) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visibility)) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

