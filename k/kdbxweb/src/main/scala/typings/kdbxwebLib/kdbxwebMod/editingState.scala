package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait editingState extends js.Object {
  var added: js.Array[stdLib.Date]
  var deleted: js.Array[stdLib.Date]
}

object editingState {
  @scala.inline
  def apply(added: js.Array[stdLib.Date], deleted: js.Array[stdLib.Date]): editingState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("added")(added)
    __obj.updateDynamic("deleted")(deleted)
    __obj.asInstanceOf[editingState]
  }
}

