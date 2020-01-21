package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GetJSONWebKeysResponse is a valid JSON Web Key Set as specififed in rfc
  * 7517
  */
@js.native
trait SchemaGetJSONWebKeysResponse extends js.Object {
  /**
    * The public component of the keys used by the cluster to sign token
    * requests.
    */
  var keys: js.UndefOr[js.Array[SchemaJwk]] = js.native
}

object SchemaGetJSONWebKeysResponse {
  @scala.inline
  def apply(keys: js.Array[SchemaJwk] = null): SchemaGetJSONWebKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetJSONWebKeysResponse]
  }
}

