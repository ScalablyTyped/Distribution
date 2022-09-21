package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.ZoomDelta
import typings.std.Touch
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TapDragZoomHandler")
@js.native
open class TapDragZoomHandler () extends StObject {
  
  var _active: Boolean = js.native
  
  var _enabled: Boolean = js.native
  
  var _swipePoint: ^ = js.native
  
  var _swipeTouch: Double = js.native
  
  var _tap: TapRecognizer = js.native
  
  var _tapTime: Double = js.native
  
  def disable(): scala.Unit = js.native
  
  def enable(): scala.Unit = js.native
  
  def isActive(): Boolean = js.native
  
  def isEnabled(): Boolean = js.native
  
  def reset(): scala.Unit = js.native
  
  def touchcancel(): scala.Unit = js.native
  
  def touchend(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): scala.Unit = js.native
  
  def touchmove(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): ZoomDelta = js.native
  
  def touchstart(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): scala.Unit = js.native
}
