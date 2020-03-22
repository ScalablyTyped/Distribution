package typings.luminoDragdrop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.luminoDragdrop.luminoDragdropStrings.none
  - typings.luminoDragdrop.luminoDragdropStrings.copy
  - typings.luminoDragdrop.luminoDragdropStrings.link
  - typings.luminoDragdrop.luminoDragdropStrings.move
*/
trait DropAction extends js.Object

object DropAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def copy: typings.luminoDragdrop.luminoDragdropStrings.copy = this.cast("copy")
  @scala.inline
  def link: typings.luminoDragdrop.luminoDragdropStrings.link = this.cast("link")
  @scala.inline
  def move: typings.luminoDragdrop.luminoDragdropStrings.move = this.cast("move")
  @scala.inline
  def none: typings.luminoDragdrop.luminoDragdropStrings.none = this.cast("none")
}

