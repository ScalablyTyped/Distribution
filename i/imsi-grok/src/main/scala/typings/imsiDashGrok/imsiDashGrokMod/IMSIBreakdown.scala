package typings.imsiDashGrok.imsiDashGrokMod

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
    val __obj = js.Dynamic.literal(country_code = country_code, country_iso = country_iso, country_name = country_name, mcc = mcc, mnc = mnc, network_name = network_name)
  
    __obj.asInstanceOf[IMSIBreakdown]
  }
}

