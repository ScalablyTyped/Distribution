package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFocusVisibleCheckTime extends js.Object {
  var focusVisibleCheckTime: Double = js.native
  var focusVisibleMaxCheckTimes: Double = js.native
  var focusVisibleTimeout: js.Any = js.native
}

object AnonFocusVisibleCheckTime {
  @scala.inline
  def apply(focusVisibleCheckTime: Double, focusVisibleMaxCheckTimes: Double, focusVisibleTimeout: js.Any): AnonFocusVisibleCheckTime = {
    val __obj = js.Dynamic.literal(focusVisibleCheckTime = focusVisibleCheckTime.asInstanceOf[js.Any], focusVisibleMaxCheckTimes = focusVisibleMaxCheckTimes.asInstanceOf[js.Any], focusVisibleTimeout = focusVisibleTimeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFocusVisibleCheckTime]
  }
}

