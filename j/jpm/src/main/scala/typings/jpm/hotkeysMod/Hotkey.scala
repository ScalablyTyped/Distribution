package typings.jpm.hotkeysMod

import typings.jpm.anon.Combo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hotkey extends js.Object {
  
  def destroy(): Unit = js.native
}
@JSImport("sdk/hotkeys", "Hotkey")
@js.native
object Hotkey extends js.Object {
  
  def apply(options: Combo): Hotkey = js.native
}
