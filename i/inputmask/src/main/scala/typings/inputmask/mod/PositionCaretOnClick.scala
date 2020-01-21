package typings.inputmask.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inputmask.inputmaskStrings.none
  - typings.inputmask.inputmaskStrings.lvp
  - typings.inputmask.inputmaskStrings.radixFocus
  - typings.inputmask.inputmaskStrings.select
  - typings.inputmask.inputmaskStrings.ignore
*/
trait PositionCaretOnClick extends js.Object

object PositionCaretOnClick {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ignore: typings.inputmask.inputmaskStrings.ignore = this.cast("ignore")
  @scala.inline
  def lvp: typings.inputmask.inputmaskStrings.lvp = this.cast("lvp")
  @scala.inline
  def none: typings.inputmask.inputmaskStrings.none = this.cast("none")
  @scala.inline
  def radixFocus: typings.inputmask.inputmaskStrings.radixFocus = this.cast("radixFocus")
  @scala.inline
  def select: typings.inputmask.inputmaskStrings.select = this.cast("select")
}

