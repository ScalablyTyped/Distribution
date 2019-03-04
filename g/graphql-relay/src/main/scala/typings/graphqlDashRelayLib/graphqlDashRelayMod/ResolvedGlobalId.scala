package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedGlobalId extends js.Object {
  var id: java.lang.String
  var `type`: java.lang.String
}

object ResolvedGlobalId {
  @scala.inline
  def apply(id: java.lang.String, `type`: java.lang.String): ResolvedGlobalId = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResolvedGlobalId]
  }
}

