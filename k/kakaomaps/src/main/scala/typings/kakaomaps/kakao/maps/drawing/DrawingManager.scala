package typings.kakaomaps.kakao.maps.drawing

import typings.kakaomaps.kakao.maps.LatLng
import typings.kakaomaps.kakao.maps.LatLngBounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawingManager extends StObject {
  
  def cancel(): Unit = js.native
  
  def getData(): js.Object = js.native
  def getData(types: js.Array[OverlayType]): js.Object = js.native
  
  def getOverlays(): js.Object = js.native
  def getOverlays(types: js.Array[OverlayType]): js.Object = js.native
  
  def put(overlayType: OverlayType, param1: js.Array[js.Array[LatLng] | LatLng]): Unit = js.native
  def put(overlayType: OverlayType, param1: js.Array[js.Array[LatLng] | LatLng], param2: Double): Unit = js.native
  def put(overlayType: OverlayType, param1: LatLng): Unit = js.native
  def put(overlayType: OverlayType, param1: LatLngBounds): Unit = js.native
  def put(overlayType: OverlayType, param1: LatLngBounds, param2: Double): Unit = js.native
  def put(overlayType: OverlayType, param1: LatLng, param2: Double): Unit = js.native
  
  def redo(): Unit = js.native
  
  def redoable(): Boolean = js.native
  
  def remove(overlay: Any): Unit = js.native
  
  def select(`type`: OverlayType): Unit = js.native
  def select(`type`: OverlayType, index: Double): Unit = js.native
  
  def setStrokeColor(strokeColor: String): Unit = js.native
  
  def setStrokeWeight(strokeWeight: Double): Unit = js.native
  
  def setStyle(`type`: OverlayType, prop: String, value: String): Unit = js.native
  def setStyle(`type`: OverlayType, prop: String, value: Double): Unit = js.native
  
  def undo(): Unit = js.native
  
  def undoable(): Boolean = js.native
}
