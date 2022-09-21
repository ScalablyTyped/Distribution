package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rectangle extends StObject {
  
  def getBounds(): LatLngBounds = js.native
  
  def getMap(): Map | Null = js.native
  
  def getZIndex(): Double = js.native
  
  def setBounds(bounds: LatLngBounds): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  def setOptions(options: RectangleOptions): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
