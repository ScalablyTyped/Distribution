package typings.jpm.sdkContextDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Separator extends ItemMenuSeparator {
  var parentMenu: Menu
  def destroy(): Unit
}

object Separator {
  @scala.inline
  def apply(destroy: () => Unit, parentMenu: Menu): Separator = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), parentMenu = parentMenu)
  
    __obj.asInstanceOf[Separator]
  }
}

