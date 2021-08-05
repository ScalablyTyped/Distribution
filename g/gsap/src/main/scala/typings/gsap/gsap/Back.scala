package typings.gsap.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Back
  extends StObject
     with Ease {
  
  def config(overshoot: Double): Elastic
}
object Back {
  
  inline def apply(config: Double => Elastic, getRatio: Double => Double): Back = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[Back]
  }
  
  extension [Self <: Back](x: Self) {
    
    inline def setConfig(value: Double => Elastic): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
  }
}
