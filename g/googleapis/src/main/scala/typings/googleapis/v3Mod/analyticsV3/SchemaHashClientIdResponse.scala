package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a hash Client Id response resource.
  */
@js.native
trait SchemaHashClientIdResponse extends js.Object {
  var clientId: js.UndefOr[String] = js.native
  var hashedClientId: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var webPropertyId: js.UndefOr[String] = js.native
}

object SchemaHashClientIdResponse {
  @scala.inline
  def apply(
    clientId: String = null,
    hashedClientId: String = null,
    kind: String = null,
    webPropertyId: String = null
  ): SchemaHashClientIdResponse = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (hashedClientId != null) __obj.updateDynamic("hashedClientId")(hashedClientId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHashClientIdResponse]
  }
}

