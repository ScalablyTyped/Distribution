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
    val __obj = js.Dynamic.literal(description = description, reg = reg, serviceCode = serviceCode, sn = sn, wordmark = wordmark)
  
    __obj.asInstanceOf[TrademarkedData]
  }
}

