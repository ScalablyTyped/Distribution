package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account keys list response.
  */
@js.native
trait SchemaListServiceAccountKeysResponse extends js.Object {
  /**
    * The public keys for the service account.
    */
  var keys: js.UndefOr[js.Array[SchemaServiceAccountKey]] = js.native
}

object SchemaListServiceAccountKeysResponse {
  @scala.inline
  def apply(keys: js.Array[SchemaServiceAccountKey] = null): SchemaListServiceAccountKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListServiceAccountKeysResponse]
  }
}

