package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GyroAnalogOption
  extends StObject
     with GyroGeneralOption {
  
  var pins: js.Array[String]
  
  var resolution: js.UndefOr[Double] = js.undefined
  
  var sensitivity: Double
}
object GyroAnalogOption {
  
  inline def apply(pins: js.Array[String], sensitivity: Double): GyroAnalogOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyroAnalogOption]
  }
  
  extension [Self <: GyroAnalogOption](x: Self) {
    
    inline def setPins(value: js.Array[String]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    
    inline def setPinsVarargs(value: String*): Self = StObject.set(x, "pins", js.Array(value*))
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
  }
}
