package typings
package jpmLib.sdkHotkeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hotkey extends js.Object {
  def destroy(): scala.Unit
}

object Hotkey {
  @scala.inline
  def apply(destroy: () => scala.Unit): Hotkey = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[Hotkey]
  }
}

