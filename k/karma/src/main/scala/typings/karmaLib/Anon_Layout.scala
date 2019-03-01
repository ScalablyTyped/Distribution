package typings
package karmaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Layout extends js.Object {
  var layout: Anon_Pattern
  var `type`: java.lang.String
}

object Anon_Layout {
  @scala.inline
  def apply(layout: Anon_Pattern, `type`: java.lang.String): Anon_Layout = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("layout")(layout)
    __obj.asInstanceOf[Anon_Layout]
  }
}

