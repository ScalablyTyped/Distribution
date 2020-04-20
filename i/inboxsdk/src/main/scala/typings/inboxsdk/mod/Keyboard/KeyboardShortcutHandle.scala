package typings.inboxsdk.mod.Keyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardShortcutHandle extends js.Object {
  def remove(): Unit
}

object KeyboardShortcutHandle {
  @scala.inline
  def apply(remove: () => Unit): KeyboardShortcutHandle = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[KeyboardShortcutHandle]
  }
}

