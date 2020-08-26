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
@js.native
trait Options extends js.Object {
  var categoryFilter: js.UndefOr[js.Array[String]] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var scheme: js.UndefOr[String] = js.native
  var tileCacheSize: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Double] = js.native
  var tileType: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategoryFilterVarargs(value: String*): Self = this.set("categoryFilter", js.Array(value :_*))
    @scala.inline
    def setCategoryFilter(value: js.Array[String]): Self = this.set("categoryFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryFilter: Self = this.set("categoryFilter", js.undefined)
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    @scala.inline
    def setTileCacheSize(value: Double): Self = this.set("tileCacheSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileCacheSize: Self = this.set("tileCacheSize", js.undefined)
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    @scala.inline
    def setTileType(value: String): Self = this.set("tileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileType: Self = this.set("tileType", js.undefined)
  }
  
}

