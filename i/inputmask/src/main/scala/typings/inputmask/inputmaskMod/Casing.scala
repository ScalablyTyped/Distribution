package typings.inputmask.inputmaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inputmask.inputmaskStrings.upper
  - typings.inputmask.inputmaskStrings.lower
  - typings.inputmask.inputmaskStrings.title
*/
trait Casing extends js.Object

object Casing {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lower: typings.inputmask.inputmaskStrings.lower = this.cast("lower")
  @scala.inline
  def title: typings.inputmask.inputmaskStrings.title = this.cast("title")
  @scala.inline
  def upper: typings.inputmask.inputmaskStrings.upper = this.cast("upper")
}

