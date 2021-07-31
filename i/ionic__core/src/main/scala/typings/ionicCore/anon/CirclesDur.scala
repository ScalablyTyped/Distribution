package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CirclesDur extends StObject {
  
  var circles: Double
  
  var dur: Double
  
  def fn(_underscore: Double, index: Double): RStyle
}
object CirclesDur {
  
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double) => RStyle): CirclesDur = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction2(fn))
    __obj.asInstanceOf[CirclesDur]
  }
  
  @scala.inline
  implicit class CirclesDurMutableBuilder[Self <: CirclesDur] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircles(value: Double): Self = StObject.set(x, "circles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFn(value: (Double, Double) => RStyle): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
  }
}
