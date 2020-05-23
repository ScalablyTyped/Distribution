package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`A JSON string with map of variables for the haste module system`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `4` extends js.Object {
  val description: `A JSON string with map of variables for the haste module system`
  val `type`: string
}

object `4` {
  @scala.inline
  def apply(description: `A JSON string with map of variables for the haste module system`, `type`: string): `4` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
}

