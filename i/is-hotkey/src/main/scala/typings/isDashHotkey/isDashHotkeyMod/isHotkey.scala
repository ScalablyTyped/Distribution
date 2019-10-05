package typings.isDashHotkey.isDashHotkeyMod

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-hotkey", "isHotkey")
@js.native
object isHotkey extends js.Object {
  def apply(hotkey: String): Boolean = js.native
  def apply(hotkey: String, options: HotKeyOptions): Boolean = js.native
  def apply(hotkey: String, options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: String, options: KeyboardEvent): Boolean = js.native
  def apply(hotkey: String, options: KeyboardEvent, event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String]): Boolean = js.native
  def apply(hotkey: js.Array[String], options: HotKeyOptions): Boolean = js.native
  def apply(hotkey: js.Array[String], options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String], options: KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String], options: KeyboardEvent, event: KeyboardEvent): Boolean = js.native
}

