package typings.graphql.findBreakingChangesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DangerousChange extends js.Object {
  var description: String
  var `type`: String
}

object DangerousChange {
  @scala.inline
  def apply(description: String, `type`: String): DangerousChange = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DangerousChange]
  }
}

