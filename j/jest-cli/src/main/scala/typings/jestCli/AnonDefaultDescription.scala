package typings.jestCli

import typings.jestCli.jestCliStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultDescription extends js.Object {
  var default: Double
  var description: String
  var `type`: number
}

object AnonDefaultDescription {
  @scala.inline
  def apply(default: Double, description: String, `type`: number): AnonDefaultDescription = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultDescription]
  }
}

