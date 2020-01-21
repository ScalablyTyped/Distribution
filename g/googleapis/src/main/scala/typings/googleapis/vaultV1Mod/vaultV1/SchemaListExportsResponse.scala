package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The holds for a matter.
  */
@js.native
trait SchemaListExportsResponse extends js.Object {
  /**
    * The list of exports.
    */
  var exports: js.UndefOr[js.Array[SchemaExport]] = js.native
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListExportsResponse {
  @scala.inline
  def apply(exports: js.Array[SchemaExport] = null, nextPageToken: String = null): SchemaListExportsResponse = {
    val __obj = js.Dynamic.literal()
    if (exports != null) __obj.updateDynamic("exports")(exports.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListExportsResponse]
  }
}

