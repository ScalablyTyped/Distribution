package typings.isDashHotkey.isDashHotkeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotKeyOptions extends js.Object {
  var byKey: Boolean
}

object HotKeyOptions {
  @scala.inline
  def apply(byKey: Boolean): HotKeyOptions = {
    val __obj = js.Dynamic.literal(byKey = byKey)
  
    __obj.asInstanceOf[HotKeyOptions]
  }
}

