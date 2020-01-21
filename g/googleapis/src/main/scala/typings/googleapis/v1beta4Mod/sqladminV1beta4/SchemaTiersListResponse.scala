package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tiers list response.
  */
@js.native
trait SchemaTiersListResponse extends js.Object {
  /**
    * List of tiers.
    */
  var items: js.UndefOr[js.Array[SchemaTier]] = js.native
  /**
    * This is always sql#tiersList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaTiersListResponse {
  @scala.inline
  def apply(items: js.Array[SchemaTier] = null, kind: String = null): SchemaTiersListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTiersListResponse]
  }
}

