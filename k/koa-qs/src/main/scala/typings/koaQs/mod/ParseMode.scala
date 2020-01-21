package typings.koaQs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.koaQs.koaQsStrings.extended
  - typings.koaQs.koaQsStrings.strict
  - typings.koaQs.koaQsStrings.first
*/
trait ParseMode extends js.Object

object ParseMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def extended: typings.koaQs.koaQsStrings.extended = this.cast("extended")
  @scala.inline
  def first: typings.koaQs.koaQsStrings.first = this.cast("first")
  @scala.inline
  def strict: typings.koaQs.koaQsStrings.strict = this.cast("strict")
}

