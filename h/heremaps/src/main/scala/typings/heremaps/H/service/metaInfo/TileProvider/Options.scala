package typings.heremaps.H.service.metaInfo.TileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration object which can be used to initialize the TileProvider.
  * @property tileType {string=} - The tile type for which to request meta info
  * @property scheme {string=} - The map scheme for which to request meta info
  * @property tileCacheSize {number=} - The number of fully rendered spatial tiles that are cached for immediate reuse, default is 32
  * @property tileSize {number=} - The size of the tiles rendered by this provider (must be power of 2, default is 256)
  * @property pixelRatio {number=} - The pixel ratio to use for over-sampling in cases of high-resolution displays
  * @property categoryFilter {Array<string>=} - A list of meta-info category names which should be suppressed. See Metainfo Tile for valid category names.
  */
trait Options extends js.Object {
  var categoryFilter: js.UndefOr[js.Array[String]] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var scheme: js.UndefOr[String] = js.undefined
  var tileCacheSize: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var tileType: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    categoryFilter: js.Array[String] = null,
    pixelRatio: Int | Double = null,
    scheme: String = null,
    tileCacheSize: Int | Double = null,
    tileSize: Int | Double = null,
    tileType: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (categoryFilter != null) __obj.updateDynamic("categoryFilter")(categoryFilter)
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    if (tileCacheSize != null) __obj.updateDynamic("tileCacheSize")(tileCacheSize.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileType != null) __obj.updateDynamic("tileType")(tileType)
    __obj.asInstanceOf[Options]
  }
}

