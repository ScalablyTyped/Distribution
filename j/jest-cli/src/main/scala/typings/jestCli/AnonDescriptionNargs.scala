package typings.jestCli

import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionNargs extends js.Object {
  var description: String
  var nargs: Double
  var `type`: string
}

object AnonDescriptionNargs {
  @scala.inline
  def apply(description: String, nargs: Double, `type`: string): AnonDescriptionNargs = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], nargs = nargs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptionNargs]
  }
}

