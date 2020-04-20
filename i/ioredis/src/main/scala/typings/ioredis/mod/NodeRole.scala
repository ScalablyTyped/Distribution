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
  def all: typings.ioredis.ioredisStrings.all = "all".asInstanceOf[typings.ioredis.ioredisStrings.all]
  @scala.inline
  def master: typings.ioredis.ioredisStrings.master = "master".asInstanceOf[typings.ioredis.ioredisStrings.master]
  @scala.inline
  def slave: typings.ioredis.ioredisStrings.slave = "slave".asInstanceOf[typings.ioredis.ioredisStrings.slave]
}

