package typings
package inboxsdkLib.inboxsdkMod.KeyboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardShortcutHandle extends js.Object {
  def remove(): scala.Unit
}

object KeyboardShortcutHandle {
  @scala.inline
  def apply(remove: () => scala.Unit): KeyboardShortcutHandle = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[KeyboardShortcutHandle]
  }
}

