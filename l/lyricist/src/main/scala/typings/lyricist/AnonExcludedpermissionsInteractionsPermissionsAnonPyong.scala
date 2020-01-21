package typings.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludedpermissionsInteractionsPermissionsAnonPyong extends js.Object {
  var excluded_permissions: js.Array[String]
  var interactions: AnonPyong
  var permissions: js.Array[String]
}

object AnonExcludedpermissionsInteractionsPermissionsAnonPyong {
  @scala.inline
  def apply(excluded_permissions: js.Array[String], interactions: AnonPyong, permissions: js.Array[String]): AnonExcludedpermissionsInteractionsPermissionsAnonPyong = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExcludedpermissionsInteractionsPermissionsAnonPyong]
  }
}

