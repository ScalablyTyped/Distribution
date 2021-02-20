package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.vector
import org.scalablytyped.runtime.StObject
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
  implicit class VectorSourceImplMutableBuilder[Self <: VectorSourceImpl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetTiles(value: js.Array[String] => VectorSourceImpl): Self = StObject.set(x, "setTiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUrl(value: String => VectorSourceImpl): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
  }
}
