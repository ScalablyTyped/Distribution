package typings
package isoDash3166Dash2Lib.isoDash3166Dash2Mod.SubdivisionInfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Partial extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
}

object Partial {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String): Partial = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Partial]
  }
}

