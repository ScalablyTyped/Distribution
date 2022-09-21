package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.NumTaps
import typings.std.Touch
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "TapRecognizer")
@js.native
open class TapRecognizer protected () extends StObject {
  def this(options: NumTaps) = this()
  
  var count: Double = js.native
  
  var lastTap: ^ = js.native
  
  var lastTime: Double = js.native
  
  var numTaps: Double = js.native
  
  def reset(): scala.Unit = js.native
  
  var singleTap: SingleTapRecognizer = js.native
  
  def touchend(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): ^ = js.native
  
  def touchmove(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): scala.Unit = js.native
  
  def touchstart(e: TouchEvent, points: js.Array[^], mapTouches: js.Array[Touch]): scala.Unit = js.native
}
