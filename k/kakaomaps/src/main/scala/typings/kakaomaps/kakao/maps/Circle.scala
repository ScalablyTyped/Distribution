package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circle extends StObject {
  
  def getBounds(): LatLngBounds = js.native
  
  def getMap(): Map | Null = js.native
  
  def getPosition(): LatLng = js.native
  
  def getRadius(): Double = js.native
  
  def getZIndex(): Double = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  def setOptions(options: CircleOptions): Unit = js.native
  
  def setPosition(position: LatLng): Unit = js.native
  
  def setRadius(radius: Double): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
