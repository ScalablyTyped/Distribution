package typings.mapboxMapboxGlDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FineTolerance extends StObject {
  
  var fineTolerance: js.UndefOr[Double] = js.undefined
  
  var grossTolerance: js.UndefOr[Double] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
}
object FineTolerance {
  
  inline def apply(): FineTolerance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FineTolerance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FineTolerance] (val x: Self) extends AnyVal {
    
    inline def setFineTolerance(value: Double): Self = StObject.set(x, "fineTolerance", value.asInstanceOf[js.Any])
    
    inline def setFineToleranceUndefined: Self = StObject.set(x, "fineTolerance", js.undefined)
    
    inline def setGrossTolerance(value: Double): Self = StObject.set(x, "grossTolerance", value.asInstanceOf[js.Any])
    
    inline def setGrossToleranceUndefined: Self = StObject.set(x, "grossTolerance", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
