package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "SourceFeatureState")
@js.native
open class SourceFeatureState () extends StObject {
  
  def coalesceChanges(
    tiles: /* import warning: importer.ImportType#apply Failed type conversion: {[ _ in any ]: maplibre-gl.maplibre-gl.Tile} */ js.Any,
    painter: Any
  ): scala.Unit = js.native
  
  def getState(sourceLayer: String, featureId: String): Any = js.native
  def getState(sourceLayer: String, featureId: Double): Any = js.native
  
  def initializeTileState(tile: Tile, painter: Any): scala.Unit = js.native
  
  def removeFeatureState(sourceLayer: String): scala.Unit = js.native
  def removeFeatureState(sourceLayer: String, featureId: String): scala.Unit = js.native
  def removeFeatureState(sourceLayer: String, featureId: String, key: String): scala.Unit = js.native
  def removeFeatureState(sourceLayer: String, featureId: Double): scala.Unit = js.native
  def removeFeatureState(sourceLayer: String, featureId: Double, key: String): scala.Unit = js.native
  def removeFeatureState(sourceLayer: String, featureId: scala.Unit, key: String): scala.Unit = js.native
  
  var state: LayerFeatureStates = js.native
  
  var stateChanges: LayerFeatureStates = js.native
  
  def updateState(sourceLayer: String, featureId: String, newState: Any): scala.Unit = js.native
  def updateState(sourceLayer: String, featureId: Double, newState: Any): scala.Unit = js.native
}
