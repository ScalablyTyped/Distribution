package typings.joi.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPOptions extends js.Object {
  var cidr: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[js.Array[String]] = js.undefined
}

object IPOptions {
  @scala.inline
  def apply(cidr: String = null, version: js.Array[String] = null): IPOptions = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPOptions]
  }
}

trait IpOptions extends js.Object {
  /**
    * Used to determine if a CIDR is allowed or not. Valid values: optional, required, forbidden
    */
  var cidr: js.UndefOr[String] = js.undefined
  /**
    * One or more IP address versions to validate against. Valid values: ipv4, ipv6, ipvfuture
    */
  var version: js.UndefOr[String | js.Array[String]] = js.undefined
}

object IpOptions {
  @scala.inline
  def apply(cidr: String = null, version: String | js.Array[String] = null): IpOptions = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpOptions]
  }
}

