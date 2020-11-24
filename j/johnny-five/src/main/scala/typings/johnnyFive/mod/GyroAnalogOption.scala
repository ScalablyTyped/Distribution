package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GyroAnalogOption extends GyroGeneralOption {
  
  var pins: js.Array[String] = js.native
  
  var resolution: js.UndefOr[Double] = js.native
  
  var sensitivity: Double = js.native
}
object GyroAnalogOption {
  
  @scala.inline
  def apply(pins: js.Array[String], sensitivity: Double): GyroAnalogOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyroAnalogOption]
  }
  
  @scala.inline
  implicit class GyroAnalogOptionOps[Self <: GyroAnalogOption] (val x: Self) extends AnyVal {
    
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
    def setSensitivity(value: Double): Self = this.set("sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
  }
}
