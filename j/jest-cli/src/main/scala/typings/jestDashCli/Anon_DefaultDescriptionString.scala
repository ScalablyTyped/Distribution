package typings.jestDashCli

import typings.jestDashCli.jestDashCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultDescriptionString extends js.Object {
  var default: String
  var description: String
  var `type`: string
}

object Anon_DefaultDescriptionString {
  @scala.inline
  def apply(default: String, description: String, `type`: string): Anon_DefaultDescriptionString = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultDescriptionString]
  }
}

