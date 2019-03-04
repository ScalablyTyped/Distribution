package typings
package ldapjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filters extends js.Object {
  var filters: js.Array[ldapjsLib.ldapjsMod.Filter]
}

object Anon_Filters {
  @scala.inline
  def apply(filters: js.Array[ldapjsLib.ldapjsMod.Filter]): Anon_Filters = {
    val __obj = js.Dynamic.literal(filters = filters)
  
    __obj.asInstanceOf[Anon_Filters]
  }
}

