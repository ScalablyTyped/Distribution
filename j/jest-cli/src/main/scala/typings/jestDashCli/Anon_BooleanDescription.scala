package typings.jestDashCli

import typings.jestDashCli.jestDashCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BooleanDescription extends js.Object {
  var description: String
  var `type`: boolean
}

object Anon_BooleanDescription {
  @scala.inline
  def apply(description: String, `type`: boolean): Anon_BooleanDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BooleanDescription]
  }
}

