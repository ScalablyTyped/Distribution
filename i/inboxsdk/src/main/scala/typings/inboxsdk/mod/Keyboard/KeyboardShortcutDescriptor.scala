package typings.inboxsdk.mod.Keyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardShortcutDescriptor extends js.Object {
  var chord: String = js.native
  var description: String = js.native
}

object KeyboardShortcutDescriptor {
  @scala.inline
  def apply(chord: String, description: String): KeyboardShortcutDescriptor = {
    val __obj = js.Dynamic.literal(chord = chord.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardShortcutDescriptor]
  }
  @scala.inline
  implicit class KeyboardShortcutDescriptorOps[Self <: KeyboardShortcutDescriptor] (val x: Self) extends AnyVal {
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
    def setChord(value: String): Self = this.set("chord", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
  }
  
}

