package typings.googleapis.siteVerificationV1Mod.siteVerificationV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSiteVerificationWebResourceListResponse extends js.Object {
  /**
    * The list of sites that are owned by the authenticated user.
    */
  var items: js.UndefOr[js.Array[SchemaSiteVerificationWebResourceResource]] = js.native
}

object SchemaSiteVerificationWebResourceListResponse {
  @scala.inline
  def apply(items: js.Array[SchemaSiteVerificationWebResourceResource] = null): SchemaSiteVerificationWebResourceListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSiteVerificationWebResourceListResponse]
  }
}

