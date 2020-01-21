package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account sign JWT response.
  */
@js.native
trait SchemaSignJwtResponse extends js.Object {
  /**
    * The id of the key used to sign the JWT.
    */
  var keyId: js.UndefOr[String] = js.native
  /**
    * The signed JWT.
    */
  var signedJwt: js.UndefOr[String] = js.native
}

object SchemaSignJwtResponse {
  @scala.inline
  def apply(keyId: String = null, signedJwt: String = null): SchemaSignJwtResponse = {
    val __obj = js.Dynamic.literal()
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (signedJwt != null) __obj.updateDynamic("signedJwt")(signedJwt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSignJwtResponse]
  }
}

