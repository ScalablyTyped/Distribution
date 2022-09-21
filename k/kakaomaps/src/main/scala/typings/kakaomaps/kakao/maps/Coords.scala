package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coords extends StObject {
  
  def equals(latlng: Coords): Boolean
  
  def getX(): Double
  
  def getY(): Double
  
  def toLatLng(): LatLng
}
object Coords {
  
  inline def apply(equals_ : Coords => Boolean, getX: () => Double, getY: () => Double, toLatLng: () => LatLng): Coords = {
    val __obj = js.Dynamic.literal(getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY), toLatLng = js.Any.fromFunction0(toLatLng))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Coords]
  }
  
  extension [Self <: Coords](x: Self) {
    
    inline def setEquals_(value: Coords => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetX(value: () => Double): Self = StObject.set(x, "getX", js.Any.fromFunction0(value))
    
    inline def setGetY(value: () => Double): Self = StObject.set(x, "getY", js.Any.fromFunction0(value))
    
    inline def setToLatLng(value: () => LatLng): Self = StObject.set(x, "toLatLng", js.Any.fromFunction0(value))
  }
}
