package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/transitions.Duration> */
trait PartialDuration extends StObject {
  
  var complex: js.UndefOr[Double] = js.undefined
  
  var enteringScreen: js.UndefOr[Double] = js.undefined
  
  var leavingScreen: js.UndefOr[Double] = js.undefined
  
  var short: js.UndefOr[Double] = js.undefined
  
  var shorter: js.UndefOr[Double] = js.undefined
  
  var shortest: js.UndefOr[Double] = js.undefined
  
  var standard: js.UndefOr[Double] = js.undefined
}
object PartialDuration {
  
  inline def apply(): PartialDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDuration]
  }
  
  extension [Self <: PartialDuration](x: Self) {
    
    inline def setComplex(value: Double): Self = StObject.set(x, "complex", value.asInstanceOf[js.Any])
    
    inline def setComplexUndefined: Self = StObject.set(x, "complex", js.undefined)
    
    inline def setEnteringScreen(value: Double): Self = StObject.set(x, "enteringScreen", value.asInstanceOf[js.Any])
    
    inline def setEnteringScreenUndefined: Self = StObject.set(x, "enteringScreen", js.undefined)
    
    inline def setLeavingScreen(value: Double): Self = StObject.set(x, "leavingScreen", value.asInstanceOf[js.Any])
    
    inline def setLeavingScreenUndefined: Self = StObject.set(x, "leavingScreen", js.undefined)
    
    inline def setShort(value: Double): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    inline def setShorter(value: Double): Self = StObject.set(x, "shorter", value.asInstanceOf[js.Any])
    
    inline def setShorterUndefined: Self = StObject.set(x, "shorter", js.undefined)
    
    inline def setShortest(value: Double): Self = StObject.set(x, "shortest", value.asInstanceOf[js.Any])
    
    inline def setShortestUndefined: Self = StObject.set(x, "shortest", js.undefined)
    
    inline def setStandard(value: Double): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    inline def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
  }
}
