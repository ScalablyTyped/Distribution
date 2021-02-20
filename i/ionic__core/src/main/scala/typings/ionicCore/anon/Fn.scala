package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn extends StObject {
  
  var circles: Double = js.native
  
  var dur: Double = js.native
  
  def fn(): Style = js.native
}
object Fn {
  
  @scala.inline
  def apply(circles: Double, dur: Double, fn: () => Style): Fn = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn))
    __obj.asInstanceOf[Fn]
  }
  
  @scala.inline
  implicit class FnMutableBuilder[Self <: Fn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircles(value: Double): Self = StObject.set(x, "circles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFn(value: () => Style): Self = StObject.set(x, "fn", js.Any.fromFunction0(value))
  }
}
