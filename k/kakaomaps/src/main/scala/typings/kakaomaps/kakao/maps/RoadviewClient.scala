package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoadviewClient extends StObject {
  
  def getNearestPanoId(position: LatLng, radius: Double, callback: js.Function1[/* panoId */ Double, Unit]): Unit
}
object RoadviewClient {
  
  inline def apply(getNearestPanoId: (LatLng, Double, js.Function1[/* panoId */ Double, Unit]) => Unit): RoadviewClient = {
    val __obj = js.Dynamic.literal(getNearestPanoId = js.Any.fromFunction3(getNearestPanoId))
    __obj.asInstanceOf[RoadviewClient]
  }
  
  extension [Self <: RoadviewClient](x: Self) {
    
    inline def setGetNearestPanoId(value: (LatLng, Double, js.Function1[/* panoId */ Double, Unit]) => Unit): Self = StObject.set(x, "getNearestPanoId", js.Any.fromFunction3(value))
  }
}
