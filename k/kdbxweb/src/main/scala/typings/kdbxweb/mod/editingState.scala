package typings.kdbxweb.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait editingState extends js.Object {
  var added: js.Array[Date]
  var deleted: js.Array[Date]
}

object editingState {
  @scala.inline
  def apply(added: js.Array[Date], deleted: js.Array[Date]): editingState = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[editingState]
  }
}

