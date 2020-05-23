package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`A preset that is used as a base for JestApostrophes configurationDot`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `8` extends js.Object {
  val description: `A preset that is used as a base for JestApostrophes configurationDot`
  val `type`: string
}

object `8` {
  @scala.inline
  def apply(
    description: `A preset that is used as a base for JestApostrophes configurationDot`,
    `type`: string
  ): `8` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
}

