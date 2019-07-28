package typings.ldapjs

import typings.ldapjs.ldapjsMod.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: Filter
}

object Anon_Filter {
  @scala.inline
  def apply(filter: Filter): Anon_Filter = {
    val __obj = js.Dynamic.literal(filter = filter)
  
    __obj.asInstanceOf[Anon_Filter]
  }
}

