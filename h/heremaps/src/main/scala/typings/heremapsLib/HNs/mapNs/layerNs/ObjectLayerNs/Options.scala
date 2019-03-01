package typings
package heremapsLib.HNs.mapNs.layerNs.ObjectLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration object which can be use to initialize the ObjectLayer.
  * @property tileSize {number=} - the size of the tiles rendered by this layer for polylines and polygons (must be power of 2, default is 256)
  * @property tileCacheSize {number=} - the number of fully rendered spatial tiles that are cached for immediate reuse, default is 32
  * @property dataCacheSize {number=} - the number of tiles to cache which have render data only, default is 512
  * @property pixelRatio {number=} - The pixelRatio to use for over-sampling in cases of high-resolution displays
  */
trait Options extends js.Object {
  var dataCacheSize: js.UndefOr[scala.Double] = js.undefined
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  var tileCacheSize: js.UndefOr[scala.Double] = js.undefined
  var tileSize: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dataCacheSize: scala.Int | scala.Double = null,
    pixelRatio: scala.Int | scala.Double = null,
    tileCacheSize: scala.Int | scala.Double = null,
    tileSize: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dataCacheSize != null) __obj.updateDynamic("dataCacheSize")(dataCacheSize.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (tileCacheSize != null) __obj.updateDynamic("tileCacheSize")(tileCacheSize.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

