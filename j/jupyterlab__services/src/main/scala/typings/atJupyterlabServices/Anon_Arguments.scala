package typings.atJupyterlabServices

import typings.atJupyterlabServices.atJupyterlabServicesStrings.request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arguments extends js.Object {
  var arguments: js.UndefOr[js.Any] = js.undefined
  var command: String
  var seq: Double
  var `type`: request
}

object Anon_Arguments {
  @scala.inline
  def apply(command: String, seq: Double, `type`: request, arguments: js.Any = null): Anon_Arguments = {
    val __obj = js.Dynamic.literal(command = command, seq = seq)
    __obj.updateDynamic("type")(`type`)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    __obj.asInstanceOf[Anon_Arguments]
  }
}

