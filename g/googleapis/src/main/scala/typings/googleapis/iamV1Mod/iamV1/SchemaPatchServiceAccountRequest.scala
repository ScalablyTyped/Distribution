package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The patch service account request.
  */
@js.native
trait SchemaPatchServiceAccountRequest extends js.Object {
  var serviceAccount: js.UndefOr[SchemaServiceAccount] = js.native
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaPatchServiceAccountRequest {
  @scala.inline
  def apply(serviceAccount: SchemaServiceAccount = null, updateMask: String = null): SchemaPatchServiceAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPatchServiceAccountRequest]
  }
}

