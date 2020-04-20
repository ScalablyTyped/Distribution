package typings.imsiGrok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMSIBreakdown extends js.Object {
  var country_code: String
  var country_iso: String
  var country_name: String
  var mcc: String
  var mnc: String
  var network_name: String
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
}

