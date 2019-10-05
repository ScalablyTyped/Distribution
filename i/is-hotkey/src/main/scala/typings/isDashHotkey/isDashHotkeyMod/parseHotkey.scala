package typings.isDashHotkey.isDashHotkeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-hotkey", "parseHotkey")
@js.native
object parseHotkey extends js.Object {
  def apply(hotkey: String): HotKey = js.native
  def apply(hotkey: String, options: HotKeyOptions): HotKey = js.native
}

