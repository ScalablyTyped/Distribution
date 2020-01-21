package typings.jupyterlabServices

import typings.jupyterlabServices.jupyterlabServicesStrings.request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArguments extends js.Object {
  var arguments: js.UndefOr[js.Any] = js.undefined
  var command: String
  var seq: Double
  var `type`: request
}

object AnonArguments {
  @scala.inline
  def apply(command: String, seq: Double, `type`: request, arguments: js.Any = null): AnonArguments = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArguments]
  }
}

