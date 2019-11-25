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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], countryName = countryName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], regionCode = regionCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
}

