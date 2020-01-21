package typings.jpm.contextMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Separator extends ItemMenuSeparator {
  var parentMenu: Menu
  def destroy(): Unit
}

@JSImport("sdk/context-menu", "Separator")
@js.native
object Separator extends js.Object {
  def apply(): Separator = js.native
}

