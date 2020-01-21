package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account sign blob response.
  */
@js.native
trait SchemaSignBlobResponse extends js.Object {
  /**
    * The id of the key used to sign the blob.
    */
  var keyId: js.UndefOr[String] = js.native
  /**
    * The signed blob.
    */
  var signature: js.UndefOr[String] = js.native
}

object SchemaSignBlobResponse {
  @scala.inline
  def apply(keyId: String = null, signature: String = null): SchemaSignBlobResponse = {
    val __obj = js.Dynamic.literal()
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSignBlobResponse]
  }
}

