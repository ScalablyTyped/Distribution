package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludedpermissionsInteractions extends js.Object {
  var excluded_permissions: js.Array[String]
  var interactions: AnonCosign
  var iq_by_action: js.Any
  var permissions: js.Array[String]
}

object AnonExcludedpermissionsInteractions {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    interactions: AnonCosign,
    iq_by_action: js.Any,
    permissions: js.Array[String]
  ): AnonExcludedpermissionsInteractions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], iq_by_action = iq_by_action.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExcludedpermissionsInteractions]
  }
}

