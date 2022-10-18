package typings.maplibreGl.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.maplibreGl.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TileLayerIndex")
@js.native
open class TileLayerIndex protected () extends StObject {
  def this(tileID: OverscaledTileID, symbolInstances: SymbolInstanceArray, bucketInstanceId: Double) = this()
  
  var bucketInstanceId: Double = js.native
  
  def findMatches(
    symbolInstances: SymbolInstanceArray,
    newTileID: OverscaledTileID,
    zoomCrossTileIDs: NumberDictionary[Boolean]
  ): scala.Unit = js.native
  
  def getScaledCoordinates(symbolInstance: SymbolInstance, childTileID: OverscaledTileID): X = js.native
  
  var indexedSymbolInstances: NumberDictionary[js.Array[typings.maplibreGl.anon.CrossTileID]] = js.native
  
  var tileID: OverscaledTileID = js.native
}
