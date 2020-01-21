package typings.johnnyFive.mod.IR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadCalibrationOption extends js.Object {
  var max: js.Array[Double]
  var min: js.Array[Double]
}

object LoadCalibrationOption {
  @scala.inline
  def apply(max: js.Array[Double], min: js.Array[Double]): LoadCalibrationOption = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoadCalibrationOption]
  }
}

