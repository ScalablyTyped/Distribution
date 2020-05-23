package typings.heremaps.H.map.Overlay

import typings.heremaps.H.map.provider.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used to initialize an Overlay
  * @property min {number=} - The minimum zoom level for which the object is visible, default is -Infinity
  * @property max {number=} - The maximum zoom level for which the object is visible, default is Infinity
  * @property opacity {number=} - The opacity of the object in range from 0 (transparent) to 1 (opaque), default is 1.
  * @property visibility {boolean=} - Indicates whether the map object is visible at all, default is true.
  * @property zIndex {number=} - The z-index value of the map object, default is 0
  * @property provider {(H.map.provider.Provider | null)=} - The provider of this object. This property is only needed if a customized Implementation of ObjectProvider wants to instantiate
  * an object.
  * @property data {*} - Optional arbitrary data to be stored with this map object. This data can be retrieved by calling getData.
  */
trait Options extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var provider: js.UndefOr[Provider] = js.undefined
  var visibility: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    data: js.Any = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    provider: Provider = null,
    visibility: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (!js.isUndefined(visibility)) __obj.updateDynamic("visibility")(visibility.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

