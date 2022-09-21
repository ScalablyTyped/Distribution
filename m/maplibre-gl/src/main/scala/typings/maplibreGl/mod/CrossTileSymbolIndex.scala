package typings.maplibreGl.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "CrossTileSymbolIndex")
@js.native
open class CrossTileSymbolIndex () extends StObject {
  
  def addLayer(styleLayer: StyleLayer, tiles: js.Array[Tile], lng: Double): Boolean = js.native
  
  var bucketsInCurrentPlacement: NumberDictionary[Boolean] = js.native
  
  var crossTileIDs: CrossTileIDs = js.native
  
  var layerIndexes: StringDictionary[CrossTileSymbolLayerIndex] = js.native
  
  var maxBucketInstanceId: Double = js.native
  
  def pruneUnusedLayers(usedLayers: js.Array[String]): scala.Unit = js.native
}
