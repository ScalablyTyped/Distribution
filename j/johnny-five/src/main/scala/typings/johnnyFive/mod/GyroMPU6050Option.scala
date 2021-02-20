package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GyroMPU6050Option extends GyroGeneralOption {
  
  var sensitivity: Double = js.native
}
object GyroMPU6050Option {
  
  @scala.inline
  def apply(sensitivity: Double): GyroMPU6050Option = {
    val __obj = js.Dynamic.literal(sensitivity = sensitivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyroMPU6050Option]
  }
  
  @scala.inline
  implicit class GyroMPU6050OptionMutableBuilder[Self <: GyroMPU6050Option] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
  }
}
