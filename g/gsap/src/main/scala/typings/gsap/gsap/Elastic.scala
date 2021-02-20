package typings.gsap.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Elastic extends Ease {
  
  def config(amplitude: Double, period: Double): Elastic = js.native
}
object Elastic {
  
  @scala.inline
  def apply(config: (Double, Double) => Elastic, getRatio: Double => Double): Elastic = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction2(config), getRatio = js.Any.fromFunction1(getRatio))
    __obj.asInstanceOf[Elastic]
  }
  
  @scala.inline
  implicit class ElasticMutableBuilder[Self <: Elastic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: (Double, Double) => Elastic): Self = StObject.set(x, "config", js.Any.fromFunction2(value))
  }
}
