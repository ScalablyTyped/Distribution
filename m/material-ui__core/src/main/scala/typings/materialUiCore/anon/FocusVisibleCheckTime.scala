package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusVisibleCheckTime extends js.Object {
  var focusVisibleCheckTime: Double = js.native
  var focusVisibleMaxCheckTimes: Double = js.native
  var focusVisibleTimeout: js.Any = js.native
}

object FocusVisibleCheckTime {
  @scala.inline
  def apply(focusVisibleCheckTime: Double, focusVisibleMaxCheckTimes: Double, focusVisibleTimeout: js.Any): FocusVisibleCheckTime = {
    val __obj = js.Dynamic.literal(focusVisibleCheckTime = focusVisibleCheckTime.asInstanceOf[js.Any], focusVisibleMaxCheckTimes = focusVisibleMaxCheckTimes.asInstanceOf[js.Any], focusVisibleTimeout = focusVisibleTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusVisibleCheckTime]
  }
}

