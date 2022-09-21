package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "MouseRotateWrapper")
@js.native
open class MouseRotateWrapper protected () extends StObject {
  def this(map: Map, element: HTMLElement) = this()
  def this(map: Map, element: HTMLElement, pitch: Boolean) = this()
  
  var _clickTolerance: Double = js.native
  
  var _lastPos: ^ = js.native
  
  var _startPos: ^ = js.native
  
  def down(e: MouseEvent, point: ^): scala.Unit = js.native
  
  var element: HTMLElement = js.native
  
  var map: Map = js.native
  
  var mousePitch: MousePitchHandler = js.native
  
  var mouseRotate: MouseRotateHandler = js.native
  
  def mousedown(e: MouseEvent): scala.Unit = js.native
  
  def mousemove(e: MouseEvent): scala.Unit = js.native
  
  def mouseup(e: MouseEvent): scala.Unit = js.native
  
  def move(e: MouseEvent, point: ^): scala.Unit = js.native
  
  def off(): scala.Unit = js.native
  
  def offTemp(): scala.Unit = js.native
  
  def reset(): scala.Unit = js.native
  
  def touchend(e: TouchEvent): scala.Unit = js.native
  
  def touchmove(e: TouchEvent): scala.Unit = js.native
  
  def touchstart(e: TouchEvent): scala.Unit = js.native
}
