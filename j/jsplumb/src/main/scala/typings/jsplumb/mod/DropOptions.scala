package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropOptions extends js.Object {
  var hoverClass: String
}

object DropOptions {
  @scala.inline
  def apply(hoverClass: String): DropOptions = {
    val __obj = js.Dynamic.literal(hoverClass = hoverClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropOptions]
  }
}

