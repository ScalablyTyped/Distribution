package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedpermissionsInteractions extends js.Object {
  var excluded_permissions: js.Array[String]
  var interactions: Pyong
  var permissions: js.Array[String]
}

object ExcludedpermissionsInteractions {
  @scala.inline
  def apply(excluded_permissions: js.Array[String], interactions: Pyong, permissions: js.Array[String]): ExcludedpermissionsInteractions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludedpermissionsInteractions]
  }
}

