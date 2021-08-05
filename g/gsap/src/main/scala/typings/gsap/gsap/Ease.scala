package typings.gsap.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ease extends StObject {
  
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  def getRatio(p: Double): Double
}
object Ease {
  
  inline def apply(getRatio: Double => Double): Ease = {
    val __obj = js.Dynamic.literal(getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[Ease]
  }
  
  extension [Self <: Ease](x: Self) {
    
    inline def setGetRatio(value: Double => Double): Self = StObject.set(x, "getRatio", js.Any.fromFunction1(value))
  }
}
