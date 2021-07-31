package typings.gsap.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SteppedEase
  extends StObject
     with Ease {
  
  def config(steps: Double): SteppedEase
}
object SteppedEase {
  
  @scala.inline
  def apply(config: Double => SteppedEase, getRatio: Double => Double): SteppedEase = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[SteppedEase]
  }
  
  @scala.inline
  implicit class SteppedEaseMutableBuilder[Self <: SteppedEase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: Double => SteppedEase): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
  }
}
