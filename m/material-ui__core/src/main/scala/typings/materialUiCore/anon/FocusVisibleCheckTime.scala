package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  @scala.inline
  implicit class FocusVisibleCheckTimeOps[Self <: FocusVisibleCheckTime] (val x: Self) extends AnyVal {
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
    def setFocusVisibleCheckTime(value: Double): Self = this.set("focusVisibleCheckTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusVisibleMaxCheckTimes(value: Double): Self = this.set("focusVisibleMaxCheckTimes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusVisibleTimeout(value: js.Any): Self = this.set("focusVisibleTimeout", value.asInstanceOf[js.Any])
  }
  
}

