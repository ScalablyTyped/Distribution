package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marker extends StObject {
  
  def getAltitude(): Double = js.native
  
  def getClickable(): Boolean = js.native
  
  def getDraggable(): Boolean = js.native
  
  def getImage(): MarkerImage = js.native
  
  def getMap(): Map | Null = js.native
  
  def getOpacity(): Double = js.native
  
  def getPosition(): LatLng = js.native
  
  def getRange(): Double = js.native
  
  def getTitle(): String = js.native
  
  def getVisible(): Boolean = js.native
  
  def getZIndex(): Double = js.native
  
  def setAltitude(altitude: Double): Unit = js.native
  
  def setClickable(clickable: Boolean): Unit = js.native
  
  def setDraggable(draggable: Boolean): Unit = js.native
  
  def setImage(image: MarkerImage): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map_or_roadview: Map): Unit = js.native
  def setMap(map_or_roadview: Roadview): Unit = js.native
  
  def setOpacity(opacity: Double): Unit = js.native
  
  def setPosition(position: LatLng): Unit = js.native
  def setPosition(position: Viewpoint): Unit = js.native
  
  def setRange(range: Double): Unit = js.native
  
  def setTitle(title: String): Unit = js.native
  
  def setVisible(visible: Boolean): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
