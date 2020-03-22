package typings.jestCli

import typings.jestCli.jestCliStrings.`Allows to use a custom runner instead of JestApostrophes default test runnerDot`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon11 extends js.Object {
  val description: `Allows to use a custom runner instead of JestApostrophes default test runnerDot`
  val `type`: string
}

object Anon11 {
  @scala.inline
  def apply(
    description: `Allows to use a custom runner instead of JestApostrophes default test runnerDot`,
    `type`: string
  ): Anon11 = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon11]
  }
}

