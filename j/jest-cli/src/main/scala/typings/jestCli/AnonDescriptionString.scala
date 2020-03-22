package typings.jestCli

import typings.jestCli.jestCliBooleans.`true`
import typings.jestCli.jestCliStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionString extends js.Object {
  val description: String
  val string: `true`
  val `type`: array
}

object AnonDescriptionString {
  @scala.inline
  def apply(description: String, string: `true`, `type`: array): AnonDescriptionString = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionString]
  }
}

