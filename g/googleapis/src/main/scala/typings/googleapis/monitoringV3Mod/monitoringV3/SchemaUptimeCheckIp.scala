package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the region, location, and list of IP addresses where checkers in
  * the location run from.
  */
@js.native
trait SchemaUptimeCheckIp extends js.Object {
  /**
    * The IP address from which the uptime check originates. This is a full IP
    * address (not an IP address range). Most IP addresses, as of this
    * publication, are in IPv4 format; however, one should not rely on the IP
    * addresses being in IPv4 format indefinitely and should support
    * interpreting this field in either IPv4 or IPv6 format.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * A more specific location within the region that typically encodes a
    * particular city/town/metro (and its containing state/province or country)
    * within the broader umbrella region category.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * A broad region category in which the IP address is located.
    */
  var region: js.UndefOr[String] = js.native
}

object SchemaUptimeCheckIp {
  @scala.inline
  def apply(): SchemaUptimeCheckIp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUptimeCheckIp]
  }
  @scala.inline
  implicit class SchemaUptimeCheckIpOps[Self <: SchemaUptimeCheckIp] (val x: Self) extends AnyVal {
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
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

