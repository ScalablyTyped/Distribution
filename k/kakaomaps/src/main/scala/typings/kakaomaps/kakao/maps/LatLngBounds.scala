package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLngBounds extends StObject {
  
  def contain(latlng: LatLng): Boolean
  
  def equals(latlngBounds: LatLngBounds): Boolean
  
  def extend(latlng: LatLng): Unit
  
  def getNorthEast(): LatLng
  
  def getSouthWest(): LatLng
  
  def isEmpty(): Boolean
}
object LatLngBounds {
  
  inline def apply(
    contain: LatLng => Boolean,
    equals_ : LatLngBounds => Boolean,
    extend: LatLng => Unit,
    getNorthEast: () => LatLng,
    getSouthWest: () => LatLng,
    isEmpty: () => Boolean
  ): LatLngBounds = {
    val __obj = js.Dynamic.literal(contain = js.Any.fromFunction1(contain), extend = js.Any.fromFunction1(extend), getNorthEast = js.Any.fromFunction0(getNorthEast), getSouthWest = js.Any.fromFunction0(getSouthWest), isEmpty = js.Any.fromFunction0(isEmpty))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[LatLngBounds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LatLngBounds] (val x: Self) extends AnyVal {
    
    inline def setContain(value: LatLng => Boolean): Self = StObject.set(x, "contain", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: LatLngBounds => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setExtend(value: LatLng => Unit): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setGetNorthEast(value: () => LatLng): Self = StObject.set(x, "getNorthEast", js.Any.fromFunction0(value))
    
    inline def setGetSouthWest(value: () => LatLng): Self = StObject.set(x, "getSouthWest", js.Any.fromFunction0(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
  }
}
