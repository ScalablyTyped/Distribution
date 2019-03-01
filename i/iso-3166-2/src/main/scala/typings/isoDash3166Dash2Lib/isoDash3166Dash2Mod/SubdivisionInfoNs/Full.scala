package typings
package isoDash3166Dash2Lib.isoDash3166Dash2Mod.SubdivisionInfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Full extends Partial {
  var code: java.lang.String
  var countryCode: java.lang.String
  var countryName: java.lang.String
  var regionCode: java.lang.String
}

object Full {
  @scala.inline
  def apply(
    code: java.lang.String,
    countryCode: java.lang.String,
    countryName: java.lang.String,
    name: java.lang.String,
    regionCode: java.lang.String,
    `type`: java.lang.String
  ): Full = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("countryCode")(countryCode)
    __obj.updateDynamic("countryName")(countryName)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("regionCode")(regionCode)
    __obj.asInstanceOf[Full]
  }
}

