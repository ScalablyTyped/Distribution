package typings.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jestTypes.jestTypesStrings.skip
  - typings.jestTypes.jestTypesStrings.done
  - typings.jestTypes.jestTypesStrings.todo
*/
trait TestStatus extends js.Object

object TestStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def done: typings.jestTypes.jestTypesStrings.done = this.cast("done")
  @scala.inline
  def skip: typings.jestTypes.jestTypesStrings.skip = this.cast("skip")
  @scala.inline
  def todo: typings.jestTypes.jestTypesStrings.todo = this.cast("todo")
}

