package typings.ldapjs

import typings.ldapjs.mod.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilters extends js.Object {
  var filters: js.Array[Filter]
}

object AnonFilters {
  @scala.inline
  def apply(filters: js.Array[Filter]): AnonFilters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilters]
  }
}

