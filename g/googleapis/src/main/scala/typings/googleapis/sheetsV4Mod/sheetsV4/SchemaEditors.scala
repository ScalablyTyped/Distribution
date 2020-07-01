package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The editors of a protected range.
  */
@js.native
trait SchemaEditors extends js.Object {
  /**
    * True if anyone in the document&#39;s domain has edit access to the
    * protected range.  Domain protection is only supported on documents within
    * a domain.
    */
  var domainUsersCanEdit: js.UndefOr[Boolean] = js.native
  /**
    * The email addresses of groups with edit access to the protected range.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /**
    * The email addresses of users with edit access to the protected range.
    */
  var users: js.UndefOr[js.Array[String]] = js.native
}

object SchemaEditors {
  @scala.inline
  def apply(
    domainUsersCanEdit: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[String] = null,
    users: js.Array[String] = null
  ): SchemaEditors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(domainUsersCanEdit)) __obj.updateDynamic("domainUsersCanEdit")(domainUsersCanEdit.get.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEditors]
  }
}

