package typings.jupyterlabServices.messagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Control message types.
  *
  * #### Notes
  * Debug messages are experimental messages that are not in the official
  * kernel message specification. As such, debug message types are *NOT*
  * considered part of the public API, and may change without notice.
  */
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

