package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.mapbox
import typings.maplibreGl.maplibreGlStrings.terrarium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "RasterDEMTileSource")
@js.native
open class RasterDEMTileSource protected () extends RasterTileSource {
  def this(id: String, options: RasterDEMSourceSpecification, dispatcher: Dispatcher, eventedParent: Evented) = this()
  
  def _getNeighboringTiles(tileID: OverscaledTileID): js.Object = js.native
  
  var encoding: mapbox | terrarium = js.native
  
  @JSName("unloadTile")
  def unloadTile_MRasterDEMTileSource(tile: Tile): scala.Unit = js.native
}
