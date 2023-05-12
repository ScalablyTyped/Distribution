package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadCalibrationOption extends StObject {
  
  var max: js.Array[Double]
  
  var min: js.Array[Double]
}
object LoadCalibrationOption {
  
  inline def apply(max: js.Array[Double], min: js.Array[Double]): LoadCalibrationOption = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadCalibrationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadCalibrationOption] (val x: Self) extends AnyVal {
    
    inline def setMax(value: js.Array[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxVarargs(value: Double*): Self = StObject.set(x, "max", js.Array(value*))
    
    inline def setMin(value: js.Array[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinVarargs(value: Double*): Self = StObject.set(x, "min", js.Array(value*))
  }
}
