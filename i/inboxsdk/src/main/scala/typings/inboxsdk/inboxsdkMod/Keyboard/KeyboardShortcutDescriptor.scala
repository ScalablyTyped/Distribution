package typings.inboxsdk.inboxsdkMod.Keyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardShortcutDescriptor extends js.Object {
  var chord: String
  var description: String
}

object KeyboardShortcutDescriptor {
  @scala.inline
  def apply(chord: String, description: String): KeyboardShortcutDescriptor = {
    val __obj = js.Dynamic.literal(chord = chord, description = description)
  
    __obj.asInstanceOf[KeyboardShortcutDescriptor]
  }
}

