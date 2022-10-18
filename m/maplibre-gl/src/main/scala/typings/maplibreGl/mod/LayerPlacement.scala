package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "LayerPlacement")
@js.native
open class LayerPlacement protected () extends StObject {
  def this(styleLayer: SymbolStyleLayer) = this()
  
  var _bucketParts: js.Array[BucketPart] = js.native
  
  var _currentPartIndex: Double = js.native
  
  var _currentTileIndex: Double = js.native
  
  var _seenCrossTileIDs: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in string | number ]: boolean} */ js.Any = js.native
  
  var _sortAcrossTiles: Boolean = js.native
  
  def continuePlacement(
    tiles: js.Array[Tile],
    placement: Placement,
    showCollisionBoxes: Boolean,
    styleLayer: StyleLayer,
    shouldPausePlacement: js.Function0[Boolean]
  ): Boolean = js.native
}
