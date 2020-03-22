package typings.grommet.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Extracting types for common properties among components
/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.top
  - typings.grommet.grommetStrings.left
  - typings.grommet.grommetStrings.bottom
  - typings.grommet.grommetStrings.right
  - typings.grommet.grommetStrings.start
  - typings.grommet.grommetStrings.end
  - typings.grommet.grommetStrings.horizontal
  - typings.grommet.grommetStrings.vertical
  - typings.grommet.grommetStrings.all
  - typings.grommet.grommetStrings.between
*/
trait BoxSideType extends _BorderType

object BoxSideType {
  @scala.inline
  def all: typings.grommet.grommetStrings.all = this.cast("all")
  @scala.inline
  def between: typings.grommet.grommetStrings.between = this.cast("between")
  @scala.inline
  def bottom: typings.grommet.grommetStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typings.grommet.grommetStrings.end = this.cast("end")
  @scala.inline
  def horizontal: typings.grommet.grommetStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def left: typings.grommet.grommetStrings.left = this.cast("left")
  @scala.inline
  def right: typings.grommet.grommetStrings.right = this.cast("right")
  @scala.inline
  def start: typings.grommet.grommetStrings.start = this.cast("start")
  @scala.inline
  def top: typings.grommet.grommetStrings.top = this.cast("top")
  @scala.inline
  def vertical: typings.grommet.grommetStrings.vertical = this.cast("vertical")
}

