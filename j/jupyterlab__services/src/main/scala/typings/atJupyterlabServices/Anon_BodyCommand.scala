package typings.atJupyterlabServices

import typings.atJupyterlabServices.atJupyterlabServicesStrings.response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommand extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var command: String
  var message: js.UndefOr[String] = js.undefined
  var request_seq: Double
  var seq: Double
  var success: Boolean
  var `type`: response
}

object Anon_BodyCommand {
  @scala.inline
  def apply(
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: response,
    body: js.Any = null,
    message: String = null
  ): Anon_BodyCommand = {
    val __obj = js.Dynamic.literal(command = command, request_seq = request_seq, seq = seq, success = success)
    __obj.updateDynamic("type")(`type`)
    if (body != null) __obj.updateDynamic("body")(body)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_BodyCommand]
  }
}

