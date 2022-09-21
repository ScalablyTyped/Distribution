package typings.kakaomaps.kakao.maps

import typings.kakaomaps.anon.Rx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ellipse extends StObject {
  
  def getBounds(): LatLngBounds = js.native
  
  def getMap(): Map | Null = js.native
  
  def getPosition(): LatLng = js.native
  
  def getRadius(): Rx = js.native
  
  def getRadiusX(): Double = js.native
  
  def getRadiusY(): Double = js.native
  
  def getZIndex(): Double = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  def setOptions(options: EllipseOptions): Unit = js.native
  
  def setPosition(position: LatLng): Unit = js.native
  
  def setRadius(rx: Double, ry: Double): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
