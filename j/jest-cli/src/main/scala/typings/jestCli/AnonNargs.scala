package typings.jestCli

import typings.jestCli.jestCliNumbers.`1`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNargs extends js.Object {
  val description: String
  val nargs: `1`
  val `type`: string
}

object AnonNargs {
  @scala.inline
  def apply(description: String, nargs: `1`, `type`: string): AnonNargs = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], nargs = nargs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNargs]
  }
}

