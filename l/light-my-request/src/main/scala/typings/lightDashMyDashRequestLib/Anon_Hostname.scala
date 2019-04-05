package typings
package lightDashMyDashRequestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hostname extends js.Object {
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var pathname: java.lang.String
  var port: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var protocal: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Hostname {
  @scala.inline
  def apply(
    pathname: java.lang.String,
    hostname: java.lang.String = null,
    port: java.lang.String | scala.Double = null,
    protocal: java.lang.String = null,
    query: java.lang.String = null
  ): Anon_Hostname = {
    val __obj = js.Dynamic.literal(pathname = pathname)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocal != null) __obj.updateDynamic("protocal")(protocal)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_Hostname]
  }
}

