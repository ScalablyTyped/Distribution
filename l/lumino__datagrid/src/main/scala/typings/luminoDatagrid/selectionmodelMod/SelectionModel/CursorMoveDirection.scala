package typings.luminoDatagrid.selectionmodelMod.SelectionModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the cursor move direction.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoDatagrid.luminoDatagridStrings.up
  - typings.luminoDatagrid.luminoDatagridStrings.down
  - typings.luminoDatagrid.luminoDatagridStrings.left
  - typings.luminoDatagrid.luminoDatagridStrings.right
  - typings.luminoDatagrid.luminoDatagridStrings.none
*/
trait CursorMoveDirection extends js.Object

object CursorMoveDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def down: typings.luminoDatagrid.luminoDatagridStrings.down = this.cast("down")
  @scala.inline
  def left: typings.luminoDatagrid.luminoDatagridStrings.left = this.cast("left")
  @scala.inline
  def none: typings.luminoDatagrid.luminoDatagridStrings.none = this.cast("none")
  @scala.inline
  def right: typings.luminoDatagrid.luminoDatagridStrings.right = this.cast("right")
  @scala.inline
  def up: typings.luminoDatagrid.luminoDatagridStrings.up = this.cast("up")
}

