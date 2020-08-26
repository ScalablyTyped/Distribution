package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information required for a TCP uptime check request.
  */
@js.native
trait SchemaTcpCheck extends js.Object {
  /**
    * The port to the page to run the check against. Will be combined with host
    * (specified within the MonitoredResource) to construct the full URL.
    * Required.
    */
  var port: js.UndefOr[Double] = js.native
}

object SchemaTcpCheck {
  @scala.inline
  def apply(): SchemaTcpCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTcpCheck]
  }
  @scala.inline
  implicit class SchemaTcpCheckOps[Self <: SchemaTcpCheck] (val x: Self) extends AnyVal {
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

