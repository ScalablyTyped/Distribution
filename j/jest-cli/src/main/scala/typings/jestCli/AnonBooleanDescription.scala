package typings.jestCli

import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBooleanDescription extends js.Object {
  var description: String
  var `type`: boolean
}

object AnonBooleanDescription {
  @scala.inline
  def apply(description: String, `type`: boolean): AnonBooleanDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBooleanDescription]
  }
}

