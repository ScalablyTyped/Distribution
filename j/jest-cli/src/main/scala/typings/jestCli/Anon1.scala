package typings.jestCli

import typings.jestCli.jestCliBooleans.`false`
import typings.jestCli.jestCliStrings.`Make calling deprecated APIs throw helpful error messagesDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  val default: `false`
  val description: `Make calling deprecated APIs throw helpful error messagesDot`
  val `type`: boolean
}

object Anon1 {
  @scala.inline
  def apply(
    default: `false`,
    description: `Make calling deprecated APIs throw helpful error messagesDot`,
    `type`: boolean
  ): Anon1 = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

