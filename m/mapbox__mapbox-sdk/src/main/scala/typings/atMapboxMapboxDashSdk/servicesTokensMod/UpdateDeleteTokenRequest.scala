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
    val __obj = js.Dynamic.literal(tokenId = tokenId)
    if (note != null) __obj.updateDynamic("note")(note)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[UpdateDeleteTokenRequest]
  }
}

