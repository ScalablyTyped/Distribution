package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideEffect extends StObject {
  
  var direction: js.UndefOr[String] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
}
object SlideEffect {
  
  @scala.inline
  def apply(): SlideEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideEffect]
  }
  
  @scala.inline
  implicit class SlideEffectMutableBuilder[Self <: SlideEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
  }
}
