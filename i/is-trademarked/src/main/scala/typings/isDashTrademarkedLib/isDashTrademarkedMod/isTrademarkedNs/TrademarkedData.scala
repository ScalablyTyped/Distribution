package typings
package isDashTrademarkedLib.isDashTrademarkedMod.isTrademarkedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrademarkedData extends js.Object {
  var description: java.lang.String
  var reg: stdLib.Date
  var serviceCode: java.lang.String
  var sn: java.lang.String
  var wordmark: java.lang.String
}

object TrademarkedData {
  @scala.inline
  def apply(
    description: java.lang.String,
    reg: stdLib.Date,
    serviceCode: java.lang.String,
    sn: java.lang.String,
    wordmark: java.lang.String
  ): TrademarkedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("reg")(reg)
    __obj.updateDynamic("serviceCode")(serviceCode)
    __obj.updateDynamic("sn")(sn)
    __obj.updateDynamic("wordmark")(wordmark)
    __obj.asInstanceOf[TrademarkedData]
  }
}

