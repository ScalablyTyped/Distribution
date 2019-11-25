package typings.gulpDashNgDashAnnotate.gulpDashNgDashAnnotateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameOption extends js.Object {
  var from: String
  var to: String
}

object RenameOption {
  @scala.inline
  def apply(from: String, to: String): RenameOption = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenameOption]
  }
}

