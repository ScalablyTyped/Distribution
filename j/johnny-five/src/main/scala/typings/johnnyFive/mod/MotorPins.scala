package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotorPins extends StObject {
  
  var brake: js.UndefOr[Double] = js.undefined
  
  var cdir: js.UndefOr[Double] = js.undefined
  
  var dir: Double
  
  var pwm: Double
}
object MotorPins {
  
  inline def apply(dir: Double, pwm: Double): MotorPins = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotorPins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotorPins] (val x: Self) extends AnyVal {
    
    inline def setBrake(value: Double): Self = StObject.set(x, "brake", value.asInstanceOf[js.Any])
    
    inline def setBrakeUndefined: Self = StObject.set(x, "brake", js.undefined)
    
    inline def setCdir(value: Double): Self = StObject.set(x, "cdir", value.asInstanceOf[js.Any])
    
    inline def setCdirUndefined: Self = StObject.set(x, "cdir", js.undefined)
    
    inline def setDir(value: Double): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setPwm(value: Double): Self = StObject.set(x, "pwm", value.asInstanceOf[js.Any])
  }
}
