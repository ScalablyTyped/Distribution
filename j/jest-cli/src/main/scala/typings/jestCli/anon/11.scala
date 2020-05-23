package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Allows to use a custom runner instead of JestApostrophes default test runnerDot`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `11` extends js.Object {
  val description: `Allows to use a custom runner instead of JestApostrophes default test runnerDot`
  val `type`: string
}

object `11` {
  @scala.inline
  def apply(
    description: `Allows to use a custom runner instead of JestApostrophes default test runnerDot`,
    `type`: string
  ): `11` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
}

