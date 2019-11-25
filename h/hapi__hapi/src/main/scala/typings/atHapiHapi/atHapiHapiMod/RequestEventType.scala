package typings.atHapiHapi.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atHapiHapi.atHapiHapiStrings.peek
  - typings.atHapiHapi.atHapiHapiStrings.finish
  - typings.atHapiHapi.atHapiHapiStrings.disconnect
*/
trait RequestEventType extends js.Object

object RequestEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disconnect: typings.atHapiHapi.atHapiHapiStrings.disconnect = this.cast("disconnect")
  @scala.inline
  def finish: typings.atHapiHapi.atHapiHapiStrings.finish = this.cast("finish")
  @scala.inline
  def peek: typings.atHapiHapi.atHapiHapiStrings.peek = this.cast("peek")
}

