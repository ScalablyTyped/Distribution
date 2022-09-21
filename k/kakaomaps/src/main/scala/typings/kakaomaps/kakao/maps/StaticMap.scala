package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticMap extends StObject {
  
  def getCenter(): LatLng = js.native
  
  def getLevel(): Double = js.native
  
  def setCenter(latlng: LatLng): Unit = js.native
  
  def setLevel(level: Double): Unit = js.native
  
  def setMapTypeId(): MapTypeId = js.native
  def setMapTypeId(mapTypeId: MapTypeId): Unit = js.native
}
