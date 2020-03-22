package typings.jupyterlabServices.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabServices.jupyterlabServicesStrings.input_request
  - typings.jupyterlabServices.jupyterlabServicesStrings.input_reply
*/
trait StdinMessageType extends js.Object

object StdinMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def input_reply: typings.jupyterlabServices.jupyterlabServicesStrings.input_reply = this.cast("input_reply")
  @scala.inline
  def input_request: typings.jupyterlabServices.jupyterlabServicesStrings.input_request = this.cast("input_request")
}

