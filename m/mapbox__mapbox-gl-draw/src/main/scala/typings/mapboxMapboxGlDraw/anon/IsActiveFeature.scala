package typings.mapboxMapboxGlDraw.anon

import typings.mapboxGl.mod.MapboxEvent
import typings.mapboxMapboxGlDraw.mod.MapMouseEvent
import typings.mapboxMapboxGlDraw.mod.MapTouchEvent
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsActiveFeature extends StObject {
  
  def isActiveFeature(e: MapMouseEvent): Boolean = js.native
  def isActiveFeature(e: MapTouchEvent): Boolean = js.native
  
  def isEnterKey(e: KeyboardEvent): Boolean = js.native
  
  def isEscapeKey(e: KeyboardEvent): Boolean = js.native
  
  def isFeature(e: MapMouseEvent): Boolean = js.native
  def isFeature(e: MapTouchEvent): Boolean = js.native
  
  def isInactiveFeature(e: MapMouseEvent): Boolean = js.native
  def isInactiveFeature(e: MapTouchEvent): Boolean = js.native
  
  def isOfMetaType(e: MapMouseEvent): Boolean = js.native
  def isOfMetaType(e: MapTouchEvent): Boolean = js.native
  
  def isShiftDown(e: MapboxEvent[Unit]): Boolean = js.native
  
  def isShiftMousedown(e: MapboxEvent[Unit]): Boolean = js.native
  
  def isTrue(): Boolean = js.native
  
  def isVertex(e: MapMouseEvent): Boolean = js.native
  def isVertex(e: MapTouchEvent): Boolean = js.native
  
  def noTarget(e: MapMouseEvent): Boolean = js.native
  def noTarget(e: MapTouchEvent): Boolean = js.native
}
