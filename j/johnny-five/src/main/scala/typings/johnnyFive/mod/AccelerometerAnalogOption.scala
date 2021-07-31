package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccelerometerAnalogOption
  extends StObject
     with AccelerometerGeneralOption {
  
  var aref: js.UndefOr[Double] = js.undefined
  
  var autoCalibrate: js.UndefOr[Boolean] = js.undefined
  
  var pins: js.Array[String]
  
  var sensitivity: js.UndefOr[Double] = js.undefined
  
  var zeroV: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object AccelerometerAnalogOption {
  
  @scala.inline
  def apply(pins: js.Array[String]): AccelerometerAnalogOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerAnalogOption]
  }
  
  @scala.inline
  implicit class AccelerometerAnalogOptionMutableBuilder[Self <: AccelerometerAnalogOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAref(value: Double): Self = StObject.set(x, "aref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArefUndefined: Self = StObject.set(x, "aref", js.undefined)
    
    @scala.inline
    def setAutoCalibrate(value: Boolean): Self = StObject.set(x, "autoCalibrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCalibrateUndefined: Self = StObject.set(x, "autoCalibrate", js.undefined)
    
    @scala.inline
    def setPins(value: js.Array[String]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinsVarargs(value: String*): Self = StObject.set(x, "pins", js.Array(value :_*))
    
    @scala.inline
    def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    @scala.inline
    def setZeroV(value: Double | js.Array[Double]): Self = StObject.set(x, "zeroV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroVUndefined: Self = StObject.set(x, "zeroV", js.undefined)
    
    @scala.inline
    def setZeroVVarargs(value: Double*): Self = StObject.set(x, "zeroV", js.Array(value :_*))
  }
}
