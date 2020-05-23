package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`A JSON string which allows the use of a custom resolverDot`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `10` extends js.Object {
  val description: `A JSON string which allows the use of a custom resolverDot`
  val `type`: string
}

object `10` {
  @scala.inline
  def apply(description: `A JSON string which allows the use of a custom resolverDot`, `type`: string): `10` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
}

