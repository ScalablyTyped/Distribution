package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Flags list response.
  */
@js.native
trait SchemaFlagsListResponse extends js.Object {
  /**
    * List of flags.
    */
  var items: js.UndefOr[js.Array[SchemaFlag]] = js.native
  /**
    * This is always sql#flagsList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaFlagsListResponse {
  @scala.inline
  def apply(items: js.Array[SchemaFlag] = null, kind: String = null): SchemaFlagsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFlagsListResponse]
  }
}

