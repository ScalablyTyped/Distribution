package typings.jestCli

import typings.jestCli.jestCliBooleans.`true`
import typings.jestCli.jestCliStrings.`Explicit list of paths coverage will be restricted toDot`
import typings.jestCli.jestCliStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonString extends js.Object {
  val description: `Explicit list of paths coverage will be restricted toDot`
  val string: `true`
  val `type`: array
}

object AnonString {
  @scala.inline
  def apply(
    description: `Explicit list of paths coverage will be restricted toDot`,
    string: `true`,
    `type`: array
  ): AnonString = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonString]
  }
}

