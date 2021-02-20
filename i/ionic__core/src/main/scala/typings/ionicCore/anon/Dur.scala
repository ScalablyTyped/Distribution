package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dur extends StObject {
  
  var circles: Double = js.native
  
  var dur: Double = js.native
  
  var elmDuration: Boolean = js.native
  
  def fn(): Cx = js.native
}
object Dur {
  
  @scala.inline
  def apply(circles: Double, dur: Double, elmDuration: Boolean, fn: () => Cx): Dur = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], elmDuration = elmDuration.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn))
    __obj.asInstanceOf[Dur]
  }
  
  @scala.inline
  implicit class DurMutableBuilder[Self <: Dur] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircles(value: Double): Self = StObject.set(x, "circles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElmDuration(value: Boolean): Self = StObject.set(x, "elmDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFn(value: () => Cx): Self = StObject.set(x, "fn", js.Any.fromFunction0(value))
  }
}
