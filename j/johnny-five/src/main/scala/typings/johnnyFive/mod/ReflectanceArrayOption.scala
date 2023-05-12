package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReflectanceArrayOption extends StObject {
  
  var emitter: Double | String
  
  var freq: js.UndefOr[Double] = js.undefined
  
  var pins: js.Array[Double | String]
}
object ReflectanceArrayOption {
  
  inline def apply(emitter: Double | String, pins: js.Array[Double | String]): ReflectanceArrayOption = {
    val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectanceArrayOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReflectanceArrayOption] (val x: Self) extends AnyVal {
    
    inline def setEmitter(value: Double | String): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
    
    inline def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    inline def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
    
    inline def setPins(value: js.Array[Double | String]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    
    inline def setPinsVarargs(value: (Double | String)*): Self = StObject.set(x, "pins", js.Array(value*))
  }
}
