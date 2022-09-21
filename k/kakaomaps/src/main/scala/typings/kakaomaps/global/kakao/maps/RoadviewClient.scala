package typings.kakaomaps.global.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kakao.maps.RoadviewClient")
@js.native
open class RoadviewClient ()
  extends StObject
     with typings.kakaomaps.kakao.maps.RoadviewClient {
  
  /* CompleteClass */
  override def getNearestPanoId(
    position: typings.kakaomaps.kakao.maps.LatLng,
    radius: Double,
    callback: js.Function1[/* panoId */ Double, Unit]
  ): Unit = js.native
}
