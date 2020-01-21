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
  def apply(port: Int | Double = null): SchemaTcpCheck = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTcpCheck]
  }
}

