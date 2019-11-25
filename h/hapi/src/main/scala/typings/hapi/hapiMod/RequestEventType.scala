package typings.hapi.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapi.hapiStrings.peek
  - typings.hapi.hapiStrings.finish
  - typings.hapi.hapiStrings.disconnect
*/
trait RequestEventType extends js.Object

object RequestEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disconnect: typings.hapi.hapiStrings.disconnect = this.cast("disconnect")
  @scala.inline
  def finish: typings.hapi.hapiStrings.finish = this.cast("finish")
  @scala.inline
  def peek: typings.hapi.hapiStrings.peek = this.cast("peek")
}

