package typings
package isoDash3166Dash2Lib.isoDash3166Dash2Mod.CountryInfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Full extends Partial {
  var code: java.lang.String
}

object Full {
  @scala.inline
  def apply(
    code: java.lang.String,
    name: java.lang.String,
    sub: isoDash3166Dash2Lib.isoDash3166Dash2Mod.SubdivisionInfoNs.Map
  ): Full = {
    val __obj = js.Dynamic.literal(code = code, name = name, sub = sub)
  
    __obj.asInstanceOf[Full]
  }
}

