package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interactions extends js.Object {
  var excluded_permissions: js.Array[String]
  var interactions: Cosign
  var iq_by_action: js.Any
  var permissions: js.Array[String]
}

object Interactions {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    interactions: Cosign,
    iq_by_action: js.Any,
    permissions: js.Array[String]
  ): Interactions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], iq_by_action = iq_by_action.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interactions]
  }
}

