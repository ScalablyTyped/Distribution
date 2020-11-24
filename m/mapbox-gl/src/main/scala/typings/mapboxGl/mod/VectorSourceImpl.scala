package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorSourceImpl
  extends VectorSource
     with AnySourceImpl {
  
  /**
    * Sets the source `tiles` property and re-renders the map.
    *
    * @param {string[]} tiles An array of one or more tile source URLs, as in the TileJSON spec.
    * @returns {VectorTileSource} this
    */
  def setTiles(tiles: js.Array[String]): VectorSourceImpl = js.native
  
  /**
    * Sets the source `url` property and re-renders the map.
    *
    * @param {string} url A URL to a TileJSON resource. Supported protocols are `http:`, `https:`, and `mapbox://<Tileset ID>`.
    * @returns {VectorTileSource} this
    */
  def setUrl(url: String): VectorSourceImpl = js.native
}
object VectorSourceImpl {
  
  @scala.inline
  def apply(setTiles: js.Array[String] => VectorSourceImpl, setUrl: String => VectorSourceImpl, `type`: vector): VectorSourceImpl = {
    val __obj = js.Dynamic.literal(setTiles = js.Any.fromFunction1(setTiles), setUrl = js.Any.fromFunction1(setUrl))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorSourceImpl]
  }
  
  @scala.inline
  implicit class VectorSourceImplOps[Self <: VectorSourceImpl] (val x: Self) extends AnyVal {
    
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
    def setSetTiles(value: js.Array[String] => VectorSourceImpl): Self = this.set("setTiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUrl(value: String => VectorSourceImpl): Self = this.set("setUrl", js.Any.fromFunction1(value))
  }
}
