package typings.isoDash3166Dash2.isoDash3166Dash2Mod.CountryInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Full extends Partial {
  var code: String
}

object Full {
  @scala.inline
  def apply(code: String, name: String, sub: typings.isoDash3166Dash2.isoDash3166Dash2Mod.SubdivisionInfo.Map): Full = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Full]
  }
}

