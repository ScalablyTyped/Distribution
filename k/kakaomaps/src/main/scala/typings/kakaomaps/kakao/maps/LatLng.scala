package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLng extends StObject {
  
  def equals(latlng: LatLng): Boolean
  
  def getLat(): Double
  
  def getLng(): Double
  
  def toCoords(): Coords
}
object LatLng {
  
  inline def apply(equals_ : LatLng => Boolean, getLat: () => Double, getLng: () => Double, toCoords: () => Coords): LatLng = {
    val __obj = js.Dynamic.literal(getLat = js.Any.fromFunction0(getLat), getLng = js.Any.fromFunction0(getLng), toCoords = js.Any.fromFunction0(toCoords))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[LatLng]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LatLng] (val x: Self) extends AnyVal {
    
    inline def setEquals_(value: LatLng => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetLat(value: () => Double): Self = StObject.set(x, "getLat", js.Any.fromFunction0(value))
    
    inline def setGetLng(value: () => Double): Self = StObject.set(x, "getLng", js.Any.fromFunction0(value))
    
    inline def setToCoords(value: () => Coords): Self = StObject.set(x, "toCoords", js.Any.fromFunction0(value))
  }
}
