package typings.jestDashCli

import typings.jestDashCli.jestDashCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BooleanDefault extends js.Object {
  var default: Boolean
  var description: String
  var `type`: boolean
}

object Anon_BooleanDefault {
  @scala.inline
  def apply(default: Boolean, description: String, `type`: boolean): Anon_BooleanDefault = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BooleanDefault]
  }
}

