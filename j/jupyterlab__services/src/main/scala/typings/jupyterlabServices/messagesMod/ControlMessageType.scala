package typings.jupyterlabServices.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabServices.jupyterlabServicesStrings.debug_request
  - typings.jupyterlabServices.jupyterlabServicesStrings.debug_reply
*/
trait ControlMessageType extends js.Object

object ControlMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug_reply: typings.jupyterlabServices.jupyterlabServicesStrings.debug_reply = this.cast("debug_reply")
  @scala.inline
  def debug_request: typings.jupyterlabServices.jupyterlabServicesStrings.debug_request = this.cast("debug_request")
}

