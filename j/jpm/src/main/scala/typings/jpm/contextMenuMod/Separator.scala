package typings.jpm.contextMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Separator extends ItemMenuSeparator {
  var parentMenu: Menu = js.native
  def destroy(): Unit = js.native
}

@JSImport("sdk/context-menu", "Separator")
@js.native
object Separator extends js.Object {
  def apply(): Separator = js.native
}

