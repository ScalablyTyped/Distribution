package typings.gun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChange extends js.Object {
  var change: Boolean
}

object AnonChange {
  @scala.inline
  def apply(change: Boolean): AnonChange = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChange]
  }
}

