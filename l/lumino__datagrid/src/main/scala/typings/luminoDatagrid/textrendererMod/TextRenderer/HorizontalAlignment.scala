package typings.luminoDatagrid.textrendererMod.TextRenderer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the supported horizontal alignment modes.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoDatagrid.luminoDatagridStrings.left
  - typings.luminoDatagrid.luminoDatagridStrings.center
  - typings.luminoDatagrid.luminoDatagridStrings.right
*/
trait HorizontalAlignment extends js.Object

object HorizontalAlignment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.luminoDatagrid.luminoDatagridStrings.center = this.cast("center")
  @scala.inline
  def left: typings.luminoDatagrid.luminoDatagridStrings.left = this.cast("left")
  @scala.inline
  def right: typings.luminoDatagrid.luminoDatagridStrings.right = this.cast("right")
}

