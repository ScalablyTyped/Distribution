package typings.jestCli

import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultDescription extends js.Object {
  val default: Boolean
  val description: String
  val `type`: boolean
}

object AnonDefaultDescription {
  @scala.inline
  def apply(default: Boolean, description: String, `type`: boolean): AnonDefaultDescription = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultDescription]
  }
}

