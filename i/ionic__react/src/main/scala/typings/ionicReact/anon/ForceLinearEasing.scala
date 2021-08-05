package typings.ionicReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceLinearEasing extends StObject {
  
  var forceLinearEasing: Boolean
  
  var step: js.UndefOr[Double] = js.undefined
}
object ForceLinearEasing {
  
  inline def apply(forceLinearEasing: Boolean): ForceLinearEasing = {
    val __obj = js.Dynamic.literal(forceLinearEasing = forceLinearEasing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceLinearEasing]
  }
  
  extension [Self <: ForceLinearEasing](x: Self) {
    
    inline def setForceLinearEasing(value: Boolean): Self = StObject.set(x, "forceLinearEasing", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
