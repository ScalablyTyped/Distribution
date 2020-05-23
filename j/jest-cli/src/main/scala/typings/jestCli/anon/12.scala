package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Print your jest config and then exitsDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `12` extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Print your jest config and then exitsDot`
  val `type`: boolean
}

object `12` {
  @scala.inline
  def apply(description: `Print your jest config and then exitsDot`, `type`: boolean): `12` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
}

