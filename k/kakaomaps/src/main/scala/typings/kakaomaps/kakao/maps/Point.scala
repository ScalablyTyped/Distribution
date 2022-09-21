package typings.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Point extends StObject {
  
  def equals(point: Point): Boolean
}
object Point {
  
  inline def apply(equals_ : Point => Boolean): Point = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Point]
  }
  
  extension [Self <: Point](x: Self) {
    
    inline def setEquals_(value: Point => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
  }
}
