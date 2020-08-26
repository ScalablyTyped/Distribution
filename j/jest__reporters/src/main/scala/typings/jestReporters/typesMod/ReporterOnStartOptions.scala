package typings.jestReporters.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReporterOnStartOptions extends js.Object {
  var estimatedTime: Double = js.native
  var showStatus: Boolean = js.native
}

object ReporterOnStartOptions {
  @scala.inline
  def apply(estimatedTime: Double, showStatus: Boolean): ReporterOnStartOptions = {
    val __obj = js.Dynamic.literal(estimatedTime = estimatedTime.asInstanceOf[js.Any], showStatus = showStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReporterOnStartOptions]
  }
  @scala.inline
  implicit class ReporterOnStartOptionsOps[Self <: ReporterOnStartOptions] (val x: Self) extends AnyVal {
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
    def setEstimatedTime(value: Double): Self = this.set("estimatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowStatus(value: Boolean): Self = this.set("showStatus", value.asInstanceOf[js.Any])
  }
  
}

