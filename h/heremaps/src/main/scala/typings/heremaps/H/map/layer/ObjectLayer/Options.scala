package typings.heremaps.H.map.layer.ObjectLayer

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
@js.native
trait Options extends js.Object {
  var dataCacheSize: js.UndefOr[Double] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var tileCacheSize: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Double] = js.native
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
    def setDataCacheSize(value: Double): Self = this.set("dataCacheSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataCacheSize: Self = this.set("dataCacheSize", js.undefined)
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setTileCacheSize(value: Double): Self = this.set("tileCacheSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileCacheSize: Self = this.set("tileCacheSize", js.undefined)
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
  }
  
}

