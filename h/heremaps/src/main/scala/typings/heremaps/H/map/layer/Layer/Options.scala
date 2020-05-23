package typings.heremaps.H.map.layer.Layer

import typings.heremaps.H.geo.IProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which can be used when creating new layer object.
  * @property min {number=} - The minimum zoom level for which the layer can provide data, default is 0
  * @property max {number=} - The maximum zoom level for which the layer can provide data, default is 22
  * @property dark {boolean=} - Indicates whether the content of this layer is mainly dark, default is false See also H.Map.Options#autoColor
  * @property projection {H.geo.IProjection=} - The projection to be used for this layer, default is H.geo.mercator
  * @property minWorldSize {number=} - The minimal world size at zoom level 0, default is 256
  */
trait Options extends js.Object {
  var dark: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var minWorldSize: js.UndefOr[Double] = js.undefined
  var projection: js.UndefOr[IProjection] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dark: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    minWorldSize: js.UndefOr[Double] = js.undefined,
    projection: IProjection = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dark)) __obj.updateDynamic("dark")(dark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWorldSize)) __obj.updateDynamic("minWorldSize")(minWorldSize.get.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

