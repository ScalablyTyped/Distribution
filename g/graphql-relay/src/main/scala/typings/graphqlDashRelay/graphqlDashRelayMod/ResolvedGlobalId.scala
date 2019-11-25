package typings.graphqlDashRelay.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedGlobalId extends js.Object {
  var id: String
  var `type`: String
}

object ResolvedGlobalId {
  @scala.inline
  def apply(id: String, `type`: String): ResolvedGlobalId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedGlobalId]
  }
}

