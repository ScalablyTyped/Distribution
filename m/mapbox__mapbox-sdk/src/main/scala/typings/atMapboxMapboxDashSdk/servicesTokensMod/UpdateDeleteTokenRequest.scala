package typings.atMapboxMapboxDashSdk.servicesTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDeleteTokenRequest extends CreateTokenRequest {
  var tokenId: String
}

object UpdateDeleteTokenRequest {
  @scala.inline
  def apply(
    tokenId: String,
    note: String = null,
    resources: js.Array[String] = null,
    scopes: js.Array[String] = null
  ): UpdateDeleteTokenRequest = {
    val __obj = js.Dynamic.literal(tokenId = tokenId.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeleteTokenRequest]
  }
}

