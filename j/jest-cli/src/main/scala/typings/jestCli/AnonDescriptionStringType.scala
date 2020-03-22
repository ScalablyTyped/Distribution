package typings.jestCli

import typings.jestCli.jestCliNumbers.`5`
import typings.jestCli.jestCliStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionStringType extends js.Object {
  val default: `5`
  val description: String
  val `type`: number
}

object AnonDescriptionStringType {
  @scala.inline
  def apply(default: `5`, description: String, `type`: number): AnonDescriptionStringType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionStringType]
  }
}

