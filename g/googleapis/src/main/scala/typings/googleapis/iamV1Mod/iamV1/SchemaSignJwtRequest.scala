package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account sign JWT request.
  */
@js.native
trait SchemaSignJwtRequest extends js.Object {
  /**
    * The JWT payload to sign, a JSON JWT Claim set.
    */
  var payload: js.UndefOr[String] = js.native
}

object SchemaSignJwtRequest {
  @scala.inline
  def apply(payload: String = null): SchemaSignJwtRequest = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSignJwtRequest]
  }
}

