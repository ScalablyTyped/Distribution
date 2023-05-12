package typings.listr2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delay extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var tries: Double
}
object Delay {
  
  inline def apply(tries: Double): Delay = {
    val __obj = js.Dynamic.literal(tries = tries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setTries(value: Double): Self = StObject.set(x, "tries", value.asInstanceOf[js.Any])
  }
}
