package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUndeleteServiceAccountResponse extends js.Object {
  /**
    * Metadata for the restored service account.
    */
  var restoredAccount: js.UndefOr[SchemaServiceAccount] = js.native
}

object SchemaUndeleteServiceAccountResponse {
  @scala.inline
  def apply(restoredAccount: SchemaServiceAccount = null): SchemaUndeleteServiceAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (restoredAccount != null) __obj.updateDynamic("restoredAccount")(restoredAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUndeleteServiceAccountResponse]
  }
}

