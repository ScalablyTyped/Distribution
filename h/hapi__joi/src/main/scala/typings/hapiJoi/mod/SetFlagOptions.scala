package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetFlagOptions extends js.Object {
  @JSName("clone")
  var clone_FSetFlagOptions: Boolean
}

object SetFlagOptions {
  @scala.inline
  def apply(clone: Boolean): SetFlagOptions = {
    val __obj = js.Dynamic.literal(clone = clone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFlagOptions]
  }
}

