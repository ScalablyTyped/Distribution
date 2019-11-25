package typings.grommet.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.start
  - typings.grommet.grommetStrings.center
  - typings.grommet.grommetStrings.end
*/
trait TextAlignType extends js.Object

object TextAlignType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.grommet.grommetStrings.center = this.cast("center")
  @scala.inline
  def end: typings.grommet.grommetStrings.end = this.cast("end")
  @scala.inline
  def start: typings.grommet.grommetStrings.start = this.cast("start")
}

