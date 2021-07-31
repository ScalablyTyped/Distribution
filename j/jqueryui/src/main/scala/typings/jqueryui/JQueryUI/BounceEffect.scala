package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BounceEffect extends StObject {
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var times: js.UndefOr[Double] = js.undefined
}
object BounceEffect {
  
  @scala.inline
  def apply(): BounceEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BounceEffect]
  }
  
  @scala.inline
  implicit class BounceEffectMutableBuilder[Self <: BounceEffect] (val x: Self) extends AnyVal {
    
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
