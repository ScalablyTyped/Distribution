package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TouchPitchHandler")
@js.native
open class TouchPitchHandler protected () extends TwoTouchHandler {
  def this(map: Map) = this()
  
  var _currentTouchCount: Double = js.native
  
  var _firstMove: Double = js.native
  
  var _lastPoints: js.Tuple2[^, ^] = js.native
  
  var _map: Map = js.native
  
  var _valid: Boolean | scala.Unit = js.native
  
  def gestureBeginsVertically(vectorA: ^, vectorB: ^, timeStamp: Double): Boolean | scala.Unit = js.native
}
