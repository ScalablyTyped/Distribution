package typings.isoDash3166Dash2.isoDash3166Dash2Mod.SubdivisionInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Full extends Partial {
  var code: String
  var countryCode: String
  var countryName: String
  var regionCode: String
}

object Full {
  @scala.inline
  def apply(
    code: String,
    countryCode: String,
    countryName: String,
    name: String,
    regionCode: String,
    `type`: String
  ): Full = {
    val __obj = js.Dynamic.literal(code = code, countryCode = countryCode, countryName = countryName, name = name, regionCode = regionCode)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Full]
  }
}

