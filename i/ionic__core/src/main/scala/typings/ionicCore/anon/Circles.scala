package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circles extends StObject {
  
  var circles: Double
  
  var dur: Double
  
  def fn(dur: Double, index: Double, total: Double): R
}
object Circles {
  
  @scala.inline
  def apply(circles: Double, dur: Double, fn: (Double, Double, Double) => R): Circles = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction3(fn))
    __obj.asInstanceOf[Circles]
  }
  
  @scala.inline
  implicit class CirclesMutableBuilder[Self <: Circles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircles(value: Double): Self = StObject.set(x, "circles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFn(value: (Double, Double, Double) => R): Self = StObject.set(x, "fn", js.Any.fromFunction3(value))
  }
}
