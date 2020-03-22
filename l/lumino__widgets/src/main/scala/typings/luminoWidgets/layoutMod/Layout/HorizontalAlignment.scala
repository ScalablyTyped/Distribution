package typings.luminoWidgets.layoutMod.Layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the horizontal alignment of a widget.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoWidgets.luminoWidgetsStrings.left
  - typings.luminoWidgets.luminoWidgetsStrings.center
  - typings.luminoWidgets.luminoWidgetsStrings.right
*/
trait HorizontalAlignment extends js.Object

object HorizontalAlignment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.luminoWidgets.luminoWidgetsStrings.center = this.cast("center")
  @scala.inline
  def left: typings.luminoWidgets.luminoWidgetsStrings.left = this.cast("left")
  @scala.inline
  def right: typings.luminoWidgets.luminoWidgetsStrings.right = this.cast("right")
}

