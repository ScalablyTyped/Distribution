package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.KeyboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardShortcutDescriptor extends js.Object {
  var chord: java.lang.String
  var description: java.lang.String
}

object KeyboardShortcutDescriptor {
  @scala.inline
  def apply(chord: java.lang.String, description: java.lang.String): KeyboardShortcutDescriptor = {
    val __obj = js.Dynamic.literal(chord = chord, description = description)
  
    __obj.asInstanceOf[KeyboardShortcutDescriptor]
  }
}

