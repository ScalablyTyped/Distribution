package typings.heremaps.H.map.layer.ITileLayer

import typings.heremaps.H.geo.IProjection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which are used to initialize a TileLayer object.
  * @property projection {H.geo.IProjection=} - an optional projection to be used for this layer, default is H.geo.mercator
  * @property opacity {number=} - tile layer opacity, default is 1
  */
trait Options extends js.Object {
  var opacity: js.UndefOr[Double] = js.undefined
  var projection: js.UndefOr[IProjection] = js.undefined
}

object Options {
  @scala.inline
  def apply(opacity: js.UndefOr[Double] = js.undefined, projection: IProjection = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

