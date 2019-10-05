package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

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
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_request
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_reply
*/
trait ControlMessageType extends MessageType

