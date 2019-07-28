package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludedpermissionsInteractions extends js.Object {
  var excluded_permissions: js.Array[String]
  var interactions: Anon_Cosign
  var iq_by_action: js.Any
  var permissions: js.Array[String]
}

object Anon_ExcludedpermissionsInteractions {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    interactions: Anon_Cosign,
    iq_by_action: js.Any,
    permissions: js.Array[String]
  ): Anon_ExcludedpermissionsInteractions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions, interactions = interactions, iq_by_action = iq_by_action, permissions = permissions)
  
    __obj.asInstanceOf[Anon_ExcludedpermissionsInteractions]
  }
}

