package typings.maplibreGl.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "PauseablePlacement")
@js.native
open class PauseablePlacement protected () extends StObject {
  def this(
    transform: Transform,
    terrain: Terrain,
    order: js.Array[String],
    forceFullPlacement: Boolean,
    showCollisionBoxes: Boolean,
    fadeDuration: Double,
    crossSourceCollisions: Boolean
  ) = this()
  def this(
    transform: Transform,
    terrain: Terrain,
    order: js.Array[String],
    forceFullPlacement: Boolean,
    showCollisionBoxes: Boolean,
    fadeDuration: Double,
    crossSourceCollisions: Boolean,
    prevPlacement: Placement
  ) = this()
  
  var _currentPlacementIndex: Double = js.native
  
  var _done: Boolean = js.native
  
  var _forceFullPlacement: Boolean = js.native
  
  var _inProgressLayer: LayerPlacement = js.native
  
  var _showCollisionBoxes: Boolean = js.native
  
  def commit(now: Double): Placement = js.native
  
  def continuePlacement(
    order: js.Array[String],
    layers: StringDictionary[StyleLayer],
    layerTiles: StringDictionary[js.Array[Tile]]
  ): scala.Unit = js.native
  
  def isDone(): Boolean = js.native
  
  var placement: Placement = js.native
}
