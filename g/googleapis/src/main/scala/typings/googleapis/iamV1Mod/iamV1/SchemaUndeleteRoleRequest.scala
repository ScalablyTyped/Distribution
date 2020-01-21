package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to undelete an existing role.
  */
@js.native
trait SchemaUndeleteRoleRequest extends js.Object {
  /**
    * Used to perform a consistent read-modify-write.
    */
  var etag: js.UndefOr[String] = js.native
}

object SchemaUndeleteRoleRequest {
  @scala.inline
  def apply(etag: String = null): SchemaUndeleteRoleRequest = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUndeleteRoleRequest]
  }
}

