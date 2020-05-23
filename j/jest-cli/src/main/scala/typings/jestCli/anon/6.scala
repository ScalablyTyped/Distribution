package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Specifies when notifications will appear for test resultsDot`
import typings.jestCli.jestCliStrings.`failure-change`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `6` extends js.Object {
  val default: `failure-change`
  val description: `Specifies when notifications will appear for test resultsDot`
  val `type`: string
}

object `6` {
  @scala.inline
  def apply(
    default: `failure-change`,
    description: `Specifies when notifications will appear for test resultsDot`,
    `type`: string
  ): `6` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
}

