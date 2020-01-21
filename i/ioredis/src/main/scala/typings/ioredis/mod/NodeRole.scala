package typings.ioredis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ioredis.ioredisStrings.master
  - typings.ioredis.ioredisStrings.slave
  - typings.ioredis.ioredisStrings.all
*/
trait NodeRole extends js.Object

object NodeRole {
  @scala.inline
  def all: typings.ioredis.ioredisStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def master: typings.ioredis.ioredisStrings.master = this.cast("master")
  @scala.inline
  def slave: typings.ioredis.ioredisStrings.slave = this.cast("slave")
}

