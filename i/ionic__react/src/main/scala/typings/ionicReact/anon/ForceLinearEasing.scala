package typings.ionicReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceLinearEasing extends StObject {
  
  var forceLinearEasing: Boolean = js.native
  
  var step: js.UndefOr[Double] = js.native
}
object ForceLinearEasing {
  
  @scala.inline
  def apply(forceLinearEasing: Boolean): ForceLinearEasing = {
    val __obj = js.Dynamic.literal(forceLinearEasing = forceLinearEasing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceLinearEasing]
  }
  
  @scala.inline
  implicit class ForceLinearEasingMutableBuilder[Self <: ForceLinearEasing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceLinearEasing(value: Boolean): Self = StObject.set(x, "forceLinearEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
