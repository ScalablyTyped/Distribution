package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Automatically resizes one or more dimensions based on the contents of the
  * cells in that dimension.
  */
@js.native
trait SchemaAutoResizeDimensionsRequest extends js.Object {
  /**
    * The dimensions to automatically resize.
    */
  var dimensions: js.UndefOr[SchemaDimensionRange] = js.native
}

object SchemaAutoResizeDimensionsRequest {
  @scala.inline
  def apply(dimensions: SchemaDimensionRange = null): SchemaAutoResizeDimensionsRequest = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoResizeDimensionsRequest]
  }
}

