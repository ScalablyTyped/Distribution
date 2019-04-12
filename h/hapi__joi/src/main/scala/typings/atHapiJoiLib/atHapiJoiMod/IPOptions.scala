package typings
package atHapiJoiLib.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPOptions extends js.Object {
  var cidr: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

trait IpOptions extends js.Object {
  /**
    * Used to determine if a CIDR is allowed or not. Valid values: optional, required, forbidden
    */
  var cidr: js.UndefOr[java.lang.String] = js.undefined
  /**
    * One or more IP address versions to validate against. Valid values: ipv4, ipv6, ipvfuture
    */
  var version: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object IPOptions {
  @scala.inline
  def apply(cidr: java.lang.String = null, version: js.Array[java.lang.String] = null): IPOptions = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IPOptions]
  }
}

object IpOptions {
  @scala.inline
  def apply(cidr: java.lang.String = null, version: java.lang.String | js.Array[java.lang.String] = null): IpOptions = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpOptions]
  }
}

