package typings.ldapjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends js.Object {
  var filters: js.Array[typings.ldapjs.mod.Filter]
}

object Filters {
  @scala.inline
  def apply(filters: js.Array[typings.ldapjs.mod.Filter]): Filters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
}

