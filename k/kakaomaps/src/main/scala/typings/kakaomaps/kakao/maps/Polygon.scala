package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polygon extends StObject {
  
  def getArea(): Double = js.native
  
  def getLength(): Double = js.native
  
  def getMap(): Map | Null = js.native
  
  def getPath(): js.Array[js.Array[LatLng] | LatLng] = js.native
  
  def getZIndex(): Double = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  def setOptions(options: PolygonOptions): Unit = js.native
  
  def setPath(path: js.Array[js.Array[LatLng] | LatLng]): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
