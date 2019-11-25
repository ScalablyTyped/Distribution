package typings.klaw.klawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.klaw.klawStrings.shift
  - typings.klaw.klawStrings.pop
*/
trait QueueMethod extends js.Object

object QueueMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pop: typings.klaw.klawStrings.pop = this.cast("pop")
  @scala.inline
  def shift: typings.klaw.klawStrings.shift = this.cast("shift")
}

