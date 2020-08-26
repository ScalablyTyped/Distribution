package typings.inboxsdk.mod.Keyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardInstance extends js.Object {
  def createShortcutHandle(keyboardShortcutDescriptor: KeyboardShortcutDescriptor): KeyboardShortcutHandle = js.native
}

object KeyboardInstance {
  @scala.inline
  def apply(createShortcutHandle: KeyboardShortcutDescriptor => KeyboardShortcutHandle): KeyboardInstance = {
    val __obj = js.Dynamic.literal(createShortcutHandle = js.Any.fromFunction1(createShortcutHandle))
    __obj.asInstanceOf[KeyboardInstance]
  }
  @scala.inline
  implicit class KeyboardInstanceOps[Self <: KeyboardInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateShortcutHandle(value: KeyboardShortcutDescriptor => KeyboardShortcutHandle): Self = this.set("createShortcutHandle", js.Any.fromFunction1(value))
  }
  
}

