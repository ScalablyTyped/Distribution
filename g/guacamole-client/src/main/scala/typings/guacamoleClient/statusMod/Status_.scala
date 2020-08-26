package typings.guacamoleClient.statusMod

import typings.guacamoleClient.statusMod.Status.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client/lib/Status", "Status")
@js.native
class Status_ protected () extends js.Object {
  /**
    * @param code The Guacamole status code, as defined by Guacamole.Status.Code.
    * @param [message] An optional human-readable message.
    */
  def this(code: Code) = this()
  def this(code: Code, message: String) = this()
  /**
    * The Guacamole status code.
    * @see Guacamole.Status.Code
    */
  var code: Code = js.native
  /**
    * An arbitrary human-readable message associated with this status, if any.
    * The human-readable message is not required, and is generally provided
    * for debugging purposes only. For user feedback, it is better to translate
    * the Guacamole status code into a message.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Returns whether this status represents an error.
    * @returns true if this status represents an error, false otherwise.
    */
  def isError(): Boolean = js.native
}

