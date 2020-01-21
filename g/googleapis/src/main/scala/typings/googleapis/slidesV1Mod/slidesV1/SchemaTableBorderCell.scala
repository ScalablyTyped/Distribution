package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of each border cell.
  */
@js.native
trait SchemaTableBorderCell extends js.Object {
  /**
    * The location of the border within the border table.
    */
  var location: js.UndefOr[SchemaTableCellLocation] = js.native
  /**
    * The border properties.
    */
  var tableBorderProperties: js.UndefOr[SchemaTableBorderProperties] = js.native
}

object SchemaTableBorderCell {
  @scala.inline
  def apply(
    location: SchemaTableCellLocation = null,
    tableBorderProperties: SchemaTableBorderProperties = null
  ): SchemaTableBorderCell = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (tableBorderProperties != null) __obj.updateDynamic("tableBorderProperties")(tableBorderProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableBorderCell]
  }
}

