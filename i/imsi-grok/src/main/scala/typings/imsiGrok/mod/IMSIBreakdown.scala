package typings.imsiGrok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMSIBreakdown extends js.Object {
  var country_code: String = js.native
  var country_iso: String = js.native
  var country_name: String = js.native
  var mcc: String = js.native
  var mnc: String = js.native
  var network_name: String = js.native
}

object IMSIBreakdown {
  @scala.inline
  def apply(
    country_code: String,
    country_iso: String,
    country_name: String,
    mcc: String,
    mnc: String,
    network_name: String
  ): IMSIBreakdown = {
    val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any], country_iso = country_iso.asInstanceOf[js.Any], country_name = country_name.asInstanceOf[js.Any], mcc = mcc.asInstanceOf[js.Any], mnc = mnc.asInstanceOf[js.Any], network_name = network_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMSIBreakdown]
  }
  @scala.inline
  implicit class IMSIBreakdownOps[Self <: IMSIBreakdown] (val x: Self) extends AnyVal {
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
    def setCountry_code(value: String): Self = this.set("country_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry_iso(value: String): Self = this.set("country_iso", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry_name(value: String): Self = this.set("country_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setMcc(value: String): Self = this.set("mcc", value.asInstanceOf[js.Any])
    @scala.inline
    def setMnc(value: String): Self = this.set("mnc", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetwork_name(value: String): Self = this.set("network_name", value.asInstanceOf[js.Any])
  }
  
}

