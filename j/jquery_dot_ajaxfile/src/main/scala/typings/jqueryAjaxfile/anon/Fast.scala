package typings.jqueryAjaxfile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fast extends js.Object {
  var fast: Double
  var slow: Double
}

object Fast {
  @scala.inline
  def apply(fast: Double, slow: Double): Fast = {
    val __obj = js.Dynamic.literal(fast = fast.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fast]
  }
}

