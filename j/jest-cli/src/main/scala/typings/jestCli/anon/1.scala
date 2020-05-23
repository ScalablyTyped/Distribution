package typings.jestCli.anon

import typings.jestCli.jestCliBooleans.`false`
import typings.jestCli.jestCliStrings.`Make calling deprecated APIs throw helpful error messagesDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  val default: `false`
  val description: `Make calling deprecated APIs throw helpful error messagesDot`
  val `type`: boolean
}

object `1` {
  @scala.inline
  def apply(
    default: `false`,
    description: `Make calling deprecated APIs throw helpful error messagesDot`,
    `type`: boolean
  ): `1` = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

