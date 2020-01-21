package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Account Permission Group List Response
  */
@js.native
trait SchemaAccountPermissionGroupsListResponse extends js.Object {
  /**
    * Account permission group collection.
    */
  var accountPermissionGroups: js.UndefOr[js.Array[SchemaAccountPermissionGroup]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermissionGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAccountPermissionGroupsListResponse {
  @scala.inline
  def apply(accountPermissionGroups: js.Array[SchemaAccountPermissionGroup] = null, kind: String = null): SchemaAccountPermissionGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (accountPermissionGroups != null) __obj.updateDynamic("accountPermissionGroups")(accountPermissionGroups.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountPermissionGroupsListResponse]
  }
}

