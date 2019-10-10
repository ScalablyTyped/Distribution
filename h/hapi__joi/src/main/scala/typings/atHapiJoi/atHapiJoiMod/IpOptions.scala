package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpOptions extends js.Object {
  /**
    * Used to determine if a CIDR is allowed or not. Valid values: optional, required, forbidden
    */
  var cidr: js.UndefOr[PresenceMode] = js.undefined
  /**
    * One or more IP address versions to validate against. Valid values: ipv4, ipv6, ipvfuture
    */
  var version: js.UndefOr[String | js.Array[String]] = js.undefined
}

object IpOptions {
  @scala.inline
  def apply(cidr: PresenceMode = null, version: String | js.Array[String] = null): IpOptions = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpOptions]
  }
}

