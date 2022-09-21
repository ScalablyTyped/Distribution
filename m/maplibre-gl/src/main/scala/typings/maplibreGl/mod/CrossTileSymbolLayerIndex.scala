package typings.maplibreGl.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "CrossTileSymbolLayerIndex")
@js.native
open class CrossTileSymbolLayerIndex () extends StObject {
  
  def addBucket(tileID: OverscaledTileID, bucket: SymbolBucket, crossTileIDs: CrossTileIDs): Boolean = js.native
  
  def handleWrapJump(lng: Double): scala.Unit = js.native
  
  var indexes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ zoom in string | number ]: {[ tileId in string | number ]: maplibre-gl.maplibre-gl.TileLayerIndex}}
    */ typings.maplibreGl.maplibreGlStrings.CrossTileSymbolLayerIndex & TopLevel[Any] = js.native
  
  var lng: Double = js.native
  
  def removeBucketCrossTileIDs(zoom: String, removedBucket: TileLayerIndex): scala.Unit = js.native
  def removeBucketCrossTileIDs(zoom: Double, removedBucket: TileLayerIndex): scala.Unit = js.native
  
  def removeStaleBuckets(
    currentIDs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in string | number ]: boolean}
    */ typings.maplibreGl.maplibreGlStrings.CrossTileSymbolLayerIndex & TopLevel[Any]
  ): Boolean = js.native
  
  var usedCrossTileIDs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ zoom in string | number ]: {[crossTileID: number] : boolean}}
    */ typings.maplibreGl.maplibreGlStrings.CrossTileSymbolLayerIndex & TopLevel[Any] = js.native
}
