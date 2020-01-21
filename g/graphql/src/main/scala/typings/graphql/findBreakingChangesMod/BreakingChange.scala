package typings.graphql.findBreakingChangesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakingChange extends js.Object {
  var description: String
  var `type`: String
}

object BreakingChange {
  @scala.inline
  def apply(description: String, `type`: String): BreakingChange = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakingChange]
  }
}

