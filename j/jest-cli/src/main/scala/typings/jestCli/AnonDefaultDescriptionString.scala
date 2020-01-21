package typings.jestCli

import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultDescriptionString extends js.Object {
  var default: String
  var description: String
  var `type`: string
}

object AnonDefaultDescriptionString {
  @scala.inline
  def apply(default: String, description: String, `type`: string): AnonDefaultDescriptionString = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultDescriptionString]
  }
}

