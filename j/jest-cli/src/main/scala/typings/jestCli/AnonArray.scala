package typings.jestCli

import typings.jestCli.jestCliBooleans.`true`
import typings.jestCli.jestCliStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArray extends js.Object {
  var description: String
  var string: `true`
  var `type`: array
}

object AnonArray {
  @scala.inline
  def apply(description: String, string: `true`, `type`: array): AnonArray = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArray]
  }
}

