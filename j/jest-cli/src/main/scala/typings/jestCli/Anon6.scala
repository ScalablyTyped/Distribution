package typings.jestCli

import typings.jestCli.jestCliStrings.`Specifies when notifications will appear for test resultsDot`
import typings.jestCli.jestCliStrings.`failure-change`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon6 extends js.Object {
  val default: `failure-change`
  val description: `Specifies when notifications will appear for test resultsDot`
  val `type`: string
}

object Anon6 {
  @scala.inline
  def apply(
    default: `failure-change`,
    description: `Specifies when notifications will appear for test resultsDot`,
    `type`: string
  ): Anon6 = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon6]
  }
}

