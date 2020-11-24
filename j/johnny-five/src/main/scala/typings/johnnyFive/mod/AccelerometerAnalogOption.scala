package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccelerometerAnalogOption extends AccelerometerGeneralOption {
  
  var aref: js.UndefOr[Double] = js.native
  
  var autoCalibrate: js.UndefOr[Boolean] = js.native
  
  var pins: js.Array[String] = js.native
  
  var sensitivity: js.UndefOr[Double] = js.native
  
  var zeroV: js.UndefOr[Double | js.Array[Double]] = js.native
}
object AccelerometerAnalogOption {
  
  @scala.inline
  def apply(pins: js.Array[String]): AccelerometerAnalogOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerAnalogOption]
  }
  
  @scala.inline
  implicit class AccelerometerAnalogOptionOps[Self <: AccelerometerAnalogOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPinsVarargs(value: String*): Self = this.set("pins", js.Array(value :_*))
    
    @scala.inline
    def setPins(value: js.Array[String]): Self = this.set("pins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAref(value: Double): Self = this.set("aref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAref: Self = this.set("aref", js.undefined)
    
    @scala.inline
    def setAutoCalibrate(value: Boolean): Self = this.set("autoCalibrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCalibrate: Self = this.set("autoCalibrate", js.undefined)
    
    @scala.inline
    def setSensitivity(value: Double): Self = this.set("sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitivity: Self = this.set("sensitivity", js.undefined)
    
    @scala.inline
    def setZeroVVarargs(value: Double*): Self = this.set("zeroV", js.Array(value :_*))
    
    @scala.inline
    def setZeroV(value: Double | js.Array[Double]): Self = this.set("zeroV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZeroV: Self = this.set("zeroV", js.undefined)
  }
}
