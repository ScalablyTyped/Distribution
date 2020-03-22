package typings.jestCli

import typings.jestCli.jestCliBooleans.`false`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultDescriptionString extends js.Object {
  val default: `false`
  val description: String
  val `type`: boolean
}

object AnonDefaultDescriptionString {
  @scala.inline
  def apply(default: `false`, description: String, `type`: boolean): AnonDefaultDescriptionString = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultDescriptionString]
  }
}

