package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShakeEffect extends StObject {
  
  var direction: js.UndefOr[String] = js.native
  
  var distance: js.UndefOr[Double] = js.native
  
  var times: js.UndefOr[Double] = js.native
}
object ShakeEffect {
  
  @scala.inline
  def apply(): ShakeEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShakeEffect]
  }
  
  @scala.inline
  implicit class ShakeEffectMutableBuilder[Self <: ShakeEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
  }
}
