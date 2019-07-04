package typings
package imsiDashGrokLib.imsiDashGrokMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMSIBreakdown extends js.Object {
  var country_code: java.lang.String
  var country_iso: java.lang.String
  var country_name: java.lang.String
  var mcc: java.lang.String
  var mnc: java.lang.String
  var network_name: java.lang.String
}

object IMSIBreakdown {
  @scala.inline
  def apply(
    country_code: java.lang.String,
    country_iso: java.lang.String,
    country_name: java.lang.String,
    mcc: java.lang.String,
    mnc: java.lang.String,
    network_name: java.lang.String
  ): IMSIBreakdown = {
    val __obj = js.Dynamic.literal(country_code = country_code, country_iso = country_iso, country_name = country_name, mcc = mcc, mnc = mnc, network_name = network_name)
  
    __obj.asInstanceOf[IMSIBreakdown]
  }
}

