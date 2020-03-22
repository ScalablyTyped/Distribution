package typings.luminoDatagrid.notificationMod.Notification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a notification placement.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoDatagrid.luminoDatagridStrings.top
  - typings.luminoDatagrid.luminoDatagridStrings.bottom
  - typings.luminoDatagrid.luminoDatagridStrings.left
  - typings.luminoDatagrid.luminoDatagridStrings.right
*/
trait Placement extends js.Object

object Placement {
  @scala.inline
  def bottom: typings.luminoDatagrid.luminoDatagridStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.luminoDatagrid.luminoDatagridStrings.left = this.cast("left")
  @scala.inline
  def right: typings.luminoDatagrid.luminoDatagridStrings.right = this.cast("right")
  @scala.inline
  def top: typings.luminoDatagrid.luminoDatagridStrings.top = this.cast("top")
}

