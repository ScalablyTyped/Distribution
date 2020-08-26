package typings.ismobilejs.isMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  var maxTouchPoints: js.UndefOr[Double] = js.native
  var platform: String = js.native
  var userAgent: String = js.native
}

object Navigator {
  @scala.inline
  def apply(platform: String, userAgent: String): Navigator = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
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
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxTouchPoints(value: Double): Self = this.set("maxTouchPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTouchPoints: Self = this.set("maxTouchPoints", js.undefined)
  }
  
}

