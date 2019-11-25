package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jest.jestStrings.all
  - typings.jest.jestStrings.`new`
  - typings.jest.jestStrings.none
*/
trait SnapshotUpdateState extends js.Object

object SnapshotUpdateState {
  @scala.inline
  def all: typings.jest.jestStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `new`: typings.jest.jestStrings.`new` = this.cast("new")
  @scala.inline
  def none: typings.jest.jestStrings.none = this.cast("none")
}

