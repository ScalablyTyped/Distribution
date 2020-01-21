package typings.jestCli

import typings.jestCli.jestCliStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionNumber extends js.Object {
  var description: String
  var `type`: number
}

object AnonDescriptionNumber {
  @scala.inline
  def apply(description: String, `type`: number): AnonDescriptionNumber = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionNumber]
  }
}

