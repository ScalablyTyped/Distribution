package typings
package isDashHotkeyLib.isDashHotkeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotKeyOptions extends js.Object {
  var byKey: scala.Boolean
}

object HotKeyOptions {
  @scala.inline
  def apply(byKey: scala.Boolean): HotKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("byKey")(byKey)
    __obj.asInstanceOf[HotKeyOptions]
  }
}

