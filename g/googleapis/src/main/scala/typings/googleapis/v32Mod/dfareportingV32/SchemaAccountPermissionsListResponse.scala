package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Account Permission List Response
  */
@js.native
trait SchemaAccountPermissionsListResponse extends js.Object {
  /**
    * Account permission collection.
    */
  var accountPermissions: js.UndefOr[js.Array[SchemaAccountPermission]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountPermissionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAccountPermissionsListResponse {
  @scala.inline
  def apply(accountPermissions: js.Array[SchemaAccountPermission] = null, kind: String = null): SchemaAccountPermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (accountPermissions != null) __obj.updateDynamic("accountPermissions")(accountPermissions.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccountPermissionsListResponse]
  }
}

