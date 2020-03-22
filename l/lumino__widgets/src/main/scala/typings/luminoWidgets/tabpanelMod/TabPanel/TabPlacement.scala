package typings.luminoWidgets.tabpanelMod.TabPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for tab placement in a tab bar.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoWidgets.luminoWidgetsStrings.top
  - typings.luminoWidgets.luminoWidgetsStrings.left
  - typings.luminoWidgets.luminoWidgetsStrings.right
  - typings.luminoWidgets.luminoWidgetsStrings.bottom
*/
trait TabPlacement extends js.Object

object TabPlacement {
  @scala.inline
  def bottom: typings.luminoWidgets.luminoWidgetsStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.luminoWidgets.luminoWidgetsStrings.left = this.cast("left")
  @scala.inline
  def right: typings.luminoWidgets.luminoWidgetsStrings.right = this.cast("right")
  @scala.inline
  def top: typings.luminoWidgets.luminoWidgetsStrings.top = this.cast("top")
}

