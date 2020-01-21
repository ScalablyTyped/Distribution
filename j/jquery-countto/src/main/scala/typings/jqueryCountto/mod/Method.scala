package typings.jqueryCountto.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jqueryCountto.jqueryCounttoStrings.start
  - typings.jqueryCountto.jqueryCounttoStrings.stop
  - typings.jqueryCountto.jqueryCounttoStrings.toggle
  - typings.jqueryCountto.jqueryCounttoStrings.restart
*/
trait Method extends js.Object

object Method {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def restart: typings.jqueryCountto.jqueryCounttoStrings.restart = this.cast("restart")
  @scala.inline
  def start: typings.jqueryCountto.jqueryCounttoStrings.start = this.cast("start")
  @scala.inline
  def stop: typings.jqueryCountto.jqueryCounttoStrings.stop = this.cast("stop")
  @scala.inline
  def toggle: typings.jqueryCountto.jqueryCounttoStrings.toggle = this.cast("toggle")
}

