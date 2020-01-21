package typings.jestCli

import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBooleanDefault extends js.Object {
  var default: Boolean
  var description: String
  var `type`: boolean
}

object AnonBooleanDefault {
  @scala.inline
  def apply(default: Boolean, description: String, `type`: boolean): AnonBooleanDefault = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBooleanDefault]
  }
}

