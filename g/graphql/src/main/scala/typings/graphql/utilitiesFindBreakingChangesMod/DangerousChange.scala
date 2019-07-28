package typings.graphql.utilitiesFindBreakingChangesMod

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
    val __obj = js.Dynamic.literal(description = description)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DangerousChange]
  }
}

