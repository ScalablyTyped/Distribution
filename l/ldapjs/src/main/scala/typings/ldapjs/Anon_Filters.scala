package typings.ldapjs

import typings.ldapjs.ldapjsMod.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filters extends js.Object {
  var filters: js.Array[Filter]
}

object Anon_Filters {
  @scala.inline
  def apply(filters: js.Array[Filter]): Anon_Filters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Filters]
  }
}

