package typings.jpm.sdkHotkeysMod

import typings.jpm.Anon_Combo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hotkey extends js.Object {
  def destroy(): Unit
}

@JSImport("sdk/hotkeys", "Hotkey")
@js.native
object Hotkey extends js.Object {
  def apply(options: Anon_Combo): Hotkey = js.native
}

