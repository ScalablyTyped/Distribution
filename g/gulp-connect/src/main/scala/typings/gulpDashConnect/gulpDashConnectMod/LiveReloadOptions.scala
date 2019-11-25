package typings.gulpDashConnect.gulpDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveReloadOptions extends js.Object {
  /** Hostname to bind live reload server to */
  var hostname: js.UndefOr[String] = js.undefined
  /** Port to run live reload server on. Defauls to 35729. */
  var port: Double
}

object LiveReloadOptions {
  @scala.inline
  def apply(port: Double, hostname: String = null): LiveReloadOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveReloadOptions]
  }
}

