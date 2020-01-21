package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Download line items response.
  */
@js.native
trait SchemaDownloadLineItemsResponse extends js.Object {
  /**
    * Retrieved line items in CSV format. For more information about file
    * formats, see  Entity Write File Format.
    */
  var lineItems: js.UndefOr[String] = js.native
}

object SchemaDownloadLineItemsResponse {
  @scala.inline
  def apply(lineItems: String = null): SchemaDownloadLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDownloadLineItemsResponse]
  }
}

