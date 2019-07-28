package typings.isDashHotkey.isDashHotkeyMod

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-hotkey", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compareHotkey(`object`: HotKey, event: KeyboardEvent): Boolean = js.native
  def default(hotkey: String): Boolean = js.native
  def default(hotkey: String, options: HotKeyOptions): Boolean = js.native
  def default(hotkey: String, options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  def default(hotkey: String, options: KeyboardEvent): Boolean = js.native
  def default(hotkey: String, options: KeyboardEvent, event: KeyboardEvent): Boolean = js.native
  def default(hotkey: js.Array[String]): Boolean = js.native
  def default(hotkey: js.Array[String], options: HotKeyOptions): Boolean = js.native
  def default(hotkey: js.Array[String], options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  def default(hotkey: js.Array[String], options: KeyboardEvent): Boolean = js.native
  def default(hotkey: js.Array[String], options: KeyboardEvent, event: KeyboardEvent): Boolean = js.native
  @JSName("default")
  def default_Function1(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSName("default")
  def default_Function1(hotkey: String, options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSName("default")
  def default_Function1(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSName("default")
  def default_Function1(hotkey: js.Array[String], options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def isCodeHotkey(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def isCodeHotkey(hotkey: String, event: KeyboardEvent): Boolean = js.native
  def isCodeHotkey(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def isCodeHotkey(hotkey: js.Array[String], event: KeyboardEvent): Boolean = js.native
  def isHotkey(hotkey: String): Boolean = js.native
  def isHotkey(hotkey: String, options: HotKeyOptions): Boolean = js.native
  def isHotkey(hotkey: String, options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  def isHotkey(hotkey: String, options: KeyboardEvent): Boolean = js.native
  def isHotkey(hotkey: String, options: KeyboardEvent, event: KeyboardEvent): Boolean = js.native
  def isHotkey(hotkey: js.Array[String]): Boolean = js.native
  def isHotkey(hotkey: js.Array[String], options: HotKeyOptions): Boolean = js.native
  def isHotkey(hotkey: js.Array[String], options: HotKeyOptions, event: KeyboardEvent): Boolean = js.native
  def isHotkey(hotkey: js.Array[String], options: KeyboardEvent): Boolean = js.native
  def isHotkey(hotkey: js.Array[String], options: KeyboardEvent, event: KeyboardEvent): Boolean = js.native
  @JSName("isHotkey")
  def isHotkey_Function1(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSName("isHotkey")
  def isHotkey_Function1(hotkey: String, options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSName("isHotkey")
  def isHotkey_Function1(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  @JSName("isHotkey")
  def isHotkey_Function1(hotkey: js.Array[String], options: HotKeyOptions): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def isKeyHotkey(hotkey: String): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def isKeyHotkey(hotkey: String, event: KeyboardEvent): Boolean = js.native
  def isKeyHotkey(hotkey: js.Array[String]): js.Function1[/* event */ KeyboardEvent, Boolean] = js.native
  def isKeyHotkey(hotkey: js.Array[String], event: KeyboardEvent): Boolean = js.native
  def parseHotkey(hotkey: String): HotKey = js.native
  def parseHotkey(hotkey: String, options: HotKeyOptions): HotKey = js.native
  def toKeyCode(name: String): Double = js.native
  def toKeyName(name: String): String = js.native
}

