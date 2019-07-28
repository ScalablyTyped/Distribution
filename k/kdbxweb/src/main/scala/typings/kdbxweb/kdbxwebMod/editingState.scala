package typings.kdbxweb.kdbxwebMod

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
    val __obj = js.Dynamic.literal(added = added, deleted = deleted)
  
    __obj.asInstanceOf[editingState]
  }
}

