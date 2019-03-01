package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.KeyboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardInstance extends js.Object {
  def createShortcutHandle(keyboardShortcutDescriptor: KeyboardShortcutDescriptor): KeyboardShortcutHandle
}

object KeyboardInstance {
  @scala.inline
  def apply(createShortcutHandle: js.Function1[KeyboardShortcutDescriptor, KeyboardShortcutHandle]): KeyboardInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createShortcutHandle")(createShortcutHandle)
    __obj.asInstanceOf[KeyboardInstance]
  }
}

