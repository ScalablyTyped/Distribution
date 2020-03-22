package typings.luminoWidgets.menuMod.Menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a menu item type.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoWidgets.luminoWidgetsStrings.command
  - typings.luminoWidgets.luminoWidgetsStrings.submenu
  - typings.luminoWidgets.luminoWidgetsStrings.separator
*/
trait ItemType extends js.Object

object ItemType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def command: typings.luminoWidgets.luminoWidgetsStrings.command = this.cast("command")
  @scala.inline
  def separator: typings.luminoWidgets.luminoWidgetsStrings.separator = this.cast("separator")
  @scala.inline
  def submenu: typings.luminoWidgets.luminoWidgetsStrings.submenu = this.cast("submenu")
}

