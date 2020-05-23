package typings.jestCli.anon

import typings.jestCli.jestCliBooleans.`true`
import typings.jestCli.jestCliStrings.`A string or array of string regexp patterns that Jest uses to detect test filesDot`
import typings.jestCli.jestCliStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `19` extends js.Object {
  val description: `A string or array of string regexp patterns that Jest uses to detect test filesDot`
  val string: `true`
  val `type`: array
}

object `19` {
  @scala.inline
  def apply(
    description: `A string or array of string regexp patterns that Jest uses to detect test filesDot`,
    string: `true`,
    `type`: array
  ): `19` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
}

