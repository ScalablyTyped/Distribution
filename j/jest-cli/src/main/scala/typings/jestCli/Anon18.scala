package typings.jestCli

import typings.jestCli.jestCliStrings.`Run only tests with a name that matches the regex patternDot`
import typings.jestCli.jestCliStrings.string
import typings.jestCli.jestCliStrings.t
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon18 extends js.Object {
  val alias: t
  val description: `Run only tests with a name that matches the regex patternDot`
  val `type`: string
}

object Anon18 {
  @scala.inline
  def apply(
    alias: t,
    description: `Run only tests with a name that matches the regex patternDot`,
    `type`: string
  ): Anon18 = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon18]
  }
}

