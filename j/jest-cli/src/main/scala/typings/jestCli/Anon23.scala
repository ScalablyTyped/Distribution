package typings.jestCli

import typings.jestCli.jestCliStrings.`Display individual test results with the test suite hierarchyDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon23 extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Display individual test results with the test suite hierarchyDot`
  val `type`: boolean
}

object Anon23 {
  @scala.inline
  def apply(
    description: `Display individual test results with the test suite hierarchyDot`,
    `type`: boolean,
    default: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon23 = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon23]
  }
}

