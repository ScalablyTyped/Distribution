package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Generate a basic configuration file`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `5` extends js.Object {
  val description: `Generate a basic configuration file`
  val `type`: boolean
}

object `5` {
  @scala.inline
  def apply(description: `Generate a basic configuration file`, `type`: boolean): `5` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
}

