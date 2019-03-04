package typings
package gulpDashConnectLib.gulpDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveReloadOptions extends js.Object {
  /** Hostname to bind live reload server to */
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  /** Port to run live reload server on. Defauls to 35729. */
  var port: scala.Double
}

object LiveReloadOptions {
  @scala.inline
  def apply(port: scala.Double, hostname: java.lang.String = null): LiveReloadOptions = {
    val __obj = js.Dynamic.literal(port = port)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    __obj.asInstanceOf[LiveReloadOptions]
  }
}

