package typings.heremaps.HNs.mapNs.layerNs.ITileLayerNs

import typings.heremaps.HNs.geoNs.IProjection
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
  def apply(opacity: Int | Double = null, projection: IProjection = null): Options = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    __obj.asInstanceOf[Options]
  }
}

