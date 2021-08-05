package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fn extends StObject {
  
  var circles: Double
  
  var dur: Double
  
  def fn(): Style
}
object Fn {
  
  inline def apply(circles: Double, dur: Double, fn: () => Style): Fn = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn))
    __obj.asInstanceOf[Fn]
  }
  
  extension [Self <: Fn](x: Self) {
    
    inline def setCircles(value: Double): Self = StObject.set(x, "circles", value.asInstanceOf[js.Any])
    
    inline def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    inline def setFn(value: () => Style): Self = StObject.set(x, "fn", js.Any.fromFunction0(value))
  }
}
