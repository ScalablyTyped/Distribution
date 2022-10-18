package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.PinchAroundZoomDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TouchZoomHandler")
@js.native
open class TouchZoomHandler () extends TwoTouchHandler {
  
  var _distance: Double = js.native
  
  def _move(points: js.Tuple2[^, ^], pinchAround: ^): PinchAroundZoomDelta = js.native
  
  var _startDistance: Double = js.native
}
