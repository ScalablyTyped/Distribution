package typings.isoDash3166Dash2.isoDash3166Dash2Mod.CountryInfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Full extends Partial {
  var code: String
}

object Full {
  @scala.inline
  def apply(
    code: String,
    name: String,
    sub: typings.isoDash3166Dash2.isoDash3166Dash2Mod.SubdivisionInfoNs.Map
  ): Full = {
    val __obj = js.Dynamic.literal(code = code, name = name, sub = sub)
  
    __obj.asInstanceOf[Full]
  }
}

