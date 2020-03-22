package typings.jupyterlabServices

import typings.jupyterlabServices.jupyterlabServicesStrings.response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommand extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var command: String
  var message: js.UndefOr[String] = js.undefined
  var request_seq: Double
  var seq: Double
  var success: Boolean
  var `type`: response
}

object AnonCommand {
  @scala.inline
  def apply(
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: response,
    body: js.Any = null,
    message: String = null
  ): AnonCommand = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommand]
  }
}

