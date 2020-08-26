package typings.isHotkey.mod

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-hotkey", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def apply(hotkey: String, options: js.UndefOr[scala.Nothing], event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: String, options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def apply(hotkey: String, options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: String, options: KeyboardEvent): Boolean = js.native
  def apply(hotkey: String, options: KeyboardEvent, event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def apply(hotkey: js.Array[String], options: js.UndefOr[scala.Nothing], event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String], options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def apply(hotkey: js.Array[String], options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String], options: KeyboardEvent): Boolean = js.native
  def apply(hotkey: js.Array[String], options: KeyboardEvent, event: KeyboardEvent): Boolean = js.native
}

