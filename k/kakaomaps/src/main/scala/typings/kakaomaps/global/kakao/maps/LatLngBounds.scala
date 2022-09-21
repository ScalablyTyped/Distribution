package typings.kakaomaps.global.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kakao.maps.LatLngBounds")
@js.native
open class LatLngBounds ()
  extends StObject
     with typings.kakaomaps.kakao.maps.LatLngBounds {
  def this(sw: typings.kakaomaps.kakao.maps.LatLng) = this()
  def this(sw: Unit, ne: typings.kakaomaps.kakao.maps.LatLng) = this()
  def this(sw: typings.kakaomaps.kakao.maps.LatLng, ne: typings.kakaomaps.kakao.maps.LatLng) = this()
  
  /* CompleteClass */
  override def contain(latlng: typings.kakaomaps.kakao.maps.LatLng): Boolean = js.native
  
  /* CompleteClass */
  override def equals(latlngBounds: typings.kakaomaps.kakao.maps.LatLngBounds): Boolean = js.native
  
  /* CompleteClass */
  override def extend(latlng: typings.kakaomaps.kakao.maps.LatLng): Unit = js.native
  
  /* CompleteClass */
  override def getNorthEast(): typings.kakaomaps.kakao.maps.LatLng = js.native
  
  /* CompleteClass */
  override def getSouthWest(): typings.kakaomaps.kakao.maps.LatLng = js.native
  
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
}
