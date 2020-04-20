package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludedpermissions extends js.Object {
  var excluded_permissions: js.Array[String]
  var interactions: AnonFollowing
  var iq_by_action: js.Any
  var permissions: js.Array[String]
  var relationships: js.Any
}

object AnonExcludedpermissions {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    interactions: AnonFollowing,
    iq_by_action: js.Any,
    permissions: js.Array[String],
    relationships: js.Any
  ): AnonExcludedpermissions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], iq_by_action = iq_by_action.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExcludedpermissions]
  }
}

