package typings.keystonejsAppNext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextOptions extends js.Object {
  var dir: String
}

object NextOptions {
  @scala.inline
  def apply(dir: String): NextOptions = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextOptions]
  }
}

