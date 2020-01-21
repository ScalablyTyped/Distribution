package typings.jpm.hotkeysMod

import typings.jpm.AnonCombo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hotkey extends js.Object {
  def destroy(): Unit
}

@JSImport("sdk/hotkeys", "Hotkey")
@js.native
object Hotkey extends js.Object {
  def apply(options: AnonCombo): Hotkey = js.native
}

