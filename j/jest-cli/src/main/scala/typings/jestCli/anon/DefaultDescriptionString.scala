package typings.jestCli.anon

import typings.jestCli.jestCliBooleans.`false`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultDescriptionString extends js.Object {
  val default: `false`
  val description: java.lang.String
  val `type`: boolean
}

object DefaultDescriptionString {
  @scala.inline
  def apply(default: `false`, description: java.lang.String, `type`: boolean): DefaultDescriptionString = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDescriptionString]
  }
}

