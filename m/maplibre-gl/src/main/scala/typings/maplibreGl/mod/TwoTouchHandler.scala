package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.`2`
import typings.std.Touch
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TwoTouchHandler")
@js.native
open class TwoTouchHandler () extends StObject {
  
  var _active: Boolean = js.native
  
  var _aroundCenter: Boolean = js.native
  
  var _enabled: Boolean = js.native
  
  var _firstTwoTouches: js.Tuple2[Double, Double] = js.native
  
  def _move(points: js.Tuple2[^, ^], pinchAround: ^, e: TouchEvent): js.Object = js.native
  
  def _start(points: js.Tuple2[^, ^]): scala.Unit = js.native
  
  var _startVector: ^ = js.native
  
  var _vector: ^ = js.native
  
  def disable(): scala.Unit = js.native
  
  def enable(): scala.Unit = js.native
  def enable(options: `2`): scala.Unit = js.native
  
  def isActive(): Boolean = js.native
  
  def isEnabled(): Boolean = js.native
  
  def reset(): scala.Unit = js.native
  
  def touchcancel(): scala.Unit = js.native
  
  def touchend(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): scala.Unit = js.native
  
  def touchmove(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): js.Object = js.native
  
  def touchstart(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): scala.Unit = js.native
}
