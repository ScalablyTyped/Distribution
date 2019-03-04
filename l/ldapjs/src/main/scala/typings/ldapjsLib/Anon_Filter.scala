package typings
package ldapjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: ldapjsLib.ldapjsMod.Filter
}

object Anon_Filter {
  @scala.inline
  def apply(filter: ldapjsLib.ldapjsMod.Filter): Anon_Filter = {
    val __obj = js.Dynamic.literal(filter = filter)
  
    __obj.asInstanceOf[Anon_Filter]
  }
}

