package typings.gsap.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlowMo
  extends StObject
     with Ease {
  
  def config(linearRatio: Double, power: Double, yoyoMode: Boolean): SlowMo
}
object SlowMo {
  
  inline def apply(config: (Double, Double, Boolean) => SlowMo, getRatio: Double => Double): SlowMo = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction3(config), getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[SlowMo]
  }
  
  extension [Self <: SlowMo](x: Self) {
    
    inline def setConfig(value: (Double, Double, Boolean) => SlowMo): Self = StObject.set(x, "config", js.Any.fromFunction3(value))
  }
}
