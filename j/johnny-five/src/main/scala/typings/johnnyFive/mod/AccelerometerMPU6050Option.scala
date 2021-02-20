package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccelerometerMPU6050Option extends AccelerometerGeneralOption {
  
  var sensitivity: js.UndefOr[Double] = js.native
}
object AccelerometerMPU6050Option {
  
  @scala.inline
  def apply(): AccelerometerMPU6050Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccelerometerMPU6050Option]
  }
  
  @scala.inline
  implicit class AccelerometerMPU6050OptionMutableBuilder[Self <: AccelerometerMPU6050Option] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
  }
}
