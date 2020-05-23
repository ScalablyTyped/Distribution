package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Display individual test results with the test suite hierarchyDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `23` extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Display individual test results with the test suite hierarchyDot`
  val `type`: boolean
}

object `23` {
  @scala.inline
  def apply(description: `Display individual test results with the test suite hierarchyDot`, `type`: boolean): `23` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
}

