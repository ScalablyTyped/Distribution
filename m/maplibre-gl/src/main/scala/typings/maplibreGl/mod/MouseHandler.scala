package typings.maplibreGl.mod

import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.ClickTolerance
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "MouseHandler")
@js.native
open class MouseHandler protected () extends StObject {
  def this(options: ClickTolerance) = this()
  
  var _active: Boolean = js.native
  
  var _clickTolerance: Double = js.native
  
  def _correctButton(e: MouseEvent, button: Double): Boolean = js.native
  
  var _enabled: Boolean = js.native
  
  var _eventButton: Double = js.native
  
  var _lastPoint: ^ = js.native
  
  def _move(lastPoint: ^, point: ^): js.Object = js.native
  
  var _moved: Boolean = js.native
  
  def disable(): scala.Unit = js.native
  
  def enable(): scala.Unit = js.native
  
  def isActive(): Boolean = js.native
  
  def isEnabled(): Boolean = js.native
  
  def mousedown(e: MouseEvent, point: ^): scala.Unit = js.native
  
  def mousemoveWindow(e: MouseEvent, point: ^): js.Object = js.native
  
  def mouseupWindow(e: MouseEvent): scala.Unit = js.native
  
  def reset(): scala.Unit = js.native
}
