package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PulsateEffect extends StObject {
  
  var times: js.UndefOr[Double] = js.undefined
}
object PulsateEffect {
  
  @scala.inline
  def apply(): PulsateEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PulsateEffect]
  }
  
  @scala.inline
  implicit class PulsateEffectMutableBuilder[Self <: PulsateEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
  }
}
