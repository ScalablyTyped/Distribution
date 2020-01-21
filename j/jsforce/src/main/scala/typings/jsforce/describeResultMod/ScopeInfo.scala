package typings.jsforce.describeResultMod

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
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScopeInfo]
  }
}

