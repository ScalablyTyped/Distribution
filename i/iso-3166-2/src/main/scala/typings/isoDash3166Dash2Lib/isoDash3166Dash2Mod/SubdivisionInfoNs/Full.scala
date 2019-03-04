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
    val __obj = js.Dynamic.literal(code = code, countryCode = countryCode, countryName = countryName, name = name, regionCode = regionCode)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Full]
  }
}

