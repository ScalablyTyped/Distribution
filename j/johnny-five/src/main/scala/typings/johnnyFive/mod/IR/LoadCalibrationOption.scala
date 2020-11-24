package typings.johnnyFive.mod.IR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadCalibrationOption extends js.Object {
  
  var max: js.Array[Double] = js.native
  
  var min: js.Array[Double] = js.native
}
object LoadCalibrationOption {
  
  @scala.inline
  def apply(max: js.Array[Double], min: js.Array[Double]): LoadCalibrationOption = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadCalibrationOption]
  }
  
  @scala.inline
  implicit class LoadCalibrationOptionOps[Self <: LoadCalibrationOption] (val x: Self) extends AnyVal {
    
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
    def setMaxVarargs(value: Double*): Self = this.set("max", js.Array(value :_*))
    
    @scala.inline
    def setMax(value: js.Array[Double]): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVarargs(value: Double*): Self = this.set("min", js.Array(value :_*))
    
    @scala.inline
    def setMin(value: js.Array[Double]): Self = this.set("min", value.asInstanceOf[js.Any])
  }
}
