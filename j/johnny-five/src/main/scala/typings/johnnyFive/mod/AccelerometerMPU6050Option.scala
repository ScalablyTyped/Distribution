package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccelerometerMPU6050Option
  extends StObject
     with AccelerometerGeneralOption {
  
  var sensitivity: js.UndefOr[Double] = js.undefined
}
object AccelerometerMPU6050Option {
  
  inline def apply(): AccelerometerMPU6050Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccelerometerMPU6050Option]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccelerometerMPU6050Option] (val x: Self) extends AnyVal {
    
    inline def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
  }
}
