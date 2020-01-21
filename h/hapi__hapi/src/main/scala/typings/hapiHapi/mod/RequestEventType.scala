package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapiHapi.hapiHapiStrings.peek
  - typings.hapiHapi.hapiHapiStrings.finish
  - typings.hapiHapi.hapiHapiStrings.disconnect
*/
trait RequestEventType extends js.Object

object RequestEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disconnect: typings.hapiHapi.hapiHapiStrings.disconnect = this.cast("disconnect")
  @scala.inline
  def finish: typings.hapiHapi.hapiHapiStrings.finish = this.cast("finish")
  @scala.inline
  def peek: typings.hapiHapi.hapiHapiStrings.peek = this.cast("peek")
}

