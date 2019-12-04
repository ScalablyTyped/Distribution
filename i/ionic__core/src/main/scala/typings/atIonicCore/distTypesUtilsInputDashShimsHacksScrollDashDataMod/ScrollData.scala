package typings.atIonicCore.distTypesUtilsInputDashShimsHacksScrollDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollData extends js.Object {
  var inputSafeY: Double
  var scrollAmount: Double
  var scrollDuration: Double
  var scrollPadding: Double
}

object ScrollData {
  @scala.inline
  def apply(inputSafeY: Double, scrollAmount: Double, scrollDuration: Double, scrollPadding: Double): ScrollData = {
    val __obj = js.Dynamic.literal(inputSafeY = inputSafeY.asInstanceOf[js.Any], scrollAmount = scrollAmount.asInstanceOf[js.Any], scrollDuration = scrollDuration.asInstanceOf[js.Any], scrollPadding = scrollPadding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScrollData]
  }
}

