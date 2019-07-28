package typings.jsforce.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeInfo extends js.Object {
  var label: String
  var name: String
}

object ScopeInfo {
  @scala.inline
  def apply(label: String, name: String): ScopeInfo = {
    val __obj = js.Dynamic.literal(label = label, name = name)
  
    __obj.asInstanceOf[ScopeInfo]
  }
}

