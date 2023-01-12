package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PulsateEffect extends StObject {
  
  var times: js.UndefOr[Double] = js.undefined
}
object PulsateEffect {
  
  inline def apply(): PulsateEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PulsateEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PulsateEffect] (val x: Self) extends AnyVal {
    
    inline def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
  }
}
