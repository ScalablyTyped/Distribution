package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes the dimensions from the sheet.
  */
@js.native
trait SchemaDeleteDimensionRequest extends js.Object {
  /**
    * The dimensions to delete from the sheet.
    */
  var range: js.UndefOr[SchemaDimensionRange] = js.native
}

object SchemaDeleteDimensionRequest {
  @scala.inline
  def apply(range: SchemaDimensionRange = null): SchemaDeleteDimensionRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteDimensionRequest]
  }
}

