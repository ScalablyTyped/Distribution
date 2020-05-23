package typings.jestCli.anon

import typings.jestCli.jestCliBooleans.`true`
import typings.jestCli.jestCliStrings.`The glob patterns Jest uses to detect test filesDot`
import typings.jestCli.jestCliStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `17` extends js.Object {
  val description: `The glob patterns Jest uses to detect test filesDot`
  val string: `true`
  val `type`: array
}

object `17` {
  @scala.inline
  def apply(description: `The glob patterns Jest uses to detect test filesDot`, string: `true`, `type`: array): `17` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`17`]
  }
}

