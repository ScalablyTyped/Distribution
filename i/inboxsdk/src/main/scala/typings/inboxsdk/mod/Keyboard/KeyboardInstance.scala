package typings.inboxsdk.mod.Keyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardInstance extends js.Object {
  def createShortcutHandle(keyboardShortcutDescriptor: KeyboardShortcutDescriptor): KeyboardShortcutHandle
}

object KeyboardInstance {
  @scala.inline
  def apply(createShortcutHandle: KeyboardShortcutDescriptor => KeyboardShortcutHandle): KeyboardInstance = {
    val __obj = js.Dynamic.literal(createShortcutHandle = js.Any.fromFunction1(createShortcutHandle))
    __obj.asInstanceOf[KeyboardInstance]
  }
}

