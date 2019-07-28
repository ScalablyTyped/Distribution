package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Excludedpermissions extends js.Object {
  var excluded_permissions: js.Array[String]
  var interactions: Anon_Following
  var iq_by_action: js.Any
  var permissions: js.Array[String]
  var relationships: js.Any
}

object Anon_Excludedpermissions {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    interactions: Anon_Following,
    iq_by_action: js.Any,
    permissions: js.Array[String],
    relationships: js.Any
  ): Anon_Excludedpermissions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions, interactions = interactions, iq_by_action = iq_by_action, permissions = permissions, relationships = relationships)
  
    __obj.asInstanceOf[Anon_Excludedpermissions]
  }
}

