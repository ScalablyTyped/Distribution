package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IOPub message types.
  *
  * #### Notes
  * Debug messages are experimental messages that are not in the official
  * kernel message specification. As such, debug message types are *NOT*
  * considered part of the public API, and may change without notice.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.clear_output
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_close
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_msg
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_open
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.display_data
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.error
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_input
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_result
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.status
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.stream
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.update_display_data
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_event
*/
trait IOPubMessageType extends MessageType

