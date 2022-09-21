package typings.kakaomaps.global.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kakao.maps.LatLng")
@js.native
open class LatLng protected ()
  extends StObject
     with typings.kakaomaps.kakao.maps.LatLng {
  def this(latitude: Double, longitude: Double) = this()
  
  /* CompleteClass */
  override def equals(latlng: typings.kakaomaps.kakao.maps.LatLng): Boolean = js.native
  
  /* CompleteClass */
  override def getLat(): Double = js.native
  
  /* CompleteClass */
  override def getLng(): Double = js.native
  
  /* CompleteClass */
  override def toCoords(): typings.kakaomaps.kakao.maps.Coords = js.native
}
