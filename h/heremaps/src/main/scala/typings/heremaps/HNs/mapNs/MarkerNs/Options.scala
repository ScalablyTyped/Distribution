package typings.heremaps.HNs.mapNs.MarkerNs

import typings.heremaps.HNs.mapNs.Icon
import typings.heremaps.HNs.mapNs.providerNs.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used to initialize a Marker
  * @property min {number=} - The minimum zoom level for which the object is visible, default is -Infinity
  * @property max {number=} - The maximum zoom level for which the object is visible, default is Infinity
  * @property visibility {boolean=} - Indicates whether the map object is visible at all, default is true.
  * @property zIndex {number=} - The z-index value of the map object, default is 0
  * @property provider {(H.map.provider.Provider | null)=} - The provider of this object. This property is only needed if a customized Implementation of ObjectProvider wants to instantiate
  * an object.
  * @property icon {H.map.Icon=} - The icon to use for the visual representation, if omitted a default icon is used.
  * @property data {*} - Optional arbitrary data to be stored with this map object. This data can be retrieved by calling getData.
  */
trait Options extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var icon: js.UndefOr[Icon] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var provider: js.UndefOr[Provider] = js.undefined
  var visibility: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    data: js.Any = null,
    icon: Icon = null,
    max: Int | Double = null,
    min: Int | Double = null,
    provider: Provider = null,
    visibility: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (!js.isUndefined(visibility)) __obj.updateDynamic("visibility")(visibility)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

