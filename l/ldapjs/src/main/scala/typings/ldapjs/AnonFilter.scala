package typings.ldapjs

import typings.ldapjs.mod.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  var filter: Filter
}

object AnonFilter {
  @scala.inline
  def apply(filter: Filter): AnonFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilter]
  }
}

